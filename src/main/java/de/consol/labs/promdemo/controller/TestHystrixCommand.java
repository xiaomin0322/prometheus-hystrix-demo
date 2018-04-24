package de.consol.labs.promdemo.controller;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.HystrixThreadPoolKey;
import com.netflix.hystrix.HystrixThreadPoolProperties;

public class TestHystrixCommand extends HystrixCommand<Integer> {

    private boolean willFail;
    private Long willWait;

    public TestHystrixCommand(String key) {
        this(key, null);
    }

    public TestHystrixCommand(String key, HystrixCommandProperties.Setter commandProperties) {
        this(
                Setter
                        .withGroupKey(HystrixCommandGroupKey.Factory.asKey(key))
                        .andCommandKey(HystrixCommandKey.Factory.asKey(key))
                        .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey(key))
                        .andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties.Setter().withMaxQueueSize(10).withCoreSize(1).withQueueSizeRejectionThreshold(1))
        );
    }

    public TestHystrixCommand(Setter setter) {
        super(setter);
    }

    public TestHystrixCommand willFail() {
        this.willFail = true;
        return this;
    }

    public TestHystrixCommand willWait(long millis) {
        this.willWait = millis;
        return this;
    }

    @Override
    protected Integer run() throws Exception {
        if (willFail) {
            throw new RuntimeException();
        }
        if (willWait != null) {
        	
            Thread.sleep(willWait);
        }
        
       // Thread.sleep(new Random(3000).nextInt());
        Thread.sleep(300);
        return 1;
    }
    
    /*@Override
    protected Integer getFallback() {
    	// TODO Auto-generated method stub
    	System.out.println("getFallback");
    	return 2;
    }*/
}
