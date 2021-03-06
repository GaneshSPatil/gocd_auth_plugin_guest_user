package cd.go.plugin.auth.util;

public class Wrapper<T> {
    private T objectToHoldOnTo;

    public Wrapper<T> holdOnTo(T objectToHoldOnTo) {
        this.objectToHoldOnTo = objectToHoldOnTo;

        return this;
    }

    public T get() {
        return objectToHoldOnTo;
    }
}
