package javaapplication42;

public class Dizi {
    
    double harmonikOrt(int []  arr){
        double sum=0;
        for (int i = 0; i <= arr.length; i++) {
            sum+= 1.0 /arr[i];
        }
     return sum;
    }
    
}
