import java.util.Scanner;
public class PA6 {
    static int n1=0,n2=1,n3=0;    
    static void printFibonacci(int count){    
        if(count>0){    
             n3 = n1 + n2;    
             n1 = n2;    
             n2 = n3;    
             System.out.print(" "+n3);   
             printFibonacci(count-1);    
         }    
     }    
     public static void main(String args[]){    
        int c;
        Scanner s = new Scanner(System.in);
        c = s.nextInt();    
        s.close();
        System.out.print(n1+" "+n2);  
        printFibonacci(c-2); 
       }  
}
