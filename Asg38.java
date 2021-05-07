class Asg38
{
 public static void main(String args[])
{for(int i=1;i<=9;i++)
{
for(int j=9;j>=i;j--)
{
System.out.print("  ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" "+k);
}
for(int l=1;l<i;l++)
{System.out.print(" "+(i-l));
}
System.out.println();
}
}
}