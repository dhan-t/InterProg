package longExam3;

public class studentGrades {
	String firstname;
	String surname;
	double finalGrade;

	studentGrades(String firstname, String surname, double finalGrade){
		this.firstname = firstname ;
		this.surname = surname;
		this.finalGrade = finalGrade;

	}
	
	public static void main(String[] args) {
		
		studentGrades johnYap = new studentGrades("John", "Yap", 0);
		
		studentGrades krishaCruz = new studentGrades("Krisha", "Cruz", 0);
		
		studentGrades henryGo = new studentGrades("Henry", "Go", 0);
		
		studentGrades haileyDaily = new studentGrades("Hailey", "Daily", 3.00);
		
		studentGrades ashtonDrake = new studentGrades("Ashton", "Drake", 2.00);

	}

}
