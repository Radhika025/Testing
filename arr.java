import java.util.*;
class arr
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int s=0;
        System.out.println("enter elements");
        for(int i=0; i<n ; i++)
        {
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        System.out.println("Sum="+s);
    }
}