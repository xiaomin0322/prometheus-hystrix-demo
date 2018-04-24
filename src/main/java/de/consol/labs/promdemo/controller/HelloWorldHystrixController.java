package de.consol.labs.promdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soundcloud.prometheus.hystrix.HystrixPrometheusMetricsPublisher;

@Controller
public class HelloWorldHystrixController {

	static {
		 //HystrixPrometheusMetricsPublisher.builder().withExponentialBuckets().buildAndRegister(); 
		 //HystrixPrometheusMetricsPublisher.builder().shouldExportDeprecatedMetrics(true).buildAndRegister();
		//HystrixPlugins.getInstance().registerMetricsPublisher(HystrixMetricsPublisherDefault.getInstance());
		HystrixPrometheusMetricsPublisher.register("user");
	}
	
	
	
    @RequestMapping(path = "/hello-world-hystrix")
    public @ResponseBody String sayHello() {
    	new Thread() {
    		@Override
    		public void run() {
    			 for(int i=0;i<10;i++) {
    	    		  TestHystrixCommand command = new TestHystrixCommand("queryUser");
    	    	         command.execute();
    	    	  }
    		}
    	}.start();
    	
        return "hello, world queryUser";
    }
    
    

}
