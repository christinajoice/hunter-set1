import java.io.*;
import java.util.*;
public class IndexEqual
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[10];int i,j;
int newa;
System.out.println("Enter the number of values");
int n=s.nextInt();
System.out.println("Enter the values");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
if(i==a[i])
{
newa=newa+" "+a[i];
}
}
System.out.println(newa);
/*
for(i=0;i<;i++)
{
for(j=1;j<;j++)
{
if(newa[i]>newa[j])
{
int temp=newa[i];
newa[i]=newa[j];
newa[j]=temp;
}
}
System.out.println("Index equal values are");
for(i=0;i<n;i++)
System.out.print(newa[i]);
}*/
}
}
