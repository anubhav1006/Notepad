package service.impl;

import dao.SessionDAO;
import model.Session;
import org.springframework.beans.factory.annotation.Autowired;
import service.NotepadService;

import java.util.List;

public class NotepadServiceImpl implements NotepadService {

    @Autowired
    private SessionDAO sessionDAO;
    @Override
    public List<Session> getCurrentSession() {
        return sessionDAO.getAllNotepads();
    }

    @Override
    public void create(Session session) {
        sessionDAO.create(session);
    }

    @Override
    public void update(Session session) {
        sessionDAO.update(session);
    }

    @Override
    public Session getApiRequestById(long id) {
        return sessionDAO.getApiRequestById(id);
    }

    @Override
    public void delete(long id) {
        sessionDAO.delete(id);
    }
}
