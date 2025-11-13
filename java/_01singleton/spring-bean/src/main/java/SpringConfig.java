

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name = "sun")
    public Sun sun() {
        return Sun.createSun(3.828E26, 46);
    }

}
