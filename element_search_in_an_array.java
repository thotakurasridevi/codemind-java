import java.util.Scanner;
class sample
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],max=0,c=0,k;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        
            x[i]=sc.nextInt();
            k=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            if(x[i]==k)
            {
                c++;
            }
        
        }
        if(c==0)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
        
}
}