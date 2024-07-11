import java.util.Scanner;
class Evenleftoddright {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int min,max,temp,n,i;
        System.out.println("Enter the size of an array a:");
        n=sc.nextInt();
        System.out.println("Enter the array a elements:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        min=0;
        max=n-1;
        while(min<max){
            while(a[min]%2==0 && min<max){
                min++;
            }
            while(a[max]%2==1 && min<max){
                max--;
            }
            if(min<max){
                temp=a[min];
                a[min]=a[max];
                a[max]=temp;
            }
            min++;
            max--;
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
