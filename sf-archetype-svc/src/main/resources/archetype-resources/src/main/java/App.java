package $package;

import org.apache.isis.core.config.presets.IsisPresets;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
        AppManifest.class
})
public class App extends SpringBootServletInitializer
{
    /**
     * @implNote this is to support the <em>Spring Boot Maven Plugin</em>, which auto-detects an
     * entry point by searching for classes having a {@code main(...)}
     */
    public static void main(String[] args) {
        IsisPresets.prototyping();
        SpringApplication.run(new Class[] { App.class }, args);
    }
}
