package main;

import ro.ase.cts.singleton.Hotel;

public class Main {
    public static void main(String[] args){
        Hotel hotel1 = Hotel.getInstance("Trivago", 10,5);
        Hotel hotel2 = Hotel.getInstance("MegaHotel", 200, 80);

        hotel1.rezervaCamera();
        hotel1.rezervaCamera();

        hotel2.rezervaCamera();
        hotel2.rezervaCamera();

    }
}
