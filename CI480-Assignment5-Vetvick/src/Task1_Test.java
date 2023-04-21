public class Task1_Test {

	public static void main(String[] args) {
				
		float avg = (92 + 92 + 92) / 3;
		String name = "Lindsey";

		StudentRecord l = new StudentRecord(name, avg);
		l.determineLetterGrade(avg);
		System.out.println(l.toString());
		
	}

}
