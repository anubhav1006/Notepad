package model;

import javax.persistence.*;

@Table(name = "Notepads")
@Entity
public class Notepads {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Notepad getNotepad() {
        return notepad;
    }

    public void setNotepad(Notepad notepad) {
        this.notepad = notepad;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade =  CascadeType.ALL)
    @JoinColumn(name="notepad_id")
    Notepad notepad;


    public Notepads(Notepad notepad) {
        this.notepad = notepad;
    }

    public Notepads() {
    }
}
