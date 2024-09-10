package box;

class Main {
    public static void main(String[] args) {
        Box blackBox = new Box(12,12,12);
        Box woodenBox = new Box(12, 14, 15);
        Box plasicBox = new Box(blackBox);

        int blackBoxVol = blackBox.volume();
        int woodenBoxVol = woodenBox.volume();
        int plasicBoxVol = plasicBox.volume();

        System.out.println("The volume of the blackbok is: " + blackBoxVol);
        System.out.println("The volume of the woodenbox is: " + woodenBoxVol);
        System.out.println("The volume of the plasticbox is: " + plasicBoxVol);

        System.out.println("Compare blackbox and woodenbox: " + blackBox.isEqual(woodenBox)); 
        System.out.println("Compare blackbox and plasticbox: " + blackBox.isEqual(plasicBox)); 
    }
}
