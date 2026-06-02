import java.util.*;
public class FindIndexOfNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of inputs you want to give");
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i=0;i<size;i++) {
            num[i]=sc.nextInt();
        
        }System.out.println("enter the number enterd and i will give you its index value");
        int a = sc.nextInt();
        boolean found = false;
        for(int i=0;i<num.length;i++) {
            if(num[i]==a) {
                System.out.println("index value = "+i);
                found = true;
            }
        }if(!found) {
            System.out.println("no such number present");
        }

    }
    
}
