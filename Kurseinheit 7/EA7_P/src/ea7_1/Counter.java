package ea7_1;

class Counter {
    private int startValue;
    private int value;
    private int min = 0;
    private int max = 99;
    Counter(int start) {
        startValue = start;
        value = start;
    }
    void increment() {
        if(value < max) {
            value++;
        }
    }
    void decrement() {
        if(value > min) {
            value--;
        }
    }
    void reset() {
        value = startValue;
    }
    @Override
    public String toString() {
        return "" + value;
    }
}
