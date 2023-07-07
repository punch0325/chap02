
public class InfinityExample {

	public static void main(String[] args) {

		double d1 = Double.POSITIVE_INFINITY;
		double d2 = 100/0.0; 
				
				
		System.out.println(d1);
		System.out.println(d2);
		
		
		 /*
		   정수는 오버플로우와 언더플로우를 조심해야하고,
		   실수에서는 계산시 무한대(Infinity)가 나오지 않도록 조심해야한다.
		  */
	}

}
