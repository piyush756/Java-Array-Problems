import java.util.*;
public class SearchNumFromMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows of matrix");
        int row = sc.nextInt();
        System.out.println("enter no of coloumn of matrix");
        int colm = sc.nextInt();
        int num[][]=new int[row][colm];
        for(int i = 0;i<row;i++) {
            for(int j=0;j<colm;j++) {
                num[i][j]=sc.nextInt();
            }
        }System.out.println("enter the number you want to find - ");
        boolean found = false;
        int a = sc.nextInt();
        for(int i = 0;i<row;i++) {
            for(int j=0;j<colm;j++) {
                if(num[i][j]==a) {
                    System.out.print("the location is: row  : "+i+" coloumn : "+j);
                    found = true;
                }
            }
        }if(!found) {
            System.out.println("no such number found");
        }
    }
}
