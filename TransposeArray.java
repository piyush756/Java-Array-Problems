import java.util.*;
public class TransposeArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("enter number of rows : ");
        int colm = sc.nextInt();
        int number[][] = new int[row][colm];
        for(int i=0;i<row;i++) {
            for(int j=0;j<colm;j++) {
                number[i][j]=sc.nextInt();
            }
        }System.out.println("formed matrix.......");
        for(int i=0;i<row;i++) {
            for(int j=0;j<colm;j++) {
                System.out.print(number[i][j]+" ");
            }System.out.println();
        }System.out.println("transpose matrix......");
        for(int i=0;i<colm;i++) {
            for(int j=0;j<row;j++) {
                System.out.print(number[j][i]+" ");     
            }System.out.println();
        }
    }
}
