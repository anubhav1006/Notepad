package model;

import javax.persistence.*;

@Table(name = "Notepads")
@Entity
public class Notepads {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int _id;

    public Notepad getNotepad() {
        return notepad;
    }

    public void setNotepad(Notepad notepad) {
        this.notepad = notepad;
    }

    @OneToOne
    Notepad notepad;

    public Notepads(Notepad notepad) {
        this.notepad = notepad;
    }


}
