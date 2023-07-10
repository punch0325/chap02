import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	System.out.print("나이를 입력하세요 : ");
	int age = scan.nextInt();
	
	System.out.println();
	System.out.println("10년 후 당신의 나이는 "+(age+10)+"살 입니다.");

	
	}

}
