package de.consol.labs.promdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect;

import de.consol.labs.promdemo.controller.HelloWorldHystrixController2;
import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;

@SpringBootApplication
@EnablePrometheusEndpoint
public class PromAppliaction {
	
	 //com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect
    @Bean
    public HystrixCommandAspect getHystrixCommandAspect() {
    	return new HystrixCommandAspect();
    }
    
    
    //HelloWorldHystrixController2 worldHystrixController2;
    
    public static void main(String[] args) throws Exception{
    	ConfigurableApplicationContext applicationContext =  SpringApplication.run(PromAppliaction.class,args);
    	final HelloWorldHystrixController2 controller2 = applicationContext.getBean(HelloWorldHystrixController2.class);
    
    	for(;;) {
    		new Thread() {
    			public void run() {
    				controller2.getUser();
    			}; 
    		}.start();
    		Thread.sleep(200);
    	}
    }

}
