package com.example.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


/**
 * Created by decre.liao on 2018/2/5 0005.
 */
@Configuration
@ComponentScan("com.example.el")
@PropertySource("classpath:test.properties") //注入配置文件，spring boot的配置文件需要放置在resources文件夹底下
public class ElConfig {

    @Value("I Love You!")
    private String normal;

    @Value("#{systemProperties['os.name']}") // 注入操作系统属性
    private String osname;

    @Value("#{ T(java.lang.Math).random() * 100.0 }") //注入表达式结果
    private double randomNumber;

    @Value("#{demoService.another}") //注入其他bean属性
    private String fromAnother;

    @Value("classpath:com/example/el/test.text") //注入文件资源
    private Resource testFile;

    @Value("http://www.baidu.com") //注入网址资源
    private Resource testUrl;

    @Value("${project.author}") //注入配置文件
    private String projectAuthor;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osname);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(projectAuthor);
            System.out.println(environment.getProperty("project.name"));
        } catch (Exception e) {

        }
    }
}
