import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SingleFileServer {

    public static void main(String[] args) {
        SpringApplication.run(SingleFileServer.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello, World!";
    }
}
