package com.kosovo_cradle_leaderboard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class KosovoCradleLeaderboardApplication {

	private static final Logger log = LoggerFactory.getLogger(KosovoCradleLeaderboardApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KosovoCradleLeaderboardApplication.class, args);
	}

}
