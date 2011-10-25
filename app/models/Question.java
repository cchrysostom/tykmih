package models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import play.db.jpa.Model;

/**
 *
 * @author Chris Chrysostom
 */
@Entity
public class Question extends Model {
    public String title;
    public String shortText;
    @Lob
    public String fullText;
    @OneToMany(mappedBy="question", cascade=CascadeType.ALL)
    public List<Answer> answers;
    
    public Question(String title, String shortText, String fullText) {
        this.title = title;
        this.shortText = shortText;
        this.fullText = fullText;
    }
    
}
