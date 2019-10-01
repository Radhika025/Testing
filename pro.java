import java.util.*;
class pro
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int p=1;
        System.out.println("enter elements");
        for(int i=0; i<n ; i++)
        {
            a[i]=sc.nextInt();
            p=p*a[i];
        }
        System.out.println("Sum="+p);
    }
}