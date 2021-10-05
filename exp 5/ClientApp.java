
public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Course[] list1 = {new Course(), new Course(), new Course()}; //innitialise at instantiation
				//Course[] list2 = {new Course(), new Course(), new Course()}; //innitialise at instantiation
				//Course[] list3 = {new Course(), new Course(), new Course()}; //innitialise at instantiation
				
				Student s1,s2,s3,s4,s5; //create objects==>innitialise this
				s1=new Student("Joseph", 101);
				Course[] s1_courses = {new Course("cs106","Object-Oriented_Programmings",3,52.0), new Course("cs101","DS & Algorithms",3,52.0), new Course("cs103","Operating System",3,52.0)};
				s1.courses=s1_courses;
				
				s2=new Student("John", 102);
				Course[] s2_courses = {new Course("cs106","Object-Oriented_Programmings",3,52.0), new Course("cs101","DS & Algorithms",3,52.0), new Course("cs103","Operating System",3,52.0)};
				s2.courses=s2_courses;
				
				s3=new Student("David", 103);
				Course[] s3_courses = {new Course("cs106","Object-Oriented_Programmings",3,52.0), new Course("cs101","DS & Algorithms",3,52.0), new Course("cs103","Operating System",3,52.0)};
				s3.courses=s3_courses;
				
				s4=new Student("Solom", 104);
				Course[] s4_courses = {new Course("cs106","Object-Oriented_Programmings",3,52.0), new Course("cs101","DS & Algorithms",3,52.0), new Course("cs103","Operating System",3,52.0)};
				s4.courses=s4_courses;
				
				s5=new Student("Adam", 105);
				Course[] s5_courses = {new Course("cs106","Object-Oriented_Programmings",3,52.0), new Course("cs101","DS & Algorithms",3,52.0), new Course("cs103","Operating System",3,52.0)};
				s5.courses=s5_courses;
				
				Student[] studentList = {s1,s2,s3,s4,s5};
				
				StudentBatch batch = new StudentBatch();
			    batch.students = studentList;
				
				RuleEngine.generateResult(batch);
				
				batch.printResult();


	}

}
