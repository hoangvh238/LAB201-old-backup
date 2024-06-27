package model.Enum;

public enum Degree {
    intermediate(1), college(2), university(3);

    int value;
    Degree(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
