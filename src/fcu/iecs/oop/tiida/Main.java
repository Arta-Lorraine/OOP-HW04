package fcu.iecs.oop.tiida;
import java.util.Scanner;

public class Main {
 
 public static void main(String[] args) {
 
  int i;
  NissanTiida Tiida=new NissanTiida();
  Scanner keyboard=new Scanner(System.in);
  
  System.out.println("Please enter a number:");
  
  int loop=keyboard.nextInt();
  
  for(i=0;i<loop;i++){
  Tiida.tiida();
  }
 }
}