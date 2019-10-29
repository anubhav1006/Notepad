package service;

import model.Notepad;
import model.Session;

import java.util.List;

public interface NotepadService {
    List<Session> getCurrentSession();
    void create(Session session);

    void update(Session session);

    Session getApiRequestById(long id);

    void delete(long id);
}
