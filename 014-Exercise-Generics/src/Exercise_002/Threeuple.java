package src.Exercise_002;

public class Threeuple<K, V, S> {
    private K firstValue;
    private V secondValue;
    private S thirdValue;

    public Threeuple(K firstValue, V secondValue, S thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    @Override
    public String toString() {
        return this.firstValue + " -> " + this.secondValue + " -> " + this.thirdValue;
    }
}
