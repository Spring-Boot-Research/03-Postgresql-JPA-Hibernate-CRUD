package com.springboot.postgresqlhibernatecrud.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfiguration {

//    @Bean
//    public DataSource dataSource(){
//        DriverManagerDataSource managerDataSource = new DriverManagerDataSource();
//        managerDataSource.setDriverClassName("org.postgresql.Driver");
//        managerDataSource.setUrl("jdbc:postgresql://localhost:5432/employees_db");
//        managerDataSource.setUsername("postgres");
//        managerDataSource.setPassword("root");
//
//        return managerDataSource;
//    }
}
