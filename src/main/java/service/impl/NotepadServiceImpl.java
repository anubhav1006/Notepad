package service.impl;

import dao.SessionDAO;
import model.Notepad;
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
    public void create(Notepad notepad) {
        sessionDAO.create(notepad);
    }

    @Override
    public void update(Notepad notepad) {
        sessionDAO.update(notepad);
    }

    @Override
    public Notepads getApiRequestById(long id) {
        return sessionDAO.getApiRequestById(id);
    }

    @Override
    public Notepad getNotepadRequestById(long id) {
        return sessionDAO.getNotepadRequestById(id);
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
