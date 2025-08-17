import java.util.concurrent.*;
class Demo08
{
public static void main(String[] args){
LinkedBlockingQueue li = new LinkedBlockingQueue(); // 3 (capacity) elements
li.offer(10); 
li.offer(20);
li.offer(30);
li.offer(40);
li.offer(50);
System.out.println(li.remove(10));// boolean
System.out.println(li.remove(10));// if remove than true else false
System.out.println(li);

}
}