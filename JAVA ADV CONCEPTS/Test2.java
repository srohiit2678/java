//DPA(Dynamic Polymorphic Assignment)
//Assigning child class's object into parent class's reference variable
class Foo
{
void m()
{
System.out.println("Hello Foo");
}
}


class Doo extends Foo
{
void m()
{
System.out.println("Hello Doo");
}
}

class Test2
{
public static void main(String arg[])
{
Foo f=new Doo();
f.m();
}
}
