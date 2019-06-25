# prometheus-hystrix-demo
prometheus-hystrix-demo 




2019-06-25 10:27:02.850  INFO 10580 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/hello-world]}" onto public java.lang.String de.consol.labs.promdemo.controller.HelloWorldController.sayHello()
2019-06-25 10:27:02.852  INFO 10580 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/hello-world-hystrix]}" onto public java.lang.String de.consol.labs.promdemo.controller.HelloWorldHystrixController.sayHello()
2019-06-25 10:27:02.853  INFO 10580 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/hello-world-hystrix2]}" onto public java.lang.String de.consol.labs.promdemo.controller.HelloWorldHystrixController2.getUser()
2019-06-25 10:27:02.856  INFO 10580 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2019-06-25 10:27:02.861  INFO 10580 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2019-06-25 10:27:02.990  INFO 10580 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2019-06-25 10:27:02.990  INFO 10580 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2019-06-25 10:27:03.065  INFO 10580 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2019-06-25 10:27:03.817  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/heapdump || /heapdump.json],methods=[GET],produces=[application/octet-stream]}" onto public void org.springframework.boot.actuate.endpoint.mvc.HeapdumpMvcEndpoint.invoke(boolean,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse) throws java.io.IOException,javax.servlet.ServletException
2019-06-25 10:27:03.823  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/{name:.*}],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EnvironmentMvcEndpoint.value(java.lang.String)
2019-06-25 10:27:03.824  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env || /env.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2019-06-25 10:27:03.825  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/health || /health.json],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.HealthMvcEndpoint.invoke(java.security.Principal)
2019-06-25 10:27:03.825  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/beans || /beans.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2019-06-25 10:27:03.827  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/mappings || /mappings.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2019-06-25 10:27:03.828  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/trace || /trace.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2019-06-25 10:27:03.829  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/configprops || /configprops.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2019-06-25 10:27:03.830  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/autoconfig || /autoconfig.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2019-06-25 10:27:03.832  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/info || /info.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2019-06-25 10:27:03.839  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/prometheus || /prometheus.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2019-06-25 10:27:03.841  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics/{name:.*}],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.MetricsMvcEndpoint.value(java.lang.String)
2019-06-25 10:27:03.841  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics || /metrics.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2019-06-25 10:27:03.842  INFO 10580 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/dump || /dump.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()



localhost:8080/prometheus
