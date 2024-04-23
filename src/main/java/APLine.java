public class APLine
{
private int myA; 
private int myB;
private int myC;
public APline( int a, int b, int c){
myA = a;
myB = b;
my C = c;
}
public int getA(){return myA;}
public int getB(){return myB;}
public int getC() {return myC;}
public void setA(int newA) {myA = newA;}
public void setB(int newB) {myB = newB;}
public void setC (int newC) {myC = newC;}
public int getSlope(){
double ans = (double) -myA/(double)myB;
return ans;
}
public boolean isOnLine(int x, int y){
boolean onLine = false;
int num = (myA*x)+(myB*y)+(myC);
if(num == 0)
onLine = true;
return onLine;
}
  
}
