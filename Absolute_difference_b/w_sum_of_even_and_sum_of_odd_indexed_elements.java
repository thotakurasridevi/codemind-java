import java.util.Scanner;
class sam{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,x[],i,sum=0,so=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(i%2==0 )
            {
                sum=sum+x[i];
            }
            if(i%2!=0)
            {
                so=so+x[i];
            }
        }
        
       System.out.print(sum-so);     
        
    }    
}