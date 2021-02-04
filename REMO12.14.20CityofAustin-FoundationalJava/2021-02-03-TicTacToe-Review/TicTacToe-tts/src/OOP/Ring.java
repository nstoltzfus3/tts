package OOP;

public abstract class Ring {
    private int circumference;
    private String material;
    private String leftOrRight;
    private boolean isMarriageRing;
    protected boolean isWorn;

    public Ring(int circumference, String material, String leftOrRight, boolean isMarriageRing) {
        this.circumference = circumference;
        this.material = material;
        this.leftOrRight = leftOrRight;
        this.isMarriageRing = isMarriageRing;
    }

    public void putItOn() {

    }

    public void takeItOff() {

    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    public int getCircumference() {
        return circumference;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getLeftOrRight() {
        return leftOrRight;
    }

    public void setLeftOrRight(String leftOrRight) {
        this.leftOrRight = leftOrRight;
    }

    public boolean isMarriageRing() {
        return isMarriageRing;
    }

    public void setMarriageRing(boolean marriageRing) {
        isMarriageRing = marriageRing;
    }

    public boolean isWorn() {
        return isWorn;
    }

    public void setWorn(boolean worn) {
        isWorn = worn;
    }

    public static void main() {
        Ring stuff = new OneRing(0, "", "", true);
    }

}
