import java.io.*;
import java.util.*;

class brcktpat {

        
    
    public static void pattern(int n)
    {
        String arr []= new String [n*2];
        
        int i=0;
        int size= arr.length-1;
        for(i=0; i<= size/2; i++)
        {
            arr[i]= "(";
        }
        
        for( ; i<= size; i++)
        {
             arr[i]= ")"; 
        }

        for(String e:arr)
        {
            System.out.print(e+" ");
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    pattern(3);
    }
}