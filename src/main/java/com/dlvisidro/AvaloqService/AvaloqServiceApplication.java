package com.dlvisidro.AvaloqService;

import com.dlvisidro.AvaloqService.ServerTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin
public class AvaloqServiceApplication {
	@GetMapping("/time")
	public ServerTime getTime() {
		ServerTime st = ServerTime.now();
		return st;
	}

	public static void main(String[] args) {
		SpringApplication.run(AvaloqServiceApplication.class, args);
	}

}
