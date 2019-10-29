import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = {"controller"})
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

    }

    /*@Configuration
    public class WebConfiguration {
        @Bean
        ServletRegistrationBean h2servletRegistration(){
            ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
            registrationBean.addUrlMappings("/console/*");
            return registrationBean;
        }

    }*/
}
