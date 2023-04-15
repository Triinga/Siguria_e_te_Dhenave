package siguri;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.print("\n--- Ky është algoritmi i enkriptimit/dekriptimit të Beale Ciphers që përdor një dokument teksti si libër!---\n\n");
     System.out.print("--- Ky algoritëm mbështet këto operacione: \n encrypt - për të enkriptuar mesazhin  \n decrypt - për të dekriptuar mesazhin \n" +
                     " stop - për të ndalur ekzekutimin e funksionit \n");




      
       System.out.print("\n Shtyp operacionin: ");
       String answer = input.nextLine().toLowerCase();
       answer = answer.replaceAll(" ", "");
       if (args.length == 0) {
       
           if (answer.equals("encrypt")) {
               System.out.println("\nZgjodhët operacionin e enkriptimit\n");
               System.out.print("Ju lutëm shkruani tekstin e thjeshtë që doni të enkriptoni: ");
               String plaintext = input.nextLine().toLowerCase();
               System.out.println(Encrypt.encrypt(plaintext, readFile()));
           } else if (answer.equals("decrypt")) {
               System.out.println("\nZgjodhët operacionin e dekriptimit\n");
               System.out.print("Ju lutëm shkruani tekstin e enkriptuar që doni të dekriptoni: ");
               String ciphertext = input.nextLine().toLowerCase();
              System.out.println(Decrypt.decrypt(ciphertext, readFile()));
           } else if (answer.equals("stop")) {
          System.out.println("\nProgrami po ndalon!");
       
           }
         
           }
          
           input.close();
       }
       
   


