package service.impl;

import dao.SessionDAO;
import model.Notepads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.NotepadService;

import java.util.List;

@Service
@Transactional
public class NotepadServiceImpl implements NotepadService {

    @Autowired
    private SessionDAO sessionDAO;
    @Override
    public List<Notepads> getAllNotepads() {
        return sessionDAO.getAllNotepads();
    }

    @Override
    public void create(Notepads notepads) {
        sessionDAO.create(notepads);
    }

    @Override
    public void update(Notepads notepads) {
        sessionDAO.update(notepads);
    }

    @Override
    public Notepads getApiRequestById(long id) {
        return sessionDAO.getApiRequestById(id);
    }

    @Override
    public void delete(long id) {
        sessionDAO.delete(id);
    }

    @Override
    public void deleteChild(long id) {
        sessionDAO.deleteChild(id);
    }

    @Override
    public List<Notepads> allActiveNotepadIds() {
        return sessionDAO.getAllNotepadIds();
    }
}