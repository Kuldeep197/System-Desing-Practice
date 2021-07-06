package com.lld.cabbooking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor

public class Location {
    private Integer x1;
    private Integer y1;

    public double distance(Location location){
        return Math.sqrt(Math.pow(this.x1-location.getX1(),2) + Math.pow(this.y1 - location.getY1(),2));
    }
}
