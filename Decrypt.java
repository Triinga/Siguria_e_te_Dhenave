package siguri;
import java.util.regex.Pattern;

public class Decrypt {

	public static String decrypt(String ciphertext, String key) {
		 if (ciphertext.length() == 0) {
	            return "\nJu lutem shkruani tekstin e enkriptuar që dëshironi të dekriptoni!";
	        }
	        if (Pattern.matches("[0-9 ]+", ciphertext)) {
	            String[] cipherArray = ciphertext.split(" ");
	            String[] splitKey = key.split(" ");

		    StringBuilder plaintext = new StringBuilder();
	            for (int i = 0; i < cipherArray.length; i++) {
	                for (int j = 0; j < splitKey.length; j++) {
	                    if (Integer.parseInt(cipherArray[i]) > splitKey.length) {
	                        return "\nNumri " + cipherArray[i] + " është invalid. Maksimumi i parashikuar është " + splitKey.length + ".";
	                    }
	                    if (cipherArray[i].equals(String.valueOf(j + 1))) {
	                        plaintext.append(splitKey[j].charAt(0));
	                    }
	                }
	            }
	            return "\nTeksti i dekriptuar: " + (plaintext);
	        } else {
	            return "\nCiphertext-i që  dëshironi të dekriptoni duhet të përmbajë vetëm numra!";
	        }
	    }
	
	
	}
