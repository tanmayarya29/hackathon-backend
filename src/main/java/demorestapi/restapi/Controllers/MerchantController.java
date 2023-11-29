package demorestapi.restapi.Controllers;

import demorestapi.restapi.DTO.MerchantIdDTO;
import demorestapi.restapi.Models.offers;
import demorestapi.restapi.Repository.OfferRepoCustom;
import demorestapi.restapi.Services.MerchantService;
import demorestapi.restapi.Services.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "*",allowedHeaders = "*") //Allowed headers will  be restricted

@RestController
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    private final OfferRepoCustom offerRepoCustom;

    @Autowired
    private OffersService offersService;

    @Autowired
    public MerchantController(OfferRepoCustom offerRepoCustom) {
        this.offerRepoCustom = offerRepoCustom;
    }

    @RequestMapping(value = "/getoffersnearby", method = RequestMethod.POST)
    public List<Map<String, Object>> getoffersnearby(@RequestBody int merchantid) {
        String location =  merchantService.getMerchant(merchantid).getLocation();

        List<MerchantIdDTO> merchantIdDTOSList = merchantService.getMerchantsByLocation(location);
        return offerRepoCustom.executeCustomQuery(merchantIdDTOSList);

    }

    @RequestMapping(value = "/addoffer", method = RequestMethod.POST)
    public int create(@RequestBody offers offer) {
        offersService.createOffer(offer);
        return 1;
    }
    @RequestMapping(value = "/getalloffers", method = RequestMethod.GET)
    public List<offers> getAllOffers() {
        return offersService.getAllOffers();
    }
    @GetMapping("/getOfferById/{id}")
    public Optional<offers> getOfferById(@PathVariable int id) {
        return offersService.getOfferById(id);
    }

    @RequestMapping(value = "/deleteOfferById/{id}", method = RequestMethod.DELETE)
    public void deleteOfferById(@PathVariable int id) {
         offersService.deleteOffer(id);
    }
}
