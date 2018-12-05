package database2;
/**
 * Class that represents a Degree
 */
public class Degree {

	public String degreeCode;
	public String degreeName;
	//Constructor
	public Degree(String dCode,String name) {
		degreeCode = dCode;
		degreeName = name;
	}
	public String toString() {
		return "degreeName = "+ degreeName +" degreeCode = " + degreeCode;
	}
}
