import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

//Name: Dana-Lee Powell
//Id;1800995
public class Students {
	private int stu_id;
	private String stu_name;
	private String stu_num;

	public Students(int stud_id, String stud_name, String stud_num) {
		stu_id = stud_id;
		stu_name = stud_name;
		stu_num = stud_num;
	}

	public void storeDetails() {
		FileWriter file = null;
		PrintWriter writer = null;
		try {
			file = new FileWriter("students_info.txt", true);
			writer = new PrintWriter(file);
			writer.printf("%d, %s, %s", this.toString());
			writer.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void Display() {
		System.out.println(
				"Student ID:" + this.stu_id + "Student Name:" + this.stu_name + "Student Number" + this.stu_num);
	}

	public void getStudentbyid(int stu_id) {
		ArrayList <Students> studentlist = new ArrayList (studentlist);
		try {
			Scanner m = new Scanner(new stu_id("Read.txt"));
			in.use;
		}
	}

	@Override
	public String toString() {
		return "Student [ID=" + stu_id + ", Name=" + stu_name + ", Number=" + stu_num + "]";
	}

}
