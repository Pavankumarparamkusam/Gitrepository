import java.util.*;
class Evenandodd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int [10];
        int n,i,esum=0,osum=0;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        System.out.println("Enter the array of a element:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]%2==0){
                esum=esum+a[i];
            }
            else{
                osum=osum+a[i];
            }
        }
        System.out.println("Sum of even number in array a="+esum);
        System.out.println("Sum of odd numbers in array a="+osum);
    }
}
