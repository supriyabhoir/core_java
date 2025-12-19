package conditional_statement;

public class if_elseif_else {
	public  void checknum(int num) {
//	int num=90;
	if(num%3==0) {
		System.out.println("Fizz");
	}
	else if(num%5==0) {
		System.out.println("Buzz");
	}
	else if(num%3==0 && num%5==0) {
		System.out.println("Buzzfizz");
	}
	else {
		System.out.println("please entered different number");
	}

}
}
