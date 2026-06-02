import java.util.*;
public class CheckAscendingArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of values you want to enter");
        int n = sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<num.length;i++) {
            num[i]=sc.nextInt();
        }boolean ascending = true;
        for(int i=0;i<num.length-1;i++) {
            if(num[i]>num[i+1]) {
                ascending=false;
                break;
            }
        }if(ascending) {
            System.out.println("number are sorted in ascending");
        }else {
            System.out.println("numbers are not sorted in ascending");
        }
    }
}
