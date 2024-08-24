import java.util.ArrayList;

public class SortsTracing {

    //Note: Style is not required for this file

    //for reference
    public ArrayList<int[]> SelectionSortExampleList() {
        ArrayList<int[]> answer = new ArrayList<int[]>();
        answer.add(new int[]{-1, 20, 18, 17, 9, 4, 2, 0, 40});
        answer.add(new int[]{-1, 0, 18, 17, 9, 4, 2, 20, 40});
        answer.add(new int[]{-1, 0, 2, 17, 9, 4, 18, 20, 40});
        answer.add(new int[]{-1, 0, 2, 4, 9, 17, 18, 20, 40});
        answer.add(new int[]{-1, 0, 2, 4, 9, 17, 18, 20, 40});
        answer.add(new int[]{-1, 0, 2, 4, 9, 17, 18, 20, 40});
        // etc... (the rest of the iterations)
        return answer;
    }

    public ArrayList<int[]> InsertionSortRandomList() {
        ArrayList<int[]> answer = new ArrayList<int[]>();
        answer.add(new int[]{30, 62, 5, 109, 66, 17, 51, 18});
        answer.add(new int[]{30, 62, 5, 109, 66, 17, 51, 18});
        answer.add(new int[]{30, 5, 62, 109, 66, 17, 51, 18});
        answer.add(new int[]{5, 30, 62, 109, 66, 17, 51, 18});
        answer.add(new int[]{5, 30, 62, 66, 109, 17, 51, 18});
        answer.add(new int[]{5, 30, 62, 66, 17, 109, 51, 18});
        answer.add(new int[]{5, 30, 62, 17, 66, 109, 51, 18});
        answer.add(new int[]{5, 30, 17, 62, 66, 109, 51, 18});
        answer.add(new int[]{5, 17, 30, 62, 66, 109, 51, 18});
        answer.add(new int[]{5, 17, 30, 62, 66, 51, 109, 18});
        answer.add(new int[]{5, 17, 30, 62, 51, 66, 109, 18});
        answer.add(new int[]{5, 17, 30, 51, 62, 66, 109, 18});
        answer.add(new int[]{5, 17, 18, 30, 51, 62, 66, 109});
        // answer.add(new int[]{30, 5, 62, 109, 66, 17, 51, 18});
        // answer.add(new int[]{30, 5, 62, 109, 66, 17, 51, 18});
        // answer.add(new int[]{30, 62, 5, 66, 109, 17, 51, 18});
        // answer.add(new int[]{30, 62, 5, 66, 17, 109, 51, 18});
        // answer.add(new int[]{30, 62, 5, 66, 17, 51, 18, 109});
        return answer;
    }

    public ArrayList<int[]> InsertionSortSortedList() {
        ArrayList<int[]> answer = new ArrayList<int[]>();
        answer.add(new int[]{5, 17, 18, 30, 51, 62, 66, 109});
        answer.add(new int[]{5, 17, 18, 30, 51, 62, 66, 109});
        answer.add(new int[]{5, 17, 18, 30, 51, 62, 66, 109});
        answer.add(new int[]{5, 17, 18, 30, 51, 62, 66, 109});
        answer.add(new int[]{5, 17, 18, 30, 51, 62, 66, 109});
        answer.add(new int[]{5, 17, 18, 30, 51, 62, 66, 109});
        answer.add(new int[]{5, 17, 18, 30, 51, 62, 66, 109});
        answer.add(new int[]{5, 17, 18, 30, 51, 62, 66, 109});
        answer.add(new int[]{5, 17, 18, 30, 51, 62, 66, 109});
        return answer;
    }

    public ArrayList<int[]> InsertionSortReversedList() {
        ArrayList<int[]> answer = new ArrayList<int[]>();
        answer.add(new int[]{109, 66, 62, 51, 30, 18, 17, 5});
        answer.add(new int[]{66, 109, 62, 51, 30, 18, 17, 5});
        answer.add(new int[]{62, 66, 109, 51, 30, 18, 17, 5});
        answer.add(new int[]{51, 62, 66, 109, 30, 18, 17, 5});
        answer.add(new int[]{30, 51, 62, 66, 109, 18, 17, 5});
        answer.add(new int[]{30, 51, 62, 66, 109, 18, 17, 5});
        answer.add(new int[]{18, 30, 51, 62, 66, 109, 17, 5});
        answer.add(new int[]{17, 18, 30, 51, 62, 66, 109, 5});
        answer.add(new int[]{5, 17, 18, 30, 51, 62, 66, 109});
        return answer;
    }

    public ArrayList<int[]> MergeSortRandomList() {
        ArrayList<int[]> answer = new ArrayList<int[]>();
        answer.add(new int[]{88, 46, -1, 8, 100, -2, 38, 16});
        answer.add(new int[]{88, 46, -1, 8, 100, -2, 38, 16});
        answer.add(new int[]{46, 88, -1, 8, -2, 100, 16, 38});
        answer.add(new int[]{-1, 8, 46, 88, -2, 16, 38, 100});
        answer.add(new int[]{-2, -1, 8, 16, 38, 46, 88, 100});
        // how to merge them back together once \
        // becoming one element arrays
        return answer;
    }

    public ArrayList<int[]> MergeSortSortedList() {
        ArrayList<int[]> answer = new ArrayList<int[]>();
        answer.add(new int[]{-2, -1, 8, 16, 38, 46, 79, 100});
        answer.add(new int[]{-2, -1, 8, 16, 38, 46, 79, 100});
        answer.add(new int[]{-2, -1, 8, 16, 38, 46, 79, 100});
        answer.add(new int[]{-2, -1, 8, 16, 38, 46, 79, 100});
        answer.add(new int[]{-2, -1, 8, 16, 38, 46, 79, 100});
        return answer;
    }

    public ArrayList<int[]> MergeSortReversedList() {
        ArrayList<int[]> answer = new ArrayList<int[]>();
        answer.add(new int[]{100, 88, 46, 38, 16, 8, -1, -2});
        answer.add(new int[]{88, 100, 38, 46, 8, 16, -2, -1});
        answer.add(new int[]{38, 46, 88, 100, -2, -1, 8, 16});
        answer.add(new int[]{-2, -1, 8, 16, 38, 46, 88, 100});
        return answer;
    }

    public ArrayList<int[]> QuickSortRandomList() {
        ArrayList<int[]> answer = new ArrayList<int[]>();
        answer.add(new int[]{12, 0, 67, -8, 54, 53, 95, 22});
        answer.add(new int[]{0, -8, 12, 67, 54, 53, 95, 22});
        answer.add(new int[]{-8, 0, 12, 67, 54, 53, 95, 22});
        answer.add(new int[]{-8, 0, 12, 22, 54, 53, 95, 67});
        answer.add(new int[]{-8, 0, 12, 22, 53, 54, 95, 67});
        answer.add(new int[]{-8, 0, 12, 22, 53, 54, 67, 95});
        return answer;
    }

    public ArrayList<int[]> QuickSortSortedList() {
        ArrayList<int[]> answer = new ArrayList<int[]>();
        answer.add(new int[]{-8, 0, 12, 22, 53, 54, 67, 95});
        answer.add(new int[]{-8, 0, 12, 22, 53, 54, 67, 95});
        answer.add(new int[]{-8, 0, 12, 22, 53, 54, 67, 95});
        answer.add(new int[]{-8, 0, 12, 22, 53, 54, 67, 95});
        answer.add(new int[]{-8, 0, 12, 22, 53, 54, 67, 95});
        return answer;
    }

    public ArrayList<int[]> QuickSortReversedList() {
        ArrayList<int[]> answer = new ArrayList<int[]>();
        answer.add(new int[]{95, 67, 54, 53, 22, 12, 0, -8});
        answer.add(new int[]{-8, 0, 12, 22, 53, 54, 67, 95});
        answer.add(new int[]{-8, 0, 12, 22, 53, 54, 67, 95});
        answer.add(new int[]{-8, 0, 12, 22, 53, 54, 67, 95});
        return answer;
    }

}