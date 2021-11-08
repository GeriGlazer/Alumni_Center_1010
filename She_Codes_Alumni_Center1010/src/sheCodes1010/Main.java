package sheCodes1010;

import java.util.Random;
import java.util.Scanner;

class Main {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		AlumniProfile alumni1 = new AlumniProfile();
		Management mgn = new Management();
		SetAndGet sag = new SetAndGet();
		
		System.out.println("        WELCOME TO THE ALUMNI SHE-CODES SYSTEM        ");
		
		do{
			do {
			displayMenu();

			option = getMenuOption(scanner);
			if(option <1 ||option >2) {
				System.out.println(" Invalid choise.Please choose between 1 and 2");
			}
			if (option == 1) {
				registerNewGrad(sag, scanner);	
			}
			else if (option ==2) {
				sheCodesLogin(sag, mgn, scanner);
				do{
					//alumni1.profileInfo();
				displayProfileMenu(sag, mgn, scanner);
				}while(true);
			}
		}while(option <1 ||option >2);
		}while (true);	
		
	}
	static int option;
	
	//jointMethod interface
	static void displayMenu() {
	
		System.out.println("_________________________________\n   - Menu - \n");
		System.out.println("1 - New Registration");
		System.out.println("2 - Login");
			
	}
	
	static int getMenuOption(Scanner scanner) {
		System.out.print("Enter option: ");
		option = scanner.nextInt();
		System.out.println();
		return option;
	}
	
	public static void displayProfileMenu(SetAndGet sag, Management mgn,Scanner scanner) {
		
		int upDateOption;
		
		do {
			System.out.println("_________________________________\n   - Profile Menu - \n");
			System.out.println("1 - Update Password");
			System.out.println("2 - Update resume");
			System.out.println("3 - Add LinkedIn page");
			System.out.println("4 - Job offer");
			System.out.println("5 - Log Off");
			System.out.print("Enter option: ");
			upDateOption = scanner.nextInt();
			if(upDateOption <1 ||upDateOption >5) {
				System.out.println(" Invalid choise.Please choose 1-5");
			}
		}while(upDateOption <1 ||upDateOption >5);
		
		switch(upDateOption) {
	
		case 1:
				System.out.println("Enter new password using 6 to 10 alpha-numeric characters(Aa123!@#)\"");
				mgn.permanentPassword();
				System.out.println("New password setted.");
				//profileInfo();
				break;
			
		case 2:
				mgn.addCourses();
				//profileInfo();
				break;
			
		case 3:	
				mgn.setLinkedInPage();
				//profileInfo();
				break;
			
		case 4:
				mgn.shouldOfferJob();
				//profileInfo();
				break;
				
		case 5:
			System.out.println("Logging off............");
			break;
		}
		sheCodesLogin(sag, mgn, scanner);
		if(upDateOption!=5){
			displayProfileMenu(sag, mgn, scanner);
		}
	}

	public static void registerNewGrad(SetAndGet sag,Scanner scanner) {
		String firstName;
		String lastName;

		
		System.out.print("First Name: ");
		sag.setAlumniFirstName(scanner.nextLine());
		System.out.print("Last name: ");
		sag.setAlumniLastName(scanner.nextLine());
		String alumniId;
		sag.setAlumniId(alumniId);
		System.out.println();
		System.out.println("Your new Alumni ID is: "  + sag.getAlumniId());
		System.out.println();
		System.out.print("Your temporary password is:    ");
		char[] userOtP = oTp(8);
		System.out.println(userOtP);	
	}
	
	//Generate OTP 8 alphanumeric characters
		public static char[] oTp (int length) {		
			String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String smallChars = "abcdefghijklmnopqrstuvwxyz";
			String numbers = "0123456789";
			String symbols = "!@#$%^&*_-=+/.?<>";
					
			String values = capitalChars + smallChars + numbers + symbols;
						
			Random oneTimePassword = new Random();
			char[] password = new char[length];
						
			for(int i = 0; i<length;i++) {
				password[i] = values.charAt(oneTimePassword.nextInt(values.length()));
			}
			return password;
			}
	public static void  sheCodesLogin(SetAndGet sag, Management mgn, Scanner scanner) {
		System.out.print("ID: ");
		String alumniIdImput = scanner.nextLine();
		System.out.println();
		System.out.print("Password (OTP if logging in for the first time): ");
		String passwordImput = scanner.nextLine();
		char [] oTpFromImput = passwordImput.toCharArray();
		System.out.println("Please change OTP for permanent password using 6 to 10 alpha-numeric characters(Aa123!@#)\"");
		mgn.permanentPassword();
		System.out.println();
		System.out.print("Loging in....");
		System.out.println();
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("Welcome " + sag.getAlumniFirstName() + " " + sag.getAlumniLastName() + " to the Alumni Profile.");
	}	
}
