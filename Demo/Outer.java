public class Outer {
 void method(){
  Inner ic = new Inner();//Causes generation of accessor class
  int jk = 211;
 }
 public class Inner {
  private Inner(){}
 }
}
