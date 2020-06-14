package learningFunction;

public class facebookRun {

	public static void main(String[] args) {
		
		
		facebook michael = new facebook();
		facebook john  = new facebook();
		
		michael.chat();
		michael.post();
		
		michael.password="dflljdlfj";
		System.out.println(michael.usrename);
		
		
		john.chat();
		john.post();
		
		john.usrename = "john1234";
		
		System.out.println(john.usrename);

	}

}
