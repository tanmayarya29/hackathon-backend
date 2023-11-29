package demorestapi.restapi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class offers {
    @Id
    private int offerid;

    private String offertitle ;

    private String description;

    private int merchantid;

    private String image;

    public int getOfferid() {
        return offerid;
    }

    public void setOfferid(int offerid) {
        this.offerid = offerid;
    }

    public String getOffertitle() {
        return offertitle;
    }

    public void setOffertitle(String offertitle) {
        this.offertitle = offertitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
