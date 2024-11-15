package hello_java;

	//Multi Demonsional Array with use of Random Method.

public class MultiDemonsionalArray {
	public static void main(String []args) {
		int nums [][][]=new int [4][4][4];
	
		for (int i=0;i<4;i++) {
			
			for (int j=0;j<4;j++) {
				
				for(int k=0;k<4;k++) {
		// Here I use the random method in math class in this line, it will print random numbers.
		// frankly to say, I was too lazy initiate the arrays value one by one.
		// so that i used the random method.
				nums [i][j][k] =(int)(Math.random()*10);
			
				System.out.print(nums[i][j][k] +" ");
				}
			}
			System.out.println();
		}	
	}

}
