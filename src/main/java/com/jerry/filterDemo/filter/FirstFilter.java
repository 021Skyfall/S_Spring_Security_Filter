package com.jerry.filterDemo.filter;

import javax.servlet.*;
import java.io.IOException;

// Servlet Filter 기본 구조
public class FirstFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("========FirstFilter 생성됨========");
    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {
        System.out.println("========First 필터 시작========");
        chain.doFilter(request,response);
        System.out.println("========First 필터 종료========");
    }

    @Override
    public void destroy() {
        System.out.println("========FirstFilter Destory========");
        Filter.super.destroy();
    }
}