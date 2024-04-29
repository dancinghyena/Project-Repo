import java.io.IOException;

import hotel.Rooms;

public class Customer {

	public static void main(String[] args) {
		

	}

}
class User{
	private static int  nextid = 0;
	private int id;
	private String email;
	private String password;
	private String debit_card;
	
	public User(String email,String password,String debit_card) throws IOException {
		this.email =email;
		this.password =password;
		this.id =nextid;
     	nextid++;
	}
	int getID(User u) {
		return id;
	}
}