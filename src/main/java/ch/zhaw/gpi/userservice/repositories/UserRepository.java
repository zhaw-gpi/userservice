package ch.zhaw.gpi.userservice.repositories;

import ch.zhaw.gpi.userservice.entities.UserEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Benutzer-Jpa-Repository
 * 
 * @author scep
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
    // Methodendeklaration, um einen Benutzer basierend auf seinem Benutzernamen zu erhalten
    public Optional<UserEntity> findByUserName(String userName);
}
