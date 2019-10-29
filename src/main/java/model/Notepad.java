package model;

import javax.persistence.*;

@Entity
@Table
public class Notepad {
    @Column
    String title;
    @Column
    String text;
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    String _id;
    @Column
    String user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Notepad(String title, String user) {
        this.title = title;
        this.user = user;
    }
}
