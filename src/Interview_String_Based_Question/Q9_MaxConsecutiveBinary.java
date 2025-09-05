package Interview_String_Based_Question;

public class Q9_MaxConsecutiveBinary {
    public static void main(String[] args) {
        int[] binaryArray = {1, 1, 0, 0, 0, 1, 1, 1, 0, 1};

        int maxOnes = 0, maxZeros = 0;
        int currentOnes = 0, currentZeros = 0;

        for (int bit : binaryArray) {
            if (bit == 1) {
                currentOnes++;
                currentZeros = 0;
            } else {
                currentZeros++;
                currentOnes = 0;
            }

            maxOnes = Math.max(maxOnes, currentOnes);
            maxZeros = Math.max(maxZeros, currentZeros);
        }

        System.out.println("Max consecutive 1s: " + maxOnes);
        System.out.println("Max consecutive 0s: " + maxZeros);
    }
}