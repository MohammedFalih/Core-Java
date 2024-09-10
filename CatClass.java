class Cat{
    String name, breed, color;
    int age;

    public Cat(String name, String breed, String color, int age){
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public String getName() { return name; };
    public String getBreed() { return breed; };
    public String getColor() { return color;};
    public int getAge() { return age; };

    public  String toString() {
        return ("Hi my name is " + this.getName()
        + ".\nMy breed,age and color are "
        + this.getBreed() + "," + this.getAge()
        + "," + this.getColor());
    }

    public static void main(String[] args) {
        Cat zara = new Cat("Zaraa", "persian", "white", 1);
        System.out.println(zara);
    }
}