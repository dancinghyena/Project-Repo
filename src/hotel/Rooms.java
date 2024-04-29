package hotel;

import java.util.Date;

public class Rooms {
private static int next_id;
private int id;
private String name;
private boolean status;
private int pricing;
private Date booked_from;
private Date booked_to;

public Rooms(int pricing) {
	id = next_id;
	next_id++;
	this.pricing = pricing;
}
void book_room() {}
void pay() {}
}
