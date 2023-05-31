package web.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Cars> carsList = new ArrayList<>();
    {
       carsList.add(new Cars("Lexus", "RX450h", 2016));
        carsList.add(new Cars("Audi", "A6", 2018));
        carsList.add(new Cars("BMW", "X7", 2019));
        carsList.add(new Cars("Rolls Roys", "Phantom", 2020));
        carsList.add(new Cars("Land Rover", "Range Rover", 2014));
    }
    @Override
    public List<Cars> getCars(int count) {
        if (count == 0) {
            return carsList;
        }
        return carsList.stream().limit(count).collect(Collectors.toList());
    }

}
