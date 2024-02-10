package com.example.carrentalproject.services.customer;

import com.example.carrentalproject.dto.BookACarDto;
import com.example.carrentalproject.dto.CarDto;
import com.example.carrentalproject.dto.CarDtoListDto;
import com.example.carrentalproject.dto.SearchCarDto;

import java.util.List;

public interface CustomerService {

    List<CarDto> getAllCars();

    boolean bookACar(BookACarDto bookACarDto);

    CarDto getCarById(long id);

    List<BookACarDto> getBookingsByUserId(Long userId);

    CarDtoListDto searchCars(SearchCarDto searchCarDto);
}
