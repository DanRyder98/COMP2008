package database2;

public class Module {
	public String moduleCode;
	public String moduleName;
	public String sessionOfStudy;
	public String departmentName;
	public int credits;
	
	public Module(String moduleCode,String moduleName,String sessionOfStudy, String departmentName, int credits) {
		this.moduleCode = moduleCode;
		this.moduleName = moduleName;
		this.sessionOfStudy = sessionOfStudy;
		this.departmentName = departmentName;
		this.credits = credits;
	}
	public Module(String moduleCode,String moduleName, int credits) {
		this.moduleCode = moduleCode;
		this.moduleName = moduleName;
		this.credits = credits;
	}
	public String toString() {
		return "moduleName = " + moduleName + "moduleCode = " + moduleCode + 
			   "sessionOfStudy = " + sessionOfStudy + "departmentName = " + departmentName + " credits = " + credits; 
	}

}
