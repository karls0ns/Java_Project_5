
public class LD12_2a {
	
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

	
	
	MatrFun2 P1 = new MatrFun2();
	
	(new MyThread2(M,0,"Even",5,P1)).start();
	(new MyThread2(M,1,"ODD",10,P1)).start();
	
	}

}
