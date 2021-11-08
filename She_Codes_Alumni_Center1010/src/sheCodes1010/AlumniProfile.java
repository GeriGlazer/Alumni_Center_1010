package sheCodes1010;

//import java.security.SecureRandom;
import java.util.Random;




public class AlumniProfile {
	
	
	
	private String alumniIdImput;
	private  String passwordImput;
	char[] oTpFromImput;
	
	SetAndGet sag = new SetAndGet();
	Management mgn = new Management();
	
	public AlumniProfile () {
	}
		
	

	
	
	
	
	void profileInfo() {
		do {
		System.out.println();
		System.out.println("_________________________________\n   - Profile info - \n");
		System.out.println(toString());
		System.out.println();
		mgn.displayCourses();
		}while (true);
	}	
	
}
