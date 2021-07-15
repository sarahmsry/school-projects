//Sarah Masry
//Panther ID: 002519149
//Due: April 9

public class lab13Client{
	public static void main(String[] args) {
		Student Alex = new Student(150, 18, 170, "CS", 3.4, 54); //Object of class Student
		Doctor Jack = new Doctor(179, 40, 173, 4, "Dermatology"); //Object of class Doctor
		
		//Information about Alex and Jack is printed below
		System.out.println("Alex's major is: " + Alex.getMajor() + ", GPA is: " + Alex.getGPA() + ", Year is: " + Alex.getYear() + 
				", Age is: " + Alex.getAge());
        System.out.println("Jack's Speciality is: " + Jack.getSpecialty() + ", Height is: " + Jack.getHeight() + ", Weight is: "
                + Jack.getWeight() + ", Salary is: " + Jack.getSalary());
	}
}