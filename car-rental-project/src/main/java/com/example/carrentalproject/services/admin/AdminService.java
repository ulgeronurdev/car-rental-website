package com.example.carrentalproject.services.admin;

import com.example.carrentalproject.dto.BookACarDto;
import com.example.carrentalproject.dto.CarDto;
import com.example.carrentalproject.dto.CarDtoListDto;
import com.example.carrentalproject.dto.SearchCarDto;

import java.io.IOException;
import java.util.List;

public interface AdminService {

    boolean postCar(CarDto carDto) throws IOException;

    List<CarDto> getAllCars();

    void deleteCar(Long id);

    CarDto getCarById(Long id);

    boolean updateCar(Long id, CarDto carDto) throws IOException;

    List<BookACarDto> getBookings();

    boolean changeBookingsStatus(Long bookId, String status);

    CarDtoListDto searchCars(SearchCarDto searchCarDto);
}
