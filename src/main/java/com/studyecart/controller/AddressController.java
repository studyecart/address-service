package com.studyecart.controller;

import com.studyecart.request.CreateAddressRequest;
import com.studyecart.response.AddressResponse;
import com.studyecart.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    @Autowired
    AddressService addressService;

@PostMapping("/create")
    public AddressResponse createAddress(@RequestBody CreateAddressRequest createAddressRequest){
    return addressService.createAddress(createAddressRequest);
}

<<<<<<< HEAD
@GetMapping("/getById/{id}")
=======
@GetMapping("/getByid/{id}")
>>>>>>> 806fd78 (new address service added)
    public AddressResponse getById(@PathVariable long id){

    return addressService.getById(id);
}

}
