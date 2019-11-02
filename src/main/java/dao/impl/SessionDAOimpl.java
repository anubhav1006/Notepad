package dao.impl;

import dao.SessionDAO;
import model.Notepad;
import model.Notepads;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SessionDAOimpl implements SessionDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Notepads> getAllNotepads() {
        return entityManager.createQuery("from Notepad").getResultList();
    }


    @Override
    public void create(Notepads notepads) {
        entityManager.persist(notepads);
    }

    @Override
    public void create(Notepad notepad) {
        entityManager.persist(notepad);
    }

    @Override
    public void update(Notepad notepad) {
        entityManager.merge(notepad);
    }

    @Override
    public Notepads getApiRequestById(long id) {
        return entityManager.find(Notepads.class, id);
    }

    @Override
    public Notepad getNotepadRequestById(long id) {
        return entityManager.find(Notepad.class, id);
    }

    @Override
    public Notepad getChildApiRequestById(long id) {
        return entityManager.find(Notepad.class, id);
    }

    @Override
    public void delete(long id) {
        Notepads apiRequest = getApiRequestById(id);
        if (apiRequest != null) {
            entityManager.remove(apiRequest);
        }
    }
    @Override
    public void deleteChild(long id) {
        Notepad apiRequest = getChildApiRequestById(id);
        if (apiRequest != null) {
            entityManager.remove(apiRequest);
        }
    }

    @Override
    public List<Notepads> getAllNotepadIds() {
        return entityManager.createQuery("from Notepads").getResultList();
    }
}
