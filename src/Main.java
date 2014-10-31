
public class Main {

	public static void main(String[] args){
		
		int[][] firstMatrix;
		int[][] secondMatrix;
		
		int[][] resultAdd;
		int[][] resultMultiply;
		
		int matrixDimension = 10;
		
		ReadInputData reader = new ReadInputData();
		AddMatrix addOperation = new AddMatrix();
		MultiplyMatrix multiplyOperation = new MultiplyMatrix();
		WriteResult writer = new WriteResult();
		
		firstMatrix = reader.create_mat(matrixDimension);
		secondMatrix = reader.create_mat(matrixDimension);
		
		resultAdd = addOperation.add(firstMatrix, secondMatrix);
		//resultMultiply = multiplyOperation.multiply(firstMatrix, secondMatrix);
		
		System.out.println("The add matrix result:");
		writer.writeResult(resultAdd);
		
		System.out.println("The multiply matrix result:");
		//writer.writeResult(resultMultiply);
		
	}
	
}
