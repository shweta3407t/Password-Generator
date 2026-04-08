package service;

import java.security.SecureRandom;
 import java.util.ArrayList;

public class PasswordService {
    
     public static void    generatePassword( Integer length,StringBuilder character){
         SecureRandom sr=new SecureRandom( );
        //  ArrayList<Integer> passlengrh=new ArrayList<>(length);
        //  length=pass.size();
         byte[] bytes=new byte[length]; 
         sr.nextBytes(bytes);

         int randomPassword=sr.nextInt();
         System.out.println(randomPassword);


        

     }
     public static void    generatePassword( Integer length,String character,String numberOfPassword ){

     }
}
