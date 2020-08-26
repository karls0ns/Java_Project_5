public class MatrFun {

	synchronized 
	public static  void printRow(int Row, int M[] []){
	
		int i = 0;
		
		System.out.println(" ");
		System.out.print("Row: ");
		System.out.print(Row);
		System.out.print("   ");
		
		while( i <= M.length-1){
			
			System.out.print(M[Row][i]);
			System.out.print(" ");			
			i++;
			
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
}
