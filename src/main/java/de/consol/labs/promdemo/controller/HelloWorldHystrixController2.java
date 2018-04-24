package de.consol.labs.promdemo.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.soundcloud.prometheus.hystrix.HystrixPrometheusMetricsPublisher;

@Controller
public class HelloWorldHystrixController2 {

	static {
		 //HystrixPrometheusMetricsPublisher.builder().withExponentialBuckets().buildAndRegister(); 
		 //HystrixPrometheusMetricsPublisher.builder().shouldExportDeprecatedMetrics(true).buildAndRegister();
		//HystrixPlugins.getInstance().registerMetricsPublisher(HystrixMetricsPublisherDefault.getInstance());
		HystrixPrometheusMetricsPublisher.register("getUserHystrixCommand");
	}
	
    
    @RequestMapping(path = "/hello-world-hystrix2")
    @HystrixCommand(
    		commandKey="getUser",groupKey="getUser",threadPoolKey="getUser",
    		/*commandProperties= {@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000"),
    		@HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),
    		@HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "20"),
    		@HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "2000")},*/
    	threadPoolProperties= {
    			@HystrixProperty(name="coreSize",value = "1"),
    			@HystrixProperty(name="maxQueueSize",value = "10"),
    			@HystrixProperty(name="queueSizeRejectionThreshold",value = "1")
    			}	
    		)
    public @ResponseBody String getUser() {
    	System.out.println("getUser>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    	try {
			Thread.sleep(new Random(300).nextInt());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        return "getUser";
    }

}
