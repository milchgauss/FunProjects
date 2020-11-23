//See if there are multiple occurrences of a letter in a word.
// If so, replace that letter with an asterisk.
// If not, leave it alone!

/** Results:

******t
rat
r*********p**t

from:
p.replaceIt("Lalaaat");
p.replaceIt("rat");
p.replaceIt("reeeaaaaaapeat");

**/


public class RepetitionSense{

static String replaceIt(String word){

String encoded="";
word=word.toLowerCase(); 
for (int i=0;i< word.length();++i){
char t=word.charAt(i);

if(word.lastIndexOf(t)==word.indexOf(t)){
encoded=encoded+word.charAt(i);
}

else{
encoded=encoded+"*";
}
}
System.out.println(encoded);
return encoded;
}

public static void main(String[]args){

RepetitionSense p= new RepetitionSense();
p.replaceIt("Lalaaat");
p.replaceIt("rat");
p.replaceIt("reeeaaaaaapeat");

}
}
