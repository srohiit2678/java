import java.util.concurrent.*;
class Demo09
{
public static void main(String[] args)throws InterruptedException
{
LinkedBlockingQueue li = new LinkedBlockingQueue(); // 3 (capacity) elements
li.offer(10); 
li.offer(20);
li.offer(30);
li.offer(40);
li.offer(50);
System.out.println(li.take());// element
System.out.println(li.take());//remove FIFO if no element exist than wait for infinit
System.out.println(li);

}
}