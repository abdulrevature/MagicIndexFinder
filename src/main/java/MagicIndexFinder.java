public class MagicIndexFinder {
    public static int findMagicIndex(int[] arr) {
        return findMagicIndex(arr, 0, arr.length - 1);
    }

    private static int findMagicIndex(int[] arr, int start, int end) {
        if (start > end) {
            return -1; // No magic index found
        }

        int mid = (start + end) / 2;
        if (arr[mid] == mid) {
            return mid; // Found a magic index
        } else if (arr[mid] > mid) {
            // If arr[mid] is greater than mid, the magic index must be on the left side.
            return findMagicIndex(arr, start, mid - 1);
        } else {
            // If arr[mid] is less than mid, the magic index must be on the right side.
            return findMagicIndex(arr, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
        int magicIndex = findMagicIndex(arr);
        if (magicIndex != -1) {
            System.out.println("Magic index found at index " + magicIndex);
        } else {
            System.out.println("No magic index found in the array.");
        }
    }
}
