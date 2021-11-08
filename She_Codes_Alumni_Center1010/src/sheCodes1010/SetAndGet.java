package sheCodes1010;

public class SetAndGet {
	
	private String alumniFirstName; 
	private String alumniLastName;
	private static String alumniId;
	private String permanentPasword;
	
	public SetAndGet() {
	}
	
	public String getAlumniFirstName() {
		return alumniFirstName;
	}

	public  void setAlumniFirstName(String alumniFirstName) {
		this.alumniFirstName = alumniFirstName;
	}

	public String getAlumniLastName() {
		return alumniLastName;
	}

	public  void setAlumniLastName(String alumniLastName) {
		this.alumniLastName = alumniLastName;
	}

	public String getAlumniId() {
		return alumniId;
	}

	public  void setAlumniId(String alumniId) {
		alumniId = alumniFirstName.toLowerCase() + "." + alumniLastName.toLowerCase() + ".she-codes";
		this.alumniId = alumniId;
	}

	public void setPermanentPassword(String permanentPasword) {
		this.permanentPasword = permanentPasword;
		//create permanent pass
	}
	
	public String getPermanentPassword() {
		return permanentPasword;
	}
}
