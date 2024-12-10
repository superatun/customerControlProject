package mx.com.gm;

import mx.com.gm.servicio.helpers.EnvironmentsHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;


@SpringBootApplication
public class HolaSpringApplication {

	public static void main(String[] args) {
		String[] environments = {"DB_URL","DB_USERNAME","DB_PASSWORD"};
		EnvironmentsHelper.SetEnvironments(environments);
		SpringApplication.run(HolaSpringApplication.class, args);
	}

}
