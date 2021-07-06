package com.lld.cabbooking.model;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.print.attribute.standard.Destination;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)

public class Trip {

    private UUID id;
    private UUID cabId;
    private UUID riderId;
    private Location origin;
    private Location destination;
    private TripStatus rideStatus;

    public Trip bookRide(UUID riderId,UUID cabId,Location origin,Location destination)
    { return new Trip().setId(UUID.randomUUID())
            .setCabId(cabId)
            .setDestination(destination)
            .setRiderId(riderId)
            .setOrigin(origin)
            .setRideStatus(TripStatus.ONGOING);
    }

    public UUID endTrip(){
        this.setRideStatus(TripStatus.ENDED);
        return this.getId();
    }
}
