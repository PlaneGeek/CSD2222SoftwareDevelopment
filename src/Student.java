
public class Student {
	

		private String name; //name has a defualt value null
		private int age; //Age
		private char gender;
		private String programme; 
		
		
		
		// construct a student 
		public Student (String name, int age, char gender){
			this.name = name;
			this.age = age;
			this.gender = gender;
			//this.programme = programme;
			
			
		}
	public void displayStudentDetails() {
		System.out.println("Name: " + name + " Age: " + age + "Gender:" + gender + "Programme:" + programme);

	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme){
		this.programme = programme;

	}

	}

