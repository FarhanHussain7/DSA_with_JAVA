package Interview_String_Based_Question;

public class Q10_MaxHammingRotation {

    public static String getMaxHammingRotation(String s) {
        int n = s.length();
        int maxDist = -1;
        String bestRotation = s;

        for (int i = 1; i < n; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            int dist = hammingDistance(s, rotated);

            if (dist > maxDist) {
                maxDist = dist;
                bestRotation = rotated;
            }
        }

        System.out.println("Max Hamming Distance: " + maxDist);
        return bestRotation;
    }

    private static int hammingDistance(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "abcde";
        String result = getMaxHammingRotation(input);
        System.out.println("Best Rotation: " + result);
    }
}