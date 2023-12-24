
public class BinarySearch {

	public int findTarget(int target, int[] arr) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
//			int mid = left + (right - left) / 2;
			int mid = (left + right) / 2;
			System.out.println(left + " " + right + " " + mid);
			if (arr[left] == target) {
				return left;
			}
			if (arr[right] == target) {
				return right;
			}

			if (arr[mid] > target) {
				right = mid - 1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else if (arr[mid] == target) {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 8, 16, 20, 23, 27, 29, 40, 47, 50 };
		int target = 50;
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.findTarget(target, arr));

	}

}
