
public class IntegerExample {

	public static void main(String[] args) {
	
		int max = 0b01111111_11111111_11111111_11111111;
		int min = 0b00000000_00000000_00000000_00000000;
		
		System.out.println("max = "+max);
		System.out.println();
		System.out.println("min = "+min);
		
		max = max + 1; //이진수로 표현한 숫자에 1을 더해주면 음수가 된다
		System.out.println();
		System.out.println("max + 1 = "+max);
	}

}
