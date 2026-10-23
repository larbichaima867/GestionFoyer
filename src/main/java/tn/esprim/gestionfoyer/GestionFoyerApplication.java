package tn.esprim.gestionfoyer;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionFoyerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionFoyerApplication.class, args);
    }

}
