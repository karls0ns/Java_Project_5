
public class MyThread2 extends Thread{
	 
		int [][] Mas;
		String Name;
		int StartRow;
		int Priority;		
		MatrFun2 P;
		
		public MyThread2(int[][] M, int StartRow, String Name,int Priority, MatrFun2 P1){
			Mas = M;
			this.Name = Name;
			this.StartRow = StartRow;
			this.Priority = Priority;			
			P = P1;
		}
		
		public void run() {		 	
			
			int k = StartRow;
									
				while(k <= Mas.length-1){ 				
				
					synchronized (P){
					P.printRow(k, Mas);
					}
					k = k+2;
					 				
			}
		}
}	


