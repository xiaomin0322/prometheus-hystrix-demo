package de.consol.labs.promdemo.Interceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import io.prometheus.client.Counter;


public class RequestCounterInterceptor extends HandlerInterceptorAdapter {

    // @formatter:off
    // Note (1)
    private static final Counter requestTotal = Counter.build()
         .name("http_requests_total")
         .labelNames("method", "handler", "status")
         .help("Http Request Total").register();
    // @formatter:on

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e)
                                                                                                         throws Exception {
         // Update counters
         String handlerLabel = handler.toString();
         // get short form of handler method name
         if (handler instanceof HandlerMethod) {
              Method method = ((HandlerMethod) handler).getMethod();
              handlerLabel = method.getDeclaringClass().getSimpleName() + "." + method.getName();
         }
         // Note (2)
         requestTotal.labels(request.getMethod(), handlerLabel, Integer.toString(response.getStatus())).inc();
    }
}