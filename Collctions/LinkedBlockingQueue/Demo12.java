import java.util.concurrent.*;
class Demo12
{
public static void main(String[] args)throws InterruptedException
{
LinkedBlockingQueue li = new LinkedBlockingQueue();
System.out.println(li.poll(5,TimeUnit.SECONDS));//remove FIFO if no element exist than wait for 5 secounds
li.offer(10); 
li.offer(20);
li.offer(30);
li.offer(40);
li.offer(50);
System.out.println(li);

}
}