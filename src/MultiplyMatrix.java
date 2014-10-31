
public class MultiplyMatrix {

	//o metoda multiply care primeste 2 matrici de forma int[][] 
		//si returneaza matricea rezultat
	
	public int[][] multiply(int[][] a,int[][] b){
		
		int n = a.length;
		int[][] result = new int[n][n];
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				result[i][j] = 0;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++)
					result[i][j] += a[i][k]*a[k][j];
			}
		}
			
		return result;
		
	}
}
