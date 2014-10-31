
public class AddMatrix {
	
	//o metoda add care primeste 2 matrici de forma int[][] 
	//si returneaza matricea rezultat
	
	public int[][] add(int m1[][], int m2[][]) {
		int res[][] = new int[m1.length][m2.length];
		
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		return res;
	}
}
