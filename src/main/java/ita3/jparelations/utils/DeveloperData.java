package ita3.jparelations.utils;

import ita3.jparelations.repository.IAddressRepository;
import ita3.jparelations.repository.ICitizenRepository;
import ita3.jparelations.repository.ITownRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeveloperData implements ApplicationRunner {

    IAddressRepository address;
    ICitizenRepository citizen;
    ITownRepository town;

    public DeveloperData(IAddressRepository address, ICitizenRepository citizen, ITownRepository town) {
        this.address = address;
        this.citizen = citizen;
        this.town = town;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
