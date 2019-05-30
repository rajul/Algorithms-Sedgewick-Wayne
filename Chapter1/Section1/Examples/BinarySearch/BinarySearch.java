import java.util.Arrays;

class BinarySearch {
    public static int rank(int key, int[] A) {
	int lo = 0;
	int hi = A.length - 1;

	while(lo <= hi) {
	    int mid = lo + (hi - lo) / 2;

	    if (A[mid] > key)
		hi = mid - 1;
	    else if (A[mid] < key)
		lo = mid + 1;
	    else
		return mid;
	}

	return -1;
    }

    public static void main(String args[]) {
	int[] testArray = {1, 3, 4, 5, 6, 10};

	int res = BinarySearch.rank(10, testArray);
	int res1 = BinarySearch.rank(3, testArray);

	System.out.println(res);
	System.out.println(res1);
    }
}
