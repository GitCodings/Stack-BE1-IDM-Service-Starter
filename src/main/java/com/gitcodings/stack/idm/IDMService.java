package com.gitcodings.stack.idm;

import com.gitcodings.stack.idm.config.IDMServiceConfig;
import com.gitcodings.stack.core.spring.StackService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@StackService
@EnableConfigurationProperties({
    IDMServiceConfig.class
})
public class IDMService
{
    public static void main(String[] args)
    {
        SpringApplication.run(IDMService.class, args);
    }
}
