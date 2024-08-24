/*
 * NAME: Felix Najera
 * PID:  Najera
 */

//Provided imports, feel free to use these if needed
import java.util.Collections;
import java.util.ArrayList;

/**
 * Data structures to be used for analysis.
 */
public class Sorts {
    /**
     * this helper finds the appropriate number of buckets you should allocate
     * based on the range of the values in the input list
     * @param list the input list to bucket sort
     * @return number of buckets
     */
    private static int assignNumBuckets(ArrayList<Integer> list) {
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        return (int) Math.sqrt(max - min) + 1;
    }

    /**
     * this helper finds the appropriate bucket index that a data should be
     * placed in
     * @param data a particular data from the input list if you are using
     *             loop iteration
     * @param numBuckets number of buckets
     * @param listMin the smallest element of the input list
     * @return the index of the bucket for which the particular data should
     * be placed in
     */
    private static int assignBucketIndex(Integer data, int numBuckets, Integer listMin) {
        return (data - listMin) / numBuckets;
    }

    /**
     * This method performs bucket sort on the input arraylist
     *
     * @param list The arraylist we want to sort
     */
    public static ArrayList<Integer> bucketSort(ArrayList<Integer> list) {
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
        int numBuckets = assignNumBuckets(list);
        for (int i = 0; i < numBuckets; i++) {
            ArrayList<Integer> freshBucket = new ArrayList<>();
            buckets.add(i, freshBucket);
        }
        Integer listMin = Collections.min(list);
        for (Integer data : list) {
            int bucketIndex = assignBucketIndex(data, numBuckets, listMin);
            // Adds data to correct bucket
            buckets.get(bucketIndex).add(data);
        }

        ArrayList<Integer> sortedList = new ArrayList<>();
        for (ArrayList<Integer> bucket : buckets) {
            if (bucket.size() > 0) {
                Collections.sort(bucket);
            }
            // Adds all elements in bucket to sortedList
            sortedList.addAll(bucket);
        }
        return sortedList;
    }

    /**
     * This method performs count sort on the input arraylist
     *
     * @param list The arraylist we want to sort
     */
    public static ArrayList<Integer> countSort(ArrayList<Integer> list) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        // Find the largest element of the array
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Initialize output with all zeros.
        for (int i = 0; i < list.size(); ++i) {
            output.add(0);
        }

        // Store the count of each element
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            // increment count array at correct index
            count[value]++;
        }

        // Store the cumulative count of each array
        for (int i = 1; i <= max; i++) {
            // inserting the data into the previous
            count[i] += count[i - 1];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = 0; i < list.size(); i++) {
            count[list.get(i)]--;
            output.set(count[list.get(i)], list.get(i));
        }

        return output;
    }

    ////////////////////////
    ///// EXTRA CREDIT /////
    ////////////////////////

    // public static boolean inspectInsertion(int[] arr, int n) {
    //     //
    //     return false;
    // }

    // public static boolean inspectSelection(int[] arr, int n) {
    //     //
    //     return false;
    // }

    // public static boolean inspectMerge(int[] arr, int n) {
    //     //
    //     return false;
    // }

}
