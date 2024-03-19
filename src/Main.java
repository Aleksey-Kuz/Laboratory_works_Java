public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Queue my_queue = new Queue(arr);
        System.out.println("Queue: [1,2,3,4,5]");
        System.out.println("Queue size: " + my_queue.get_size());
        System.out.println("Queue front: " + my_queue.front());
        System.out.println("Queue back: " + my_queue.back());
        System.out.println();

        for (int i = 0; i < 5; ++i)
        {
            System.out.println("Queue.pop: " + my_queue.pop());
        }

        System.out.println("Queue.is_empty(): " + my_queue.is_empty());
        System.out.println();

        my_queue.push(0); System.out.println("Queue.push: " + 0);
        my_queue.push(10); System.out.println("Queue push: " + 10);
        my_queue.push(100); System.out.println("Queue push: " + 100);

        System.out.println();

        System.out.println("Queue: [0, 10, 100]");
        System.out.println("Queue.is_empty(): " + my_queue.is_empty());

        System.out.println("Queue.find_elem(10): " + my_queue.find_elem(10));
        System.out.println("Queue.find_elem(1000): " + my_queue.find_elem(1000));

    }
}