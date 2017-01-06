package fcu.iecs.oop.tiida;

public class NissanTiida {

  int number=1;
 
 public void tiida(){
  
  System.out.println("©I¥s²Ä "+number+"¦¸");
  
  for(int j=0;j<number;j++){
   for(int i=0;i<number;i++){
    System.out.print("*");
   }
  System.out.println();
  }
  number++;
 }
}