package ita3.jparelations.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String street;
    private int zip;
    private String city;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    List<Citizen> citizens = new ArrayList();

    public Address() {}

    public Address(String street, String city, int zip) {
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addCitizen(Citizen citizen){
        citizens.add(citizen);
        citizen.setAddress(this);
    }
}
