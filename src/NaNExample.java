
public class NaNExample {

	public static void main(String[] args) {
	
		double d1 = Double.NaN;
		double d2 = 0.0/0.0;
		// 수학적으로 0.0./0.0 계산식이 가능하기 때문에 프로그래밍 언어에서도 쓸 수 있지만 이 계산식은 발생하지 않도록 주의한다(의미가 없는데 오류가 나지 않기 때문)
		
		System.out.println(d1);
		System.out.println(d2);
		
	}

}
