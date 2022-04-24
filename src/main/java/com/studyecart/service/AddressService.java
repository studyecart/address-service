package com.studyecart.service;

import com.studyecart.entity.Address;
import com.studyecart.repository.AddressRepository;
import com.studyecart.request.CreateAddressRequest;
import com.studyecart.response.AddressResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    Logger logger= LoggerFactory.getLogger(AddressService.class);
    @Autowired
    AddressRepository addressRepository;

    public AddressResponse createAddress(CreateAddressRequest createAddressRequest){

        Address address=new Address();
        address.setCity(createAddressRequest.getCity());
        address.setStreet(createAddressRequest.getStreet());
        addressRepository.save(address);
        return  new AddressResponse(address);
    }

    public AddressResponse getById(long id){

        logger.info("Inside getByID"+id);

        Address address=addressRepository.findById(id).get();
        return  new AddressResponse(address);
    }
}
