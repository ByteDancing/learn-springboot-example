package com.union.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.sql.SQLException;

/**
 * description
 *
 * @author Mr.Cheng
 * @date 2019/6/16
 */
@Slf4j
@Configuration
public class DruidConfig {

    @Value("${spring.datasource.url}")
    private String dbUrl;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    @Value("${spring.datasource.initialSize}")
    private int initialSize;
    @Value("${spring.datasource.maxActive}")
    private int maxActive;
    @Value("${spring.datasource.minIdle}")
    private int minIdle;
    @Value("${spring.datasource.maxWait}")
    private int maxWait;
    @Value("${spring.datasource.poolPreparedStatements}")
    private boolean poolPreparedStatements;
    @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;
    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;
    @Value("${spring.datasource.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;
/*    @Value("${spring.datasource.max-evictable-idle-time-millis}")
    private int maxEvictableIdleTimeMillis;*/
    @Value("${spring.datasource.validationQuery}")
    private String validationQuery;
    @Value("${spring.datasource.testWhileIdle}")
    private boolean testWhileIdle;
    @Value("${spring.datasource.testOnBorrow}")
    private boolean testOnBorrow;
    @Value("${spring.datasource.testOnReturn}")
    private boolean testOnReturn;
    @Value("${spring.datasource.filters}")
    private String filters;
    @Value("{spring.datasource.connectionProperties}")
    private String connectionProperties;

    @Bean
    public DruidDataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(dbUrl);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setInitialSize(initialSize);
        druidDataSource.setMinIdle(minIdle);
        druidDataSource.setMaxActive(maxActive);
        druidDataSource.setMaxWait(maxWait);
        druidDataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        druidDataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
//        druidDataSource.setMaxEvictableIdleTimeMillis(maxEvictableIdleTimeMillis);
        druidDataSource.setValidationQuery(validationQuery);
        druidDataSource.setTestWhileIdle(testWhileIdle);
        druidDataSource.setTestOnBorrow(testOnBorrow);
        druidDataSource.setTestOnReturn(testOnReturn);
        druidDataSource.setPoolPreparedStatements(poolPreparedStatements);
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        try {
            druidDataSource.setFilters(filters);
        } catch (SQLException e) {
            log.error("druid initialization filter failed", e.getMessage(), e);
        }
        druidDataSource.setConnectionProperties(connectionProperties);
        return druidDataSource;
    }
}
