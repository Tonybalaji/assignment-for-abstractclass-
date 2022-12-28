package week3.day2.assignmentofabstract;

public class Automation extends MultipulLanguage  implements Language,Testtool

{

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}
	
	public static void main(String[] args) {
		
		 Automation ba = new  Automation();
		 
		 ba.python();
		 
		 ba.java();
		 
		 ba.ruby();
		 
		 ba.Selenium();
		 
		
	}

	
}
