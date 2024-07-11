import java.util.*;
class Exchangcolumns {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[5][5];
        int i,j,row,col,temp,n1,n2;
        System.out.println("Enter the order of matrix:");
        row=sc.nextInt();
        col=sc.nextInt();
        System.out.println("Enter the elements of a matrix:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the columns to be exchanged:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(i=0;i<row;i++){
            temp=a[i][n2-1];
            a[i][n2-1]=a[i][n1-1];
            a[i][n1-1]=temp;
        }
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
