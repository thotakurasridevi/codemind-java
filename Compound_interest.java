import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,t,r,d,ci;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        d=(1+r/100);
        ci=p*(Math.pow(d,t));
        System.out.format("%.2f",ci);
       
    }
}