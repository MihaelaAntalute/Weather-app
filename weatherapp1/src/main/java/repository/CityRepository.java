package repository;

import com.spring.weathweapp.model.City;
import com.spring.weathweapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {

List<City> findAllByUserListContaining(User user);

}
