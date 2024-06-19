package homework4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Student {
	public int studentId;
	public String firstName, middleName, lastName;
	public Date dob;

	public Student(String firstName, String middleName, String lastName, Date dob) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName lastName;
		this.dob dob;
		Random random = new Random(System.currentTimeMillis());
		studentId = random.nextInt(100);
	}

	public String completeName() {
		return firstName+" "+middleName+" "+lastName;
	}
	
	@SuppressWarnings("deprecation")
	public void info() {
		System.out.println("------------------------------------"
		+"\nStudent ID: "+studentId +"\nName: "+completeName()
		+"\nDate of birth: "+dob.getDate()+"/"+dob.getMonth()+"/"+dob.getYear()
		+"\n------------------------------------");
	}
}
