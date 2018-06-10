package chitter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Peep {

    @Id
    @GeneratedValue
    private Long id;
    private String content;

    public Peep() {
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
