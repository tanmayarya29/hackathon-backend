package demorestapi.restapi.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class merchantmaster {

    @Id
    private int merchantid;

    private String merchantname;
    private String location;

    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
    }

    public String getMerchantname() {
        return merchantname;
    }

    public void setMerchantname(String merchantname) {
        this.merchantname = merchantname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
