
package array;
/* NAME : BINUYO SIMEON OLAJIDE
DEPT : COMPUTER SCIENCE
MATRIC NO : CSC/15/3045
*/ 

public class Array {

    
   public static double series(double n){
   double work=0;
   for (double j=1;j<=n;j++){
   work+=Math.pow(-1, j+1)/(2*j-1);
   }
   work = work*4;
   return work;
   }
    public static void main(String[] args) {
        /*int lBound=10;
        int uBound=100;
        System.out.printf("%s%18s%n","i","m(i)");
        System.out.println("--------------------");
        for (double j = lBound;j<=uBound;j+=10){
            System.out.printf("%12.0f%-6.5f%n",j,series(j));*/
        char [] alpha = new char[91];
        for (char i=0;i<=90;i++){
        alpha[i] = i;
            System.out.println(alpha[i]);
        }
        }
    }
        
    
    

