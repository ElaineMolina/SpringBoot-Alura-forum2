package br.com.molina.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;


@SpringBootApplication
@EnableSpringDataWebSupport
public class Forum1Application {

	public static void main(String[] args) {

		SpringApplication.run(Forum1Application.class, args);
	}

}
