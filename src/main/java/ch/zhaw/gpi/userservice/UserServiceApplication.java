package ch.zhaw.gpi.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hauptklasse mit Main-Methode, um die SpringBoot-Applikation zu starten
 * 
 * @author scep
 */
@SpringBootApplication
public class UserServiceApplication {

    /**
     * Main-Methode
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Startet eine Spring-Boot-Applikation basierend auf dieser Klasse
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
