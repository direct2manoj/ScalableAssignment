package com.sa.studentaap.configuration;

import com.sa.studentaap.service.StudentService;
import org.modelmapper.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


public class StudentConfig {

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }

    @Bean
    public RestTemplate restTemplateBean() {
        return new RestTemplate();
    }

}
