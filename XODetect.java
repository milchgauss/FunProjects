//Program to detect whether or not the Xs and Os appear with the same frequency in a string

public class XODetect{

public boolean detect(String s){
	int x=0;
	int o=0;

for (int i=0;i<s.length();i++){
char d=s.charAt(i);
	if(d=='x'){
	x+=1;
	}
	if(d=='o'){
	o+=1;
	}	
	}
	if(x==o){
	return true;

	}
	return false;

	 
	}

public static void main(String[]args){

XODetect p= new XODetect();
System.out.println(p.detect("xxooxox"));
System.out.println(p.detect("xxo8djw"));
System.out.println(p.detect("sdfsdwww"));
System.out.println(p.detect("ffffxoxo"));


}

}