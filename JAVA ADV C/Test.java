class Foo
{
static int x=100;

void m()
{
System.out.println(x);
x++;
}
}
 
class Test
{
public static void main(String... a)
{
Foo f1=new Foo();
Foo f2=new Foo();
Foo f3=new Foo();

f1.m();
f2.m();
f3.m();
}
}