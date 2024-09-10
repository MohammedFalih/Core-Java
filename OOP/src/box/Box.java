package box;

public class Box {
   private int length;
   private int breadth;
   private int height;

   public Box(int l, int b, int h){
    this.length = l;
    this.breadth = b;
    this.height = h;
   }

   public Box(Box box){
    this.length = box.length;
    this.breadth = box.breadth;
    this.height = box.height;
   }

   public int volume(){
    return length*height*breadth;
   }

   public boolean isEqual(Box box){
    if(length == box.length && breadth == box.breadth && height == box.height){
        return true;
    }
    return false;
   }
}
