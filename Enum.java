public class Enum {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level level = Level.MEDIUM;
        System.out.println(level);

        System.out.println("\nEnum with switch-case: ");
        switch (level) {
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
            default:
                System.out.println("None");
        }

        System.out.println("\nEnum with for-each loop: ");
        for (Level lvl : Level.values()) {
            System.out.println(lvl);
        }
    }
}
