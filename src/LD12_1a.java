
public class LD12_1a {

	private static int [][] M = new int[][] {{1,1,1,1,1,1,1,1,1,1},
			{2,2,2,2,2,2,2,2,2,2},
			{3,3,3,3,3,3,3,3,3,3},
			{4,4,4,4,4,4,4,4,4,4},
			{5,5,5,5,5,5,5,5,5,5},
			{6,6,6,6,6,6,6,6,6,6},
			{7,7,7,7,7,7,7,7,7,7},
			{8,8,8,8,8,8,8,8,8,8},
			{9,9,9,9,9,9,9,9,9,9},
			{10,10,10,10,10,10,10,10,10,10}};
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		(new MyThread(M,0,"Even",5)).start();
		(new MyThread(M,1,"ODD",10)).start();
		
	}

}
