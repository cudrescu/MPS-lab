
public class WriteResult {
	
	//afiseaza la tastatura o matrice de forma int[][]
	public void writeResult(int[][] result){
		
		for(int i = 0; i<result.length; i++){
			for(int j = 0; j<result.length; j++){
				System.out.print(result[i][j] + " ");
			}
		System.out.println();
		}
	}
}
