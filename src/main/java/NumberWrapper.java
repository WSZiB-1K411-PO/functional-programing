import lombok.AllArgsConstructor;

@AllArgsConstructor
public record NumberWrapper(Integer number) {
    public NumberWrapper add(Integer a) {
        return new NumberWrapper(number + a);
    }

    public void print() {
        System.out.println(number);
    }

    @Override
    public String toString() {
        return "" + number;
    }
}
