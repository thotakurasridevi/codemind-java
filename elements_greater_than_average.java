import java.util.Scanner;
class sam
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],sum=0,avg,i,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+x[i];
        }
        for(i=0;i<n;i++)
        {
            avg=sum/n;
        
        if(x[i]>=avg)
        count++;
        }
         System.out.println(count);
        
    }
}