package com.forgeops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@Controller
public class CelebrationApp {

	public static void main(String[] args) {
		SpringApplication.run(CelebrationApp.class, args);
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm:ss")));
		model.addAttribute("platform", "ForgeOps v1.0 — Offline-First DevOps");
		return "index";
	}
}
