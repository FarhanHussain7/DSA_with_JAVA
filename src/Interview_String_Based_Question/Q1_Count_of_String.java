package Interview_String_Based_Question;

public class Q1_Count_of_String {
    public static void main(String[] args) {
        String st = "aabbbddccaabbaacc";

        for (char c = 'a'; c<='z'; c++){
            int count = 0;
            for (int i = 0; i<st.length(); i++){
                if (st.charAt(i)==c){
                    count++;
                }
            }
            if (count>0){
                System.out.println(c + " : "+ count);
            }
        }















//        int len = st.length();
//        String Ct = "";
//        for (int i = 0; i<len; i++){
//            int count = 0;
//            for (int j = 0; j<len; j++){
//                if (st.charAt(i)==st.charAt(j)){
//                    count++;
//                }
//            }
//            System.out.println(count + " - This is count of " + st.charAt(i));
//        }
    }
}
