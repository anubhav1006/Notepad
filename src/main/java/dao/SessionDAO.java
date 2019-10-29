package dao;
import model.Session;

import java.util.List;

public interface SessionDAO {

    List<Session> getAllNotepads();

    void create(Session session);

    void update(Session session);

    Session getApiRequestById(long id);

    void delete(long id);
}
