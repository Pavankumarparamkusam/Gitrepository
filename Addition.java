import java.util.Scanner;
class Addition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[5][5];
        int i,j,row,col;
        boolean flag=true;
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
            }
        }
    }
}