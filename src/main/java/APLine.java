public class APLine
{
private int myA; 
private int myB;
private int myC;
public APLine(int a, int b, int c){
myA = a;
myB = b;
myC = c;
}
public int getSlope(){
return -(double)myA / (double)myB;
}
public boolean isOnLine(int x, int y){
return (myA * x) + (myB * y) + myC == 0;
}
  
}
