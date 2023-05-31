package web.Dao;

import web.model.Cars;

import java.util.List;

public interface CarDao {
    List<Cars> getCars (int count);
}
