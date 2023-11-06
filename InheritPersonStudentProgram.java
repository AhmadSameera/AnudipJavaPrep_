package anudip_assignment;


class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void speak() {
		System.out.println(name+" is the name of the Student.");
		System.out.println(age+" is the age of the Student.");
	}
}

class Student1 extends Person{
	String grade;

	public Student1(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}
	void study() {
		System.out.println(name+" got the grade "+grade+".");
		
	}
}
public class InheritPersonStudentProgram {

	public static void main(String[] args) {
		Student1 student= new Student1("Shyam",20,"A");
		student.speak();
		student.study();
	}

}
