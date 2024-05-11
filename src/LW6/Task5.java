package LW6;

import java.util.Arrays;

public class Task5 {
        public static int findMax(int[] array) {
            int threadCount = Runtime.getRuntime().availableProcessors();
            MaxFinderThread[] threads = new MaxFinderThread[threadCount];
            int blockSize = array.length / threadCount;

            for (int i = 0; i < threadCount; i++) {
                int startIndex = i * blockSize;
                int endIndex = (i == threadCount - 1) ? array.length : (i + 1) * blockSize;
                threads[i] = new MaxFinderThread(array, startIndex, endIndex);
                threads[i].start();
            }

            int max = Integer.MIN_VALUE;
            try {
                for (MaxFinderThread thread : threads) {
                    thread.join();
                    max = Math.max(max, thread.getMax());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return max;
        }

        public static void main(String[] args) {
            int[] array = {3, 6, 1, 8, 3, 4, 5, 2, 7};
            System.out.println(Arrays.toString(array));
            int max = findMax(array);
            System.out.println("Maximum element: " + max);
        }
    }
class MaxFinderThread extends Thread{
    private int[] array;
    private int startIndex;
    private int endIndex;
    private int max = Integer.MIN_VALUE;

    public MaxFinderThread(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            max = Math.max(max, array[i]);
        }
    }

    public int getMax() {
        return max;
    }
}


