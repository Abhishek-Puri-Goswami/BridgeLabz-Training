package com.constructors.levelone;

public class HotelBooking {
	private String guestName;
	private String roomType;
	private int nights;

    // Default Constructor
    public HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }
    
    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // method to display booking details
    public void display() {
        System.out.println("{ " + guestName + ", " + roomType + ", " + nights + " nights	 }");
    }

    // main - driver method
    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Rahul", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2);

        h1.display();
        h2.display();
        h3.display();
    }
}
