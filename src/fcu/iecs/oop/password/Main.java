package fcu.iecs.oop.password;
import java.util.Scanner; 

public class Main {
 
 public static void main(String[] args) {
  
  Scanner keyboard=new Scanner(System.in);
  PasswordEncorder encoder=new PasswordEncorder() ;
  int replay=0;
  
  while(replay==0){
   System.out.println("Please enter a password:");
   
   String password=keyboard.next();
   
   if(password.equals("exit")) break;
   System.out.print(encoder.encode(password));
   System.out.println();
  };
 }
}