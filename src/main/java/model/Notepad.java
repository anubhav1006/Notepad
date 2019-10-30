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
    Long notepad_id;

    public Long getId() {
        return notepad_id;
    }

    public void setId(Long notepad_id) {
        this.notepad_id = notepad_id;
    }

    public Notepad() {
    }

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

    public Notepad(String title, String user, String text) {
        this.title = title;
        this.user = user;
        this.text = text;
    }
}
