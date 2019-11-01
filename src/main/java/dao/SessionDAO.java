package dao;
import model.Notepad;
import model.Notepads;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SessionDAO {

    List<Notepads> getAllNotepads();

    void create(Notepads notepads);
    void create(Notepad notepad);

    void update(Notepad notepad);

    Notepads getApiRequestById(long id);
    Notepad getNotepadRequestById(long id);

    Notepad getChildApiRequestById(long id);

    void delete(long id);

    List<Notepads> getAllNotepadIds();

    void deleteChild(long id);
}
