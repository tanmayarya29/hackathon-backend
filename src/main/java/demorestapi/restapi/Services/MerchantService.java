package demorestapi.restapi.Services;

import demorestapi.restapi.DTO.MerchantDTO;
import demorestapi.restapi.DTO.MerchantIdDTO;
import demorestapi.restapi.Models.merchantmaster;
import demorestapi.restapi.Repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class MerchantService {


        @Autowired
        private MerchantRepository merchantRepository;

        public MerchantDTO getMerchant(int merchantid) {
            merchantmaster merchant = merchantRepository.getById(merchantid);

            // Convert entity to DTO
            MerchantDTO dto = new MerchantDTO();
            dto.setMerchantid(merchant.getMerchantid());
            dto.setMerchantname(merchant.getMerchantname());
            dto.setLocation(merchant.getLocation());

            return dto;        }

    public List<MerchantIdDTO> getMerchantsByLocation(String location) {
        List<merchantmaster> merchants = merchantRepository.findByLocation(location);

        // Convert entities to DTOs
        List<MerchantIdDTO> dtos = new ArrayList<>();
        for (merchantmaster merchant : merchants) {
            MerchantIdDTO dto = new MerchantIdDTO();
            dto.setMerchantId(merchant.getMerchantid());
            dtos.add(dto);
        }

        return dtos;
    }



}
