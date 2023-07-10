
public class VariableScope {

	public static void main(String[] args) {

		//변수의 유효범위(Block Scope)
		
		int num1 = 12; 
		
		{
			int num2 = 3;
			System.out.println(num2);
		}
		
		System.out.println(num1);
//		System.out.println(num2);
//		num2는 {}안에서만 쓸 수 있는 지역 변수이므로 {}을 벗어나면 사용 불가 
	}

}
