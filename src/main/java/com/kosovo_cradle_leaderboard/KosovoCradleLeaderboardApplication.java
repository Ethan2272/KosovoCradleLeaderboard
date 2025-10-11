package com.kosovo_cradle_leaderboard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class KosovoCradleLeaderboardApplication {

	private static final Logger log = LoggerFactory.getLogger(KosovoCradleLeaderboardApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KosovoCradleLeaderboardApplication.class, args);
	}


	@Bean
	public CommandLineRunner demo(PlayerRepository repository) {
		return (args) -> {
		// save a few customers
		repository.save(new Player("Jack", "Bauer", "US", 26));
		repository.save(new Player("Chloe", "O'Brian", "US", 29));
		repository.save(new Player("Kim", "Bauer", "US", 30));
		repository.save(new Player("David", "Palmer", "US", 35));
		repository.save(new Player("Anthony", "Gojani", "XK", 44));

		// fetch all customers
		log.info("Players found with findAll():");
		log.info("-------------------------------");
		repository.findAll().forEach(customer -> {
			log.info(customer.toString());
		});
		log.info("");

		// fetch an individual customer by ID
		Player player = repository.findById(1L);
		log.info("Player found with findById(1L):");
		log.info("--------------------------------");
		log.info(player.toString());
		log.info("");

		// fetch customers by last name
		log.info("Player found with findByCountryCode('XK'):");
		log.info("--------------------------------------------");
		repository.findByCountryCode("XK").forEach(bauer -> {
			log.info(bauer.toString());
		});
		log.info("");
		};
  }

}
