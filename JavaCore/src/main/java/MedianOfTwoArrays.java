/**
 * 
 * @author rishiraj
 * to find the median for the elements of two arrays taken together
 */
public class MedianOfTwoArrays {

	public static void main(String[] args) {

		int[] nums1 = { 1, 3 }, nums2 = { 2 };

		nums1= new int[] {1,2};		nums2= new int[] {3,4};

//		nums1= new int[] {0,0};		nums2= new int[] {0,0};

		nums1= new int[] {};			nums2= new int[] {1};

		nums1= new int[] {2};			nums2= new int[] {};

		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] arr1, int[] arr2) {

		double med = 0.0;
		int low = 0;
		int high = 0;
		double frequency = 0.0;

		if (0 != arr1.length) {
			frequency += 1;
			high = arr1[arr1.length - 1];
			if (1 < arr1.length)
				low = arr1[0];
		}

		if (0 != arr2.length) {
			frequency += 1;
			if (arr2[arr2.length - 1] > high)
				high = arr2[arr2.length - 1];
			if (arr2[0] < low)
				low = arr2[0];
		}

		System.out.println("low: " + low);
		System.out.println("high: " + high);
		med = (low + high) / frequency;

		return med;
	}
}