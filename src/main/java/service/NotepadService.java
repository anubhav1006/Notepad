package service;

import model.Notepads;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface NotepadService {
    List<Notepads> getAllNotepads();
    void create(Notepads notepads);

    void update(Notepads notepads);

    Notepads getApiRequestById(long id);

    void delete(long id);
}
