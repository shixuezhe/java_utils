package com.boot.pool;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author ： liyang
 * &#064;@date    ： 2025/6/12 14:25
 * &#064;@description：
 */
@Slf4j
public class PHCMTest {
    private static final Logger log = LoggerFactory.getLogger(PHCMTest.class);

    public static void main(String[] args) {
        CloseableHttpClient httpClient = PoolingHttpClientConnectionManagerTemplate.getHttpClient();
        HttpGet  httpGet = new HttpGet("http://www.example.com");
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
            System.out.println(response.getStatusLine());
        } catch (Exception e) {
            log.info("请求异常,{}",e.getMessage());
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                PoolingHttpClientConnectionManagerTemplate.close(httpClient);
            }catch (Exception e) {
                log.info("关闭资源异常,{}", e.getMessage());
            }
        }
    }
}
