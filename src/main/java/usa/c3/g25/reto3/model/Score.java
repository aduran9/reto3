package usa.c3.g25.reto3.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "score")
/**
 * Clase Score
 */
public class Score implements Serializable {
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 250)
    private Integer score;

    @Column(length = 250)
    private String scoreMessage;

    public Score() {
        /**
         * Constructor vacio
         */
    }

    public Score(Integer id, Integer score, String scoreMessage) {
        this.id = id;
        this.score = score;
        this.scoreMessage = scoreMessage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getScoreMessage() {
        return scoreMessage;
    }

    public void setScoreMessage(String scoreMessage) {
        this.scoreMessage = scoreMessage;
    }
    
}
