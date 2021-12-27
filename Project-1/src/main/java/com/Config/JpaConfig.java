package com.Config;

import java.beans.JavaBean;

//import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import com.Repository.BookRepository;
@Configuration
@EnableJpaRepositories(basePackages = "com.Repository.BookRepository")

public class JpaConfig {

}