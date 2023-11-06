package anudip_assignment;
interface PersonInterface1 {
	void speak();
}
class StudentInterface implements PersonInterface1 {
    @Override
    public void speak() {
        System.out.println("Student is speaking.");
    }
}

// Create the Teacher class that implements the Person interface
class TeacherInterface implements PersonInterface1 {
    @Override
    public void speak() {
        System.out.println("Teacher is speaking to students.");
    }
}
public class StudentTeacherwuthInterface {

	public static void main(String[] args) {
		 // Create objects of the Student and Teacher class
		StudentInterface student = new StudentInterface();
        TeacherInterface teacher = new TeacherInterface();

        // Call the speak method for the Student and Teacher objects
        student.speak(); 
        teacher.speak(); 
	}

}
