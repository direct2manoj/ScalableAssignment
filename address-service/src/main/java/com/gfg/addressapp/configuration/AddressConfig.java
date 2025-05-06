package com.gfg.addressapp.configuration;

import com.gfg.addressapp.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfig {

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }

}
