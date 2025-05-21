import java.util.concurrent.*;
class Demo1
{
public static void main(String[] args)
{
LinkedBlockingQueue li = new LinkedBlockingQueue();
li.add(10);
li.add(20);
li.add(30);
li.add(40);
li.add(50);
System.out.println(li);
}
}