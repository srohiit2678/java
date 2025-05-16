class StaticScopeDemo {
    static int x = 5;  // Static variable

    public static void main(String[] args) {
        int x = 10;  // Local variable inside main()
        {
          //  int x = 15; //  Compilation Error - Redeclaration of x in the same scope
            System.out.println(x);
        }
    }
}
