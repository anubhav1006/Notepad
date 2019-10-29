package dao.impl;

import dao.SessionDAO;
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
        return entityManager.createQuery("from Notepads").getResultList();
    }


    @Override
    public void create(Notepads notepads) {
        entityManager.persist(notepads);
    }

    @Override
    public void update(Notepads notepads) {
        entityManager.merge(notepads);
    }

    @Override
    public Notepads getApiRequestById(long id) {
        return entityManager.find(Notepads.class, id);
    }

    @Override
    public void delete(long id) {
        Notepads apiRequest = getApiRequestById(id);
        if (apiRequest != null) {
            entityManager.remove(apiRequest);
        }
    }
}
