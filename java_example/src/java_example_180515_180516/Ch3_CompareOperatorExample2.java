package java_example_180515_180516;
//비교연산자 사용 예제 
public class Ch3_CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //출력결과??
		//true v2가 double 타입으로 자동 형변환된 후 비교연산 수행 
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); 
		//false 0.1f 근사치 실제 값은 0.10000002232423
		System.out.println((float)v4 == v5); //true 
		System.out.println((int)(v4*10) == (int)(v5*10)); 
	}

}
