package basic.programs;

/*
 * Given a stream of incoming numbers, find average or mean of the stream at every point.
 */
public class AverageInStream {

	public float[] streamAvg(int[] arr, int n) {
        
        float avrArr[] = new float[n];
        float avr = 0;
        for(int i=0; i<avrArr.length; i++)
        {
           avr += arr[i];
           avrArr[i] = avr / (i+1);
        }
        return avrArr;
    }
}
