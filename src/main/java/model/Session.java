package model;

import javax.persistence.*;

@Table
@Entity
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int _id;

    public Notepad getNotepad() {
        return notepad;
    }

    public void setNotepad(Notepad notepad) {
        this.notepad = notepad;
    }

    Notepad notepad;
    public Session(Notepad notepad) {
        this.notepad = notepad;
    }


}
