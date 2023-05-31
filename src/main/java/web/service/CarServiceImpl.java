package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.Dao.CarDaoImpl;
import web.model.Cars;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDaoImpl carDao;
    @Override
    public List<Cars> getCars(int count) {
        return carDao.getCars(count);
    }
}
