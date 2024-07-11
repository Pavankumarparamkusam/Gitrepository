import java.util.*;
class Diagonal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[5][5];
        int i,j,row,col,odsum=0,pdsum=0;
        System.out.println("Enter the order of 2d array a:");
        row=sc.nextInt();
        col=sc.nextInt();
        System.out.println("Enter the 2d array a elements:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                if(i==j){
                    pdsum=pdsum+a[i][j];
                }
                if(i+j==row-1){
                    odsum=odsum+a[i][j];
                }
            }
        }
        System.out.println("Principle diagonal sum="+pdsum);
        System.out.println("Other diagonal sum="+odsum);
    }
}