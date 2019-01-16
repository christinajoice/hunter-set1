import java.util.*;
import java.io.*;
public class Unique
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i,j,flag=0;
int a[]=new int[10];
System.out.println("Enter number of values");
int n=s.nextInt();
System.out.println("Enter the elements");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
i=0;
out:
for(i=0;i<n;i++)
{
flag=0;
for(j=0;j<n;j++)
{
if(a[i]==a[j] && i!=j)
{
flag=1;
continue out;
}

}
if(flag==0)
{
System.out.println("The unique element is"+a[i]);
}
}
}
}
