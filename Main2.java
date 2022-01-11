package Final;

public class Main {

	public static void main(String[] args) {
		
		master Amy = new master("Amy", 23, "M0856195", 1, "Ian");
		Amy.printPerson();
		
		bachelor Eric = new bachelor("Eric", 20, "D0812659", 3, "SIEM");
		Eric.printPerson();
		
		teacher Leo = new teacher("Leo", 32, "T871689", 1470000);
		Leo.printPerson();
	}

}


class person {
	private String name;
	private int age;
	private String id;
	
	public person() {
		
	}
	
	public person(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	
	public void printPerson() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("ID: " + id);
	}
}

class teacher extends person {
	private int salary = 0;
	
	public teacher(String name, int age, String id, int salary) {
		super(name, age, id);
		this.salary = salary;
	}
	
	@Override
	public void printPerson() {
		super.printPerson();
		System.out.println("Teacher");
		System.out.println("Salary: " + salary);
	}
}

class student extends person {
	private int grade = 0;
	
	public student(String name, int age, String id, int grade) {
		super(name, age, id);
		this.grade = grade;
	}
}

class master extends student {
	private String adviser = "";
	
	public master(String name, int age, String id, int grade, String adviser) {
		super(name, age, id, grade);
		this.adviser = adviser;
	}
	
	@Override
	public void printPerson() {
		super.printPerson();
		System.out.println("Master");
		System.out.println("Adviser: " + adviser);
	}
}

class bachelor extends student {
	private String project = "";
	
	public bachelor(String name, int age, String id, int grade, String project) {
		super(name, age, id, grade);
		this.project = project;
	}
	
	@Override
	public void printPerson() {
		super.printPerson();
		System.out.println("Bachelor");
		System.out.println("Project: " + project);
	}
}
