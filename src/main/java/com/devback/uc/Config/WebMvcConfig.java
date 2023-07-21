package com.devback.uc.Config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.devback.uc.Interceptor.ChambreA1Interceptor;
import com.devback.uc.Interceptor.LogoutTokenInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Autowired
    private LogoutTokenInterceptor logoutTokenInterceptor;
	
	@Autowired
	private ChambreA1Interceptor chambreA1Interceptor;
    
 

    /*public WebMvcConfig(LogoutTokenInterceptor logoutTokenInterceptor) {
        this.logoutTokenInterceptor = logoutTokenInterceptor;
    }*/

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logoutTokenInterceptor).addPathPatterns("/api/**");
        registry.addInterceptor(chambreA1Interceptor).addPathPatterns("/ChambreA1/**");
    }
}
