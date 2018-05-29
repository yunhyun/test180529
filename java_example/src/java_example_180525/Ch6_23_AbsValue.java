package java_example_180525;

public class Ch6_23_AbsValue {
	public double getDistance(int x1, int y1, int x2, int y2) {
		double result;
		result=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		return result;
	}
	
	public int getAbsValue(int x) {
		if(x<0) {
			x=-1*x;
		} else {
			x=x;
		}
		
		return x;
	}
}
