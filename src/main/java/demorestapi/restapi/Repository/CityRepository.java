package demorestapi.restapi.Repository;

import demorestapi.restapi.Models.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
}
