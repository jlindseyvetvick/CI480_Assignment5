import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task2_UsingStudentRecord {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);

		// get input from user for student records file & create new file object
		System.out.println("Enter the file name (ie: File.txt) to import student records: ");
		String fileName = scan.nextLine();
		System.out.println();
		
		File file = new File(fileName);
		Scanner fileScanner = new Scanner(file);
			
		// create array of new Student Record objects
		int listLength = fileScanner.nextInt();
		fileScanner.nextLine();

		StudentRecord[] studentRecordArray = new StudentRecord[listLength];
		
		//create temp variables for filling in Student Records Array
		String name="";
		int grade1=0;
		int grade2=0;
		int grade3=0;
		float gradeAvg=0;
		
		for (int i = 0; i < listLength; i++) {
		StudentRecord sr = new StudentRecord(name);
		name = sr.setName(fileScanner.next());
		grade1=fileScanner.nextInt();
		grade2=fileScanner.nextInt();
		grade3=fileScanner.nextInt();
		gradeAvg = ((grade1+grade2+grade3)/3);
		sr.setAvg(gradeAvg);
		String letterGrade = sr.determineLetterGrade(gradeAvg);
			
		studentRecordArray[i] = new StudentRecord(name, gradeAvg, letterGrade);
		}
		
		System.out.println(Arrays.toString(studentRecordArray));
	}
}