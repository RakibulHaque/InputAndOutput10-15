import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args)
	{
		Scanner inputValue = new Scanner(System.in);
		//String ����
		String name = inputValue.nextLine();
		char gender = inputValue.next().charAt(0);
		int age = inputValue.nextInt();
		long mobileNo = inputValue.nextLong();
		double cgpa = inputValue.nextDouble();
		
		//�o�͂��m�F����B
		System.out.println("name: "+name);
		System.out.println("Gender:"+gender);
		System.out.println("Age: "+age);
		System.out.println("Mobile NO: "+mobileNo);
		System.out.println("cgpa "+cgpa);
		
		
	}
}
