import java.util.concurrent.*;
class Demo02
{
public static void main(String[] args)throws InterruptedException
{
LinkedBlockingQueue li = new LinkedBlockingQueue();
li.put(10); // put()throws checked Exception InterruptedException
li.put(20);
li.put(30);
li.put(40);
li.put(50);
System.out.println(li);
}
}