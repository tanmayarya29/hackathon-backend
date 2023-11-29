package demorestapi.restapi.Repository;

import demorestapi.restapi.DTO.MerchantIdDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository

public class OfferRepoCustom {

           private final JdbcTemplate jdbcTemplate;

        @Autowired
        public OfferRepoCustom(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
        }

        public List<Map<String, Object>> executeCustomQuery(List<MerchantIdDTO> merchantIdDTOS) {

                StringBuilder stringBuilder = new StringBuilder();

                for (MerchantIdDTO merchantIdDTO : merchantIdDTOS) {
                    int merchantId = merchantIdDTO.getMerchantId();
                    stringBuilder.append(merchantId).append(",");
                }

                // Remove the trailing comma if there is at least one merchantId
                if (stringBuilder.length() > 0) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }


            String sqlQuery = "select merchantname,offertitle,description from offers inner join merchantmaster me on offers.merchantid = me.merchantid where me.merchantid in ("+ stringBuilder+ ")";
                System.out.println(sqlQuery);
            return jdbcTemplate.queryForList(sqlQuery);
        }
    }


