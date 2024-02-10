package com.example.carrentalproject.entity;

import com.example.carrentalproject.dto.CarDto;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String brand;
    private String color;
    private String name;
    private String type;
    private String transmission;
    private String description;
    private Long price;
    private Date year;
    @Column(columnDefinition = "longblob")
    private byte[] image;

    public CarDto getCarDto(){
        CarDto carDto = new CarDto();
        carDto.setId(this.id);
        carDto.setBrand(this.brand);
        carDto.setColor(this.color);
        carDto.setName(this.name);
        carDto.setType(this.type);
        carDto.setTransmission(this.transmission);
        carDto.setDescription(this.description);
        carDto.setPrice(this.price);
        carDto.setYear(this.year);
        carDto.setReturnedImage(this.image);
        return carDto;
    }
}
