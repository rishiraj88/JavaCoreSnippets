public class SingleInArray {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
    System.out.println(findSingle(arr));
  }

  /**
   * 1. Initialize SUM to 0.
   * 2. Iterate over the array (for or while loop) with a step size of +2
   * (increment of index by 2).
   * 2.1. Add the current element (i th element) to SUM. And subtract the next
   * element ( the element at (i+1) index) from SUM.
   * 3. Return SUM as being the lonely value.
   * 
   * @param a
   * @return unique element of array
   */
  static int findSingle(int[] a) {
    int sum = 0;
    try {
      for (int i = 0; i < a.length; i += 2) {
        sum += a[i];
        sum -= a[i + 1];
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Well expected to run beyond index");
    }
    return sum;
  }
}