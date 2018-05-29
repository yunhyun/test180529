package java_example_180521;

public class Ch5_16_ForEachExample {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		String[] fruits= {"사과","배","바나나","체리","딸기","포도"};
		int sum=0;
		for(int i : num) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
		
		for(String a:fruits)
			System.out.println(a);
	}

}
