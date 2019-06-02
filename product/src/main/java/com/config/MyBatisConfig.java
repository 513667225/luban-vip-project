package com.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.mysql.jdbc.Driver;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@MapperScan("com.*.*.mapper")
@Configuration
public class MyBatisConfig {



    @Bean
    public MybatisSqlSessionFactoryBean sqlSessionFactoryBean(@Autowired DataSource dataSource) throws IOException{
        MybatisSqlSessionFactoryBean bean = new MybatisSqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setPlugins(new Interceptor[]{paginationInterceptor()});
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packageXMLConfigPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + "/mapper/*/*.xml";
        bean.setMapperLocations(resolver.getResources(packageXMLConfigPath));
        return bean;
    }


    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor  paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setDialectType("mysql");
        return paginationInterceptor;
    }




    @Bean
    public DataSource dataSource()  {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(Driver.class.getName());
        dataSource.setPassword("1234");
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://192.168.0.121:3306/vip_project");
        return dataSource;
    }

}
