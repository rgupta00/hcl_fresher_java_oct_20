
public class DemoArray {
	
	public static void main(String[] args) {
		//how to create arrays in java
		//int x[]=new int[5];
	
		int x[]= {4,6,7,3,5};
		
	//	x[5]=1;
		int sum=0;
		
		//classical way of write the loop
		for(int i=0;i<x.length;i++) {
			sum+=x[i];
			
		}

		System.out.println(sum);
		
		//enhace for loop: java 5: that can be used for array and collection*
		
		sum=0;
		int y[]= {4,6,7,3,5};
		
		//enhanced for loop
		for(int temp: y) {
			sum=sum+temp;
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}

}
