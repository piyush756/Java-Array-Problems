import java.util.*;
class TwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows and coloumn :");
        int row = sc.nextInt();
        int coloumn=sc.nextInt();
        int number[][]=new int[row][coloumn];
        System.out.println("enter the data : ");
        for(int i=0;i<row;i++) {
            for(int j=0;j<coloumn;j++) {
                number[i][j]=sc.nextInt();
            }
        }System.out.println("your data is - ");
        for(int i=0;i<row;i++) {
            for(int j=0;j<coloumn;j++) {
                System.out.print(number[i][j]+" ");
            }System.out.println();
        }
    }
}