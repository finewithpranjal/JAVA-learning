public class wrapper {
    public static void main(String[] args) {
        // int a = 10;
        // Integer num = 45;   // now this is an object.
        // int b = 30;
        Integer a = 10;
        Integer b = 30;
        swap(a,b);


        System.out.println(a + " " + b); // this will not swap.
  
      
            final  A raghav  = new A ("Raghav Aarya");


            // when a non premitive is 'final' you can not reasign it. you can change the values.
             raghav.name = "Other name";
            //  raghav = new A ("new object") we cant reasign the objects

            A obj;
            for (int i =0; i<100000; i++)
            {
                 obj = new A("Randome name")
            }
    }
    //    static void swap ( int a , int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;



    // final int bonus = 2;  since you cant modify the final veriabl so it is neccessary to initialize it, while declairing it.
    // bonus = 3   we can't modify the final keywords veriable

    static void swap ( Integer a , Integer b){
        int temp = a;
        a = b;
        b = temp;
        
        // System.out.println(a + " " + b);
     }

}
class A {
    final int num = 10;

    String name;
    
  public A(String name){
    // System.out.println("Object is created!");
    this.name = name;
}

  @Override
  protected void finalize() throws Throwable {
      // TODO Auto-generated method stub
      super.finalize();
      System.out.println("Object is destroyed");
  }
}
