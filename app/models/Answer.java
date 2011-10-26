package models;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;

/**
 *
 * @author Chris Chrysostom
 */
@Entity
public class Answer extends Model {
    @ManyToOne
    public Question question;
    public String label;
    public String shortText;
    public boolean isCorrect = false;
    @Lob
    public String fullText;

    public Answer(Question question, String label, String shortText, String fullText, boolean isCorrect) {
        this.question = question;
        this.label = label;
        this.shortText = shortText;
        this.fullText = fullText;
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
