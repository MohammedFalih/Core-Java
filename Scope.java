public class Scope {
   static int x = 10;
   private int y = 22;

   @SuppressWarnings("static-access")
   public void method1(int x) {
      Scope t = new Scope();
      Scope.x = 220;
      y = 90;

      System.out.println("Scope x: " + Scope.x);
      System.out.println("y: " + y);
      System.out.println("t.y: " + t.y);
      System.out.println("t.x: " + t.x);
      // System.out.println("Scope.y: " + Scope.y); it is a private variable
   }

   public static void main(String[] args) {
      Scope t = new Scope();
      t.method1(5);
   }
}