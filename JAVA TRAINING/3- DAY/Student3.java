public class Student3{
   /* static function is a method that belongs to a class
      rahter than an instance of that class. 
      static class can be called whithout creating instance of the class */
      /* only static variabal can be acces by static method  */
      static int a=5;

    static int add(int cc, int dd)
    {    int c = cc+dd;
         a++; 
         // a become 6 now
        System.out.println("static add is: "+(cc+dd));
        return c;
    }

    int sum(int aa,int bb){
        System.out.println("instance sum is: "+(aa+bb));
        return (aa+bb);
    }
    public static void main(String []args){
        Student3 obj = new Student3();
        int sum;
        sum = obj.sum(4, 6);
        System.out.println("instance return sum is: "+sum);

    int add = add(3, 4);
    System.out.println("static return add is: "+add);

}
}