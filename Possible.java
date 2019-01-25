import java.io.*;
import java.util.*;
public class Possible
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,i,j,k;
int a[]=new int[10];
System.out.println("Enter the number of elements in array");
n=s.nextInt();
System.out.println("Enter the elements");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
for(k=0;k<n;k++)
{
if(i<j && j<k)
{
if(a[i]+a[j]==a[k])
{
System.out.println(a[i]+" "+a[j]+" "+a[k]);
}
}
}
}
}
}
}
