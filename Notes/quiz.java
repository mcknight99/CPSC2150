import java.util.ArrayList;

public class quiz <cow>
{
    private ArrayList<cow> queue;

    public quiz() {
        queue = new ArrayList<cow>();
    }
    public void enqueue(cow val) {
        queue.add(val);
    }

    public cow dequeue() {
        return queue.remove(0);
    }

    public static void main(String[] args) {
        quiz<int> q = new quiz<int>(); //must be Integer to compile
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        Double myWrapperDouble = 10.0;
    }
}