package com.lld.cabbooking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)

public class Cab {
    private UUID id;
    private String name;
    private Long seatingCapacity;
    private Long currentLocation;


}
