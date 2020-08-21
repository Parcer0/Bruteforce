/*
*  Name: NstBruteC32
*  Copyright: NeoSecurityTeam
*  Author: Parcer0
*  Date: 25/05/05
*  Description: Crc32 Cracker
*               root@NeoSecurity:/home/hackzatan# pico NstBruteC32.java
*               root@NeoSecurity:/home/hackzatan# gcj --main=NstBruteC32 -O9 NstBruteC32.java -o NstBruteC32
*               root@NeoSecurity:/home/hackzatan# ./NstBruteC32
*               NeoSecurityTeam CRC32 BruteForcer
*               Initializing...
*               
*               
*               CRC32: EE72A028
*               Pass: nst
*               root@NeoSecurity:/home/hackzatan#
*/

import java.util.zip.*;
import java.io.*;

public class NstBruteC32
{
   public static boolean Validate(String CRCString) 
   {
          byte[] bytes = CRCString.getBytes();
          String CRCtoCrack = "E9F4CC3D";
          Checksum checksumEngine = new CRC32();
          checksumEngine.update(bytes, 0, bytes.length);
          long checksum_1 = checksumEngine.getValue();
          String ChkString = Long.toHexString(checksum_1).toUpperCase();

          if(ChkString.equals(CRCtoCrack))
          {
             System.out.println("CRC32: "+CRCtoCrack);
             return true;
          }

          else return false;
   }

   public static void main(String args[]) 
   {
       String Caracteres = "qazwsxedcrfvtgbyhnujmikolp"; 
       int Lenght=Caracteres.length();
       char PassWord[]=new char[5];
       double Keys=0; 
       int x,y,z,l,q;
       boolean Found=false;
       String Contrasena; 

       System.out.println("NeoSecurityTeam CRC32 BruteForcer");
       System.out.println("Initializing...\n");
Loop:
      for(x=0; x<Lenght; x++){PassWord[0]=Caracteres.charAt(x);
      for(y=0; y<Lenght; y++){PassWord[1]=Caracteres.charAt(y);
      for(z=0; z<Lenght; z++){PassWord[2]=Caracteres.charAt(z);
      for(l=0; l<Lenght; l++){PassWord[3]=Caracteres.charAt(l);
	  for(q=0; q<Lenght; q++){PassWord[4]=Caracteres.charAt(q);
	  
	  Contrasena=PassWord[0]+""+PassWord[1]+""+PassWord[2]+""+PassWord[3]+""+PassWord[4];
      Keys++;
      System.out.println(Contrasena);
	  if(Validate(Contrasena))
	  {
		System.out.println("Pass: "+Contrasena);
        Found=true;
        break Loop;
	  }}}}}}
          
          if (Found == false) System.out.println("Sorry Maybe another day.");
   }
}
