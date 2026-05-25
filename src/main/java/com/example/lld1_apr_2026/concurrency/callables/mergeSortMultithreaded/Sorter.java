package com.example.lld1_apr_2026.concurrency.callables.mergeSortMultithreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arr;
    private ExecutorService executorService;

    public Sorter(List<Integer> arr, ExecutorService executorService) {
        this.arr = arr;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        // Base case: array size 0 or 1 is already sorted
        if (arr.size() <= 1) {
            return arr;
        }

        // Divide: find the midpoint
        int mid = arr.size() / 2;

        // Create two left and right subarrays
        List<Integer> leftArray = new ArrayList<>(arr.subList(0, mid));
        List<Integer> rightArray = new ArrayList<>(arr.subList(mid, arr.size()));

        // Create two Sorter tasks
        Sorter leftSorter = new Sorter(leftArray, executorService);
        Sorter rightSorter = new Sorter(rightArray, executorService);

        // Submit the tasks to the executor to run in PARALLEL!
        Future<List<Integer>> leftFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightFuture = executorService.submit(rightSorter);

        // Wait for both the results
        List<Integer> sortedLeft = leftFuture.get();
        List<Integer> sortedRight = rightFuture.get();

        // merge the two sorted halves
        return merge(sortedLeft, sortedRight);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while ( i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        // Add the remaining elements
        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}
