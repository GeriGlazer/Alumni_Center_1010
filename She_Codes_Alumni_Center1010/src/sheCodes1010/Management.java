package sheCodes1010;

import java.util.Scanner;

// add, up-date and remove
class Management {
	
	static String[] coursesList = new String[10];
	private String linkedInPage;
	String linkedInLink;
	private String permanentPasword;
	static Scanner scanner = new Scanner(System.in);
	SetAndGet sagM = new SetAndGet();
	
	public static void setAlumniCourses() {		
		System.out.println("Please make a list of completed Courses: -->Enter 'S' to stop adding courses<--");
		
		for (int i=0; i < coursesList.length; i++) {
			if(coursesList[i]==null||coursesList[i].contains("Empty")) {
				System.out.println("Completed Course Name: ");
				coursesList[i]=scanner.next();
			}
			if(coursesList[i].equals("s") || coursesList[i].equals("S")) {
				coursesList[i]=null;
				break;
			}
		}
	}
	
	public String getCourses() {
		String startingCourseList = "Empty";
		for(String cl : coursesList) {
			startingCourseList = cl;
			if(startingCourseList!=null) {
			System.out.println(startingCourseList);
			}
		}return startingCourseList;
	}
	
	public void  displayCourses() {
		coursesList[0] = "Empty";
		System.out.println("Resume: ");
		for(int i=0; i<coursesList.length;i++) {
			
			if (coursesList[i] == null ||coursesList[0].contains("Empty")){
				System.out.print("No courses listed yet.");
				System.out.println();
				setAlumniCourses();
				break;
			}
			if (coursesList[i] != null) {	
				System.out.println((i+1) + "." + coursesList[i]);
				}
		}
	}
	
	public void addCourses() {
		System.out.println("Add Courses to resume: -->Enter 'S' to stop adding courses<--");
		
		for (int i=0; i < coursesList.length; i++) {
			if(coursesList[i]==null) {
				System.out.println("Completed Course Name: ");
				coursesList[i]=scanner.next();
			}
			if(coursesList[i].equals("s") || coursesList[i].equals("S")) {
				coursesList[i]=null;
				System.out.println("Resume updated.");
				break;
			}
		}
	}
	
	public void setLinkedInPage() {
		System.out.println("LinkedIn profile? y/n: ");
		linkedInLink = scanner.nextLine();
		do {
			//linkedInLink = scanner.nextLine();
			if(linkedInLink.matches("n")||linkedInLink.matches("N")) {
			System.out.println("OK! Let's move on!!");
			}
			else {
				System.out.println("Enter URL link:");
				linkedInLink = scanner.nextLine();
				linkedInPage = linkedInLink;
				System.out.println("LinkedIn page setted.");
				break;
				}
		}while(true);
			/*System.out.println("Enter URL link:");
			linkedInLink = scanner.nextLine();
			linkedInPage = linkedInLink;
		}while (linkedInLink.equals("y"));
		
		//isTherelinkedInLink=false;
		System.out.println("LinkedIn profile? y/n: ");
		linkedInLink = scanner.nextLine();
		if (linkedInLink.matches("n")||linkedInLink.matches("N")) {
			System.out.println("OK! Let's move on!!");
			displayProfileMenu();
		}else {
			System.out.println("Enter URL link:");
			linkedInLink = scanner.nextLine();
			linkedInPage = linkedInLink;
			}
		do {
			System.out.println("Enter URL link:");
			linkedInLink = scanner.nextLine();
			linkedInPage = linkedInLink;
		}while (!linkedInLink.matches("n")||!linkedInLink.matches("N"));
		
		if (linkedInLink.matches("n")||linkedInLink.matches("N")) {
			System.out.println("OK! Let's move on!!");
		}
		
		if (linkedInLink.matches("n")||linkedInLink.matches("N")) {
			System.out.println("OK! Let's move on!!");
			displayProfileMenu();
		}else {
			do {
				System.out.println("Enter URL link:");
				linkedInLink = scanner.nextLine();
				linkedInPage = linkedInLink;
			}while (!linkedInLink.matches("n")||!linkedInLink.matches("N"));
		}*/	
	}
	
	public String getLinkedInPage() {
		return linkedInPage;
	}	
	
	public void permanentPassword(){
		//change password
		permanentPasword = scanner.next();
		isValidPassword(permanentPasword);
		sagM.setPermanentPassword(permanentPasword);
	}
	
	public boolean isValidPassword(String permanentPasword) {
		boolean isValid = true;
		if(permanentPasword.length()>10||permanentPasword.length()<6) {
			System.out.println("Password must be less than 10 and more than 6 alpha numeric characters(Aa123@,#,$,%) in length.");
			System.out.println("Enter a valid password:");
			permanentPassword();
			isValid = false;
		}
		String upperCaseChar = "(.*[A-Z].*)";
		if(!permanentPasword.matches(upperCaseChar)) {
			System.out.println("Password must have at least one uppercase character");
			System.out.println("Enter a valid password:");
			permanentPassword();
			isValid = false;
		}
		String lowerCaseChar = "(.*[a-z].*)";
		if(!permanentPasword.matches(lowerCaseChar)) {
			System.out.println("Password must have at least one lowercase character");
			System.out.println("Enter a valid password:");
			permanentPassword();
			isValid = false;
		}
		String specialChars = "(.*[@,#,$,%].*$)";
		if(!permanentPasword.matches(specialChars)) {
			System.out.println("Password must have at least one special character among !@#$%^&*_-=+/.?<>");
			System.out.println("Enter a valid password:");
			permanentPassword();
			isValid = false;
		}
		return isValid;
	}
	
	public void shouldOfferJob() {
		boolean doesMeetRequirements = true;
		int jobOfferOptions;
		System.out.println("She-codes can help you find a fitting job based on your resume, are you intrested?");
			do {
				System.out.println("1 - Not looking for a change.");
				System.out.println("2 - Not looking but open for suggestions.");
				System.out.println("3 - Looking for a new challenge.");			
				jobOfferOptions = scanner.nextInt();
				if(jobOfferOptions <1 ||jobOfferOptions >3) {
					System.out.println(" Invalid choise.Please choose 1-3");
				}
			}while(jobOfferOptions <1 ||jobOfferOptions >3);
			
			switch(jobOfferOptions) {
			
			case 1:
					System.out.println("OK, update me if you change your mind.");
					doesMeetRequirements = false;
					break;
					
			case 2:
					System.out.println("OK, Let's see what we can offer you!");
					doesMeetRequirements = true;
					break;
					
			case 3:
					System.out.println("Great!, Let's see what we can do for you!");
					doesMeetRequirements = true;
					break;
			}
	}
			
	@Override
	public  String toString() {
		return ("Alumni Name: " + sagM.getAlumniFirstName() + " " +sagM.getAlumniLastName() +
				"\nAlumni ID: "+ sagM.getAlumniId() + "\nResume: " + getCourses());
	}
}
