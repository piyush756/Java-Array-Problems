import java.util.*;
public class NameArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of names you want to enter");
        int num = sc.nextInt();
        String name[] = new String[num];
        for(int i=0;i<name.length;i++)  {
            name[i]=sc.next();
        }
        System.out.println("printing all the names entered");
        for(int i=0;i<name.length;i++) {
            System.out.print(name[i]+" ");
        }
    }
}
