package com.youzan.open.gen.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author ph0ly
 * @time 2016-09-18
 */
@Configuration
@AutoConfigureAfter(DataSourceAutoConfiguration.class)
@EnableTransactionManagement
@MapperScan(basePackages = "com.youzan.amon.dao")
public class DataSourceConfiguration {

    private static Logger LOG = LoggerFactory.getLogger(DataSourceConfiguration.class);

    @Bean
    public DataSource dataSource(@Value("${spring.datasource.driver-class-name}") String driverClassName,
                                 @Value("${spring.datasource.url}") String url,
                                 @Value("${spring.datasource.username}") String username,
                                 @Value("${spring.datasource.password}") String password,
                                 @Value("${spring.datasource.filters}") String filters,
                                 @Value("${spring.datasource.maxActive}") Integer maxActive,
                                 @Value("${spring.datasource.initialSize}") Integer initialSize,
                                 @Value("${spring.datasource.maxWait}") Long maxWait,
                                 @Value("${spring.datasource.minIdle}") Integer minIdle,
                                 @Value("${spring.datasource.timeBetweenEvictionRunsMillis}") Long timeBetweenEvictionRunsMillis,
                                 @Value("${spring.datasource.minEvictableIdleTimeMillis}") Long minEvictableIdleTimeMillis,
                                 @Value("${spring.datasource.validationQuery}") String validationQuery,
                                 @Value("${spring.datasource.testWhileIdle}") Boolean testWhileIdle,
                                 @Value("${spring.datasource.testOnBorrow}") Boolean testOnBorrow,
                                 @Value("${spring.datasource.testOnReturn}") Boolean testOnReturn,
                                 @Value("${spring.datasource.defaultAutoCommit}") Boolean defaultAutoCommit) {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setMaxActive(maxActive);
        druidDataSource.setMinIdle(minIdle);
        druidDataSource.setMaxWait(maxWait);
        druidDataSource.setInitialSize(initialSize);
        druidDataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        druidDataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        druidDataSource.setValidationQuery(validationQuery);
        druidDataSource.setTestOnBorrow(testOnBorrow);
        druidDataSource.setTestWhileIdle(testWhileIdle);
        druidDataSource.setTestOnReturn(testOnReturn);
        druidDataSource.setDefaultAutoCommit(defaultAutoCommit);

        try {
            druidDataSource.setFilters(filters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return druidDataSource;
    }

    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum", "true");
        properties.setProperty("rowBoundsWithCount", "true");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

    @Bean
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Autowired DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{ pageHelper() });
        sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    @Primary
    public DataSourceTransactionManager dataSourceTransactionManager(@Autowired DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
