package trees;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = new int[] {4,5,6,7,1,2};
		int[] arr1 = new int[] {0,0,0,1,2,3,4,5,5,6,7,8,9,9,9};
//		int[] arr1 = new int[] {0,1,2,3,4,5,6,7,8,9};
//		int[] arr1 = new int[] {4,5,6,7,8,9};
		int search = 9;
		
	//	int pivot = binarySearch(arr, search, 0, arr.length);
		int index = binarySearch1(arr1, search, 0, arr1.length - 1);
		//System.out.println("pivot " + pivot);
		System.out.println("index " + index);
	}

	private static int binarySearch1(int[] arr, int search, int start, int end) {
		if (end == start) {
			return end;
		}
		int len = end - start;
		int mid = start + (len / 2);
		System.out.println("mid " + mid + " and len " + len);
		if (search == arr[mid]) {
			System.out.println("FOund arr mid " + arr[mid]);
			return mid;
		} else if (search > arr[mid]) {
			System.out.println("on right arr mid " + arr[mid + 1] + " and end " + arr[end]);
			return binarySearch1(arr, search, mid + 1, end);
		} else {
			System.out.println("on left arr start " + arr[start] + " and mid - 1 " + arr[(mid - 1)]);
			return binarySearch1(arr, search, start, (mid - 1));
		}
	}

	private static int binarySearch(int[] arr, int search, int start, int end) {
		int len = end - start + 1;
		int mid = (end - start) / 2;
		System.out.println("mid " + mid + " and len " + len);
		if (arr[mid] < arr[mid - 1]) {
			System.out.println("arr mid " + arr[mid]);
			return arr[mid];
		}
		System.out.println("mid - 1 mod len " + (mid - 1) % len);
		if (arr[mid] > arr[(mid - 1) % len]) {
			System.out.println("arr mid " + arr[mid] + " and end " + arr[end - 1]);
			binarySearch(arr, search, mid, end - 1);
		} else if (arr[mid] < arr[(mid - 1) % len]) {
			System.out.println("arr start " + arr[start] + " and mid - 1 mod len " + arr[(mid - 1) % len]);
			binarySearch(arr, search, start, (mid - 1) % len);
		}
		return 0;
	}
}
