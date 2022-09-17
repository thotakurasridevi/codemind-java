import java.util.Scanner;
class array2
{
public static boolean isPalindrome(int n)
{
    //palindrome logic
    int sum=0,r,temp=n;
    while(n>0){
        r=n%10;
        sum=sum*10+r;
        n=n/10;
    }
    if(sum==temp)
     return true;
    else
    return false;
} 
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int x[],i,n,count=0;
n=sc.nextInt();
x=new int[n];
   //Reading of an array elements
for(i=0;i<n;i++)

 x[i]=sc.nextInt();
   for(i=0;i<n;i++)
   {
     if(isPalindrome (x[i]))
      count++;
   }

 System.out.println(count);
}

}