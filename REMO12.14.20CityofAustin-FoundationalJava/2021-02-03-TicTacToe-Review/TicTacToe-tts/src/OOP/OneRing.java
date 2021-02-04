package OOP;

public class OneRing extends Ring{
    private String rulesOver = "them all";
    private String color;
    private String inscription = "...in the darkness binds them";
    private boolean isInvisible;

    public OneRing(int circumference, String material, String leftOrRight, boolean isMarriageRing) {
        super(circumference, material, leftOrRight, isMarriageRing);
    }

    public void heavySuggestion() {

    }

    public void putItOn() {
        isInvisible = true;
        this.isWorn = true;
        setCircumference(5);
    }
    public void takeItOff() {
        isInvisible = false;
        this.isWorn = false;
    }

    public static void main() {
        OneRing stuff = new OneRing(0, "", "", true);
        MoodRing stuff1 = new MoodRing(0, "", "", true);
        Ring[] rings = {stuff, stuff1};

//        for (Orchesta orc : orchestras) {
//            if (ring instanceof Ring) {
//
//            }
//            if (orc instanceof saxaphone) {
//
//            }
//            if (orc instanceof brass) {
//
//            }
//        }
    }
}
