
public class MyThread extends Thread{
	 
		int [][] Mas;
		String Name;
		int StartRow;
		int Priority;		
		
		public MyThread(int[][] M, int StartRow, String Name,int Priority){
			Mas = M;
			this.Name = Name;
			this.StartRow = StartRow;
			this.Priority = Priority;			
			
		}
		
		public void run() {		 	
			
			int k = StartRow;
									
			while(k <= Mas.length-1){ 				
					
				MatrFun.printRow(k, Mas);
				k = k+2;
			}	 				

		}
}	


