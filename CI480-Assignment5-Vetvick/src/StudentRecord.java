//custom class to generate a student record

public class StudentRecord {

	//create class attributes
	private String studentName;
	private float studentAvg;
	private String letterGrade;

	//create class constructor #1
	public StudentRecord(String name) {
		studentName=name;
		studentAvg=0;
	}
	
	//create class constructor #2
	public StudentRecord(String name, float avg) {
		studentName=name;
		studentAvg=avg;
	}

	//create class constructor #3
		public StudentRecord(String name, float avg, String lg) {
			studentName=name;
			studentAvg=avg;
			letterGrade=lg;
		}
	
	public String getName() {
		return studentName;
	}	
	
	public String setName(String name) {
		studentName = name;
		return studentName;
	}

	public float getAvg() {
		return studentAvg;
	}
	
	public void setAvg(float avg) {
		studentAvg = avg;
	}

	//method to determine the letter grade associated with a student's average
	public String determineLetterGrade(float avg) {
		letterGrade = "";

		if (studentAvg < 60) {
			letterGrade = "F";
		} else if (studentAvg > 60 && studentAvg < 70) {
			letterGrade = "D";
		} else if (studentAvg > 70 && studentAvg < 80) {
			letterGrade = "C";
		} else if (studentAvg > 80 && studentAvg < 90) {
			letterGrade = "B";
		} else if (studentAvg > 90 && studentAvg <= 100) {
			letterGrade = "A";
		}

		return letterGrade;
	}
	
	public String toString() {
		return studentName + ": " + studentAvg + "% (" + letterGrade + ")";
		
	}
}