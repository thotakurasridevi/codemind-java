import java.util.Scanner;
class array2
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int x[],i,n,count=0;
n=sc.nextInt();
x=new int[n];
   //Reading of an array elements
for(i=0;i<n;i++)
x[i]=sc.nextInt();
   for(i=0;i<n-1;i++)
   {
     if(x[i]>=x[i+1])
     {
     System.out.println("no");
     System.exit(0);
     }
   }
   System.out.println("yes");
}
}

   