import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,b,sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
          a=sc.nextInt();
          b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
             sum=sum+x[i];  
            
            }
        }
        System.out.println(sum);
    }
}