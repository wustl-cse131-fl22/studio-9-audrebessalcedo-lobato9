package studio9;

import assignment7.Student;
import java.util.HashMap;
import java.util.Map;

public class UniversityDatabase {
	
	private final  Map<String, Student> database ;
	
	public UniversityDatabase() {
		this.database = new HashMap<>();
	}
	
	public void addStudent(String accountName, Student student) {
		database.put(accountName, student);
	}

	public int getStudentCount() {
		return database.size();
	}

	public String lookupFullName(String accountName) {
		Student b = database.get(accountName);
		if (b == null) {
			return null;
		}
		else {
			return b.getFullName();
		}
		
	}

	public double getTotalBearBucks() {
		double total = 0;
		for(String bucks : database.keySet()) {
			Student b = database.get(bucks);
			total += b.getBearBucksBalance();
		}
		return total;
	}
}
