package com.boot.pool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

/**
 * @author ： liyang
 * &#064;date  ： 2025/6/12 11:15
 * &#064;description：http连接池的默认配置方法
 */
public class PoolingHttpClientConnectionManagerTemplate {
    private static final Logger logger = LoggerFactory.getLogger(PoolingHttpClientConnectionManagerTemplate.class);
    //禁止实例化
    private PoolingHttpClientConnectionManagerTemplate(){}

    //静态持有
    private static final class SingletonHolder {
        private static final CloseableHttpClient INSTANCE = createHttpClient();
    }

    public static CloseableHttpClient getHttpClient() {
        return SingletonHolder.INSTANCE;
    }
    public static CloseableHttpClient createHttpClient() {
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
        connectionManager.setMaxTotal(PHCMConfig.MAX_TOTAL);
        connectionManager.setDefaultMaxPerRoute(PHCMConfig.MAX_PER_ROUTE);

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(PHCMConfig.CONNECT_TIMEOUT)
                .setSocketTimeout(PHCMConfig.SOCKET_TIMEOUT)
                .setConnectionRequestTimeout(PHCMConfig.CONNECTION_REQUEST_TIMEOUT)
                .build();
        return HttpClients.custom()
                .setConnectionManager(connectionManager)
                .setDefaultRequestConfig(requestConfig)
                .build();
    }


    public static void close(CloseableHttpClient httpClient) {
        try {
            httpClient.close();
            logger.info("关闭httpClient成功");
        } catch (Exception e) {
            logger.error("关闭httpClient失败", e);
        }
    }
}
