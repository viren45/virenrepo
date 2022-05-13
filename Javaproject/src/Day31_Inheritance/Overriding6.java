package Day31_Inheritance;

class Parent2 {
    // private methods are not overridden
    private void m1()
    {
        System.out.println("From parent m1()");
    }  
    protected void m2()
    {
        System.out.println("From parent m2()");
    }
}
  
class Child2 extends Parent2 {
    // new m1() method
    // unique to Child class
    private void m1()
    {
        System.out.println("From child m1()");
    }
  
    // overriding method
    // with more accessibility
    @Override
    public void m2()
    {
        System.out.println("From child m2()");
    }
}
  
// Driver class
class Overriding6 {
    public static void main(String[] args)
    {
        Parent2 obj1 = new Parent2();
        obj1.m2();

        Parent2 obj2 = new Child2();
        obj2.m2();
    }
}