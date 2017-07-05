# project13
import java.io.*;
import java.util.*;
public class Palindrome
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);  
    int s,sum=0,temp;
    int n;
    n=sc.nextInt();
    temp=n;
    while(n>0)
    {
      s=n%10;
      sum=(sum*10)+s;
      n=n/10;
    }
    if(temp==sum)
    {
      System.out.println("palindrome");
    }
    else
    {
      System.out.println("not palindrome");
    }
  }
}
