package ar.edu.centro8.tp4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Tp4Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp4Application.class, args);
	}

}
