package pl.bpiatek.linkshortenerspringadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class LinkShortenerSpringAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinkShortenerSpringAdminApplication.class, args);
    }

}
