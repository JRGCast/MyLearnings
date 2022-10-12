package javaFromScratch.entities;

import java.util.Arrays;

public class Pensionate {
  private Integer roomsQty;
  private String[] rentedRooms;

  public Integer getRoomsToRent() {
    return roomsQty;
  }

  public void setRoomsToRent(Integer roomsQty) {
    this.roomsQty = roomsQty;
  }

  public String[] getRentedRooms() {
    return rentedRooms;
  }

  public void setRentedRooms(String[] rentedRooms) {
    this.rentedRooms = rentedRooms;
  }

  public Pensionate(Integer roomsQty) {
    this.roomsQty = roomsQty;
    this.rentedRooms = new String[roomsQty];
  }

  // TODO verify a way to pass an object with name, email and room
  public void rentRooms(Integer[] rooms, String[] renters) {
    for (int i = 0; i < rooms.length; i++) {
      rentedRooms[rooms[i]] = renters[i];
    }
  }

  public void showRentedRooms() {
    for (int i = 0; i < rentedRooms.length; i++) {
      if (rentedRooms[i] != null) {
        System.out.println("Room number: " + i + " is rented by: " + rentedRooms[i]);
      }
    }
  }

}
