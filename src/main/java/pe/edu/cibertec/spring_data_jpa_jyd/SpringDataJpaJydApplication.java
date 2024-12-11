package pe.edu.cibertec.spring_data_jpa_jyd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.cibertec.spring_data_jpa_jyd.entity.Customer;
import pe.edu.cibertec.spring_data_jpa_jyd.repository.CustomerRepository;

import java.util.Date;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaJydApplication implements CommandLineRunner {


	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {

		SpringApplication.run(SpringDataJpaJydApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/**
		 * 	Save
		 */
		Customer customer = new Customer(null,1,"Cesar","Santos","cesar@mail.com",1,1,new Date(), new Date());
		customerRepository.save(customer);

		/**
		 * 	field
		 */
		Optional<Customer> customerOptional = customerRepository.findById(599);
		Customer customer1 = customerOptional.orElse(null);
		System.out.println(customer1);
	}
}
