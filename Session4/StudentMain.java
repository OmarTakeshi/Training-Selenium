package homework4;
import java.text.ParseException;
import java.text.SimpleDateFormat; 5 import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Type the first name for the first student: ");
            String firstName1 = sc.nextLine()
            System.out.println("Type the middle name for the first student: ");
            String middleName1 = sc.nextLine();
            System.out.println("Type the last name for the first student: ");
            String lastName1 = sc.nextLine();
            System.out.println("Enter a date dd/mm/yyyy for the first student: ");
            String dateStr1 = sc2.next();
            Date datel sdf.parse(dateStr1);
            System.out.println("Input date: "+sdf.format(date1));
            Student student1 = new Student(firstName1, middleNamel, lastName1, date1);

            System.out.println("Type the first name for the second student: ");
            String firstName2 = sc.nextLine();
            System.out.println("Type the middle name for the second student: ");
            String middleName2 = sc.nextLine();
            System.out.println("Type the last name for the second student: ");
            String lastName2 = sc.nextLine();
            String lastName2 = sc.nextLine();
	    System.out.println("Enter a date dd/mm/yyyy for the second student: ");
	    String dateStr2 = sc2.next();
	    Date date2 sdf.parse(dateStr2);
	    System.out.println("Input date: "+sdf.format(date2));
	    Student student2 = new Student(firstName2, middleName2, lastName2, date2);

	    System.out.println("Type the first name for the second student: ");
	    String firstName3 = sc.nextLine();
	    System.out.println("Type the middle name for the second student: ");
  	    String middleName3 = sc.nextLine();
	    System.out.println("Type the last name for the second student: ");
	    String lastName3 = sc.nextLine();
	    System.out.println("Enter a date dd/mm/yyyy for the second student: ");
	    String dateStr3 = sc2.next();
	    Date date3 sdf.parse(dateStr3);
	    System.out.println("Input date: "+sdf.format(date3));
	    Student student3 = new Student(firstName3, middleName3, lastName3, date3);

	    student2.info();
	    student3.info();
	    student1.info();
	}catch(ParseException e) {
		System.out.println("Invalid date format");
	}
    }
}