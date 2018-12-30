package ch.zhaw.gpi.userservice.controller;

import ch.zhaw.gpi.userservice.entities.UserEntity;
import ch.zhaw.gpi.userservice.repositories.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST-Controller für Benutzer-Ressource
 * 
 * @author scep
 */
@RestController
public class UserController {
    
    // Verdrahten des Benutzer-Repository
    @Autowired
    private UserRepository userRepository;
    
    /**
     * REST-GET-METHODE auf Benutzer via Benutzername
     * 
     * @param userName  Benutzername
     * @return          Benutzer-Objekt in JSON
     */
    @RequestMapping(method = RequestMethod.GET, value = "/userapi/v1/users/{userName}")
    public ResponseEntity<UserEntity> getUser(@PathVariable String userName){
        // Benutzer-Entität über Benutzername holen
        Optional<UserEntity> user = userRepository.findByUserName(userName);
        
        // Falls Benutzer-Entität gefunden wurde
        if(user.isPresent()){
            // Benutzer zurückgeben
            return new ResponseEntity(user.get(), HttpStatus.OK);
        } else {
            // eine 404-Meldung zurück geben
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
