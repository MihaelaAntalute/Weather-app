package service;

import com.spring.weathweapp.model.City;
import com.spring.weathweapp.model.User;
import com.spring.weathweapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CityService {

    private UserRepository userRepository;

    @Autowired
    public CityService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
