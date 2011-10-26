package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

/**
 *
 * @author Chris Chrysostom
 */
@Entity
public class Category extends Model {
    public String name;
    
    public Category(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
