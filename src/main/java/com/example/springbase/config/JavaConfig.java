package com.example.springbase.config;

import com.example.springbase.service.NoAnFunctionService;
import com.example.springbase.service.UseNoAnFunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by decre.liao on 2018/2/1 0001.
 */
@Configuration
public class JavaConfig {

    @Bean
    public NoAnFunctionService noFunctionService() {
        return new NoAnFunctionService();
    }

    @Bean
    public UseNoAnFunctionService useNoAnFunctionService(){
        UseNoAnFunctionService useNoAnFunctionService = new UseNoAnFunctionService();
        useNoAnFunctionService.setFunctionService(noFunctionService());
        return useNoAnFunctionService;
    }

    /*等效于上面2个配置的总和
    @Bean
    public UseNoAnFunctionService useNoAnFunctionServiceSec(NoAnFunctionService noAnFunctionService) {
        UseNoAnFunctionService useNoAnFunctionService = new UseNoAnFunctionService();
        useNoAnFunctionService.setFunctionService(noAnFunctionService);
        return useNoAnFunctionService;
    }*/


}
