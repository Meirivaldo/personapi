package one.dio.com.personapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping
public class PersonapiApplication {

		@GetMapping
		public String getBooks(){
			return "API TEST";
		}


	}
