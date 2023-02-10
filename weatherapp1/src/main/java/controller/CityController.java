package controller;

import com.spring.weathweapp.model.City;
import com.spring.weathweapp.model.User;
import com.spring.weathweapp.service.CityService;
import com.spring.weathweapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    private UserService userService;
    private CityService cityService;

    @Autowired
    public CityController(UserService userService, CityService cityService) {
        this.userService = userService;
        this.cityService = cityService;
    }

    @PostMapping("/add/{userId}")
    public User addFavoriteCity(@RequestBody City city, @PathVariable Long userId) {
        return userService.addFavoriteCity(city, userId);
    }

    @DeleteMapping("/delete/{userId}/{cityId}")
    public User deleteCity(@PathVariable Long userId, @PathVariable Long cityId) {
        return userService.deleteCity(userId, cityId);
    }

    @GetMapping("/{userId}")
    public List<City> getUserFavoriteCities(@PathVariable Long userId) {
        return userService.getUserFavoritesCities(userId);
    }
}
