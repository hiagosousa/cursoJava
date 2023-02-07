package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rooms;

public class Hostel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Type the amount of rooms to be rented:");
		Rooms[] allRooms = new Rooms[10];
		int amountRooms = sc.nextInt();

		for (int i = 0; i < amountRooms; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i + 1) + ":\nName: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();

			allRooms[room] = new Rooms(name, email, room);
		}
		System.out.println("Rooms currently busy:");
		for (int i = 0; i < 10; i++) {
			if (allRooms[i] != null) {
				System.out.println(allRooms[i]);
			}

		}

		sc.close();
	}

}
