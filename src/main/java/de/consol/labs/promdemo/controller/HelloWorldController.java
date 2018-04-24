package de.consol.labs.promdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.prometheus.client.Counter;

@Controller
/*@SpringBootApplication
@EnablePrometheusEndpoint*/
public class HelloWorldController {

    private final Counter promRequestsTotal = Counter.build()
            .name("requests_total")
            .help("Total number of requests.")
            .register();

    @RequestMapping(path = "/hello-world")
    public @ResponseBody String sayHello() {
        promRequestsTotal.inc();
        return "hello, world";
    }

}
