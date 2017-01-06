package fcu.iecs.oop.password;

public class PasswordEncorder {

 public String encode(String password){
  
  int length=password.length();
  char [] a = new char[length];
  
   for(int i=0;i<length;i++){
    if(password.charAt(i)=='A'||password.charAt(i)=='a'){
     a[i]='4';
    }else if(password.charAt(i)=='E'||password.charAt(i)=='e'){
     a[i]='3';
    }else if(password.charAt(i)=='I'||password.charAt(i)=='i'){
     a[i]='1';    
    }else if(password.charAt(i)=='O'||password.charAt(i)=='o'){
     a[i]='0';
    }else if(password.charAt(i)=='T'||password.charAt(i)=='t'){
     a[i]='7';
    }else {
     a[i]=password.charAt(i);
    }
   }
  String str=new String(a);
  return str;
 }
}