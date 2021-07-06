package com.lld.cabbooking.database;

import com.lld.cabbooking.exception.RiderExists;
import com.lld.cabbooking.exception.RiderNotFound;
import com.lld.cabbooking.model.Rider;

import java.util.HashMap;
import java.util.UUID;

public class RiderManager {
    HashMap<UUID, Rider> riderMap = new HashMap<>();
    public void registerRider(Rider rider){
        if(riderMap.containsKey(rider.getId()))
            throw new RiderExists("Rider already registered");
        riderMap.put(rider.getId(),rider);
    }

    public Rider getRider(UUID id){
        if(!riderMap.containsKey(id))
            throw new RiderNotFound("There is no rider with that id");
       return riderMap.get(id);
    }
}
