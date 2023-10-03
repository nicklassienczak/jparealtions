package ita3.jparelations.service;

import ita3.jparelations.entity.Address;
import ita3.jparelations.repository.IAddressRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    IAddressRepository addressRepository;

    public AddressService(IAddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Transactional
    public void printFullAddressInfo(long id, boolean includeCitizens) {

        Address address_1 = addressRepository.findById(id).get();
        System.out.println(address_1.getStreet());

        if (includeCitizens) {
            System.out.println("Citizens: " + address_1.getCitizens().size());
        }
    }
}