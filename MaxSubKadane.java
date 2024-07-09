public class MaxSubKadane {
    static int KadaneAlgo(int[] value) {
        int maxSoFar = Integer.MIN_VALUE;// -infinity
        int maxEndingHere = 0;

        // iterating
        for (int i = 0; i < value.length; i++) {
            maxEndingHere = maxEndingHere + value[i];
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;

            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int value[] = { 5, 4, -1, 7, 80 };
        System.out.println("The maximum value is: " + KadaneAlgo(value));
    }
}