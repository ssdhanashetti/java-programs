package basic.programs;


public class SumOfDiigits {
	
	private static int sumOfDigits(int N) {
        int sum = 0;
        while(N > 0)
        {
            sum += N%10;
            N /= 10;
        }
        return sum;
    }
	
	public static void main(String[] args) {
		System.out.println(sumOfDigits(21));
	}

}
