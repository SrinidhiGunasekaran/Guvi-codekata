import java.io.*;
class Number
{
public static void main(String args[])
{
int number;
try
{
DataInputStream in=new DataInputStream(System.in);
number=Integer.parseInt(in.readLine());
if(number>0)
{
System.out.println("The number is positive");
}
else if(number<0)
{
System.out.println("The number is negative");
}
else if(number==0)
{
System.out.println("The number is zero");
}
else
{
System.out.println("Invalid data");
}
}
catch(Exception e)
{
}
}
}
