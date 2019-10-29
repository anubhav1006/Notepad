package dao;
import model.Notepads;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SessionDAO {

    List<Notepads> getAllNotepads();

    void create(Notepads notepads);

    void update(Notepads notepads);

    Notepads getApiRequestById(long id);

    void delete(long id);
}
