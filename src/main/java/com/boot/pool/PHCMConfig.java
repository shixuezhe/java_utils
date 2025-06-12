package com.boot.pool;

/**
 * @author ： liyang
 * &#064;date  ： 2025/6/12 11:21
 * &#064;description：数据库连接池基本配置
 */
public class PHCMConfig {
    // 最大连接数
    public static final int MAX_TOTAL = 200;
    // 每条路由最大连接数
    public static final int MAX_PER_ROUTE = 50;
    // 连接超时
    public static final int CONNECT_TIMEOUT = 5000;
    // 数据传输超时
    public static final int SOCKET_TIMEOUT = 10000;
    // 从连接池获取连接超时
    public static final int CONNECTION_REQUEST_TIMEOUT = 1000;

    public static PHCMConfig getPHCMConfig() {
        return new PHCMConfig();
    }
}
