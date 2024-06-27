package model.heightCalculator;

public class BodyInformation {
    float weight;
    float height;

    public BodyInformation(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
