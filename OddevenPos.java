import java.io.*;
import java.util.*;
public class OddevenPos
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[10];
int i;
System.out.println("Enter the number of values");
int n=s.nextInt();
System.out.println("Enter the values");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
if(i%2==0)
{
if(a[i]%2!=0)
{
System.out.println("odd numberin even position"+a[i]+"position"+i);
}
}
else
{
if(a[i]%2==0)
{
System.out.println("Even number in odd position"+a[i]+"position"+i);
}
}
}
}
}
