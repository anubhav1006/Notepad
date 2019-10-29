package model;

import javax.persistence.*;

@Table(name = "Notepads")
@Entity
public class Notepads {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long _id;

    public Notepad getNotepad() {
        return notepad;
    }

    public void setNotepad(Notepad notepad) {
        this.notepad = notepad;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @PrimaryKeyJoinColumn
    Notepad notepad;

   /* public Notepads(Notepad notepad) {
        this.notepad = notepad;
    }*/


}
