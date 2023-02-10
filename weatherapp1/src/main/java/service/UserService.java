package service;

import com.spring.weathweapp.model.City;
import com.spring.weathweapp.model.User;
import com.spring.weathweapp.repository.CityRepository;
import com.spring.weathweapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;
    public CityRepository cityRepository;

    @Autowired
    public UserService(UserRepository userRepository, CityRepository cityRepository) {
        this.cityRepository = cityRepository;
        this.userRepository = userRepository;
    }

    public User addFavoriteCity(City city, Long userId) {
        User foundUser = userRepository.findById(userId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "user not found"));
        foundUser.getCityList().add(city);
        city.getUserList().add(foundUser);
        return userRepository.save(foundUser);
    }

    public User deleteCity(Long userId, Long cityId) {
        User foundUser = userRepository.findById(userId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "user not found"));
        City foundCity = cityRepository.findById(cityId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "city not found"));
        foundUser.getCityList().remove(foundCity);
        foundCity.getUserList().remove(foundUser);
        return userRepository.save(foundUser);
    }

    public List<City> getUserFavoritesCities(Long userId) {
        User foundUser = userRepository.findById(userId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "user not found"));
        return cityRepository.findAllByUserListContaining(foundUser);
    }

    {

    }

}
