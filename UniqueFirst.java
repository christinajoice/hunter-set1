import java.io.*;
import java.util.*;
public class UniqueFirst
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
  int a[]=new int[10];
  int i,j;
System.out.println("Enter number of elements");
int n=s.nextInt();
System.out.println("Enter values");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
out:
for(i=0;i<n;i++)
{
in:
for(j=0;j<n && i!=j;j++)
{
if(a[i]==a[j])
{
System.out.println("the first element is"+a[i]);
break out;
}
  else
  {
   System.out.println("Unique"); 
  }
}
}
}
}
