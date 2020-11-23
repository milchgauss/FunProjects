/** 
the word argument will be outputted as a "word pyramid."
The following program will output:

L
Lo
Loo
Looo
Loooo
Looooo
Loooooo
Looooooo
Loooooool
Looooooola

**/

public class wordpyramid {
	public void encode(String word){
    
    String d="";
    String a=word;
    int appearance=0;

    for (int i=0;i<word.length();i++){
      int g=i+1;
      a=word.substring(0,g-1);
      
      System.out.println(a);
    }
  }

public static void main(String[]args){
wordpyramid wp=new wordpyramid();
wp.encode("Looooooola!");

}

}
