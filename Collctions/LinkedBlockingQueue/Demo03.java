import java.util.concurrent.*;
class Demo03
{
public static void main(String[] args)
{
LinkedBlockingQueue li = new LinkedBlockingQueue();
li.offer(10); 
li.offer(20);
li.offer(30);
li.offer(40);
li.offer(50);
System.out.println(li);
}
}