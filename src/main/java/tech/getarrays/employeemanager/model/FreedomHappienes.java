package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class FreedomHappienes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(nullable = false,updatable = false)
    Long Id;
    private String country;
    private String countryIsoCode;
    private String region;
    private Double freedomScore;
    private Double happienesScore;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getFreedomScore() {
        return freedomScore;
    }

    public void setFreedomScore(Double freedomScore) {
        this.freedomScore = freedomScore;
    }

    public Double getHappienesScore() {
        return happienesScore;
    }

    public void setHappienesScore(Double happienesScore) {
        this.happienesScore = happienesScore;
    }
}

