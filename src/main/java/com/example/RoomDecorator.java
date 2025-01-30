package com.example;

public abstract class RoomDecorator implements Room {
  
    private final Room room;

    public RoomDecorator(Room room) {
        this.room = room;
    }

    public void printFurniture() {
        room.printFurniture();
    }

}
