package database2;

public class Grade {

	public String registrationNumber;
	public String label;
	public String moduleName;
	public double initialGrade;
	public double resitGrade;
	
	public Grade(String registrationNumber,String label, String moduleName, double initialGrade, double resitGrade) {
		this.registrationNumber = registrationNumber;
		this.label = label;
		this.moduleName = moduleName;
		this.initialGrade = initialGrade;
		this.resitGrade = resitGrade;
	}
}
