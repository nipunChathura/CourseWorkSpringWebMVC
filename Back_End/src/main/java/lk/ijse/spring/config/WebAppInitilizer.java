package lk.ijse.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class WebAppInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};//parent context
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};// child context
    }

    protected String[] getServletMappings() {
        return new String[]{"/api/v1/customer"};
    }//default servlet mapping

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        MultipartConfigElement multiPart = new MultipartConfigElement("C:/temp/",
                1024 * 1024 * 5, 1024 * 1024 * 10, 1024 * 1024 * 3);

        registration.setMultipartConfig(multiPart);
    }
}
