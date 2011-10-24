package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

/**
 *
 * @author Chris Chrysostom
 */
@Entity
public class TykmihUser extends Model {
    public String email;
    public String password;
    public String fullname;
    public boolean isAdmin;
    
    public TykmihUser(String email, String password, String fullname) {
        this.email = email;
        this.password = password;
        this.fullname = fullname;
    }
}
