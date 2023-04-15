package siguri;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Encrypt {
    public static String  encrypt(String plaintext, String key) {

        if (plaintext.length() == 0) {
            return "\nJu lutem shkruani tekstin e thjeshtë që dëshironi të enkriptoni.";
        }

        if (Pattern.matches("[a-zA-Z0-9 ]+", plaintext)) {
            char[] plaintextArray = plaintext.replaceAll(" ", "").toCharArray();
            String[] splitedKey = key.split(" ");

            StringBuilder getLetters = new StringBuilder();
            for (int i = 0; i < splitedKey.length; i++) {
                getLetters.append(splitedKey[i].charAt(0));
            }

            ArrayList<Integer> tempciphertext = new ArrayList<>();
            StringBuilder ciphertext = new StringBuilder();
            for (int i = 0; i < plaintextArray.length; i++) {
                for (int j = 0; j < getLetters.length(); j++) {
                    if (plaintextArray[i] == getLetters.charAt(j)) {
                        tempciphertext.add(j + 1);
                    }
                }
                int index = (int) (Math.random() * tempciphertext.size());
                ciphertext.append(tempciphertext.get(index));
                ciphertext.append(" ");
                tempciphertext.clear();
            }
            return "\nTeksti i enkriptuar: " + ciphertext;
        } else {
            return "\nTeksti i thjeshtë që deshironi të enkriptoni nuk mund të përmbajë karaktere speciale!";
        }
    }

}
