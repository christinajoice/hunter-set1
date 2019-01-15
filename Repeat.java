import java.io.*;
import java.util.*;
public class Repeat
{
public static void main(String args[])
{
int large=0;
int n[]=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of elements");
int N=s.nextInt();
System.out.println("Enter N elements");
for(int i=0;i<N;i++)
{
n[i]=s.nextInt();
}
for(int i=0;i<N-1;i++)
{
for(int j=1;j<N;j++)
{
if(n[i]<n[j])
{
int temp=n[i];
n[i]=n[j];
n[j]=temp;
}
}
}
for(int i=0;i<N;i++)
large=(large*10)+n[i];
System.out.println(large);
}
}
