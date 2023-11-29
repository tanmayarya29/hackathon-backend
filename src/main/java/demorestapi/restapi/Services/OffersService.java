package demorestapi.restapi.Services;

import demorestapi.restapi.DTO.MerchantIdDTO;
import demorestapi.restapi.Models.City;
import demorestapi.restapi.Models.offers;
import demorestapi.restapi.Repository.CityRepository;
import demorestapi.restapi.Repository.OfferRepoCustom;
import demorestapi.restapi.Repository.OffersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service

public class OffersService {
    private final OfferRepoCustom repository;

    @Autowired
    private OffersRepository offersRepository;

    @Autowired
    public OffersService(OfferRepoCustom repository) {
        this.repository = repository;
    }

    public List<Map<String, Object>> executeCustomQuery(List<MerchantIdDTO> merchantIdDTOS) {
        return repository.executeCustomQuery(merchantIdDTOS);
    }
    public offers createOffer(offers offer) {
        return offersRepository.save(offer);
    }
    public List<offers> getAllOffers() {
        return offersRepository.findAll();
    }

    public Optional<offers> getOfferById(int id) {
        return offersRepository.findById((long) id);
    }

    public void deleteAllOffers() {
        offersRepository.deleteAll();
    }

    public void deleteOffer(int id) {
         offersRepository.deleteById((long) id);
    }


}
