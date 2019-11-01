
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication(scanBasePackages = {"controller","config","dao","service"})
@EntityScan(basePackages = {"model"})
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

    }

}
