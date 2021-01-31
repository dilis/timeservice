package com.dlvisidro.AvaloqService;

import com.dlvisidro.AvaloqService.ServerTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AvaloqServiceApplication {
	@RequestMapping("/time")
	public ServerTime getTime() {
		ServerTime st = new ServerTime();
		return st;
	}

	public static void main(String[] args) {
		SpringApplication.run(AvaloqServiceApplication.class, args);
	}

}
