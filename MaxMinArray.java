import java.util.*;
public class MaxMinArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of values you want to enter=");
        int n = sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<num.length;i++) {
            num[i]=sc.nextInt();
        }int max=num[0];
        int min=num[0];
        for(int i =1;i<num.length;i++) {
            if(max<num[i]) {
                max = num[i];
            }else if(min>num[i]){
                min = num[i];
            }
        }System.out.println("maximum value: "+max);
        System.out.println("minimum value : "+min);
    }
}
