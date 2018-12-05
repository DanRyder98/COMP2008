package database;

public class Student {

	public String registrationNumber;
	public String surname;
	public String forename;
	public String title;
	public String degreeName;
	public String universityEmail;
	public String personalTutor;
	
	public Student(String registrationNumber,String surname, String forename, String title, String degreeName, String universityEmail, String personalTutor) {
		this.registrationNumber = registrationNumber;
		this.surname = surname;
		this.forename = forename;
		this.title = title;
		this.degreeName = degreeName;
		this.universityEmail = universityEmail;
		this.personalTutor = personalTutor;
	}
	
}
