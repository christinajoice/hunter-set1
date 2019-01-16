import java.io.*;
import java.util.*;
public class Hunter1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number of values in array");
int n=s.nextInt();
ArrayList<Integer> alist=new ArrayList<Integer>(10);
int i,j,flag=0;
int a[]=new int[10];
System.out.println("Enter the values");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
alist.add(a[i]);
break;
}
}
}
Collections.sort(alist);
System.out.println(alist);
}
}
