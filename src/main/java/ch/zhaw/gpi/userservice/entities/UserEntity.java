package ch.zhaw.gpi.userservice.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Benutzer-Entität
 * 
 * @author scep
 */
@Entity(name="User")
public class UserEntity implements Serializable {
    // Auto-generierte Benutzer-Id (Primärschlüssel)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    
    // Benutzername, Vorname, Nachname und Mail-Adresse
    private String userName;
    private String firstName;
    private String officialName;
    private String eMail;

    // GETTER und SETTER
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
    
}
