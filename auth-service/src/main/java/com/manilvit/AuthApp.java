package com.manilvit;

import com.manilvit.configuration.RSAKeyRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RSAKeyRecord.class)
public class AuthApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(AuthApp.class);
    }
}
