package studentdatabaseapp;

public class studentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.enroll();
		std1.payTuition();
		System.out.println(std1.showInfo());
	}

}
