public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration){
        this.color = color.toLowerCase();
        this.duration = duration;
    }

    public String getColor(){
        return color;
    }

    public int getDuration(){
        return duration;
    }

    public void changeColor(String color){
        this.color = color;
    }

    public boolean isRed(){
        return "red".equals(this.color);
    }

    public boolean isYellow(){
        return "yellow".equals(this.color);
    }

    public boolean isGreen(){
        return "green".equals(this.color);
    }

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red", 30);

        System.out.println("Current color: " + light.getColor());
        System.out.println("Is the light red? " + light.isRed());

        light.changeColor("green");

        System.out.println("Is the light green? " + light.isGreen());
        System.out.println("Duration: " + light.getDuration() + " seconds");
    }
}
