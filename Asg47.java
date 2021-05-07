class Asg47
{
 public static void main(String args[])
{for(int i=1; i<=6;i++)
{
for(int j=1; j<=6;j++)
{
if(i==6||j==7-i)
System.out.print(" *");
else
System.out.print(" ");
}
for(int k=2;k<=5;k++)
{
if(k==i)
System.out.print(" *");
else
System.out.print(" ");
}
System.out.println();
}
}
}