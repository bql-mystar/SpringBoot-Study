package com.xia.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// 1、定义数据模型封装yaml文件中对应的数据
// 2、定义为spring可以管控的bean
// 3、指定加载的数据
@ConfigurationProperties(prefix="datasource")
@Component
public class DataSourceConfiguration {
    private String driver;
    private String url;
    private String username;
    private String password;
    private int maxActive;

    @Override
    public String toString() {
        return "DataSourceConfiguration{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", maxActive=" + maxActive +
                '}';
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }
}
/**
 datasource:
     driver: com.mysql.cj.jdbc.Driver
     url: jdbc:mysql://localhost:3306/db1?serverTimezone=UTC
     username: root
     password: root
     maxActive: 20
 */

