import java.util.*;
public class minMax {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int min =Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<5;i++){
            arr[i]=(int)(Math.random()*900)+100;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<5;i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("Minimum number is :" +min +" Maximium number is :" +max);
    }
}
