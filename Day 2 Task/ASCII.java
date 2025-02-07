import java.sql.SQLOutput;
//DAY 2 Evening
public class ASCII {

        public static void main(String[] args) {

            //ASCII
            ascii();
                 
        }

        private static void ascii() {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.println(ch + " -> " + (int) ch);
            }
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.println(ch + " -> " + (int) ch);
            }
        }

}
