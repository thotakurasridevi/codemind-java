import java.util.Scanner;
class array2
{
public static boolean isPrime(int n)
{
    //palindrome logic
    int sum=0,r,count=0;
    for( int i=2;i<=(int)Math.sqrt(n);i++)
    {
        if(n%i==0)
        count++;
    }
    if(count==0)
     return true;
    else
    return false;
} 
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int x[],i,k,n,count=0;
n=sc.nextInt();
x=new int[n];
   //Reading of an array elements
for(i=0;i<n;i++)

 x[i]=sc.nextInt();
 k=sc.nextInt();
   for(i=0;i<n;i++)
   {
     if(isPrime (x[i]))
     {
      if(x[i]>=k)
      count++;
     }
   }

 System.out.println(count);
}

}