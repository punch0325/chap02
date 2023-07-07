
public class StringExample {

	public static void main(String[] args) {
		
		String str1 , str2 , str3 = "";
		
		
		str1 = "\"Hello\"";
		str2 = "Hello\nWorld";
		str3 = "HelloWorld\\";
//		Escape문자 : \가 붙어서 원래 기능이 아닌 다른 기능을 할 수 있게끔 해주는 것
//					- \" ▷ 더블 쿼터 앞에 역슬래시를 붙이면 더블 쿼터가 문자로서 출력 될 수 있게 해준다
//					- \\ ▷ 역슬래시도 문자열로서 사용하고 싶으면 그 앞에 역슬래시를 한번 더 붙이면 됨  
//					- \n ▷ 문자열에서 엔터키는 먹지 않기 때문에 \n을 입력해주면 엔터와 같은 기능을 해준다
		
		System.out.println(str1);
		System.out.println();
		System.out.println();
		System.out.println(str2);
		System.out.println();
		System.out.println();
		System.out.println(str3);


		
	}

}
