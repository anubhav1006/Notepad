package service;

import model.Notepad;
import model.Notepads;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface NotepadService {
    List<Notepads> getAllNotepads();
    void create(Notepads notepads);
    void create(Notepad notepad);

    void update(Notepad notepad);

    Notepads getApiRequestById(long id);
    Notepad getNotepadRequestById(long id);

    void delete(long id);

    void deleteChild(long id);

    List<Notepads> allActiveNotepadIds();
}
