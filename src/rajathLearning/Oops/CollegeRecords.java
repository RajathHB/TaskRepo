package rajathLearning.Oops;

public class CollegeRecords {
	
	String college_name;
	String student_name;
	String reg_number;
	String course;
	
	CollegeRecords() {
		college_name = "Jain Institution";
		student_name = "Rajath";
		reg_number = "4JD14CV080";
		course = "C Cycle";
		System.out.println("Default");
	}
	
	CollegeRecords (String college , String student,String registration_id, String course){
		this.college_name = college;
		this.student_name = student;
		this.reg_number = registration_id;
		this.course = course;
		System.out.println("Param");
		
	}
	 void printdetails() {
		 System.out.println("College Name -> " +this.college_name);
		 System.out.println("Student Name -> " +this.student_name);
		 System.out.println("reg_number -> " +this.reg_number);
		 System.out.println("course -> " +this.course);
		 
	 }
}
