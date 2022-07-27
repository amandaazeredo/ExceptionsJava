package exe1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Schedule schedule = new Schedule();

		int op = 1;
		while(op != 3) {
			op = MenuOption(sc);

			if(op == 1) { //query contact
				queryContact(sc, schedule);

			} else if(op == 2) {//add contact
				addContact(sc, schedule);

			} else if(op ==3) {//exit
				System.exit(0);
			}
		}
	}

	public static void addContact(Scanner sc, Schedule schedule) {
		System.out.println("Creating a new contact, insert infos");
		String name = ReadInfo(sc, "Name: ");
		String cellphone = ReadInfo(sc, "Cellphone: ");
		String email = ReadInfo(sc, "Email: ");

		Contact c = new Contact();
		c.setName(name);
		c.setEmail(email);
		c.setCellphone(cellphone);

		System.out.println("Contact to be created:");
		System.out.println(c);

		try {
			schedule.addContact(c);
		} catch (FullScheduleException e) {
			System.out.println(e.getMessage());
			System.out.println("Contacts from schedule");
			System.out.println(schedule);
		}
	}

	public static void queryContact(Scanner sc, Schedule schedule) {
		String contactName = ReadInfo(sc, "Insert a contact name to query");
		try {
			if(schedule.ConsultContactByName(contactName) >= 0) {
				System.out.println("Contact Exist");
			}
		} catch (ContactDoesNotExistException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String ReadInfo(Scanner sc, String msg) {
		System.out.println(msg);
		String in = sc.nextLine();
		return in;
	}
	public static int MenuOption(Scanner sc) {
		boolean validInsert = false;
		int op = 3;

		while(!validInsert) {
			System.out.println("Enter an option:");
			System.out.println("1: Query contact; 2: Add contact; 3: Exit");

			try {
				String in = sc.nextLine();
				op = Integer.parseInt(in);

				if(op == 1 || op == 2 || op == 3) {
					validInsert = true;
				} else {
					throw new Exception("Invalid Insert");
				}
			}
			catch (Exception e) {
				System.out.println("Invalid Insert, Try again");
			}
		}
		return op;
	}
}
