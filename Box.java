class Box{
    int length, breadth, height;
    static int counts = 0;

    public static int getCount(){
        return counts;
    }

    public Box(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        counts++;
    }

    public String message(){
        return ("This is a box with length " + length + " and breadth " + breadth );
    }

    public static void main(String[] args) {
        Box woodenBox = new Box(15, 20);
        Box plasticBox = new Box(12, 15);
        System.out.println(woodenBox.message());
        System.out.println(plasticBox.message());
        System.out.println(getCount());
    }
}