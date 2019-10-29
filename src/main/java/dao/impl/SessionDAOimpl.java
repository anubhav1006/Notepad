package dao.impl;

import dao.SessionDAO;
import model.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SessionDAOimpl implements SessionDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Session> getAllNotepads() {

    }


    @Override
    public void create(Session session) {
        entityManager.persist(session);
    }

    @Override
    public void update(Session session) {
        entityManager.merge(session);
    }

    @Override
    public Session getApiRequestById(long id) {
        return entityManager.find(Session.class, id);
    }

    @Override
    public void delete(long id) {
        Session apiRequest = getApiRequestById(id);
        if (apiRequest != null) {
            entityManager.remove(apiRequest);
        }
    }
}
