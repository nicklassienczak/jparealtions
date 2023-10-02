package ita3.jparelations.utils;

import ita3.jparelations.entity.Address;
import ita3.jparelations.entity.Citizen;
import ita3.jparelations.repository.IAddressRepository;
import ita3.jparelations.repository.ICitizenRepository;
import ita3.jparelations.repository.ITownRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeveloperData implements ApplicationRunner {

    IAddressRepository addressRepository;
    ICitizenRepository citizenRepository;
    ITownRepository townRepository;

    public DeveloperData(IAddressRepository address, ICitizenRepository citizen, ITownRepository town) {
        this.address = address;
        this.citizen = citizen;
        this.town = town;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Address a1 = new Address("Lyngbyvej 1", "Lyngby", "2800");
        Citizen citizen1 = new Citizen("Kurt", "Wonnegut", "a@b.dk","123");
        Citizen citizen2 = new Citizen("Hanne", "Wonnegut", "h@b.dk", "234");
        a1.addCitizen(citizen1);
        a1.addCitizen(citizen2);
        addressRepository.save(a1) //Save the address

    }
}
