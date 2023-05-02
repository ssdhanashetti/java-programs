package basic.programs;
/*
 * Given a non null integer matrix Grid of dimensions NxM.Calculate the sum of its elements.
 */
public class SumOfElementsInMatrix {

	 int sumOfMatrix(int N, int M, int[][] Grid) {
	        
	        int sum = 0;
	        for(int i=0; i<N; i++)
	        {
	            for(int j=0; j<M; j++)
	            {
	                sum += Grid[i][j];
	            }
	        }
	        return sum;
	    }
}
