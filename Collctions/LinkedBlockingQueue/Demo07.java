import java.util.concurrent.*;
class Demo07
{
public static void main(String[] args){
LinkedBlockingQueue li = new LinkedBlockingQueue(3); // 3 (capacity) elements
li.offer(10); 
li.offer(20);
li.offer(30);
li.offer(40,2,TimeUnit.SECONDS);// wait for 2 seconds then move if no space found
li.offer(50,5,TimeUnit.SECONDS);// wait for 5 seconds then move if no space found
System.out.println(li);
}
}