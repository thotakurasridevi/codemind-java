import java.util.Scanner;
class sample
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],min=9;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]<min)
              {
                  min=x[i];
              }
            
        }
        System.out.println(min);
}
}