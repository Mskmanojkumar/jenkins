class Cube
{
static int a;
static void getdata(int b)
{
a=b*b*b;
System.out.println("THE CUBE OF GIVEN NUMBER "+b+" IS " +a);
}
public static void main(String arg[])
{
Cube c=new Cube();
c.getdata(30);
}
}