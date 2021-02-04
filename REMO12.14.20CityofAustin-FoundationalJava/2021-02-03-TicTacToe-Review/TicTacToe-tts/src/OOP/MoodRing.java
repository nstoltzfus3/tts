package OOP;

public class MoodRing extends Ring{
    private String color;

    public MoodRing(int circumference, String material, String leftOrRight, boolean isMarriageRing) {
        super(circumference, material, leftOrRight, isMarriageRing);
    }

    private int measureTemp() {
        return 0;
    }

    public void changeColor() {
        this.color = Integer.toString(measureTemp());
    }

    public static void main() {
        Ring stuff = new OneRing(0, "", "", true);
    }
}
