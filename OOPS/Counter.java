//14.  Create a class called Counter that stores a number and provides methods to increment, decrement and return the count.Provide the constructor without parameters that sets the values to zero and another constructor with parameters takes the values and starts from there.

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public Counter(int initialCount) {
        this.count = initialCount;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        System.out.println("Counter1 initial count: " + counter1.getCount());
        counter1.increment();
        System.out.println("Counter1 after increment: " + counter1.getCount());
        counter1.decrement();
        System.out.println("Counter1 after decrement: " + counter1.getCount());

        Counter counter2 = new Counter(10);
        System.out.println("Counter2 initial count: " + counter2.getCount());
        counter2.increment();
        System.out.println("Counter2 after increment: " + counter2.getCount());
        counter2.decrement();
        System.out.println("Counter2 after decrement: " + counter2.getCount());
    }
}