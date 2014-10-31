
public class ReadInputData {

	//citeste si returneaza o matrice de forma int[][]
	public int[][] create_mat(int n){
		
		int[][] newMatrix = new int[n][n];
		for(int i =0; i < n; i++){
			for(int j = 0; j < n; j++){
				newMatrix[i][j] = i*j;
			}
		}
		
		return newMatrix;
	}
	
}
