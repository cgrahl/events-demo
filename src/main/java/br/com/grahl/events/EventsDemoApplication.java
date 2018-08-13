package br.com.grahl.events;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventsDemoApplication implements CommandLineRunner{
	
	@Autowired
	private EventProcessor processor;
	
	public static void main(String[] args) {
		SpringApplication.run(EventsDemoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Inicio: " + new Date()); 
	    processor.process();
	    
	    System.out.println("Fim: " + new Date());
	}
	
}
