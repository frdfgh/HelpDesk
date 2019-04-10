package com.example.Kharazmi.HelpDesk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@SpringBootApplication
public class HelpDeskApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelpDeskApplication.class, args);

	}

}
