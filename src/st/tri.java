package st;

public class tri {
	
	public String judgement(int a, int b, int c){
		if( a+b<=c || a+c<=b || b+c <=a){
			return "Not a triangle";
		}else{
			if(a==b&&a==c){
				return "equilateral";
			}else if( a != b && a!=c && b!=c ){
				return "scalene";
			}else{
				return "isosceles";
			}
		}
	}
	
}
