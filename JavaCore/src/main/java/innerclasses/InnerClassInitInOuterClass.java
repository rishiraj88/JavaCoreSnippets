package innerclasses;

public class InnerClassInitInOuterClass {
 public static void main(String[] args) {
  // First approach: from within the instance code of outer class
  MyOuter myOuter0 = new MyOuter();
  myOuter0.makeInner();
  
  //Second approach: from within the static code of outer class or from within any other class
  // Reference type to use for non-static inner class: MyOuter.MyInner
  // (call to outer class constructor) DOT (call to non-static inner class constructor)
  MyOuter.MyInner myInner1 = new MyOuter().new MyInner();
  myInner1.seeOuterVar();
  //Second approach
  MyOuter myOuter2 = new MyOuter();
  MyOuter.MyInner myInner2 = myOuter2.new MyInner();
  myInner2.seeOuterVar();

// for static nested class
 // constructor has the format: (outer class name) DOT (static nested class name) PARENTHESES
 // First approach for reference variable: when not referencing from within outer class code
 MyOuter.MyStaticNested nested = new MyOuter.MyStaticNested();
 System.out.println("Outer class var returned from static nested class: " + nested.returnOuter()); 
  
}

 
}

class MyOuter {
  private int x = 66;
  static private int y = 77;

  public void makeInner() {
    // First approach
    // When in the instance code of MyOuter, no need to prefix 'myOuter.' to MyInner constructor
    MyInner myInner = new MyInner();
    myInner.seeOuterVar();
  }

  // Non-static inner class
  class MyInner {
    public void seeOuterVar() {
      System.out.println("Outer x is: "+ x++);

      // Inner class accessing the outer class instance variable with 'outerReference.this'
      System.out.println("Outer x with 'this': "+ MyOuter.this.x);
      System.out.println("The name of my outer class is [packageName.className]: "+MyOuter.this.toString().split("@")[0]);
    }
  }

  // Static nested class (Static inner class)
  static class MyStaticNested {
    public int returnOuter() {
      //return MyOuter.this.x; // MyOuter.this is not accessible
      return MyOuter.y;
    }
  }

  static void testStaticNested () {
  // Second approach for reference variable: when referencing from within the respective outer class code
  MyStaticNested nested = new MyOuter.MyStaticNested();
  System.out.println("Outer class var returned from static nested class: " + nested.returnOuter()); 
  }
}

