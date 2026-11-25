package Binary_Searching;

public class BasicBinarySearch {
    public static void main(String[] args) {
        int[]arr={-76,-4,9,28,47,49,510,619,9911,99999};
        int target=9;
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid =  (high + low) / 2;

            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}