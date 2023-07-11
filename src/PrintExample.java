
public class PrintExample {
	
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		int result = num1 + num2;
		
		System.out.println("num1 + num2 = "+result);

		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");	
		System.out.println();
		
		
		//서식이 있을 땐 printf를 써서 출력한다
		
		System.out.printf("num = [%d]\n", 99); // 정수 정렬
		System.out.printf("num = [%10d]\n", 99); // 총 10자리를 쓰는 것
		System.out.printf("num = [%-10d]\n", 99); // -를 붙이면 왼쪽정렬 됨
		System.out.printf("num = [%010d]\n", 99); // 앞에 0을 붙이면 빈자리를 0으로 채움

		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		System.out.printf("real = [%f]\n", 10.796); // 실수 정렬
		System.out.printf("real = [%20f]\n", 10.796);
		System.out.printf("real = [%-20f]\n", 10.796);
		System.out.printf("real = [%020f]\n", 10.796);
		System.out.printf("real = [%20.2f]\n", 10.796); // 소숫점 둘째 자리까지만 표시하겠다는 뜻(반올림된다)
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		// char와 String 같은 문자열 타입은 숫자가 아니기 때문에 빈자리를 0으로 채울 수 없다
		System.out.printf("ch = [%c]\n" , 'A'); // char 타입 정렬
		System.out.printf("ch = [%10c]\n" , 'A');
		System.out.printf("ch = [%-10c]\n" , 'A');

		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		System.out.printf("str = [%s]\n", "Hello"); // 문자열 타입 (String) 정렬
		System.out.printf("str = [%10s]\n", "Hello");
		System.out.printf("str = [%-10s]\n", "Hello");
	}
	
	

}
