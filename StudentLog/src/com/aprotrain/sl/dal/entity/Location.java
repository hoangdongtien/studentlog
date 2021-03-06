package com.aprotrain.sl.dal.entity;
// Generated Apr 18, 2015 3:08:48 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Location generated by hbm2java
 */
public class Location  implements java.io.Serializable {


     private byte locationId;
     private String locationName;
     private Serializable locationAddress;
     private Serializable remarks;
     private Set rooms = new HashSet(0);

    public Location() {
    }

	
    public Location(byte locationId) {
        this.locationId = locationId;
    }
    public Location(byte locationId, String locationName, Serializable locationAddress, Serializable remarks, Set rooms) {
       this.locationId = locationId;
       this.locationName = locationName;
       this.locationAddress = locationAddress;
       this.remarks = remarks;
       this.rooms = rooms;
    }
   
    public byte getLocationId() {
        return this.locationId;
    }
    
    public void setLocationId(byte locationId) {
        this.locationId = locationId;
    }
    public String getLocationName() {
        return this.locationName;
    }
    
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
    public Serializable getLocationAddress() {
        return this.locationAddress;
    }
    
    public void setLocationAddress(Serializable locationAddress) {
        this.locationAddress = locationAddress;
    }
    public Serializable getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(Serializable remarks) {
        this.remarks = remarks;
    }
    public Set getRooms() {
        return this.rooms;
    }
    
    public void setRooms(Set rooms) {
        this.rooms = rooms;
    }




}


