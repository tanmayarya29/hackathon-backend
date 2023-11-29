package demorestapi.restapi.Services;

import demorestapi.restapi.Models.City;
import demorestapi.restapi.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {


    @Autowired
    private CityRepository cityRepository;

    public City createCity(City city) {
        return cityRepository.save(city);
    }

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public Optional<City> getCityById(int id) {
        return cityRepository.findById(id);
    }

    public void deleteAllCities() {
        cityRepository.deleteAll();
    }

    public void deleteCity(int id) {
        cityRepository.deleteById(id);
    }
}

