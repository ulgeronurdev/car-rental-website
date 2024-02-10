package com.example.carrentalproject.repository;

import com.example.carrentalproject.dto.BookACarDto;
import com.example.carrentalproject.dto.CarDto;
import com.example.carrentalproject.entity.BookACar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookACarRepository extends JpaRepository<BookACar, Long> {
    List<BookACar> findAllByUserId(Long userId);
}
