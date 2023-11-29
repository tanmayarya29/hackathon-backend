package demorestapi.restapi.Repository;

import demorestapi.restapi.Models.offers;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface OffersRepository extends JpaRepository<offers, Long> {
    }


