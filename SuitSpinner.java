class SuitSpinner{


public void drawHearts(int size){
  System.out.print("\n");
int halved=size/2;
//TOP
for(int i=3; i<=halved/2; i++){
  for(int j=i; j<=halved/2; j++){
  System.out.print(" "); 
  }
  for(int j=1; j<=2*i-1; j++){
  System.out.print("*"); 
  }
  for(int j=2*i; j<=2*(halved/2)-1; j++){
  System.out.print(" "); 
  }
  for(int j=1; j<=2*i-1; j++){
  System.out.print("*");
  }
   System.out.print("\n");
}
 
//BOTTOM
for (int i=halved;i>0;i--){
System.out.println((" ".repeat(halved)+"*".repeat(size)).substring(i-1,halved+(2*i)-3));
}
}
 
///SPADES

public void drawSpades(int size){
  System.out.print("\n");
int halved=size/2;

//TOP
for (int i=0;i<halved;i++){
System.out.println((" ".repeat(halved-1)+"*".repeat(size-1)).substring(i,halved+2*i));
}
//BOTTOM

//I is rows here!

 for(int i=halved/2; i>=3; i--){

  for(int j=i; j<=halved/2; j++){
  System.out.print(" "); 
  }
  for(int j=1; j<=2*i-1; j++){
  System.out.print("*"); 
  }

  for(int j=2*i; j<=2*(halved/2)-1; j++){
  System.out.print(" "); 
  }

  for(int j=1; j<=2*i-1; j++){
  System.out.print("*");
  }

  System.out.print("\n");
}

for (int z=0;z<halved/2;z++){
System.out.println(" ".repeat(halved-1)+"*".repeat(2));

}


}

//CLOVERS

public void drawClovers(int size){

int halved=size/2;
System.out.print("\n");

for (int i=2;i<halved/2;i++){
System.out.println((" ".repeat(halved-1)+"*".repeat(size-1)).substring(i,halved+2*i));
}
for (int i=halved/2;i>3;i--){
System.out.println((" ".repeat(halved)+"*".repeat(size)).substring(i-1,halved+(2*i)-3));
}

for(int i=3; i<=halved/2; i++){
  for(int j=i; j<=halved/2; j++){
  System.out.print(" "); 
  }
  for(int j=1; j<=2*i-1; j++){
  System.out.print("*"); 
  }
  for(int j=2*i; j<=2*(halved/2)-1; j++){
  System.out.print(" "); 
  }
  for(int j=1; j<=2*i-1; j++){
  System.out.print("*");
  }
  System.out.print("\n");
 
}

 for(int i=halved/2; i>=3; i--){

  for(int j=i; j<=halved/2; j++){
  System.out.print(" "); 
  }
  for(int j=1; j<=2*i-1; j++){
  System.out.print("*"); 
  }

  for(int j=2*i; j<=2*(halved/2)-1; j++){
  System.out.print(" "); 
  }

  for(int j=1; j<=2*i-1; j++){
  System.out.print("*");
  }

  System.out.print("\n");  

}

for (int z=0;z<halved/2;z++){
System.out.println(" ".repeat(halved-1)+"*".repeat(2));

}
 

 }
 

public void drawDiamonds(int size){
  System.out.print("\n");
if(size%2==1){
System.out.println("Size cannot be odd!");
}
int halved=size/2;

for (int i=0;i<halved;i++){
System.out.println((" ".repeat(halved-1)+"*".repeat(size-1)).substring(i,halved+2*i));
}
for (int i=halved;i>0;i--){
System.out.println((" ".repeat(halved)+"*".repeat(size)).substring(i-1,halved+(2*i)-3));
}

}

public static void main(String[]args){

SuitSpinner d= new SuitSpinner();
for (int i=30;i>0;i-=2){

d.drawHearts(i);
d.drawSpades(i);
d.drawClovers(i);
d.drawDiamonds(i);

}
 	
}}
