package java_example_180515_180516;
//증감연산자 예제 
/* ++, --
 * 변수 앞에 ++이 붙으면 1을 증가시키고 계산에 사용
 * 변수 뒤에 ++이 붙으면 일단 변수값을 사용하고 1을 증가시켜 놓음. */
public class Ch3_IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.println("-----------------------");
		System.out.println("x++ 하기 전 : " + x);
		x++;//x=?, y=?, z=?
		//x값을 사용하고 x값을 1 증가 
		System.out.println("x++ 하고난 후 : " + x);
		
		System.out.println("++x 하기 전 : " + x);
		++x;//x=?, y=?, z=? 
		//기존 x값에서 1을 증가시키고 x를 사용 
		System.out.println("++x 하고난 후 : " + x);
		
		System.out.println("x=" + x);		
		System.out.println("-----------------------");		
		y--;//x=?, y=?, z=? 
		--y;//x=?, y=?, z=?
		System.out.println("y=" + y);		
		System.out.println("-----------------------");		
		z = x++;//x=?, y=?, z=? 
		//x가 가지고 있는 값을 먼저 z에 대입하고 x값을 1 증가시킴. 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("-----------------------");		
		z = ++x;//x=?, y=?, z=?
		System.out.println("z=" + z);
		System.out.println("x=" + x); 
		System.out.println("-----------------------");				
		//x=14, y=8, z=14
		z = ++x + y++;//x=15, y=8, z=23
		//x=15, y=9, z=23
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}
