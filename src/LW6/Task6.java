package LW6;

import java.util.Arrays;

public class Task6 {
        public static int sum(int[] array) {
            int threadCount = Runtime.getRuntime().availableProcessors();
            int blockSize = array.length / threadCount;
            SummationThread[] threads = new SummationThread[threadCount];

            for (int i = 0; i < threadCount; i++) {
                int startIndex = i * blockSize;
                int endIndex = (i == threadCount - 1) ? array.length : (i + 1) * blockSize;
                threads[i] = new SummationThread(array, startIndex, endIndex);
            }

            // Запускаем каждый поток и ждем их завершения
            int totalSum = 0;
            try {
                for (SummationThread thread : threads) {
                    thread.start(); // Здесь вызываем метод start() у каждого потока
                }
                for (SummationThread thread : threads) {
                    thread.join(); // Здесь вызываем метод join() у каждого потока
                    totalSum += thread.getPartialSum();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return totalSum;
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(Arrays.toString(array));
            int sum = sum(array);
            System.out.println("Sum of array elements: " + sum);
        }
    }

    class SummationThread extends Thread {
        private int[] array;
        private int startIndex;
        private int endIndex;
        private int partialSum;

        public SummationThread(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
                partialSum += array[i];
            }
        }

        public int getPartialSum() {
            return partialSum;
        }
    }