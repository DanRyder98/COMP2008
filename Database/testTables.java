package database2;

import java.util.ArrayList;
import java.util.List;

public class testTables {
	//"student1","student2","student3"
	public static List<Module> getModuleList(String student){
		List<Module> l = new ArrayList<>();
		l.add(new Module("PSY101","Introduction to Psychology","Autumn", "Psychology", 10));
		
		if(student == "1") {
			List<Module> li = new ArrayList<>();
			li.add(new Module("COM2008","Internet and web technology","Autumn", "Computer Science", 20));
			return li;
		}
		if(student == "2") {
			List<Module> li = new ArrayList<>();
			li.add(new Module("COM2108","Functional Programming","Autumn", "Computer Science", 20));
			return li;
		}
		if(student == "3") {
			List<Module> li = new ArrayList<>();
			li.add(new Module("PSY101","Introduction to Psychology","Autumn", "Psychology", 10));
			return li;
		}
		return l;
	}

}
