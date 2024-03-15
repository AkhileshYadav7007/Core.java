public class Main {
    public static int[] arr = {1, 20, 50, 15, 30};
    public static int sum = 0;
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (arr) {
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("Average of first 10 numbers: " + (sum / 10.0));
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (arr) {
                System.out.print("Squares of the numbers in arr: ");
                for (int num : arr) {
                    System.out.print(num * num + " ");
                }
                System.out.println();
            }
        });

        // Start the threads
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();

    }
}