package main;

public class BonusBinarySearch {
  
  public static void main(String[] args){
    int[] thisArray = new int[] {0,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    binarySearch(thisArray, 1);
  }
  
  /**
   * A binary search implementation for integer arrays.
   *
   * Info about binary search: https://www.geeksforgeeks.org/binary-search/
   *
   * @param sortedNumbers - must be sorted from least to greatest
   * @param n - number to search for
   * @return index of search item if it's found, -1 if not found
   */
  public static int binarySearch(int[] sortedNumbers, int n) {
    int right = sortedNumbers.length - 1;
    int left = 0;
    int mid = left + ((right - left) / 2);
    while (mid > left) {
      mid = left + ((right - left) / 2);
      if (sortedNumbers[mid] > n) {
        right = mid;
      } else if (sortedNumbers[mid] < n) {
        left = mid;
      } else {
        return mid;
      }
    }
    System.out.println(-1);
    return -1;
  }
}
