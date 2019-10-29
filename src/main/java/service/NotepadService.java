package service;

import model.Notepads;

import java.util.List;

public interface NotepadService {
    List<Notepads> getAllNotepads();
    void create(Notepads notepads);

    void update(Notepads notepads);

    Notepads getApiRequestById(long id);

    void delete(long id);
}
