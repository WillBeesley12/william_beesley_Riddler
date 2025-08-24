import static java.lang.Character.valueOf;

/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: YOUR NAME HERE
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);
            int numericValue = valueOf(c);
            if ((numericValue >= 65 && numericValue <= 90) || (numericValue >= 97 && numericValue <= 122)) {
                numericValue += 9;
                if (numericValue > 90 && numericValue < 100) {
                    numericValue -= 26;
                } else if (numericValue > 122) {
                    numericValue -= 26;
                }
            }
            char new_c = (char) numericValue;
            decrypted += new_c;
        }

        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        String[] decode = encrypted.split(" ");
        for (int i = 0; i < decode.length; i++) {
            String s = decode[i];
            int num = Integer.parseInt(s);
            char new_c = (char) num;
            decrypted += new_c;
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        String[] results = encrypted.split("(?<=\\G.{" + 8 + "})");
        for (int i = 0; i < results.length; i++) {
            String binary = results[i];
            int num = Integer.parseInt(binary, 2);
            char new_c = (char) num;
            decrypted += new_c;
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";



        return decrypted;
    }
}
