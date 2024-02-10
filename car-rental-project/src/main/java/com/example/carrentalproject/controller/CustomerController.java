package com.example.carrentalproject.controller;


import com.example.carrentalproject.dto.BookACarDto;
import com.example.carrentalproject.dto.CarDto;
import com.example.carrentalproject.dto.SearchCarDto;
import com.example.carrentalproject.services.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;


    @GetMapping("/cars")
    public ResponseEntity<List<CarDto>> getAllCars(){
        final var cars = customerService.getAllCars();
        return ResponseEntity.ok(cars);
    }

    @PostMapping("/cars/book")
    public ResponseEntity<Void> bookACar(@RequestBody BookACarDto bookACarDto){
        Boolean success = customerService.bookACar(bookACarDto);
        if(success){
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("/car/{id}")
    public ResponseEntity<CarDto> getCarById(@PathVariable Long id){
        final var car = customerService.getCarById(id);
        if(car==null){
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(car);
    }

    @GetMapping("/car/bookings/{id}")
    public ResponseEntity<List<BookACarDto>> getBookingsByUserId(@PathVariable Long id){
        return ResponseEntity.ok(customerService.getBookingsByUserId(id));
    }

    @PostMapping("/car/search")
    public ResponseEntity<?> searchCar(@RequestBody SearchCarDto searchCarDto){
        return ResponseEntity.ok(customerService.searchCars(searchCarDto));
    }

}
