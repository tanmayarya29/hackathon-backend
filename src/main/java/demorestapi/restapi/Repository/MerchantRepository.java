package demorestapi.restapi.Repository;

import demorestapi.restapi.Models.merchantmaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MerchantRepository extends JpaRepository<merchantmaster,Integer> {

    List<merchantmaster> findByLocation(String location);


}
