package com.acme.loyalsips;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api")
@EnableJpaAuditing
@SpringBootApplication
public class LoyalsipsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoyalsipsApplication.class, args);
    }

}
