 * 1. Summary of QuickSort algorithm:
 * QSort(arr): Uses partition to sort by recursive calls. With 
 *       each recursive call, run partition on the 2 sections of
 *       the array to the left/right of the previous partition.
 *       Repeat this until the bounds converge, and the list is 
 *       sorted.
 *
 * 2a. Worst pivot choice / array state and associated runtime:
 *       The 0th val, then the 1st, then the 2nd, etc. O(n^2)
 *
 * 2b. Best pivot choice / array state and associated runtime:
 *       The middle (or middle-ish) point O(nlogn)
 *
 *
 * 3. Approach to handling duplicate values in array:
 *      I don't need one, the nature of the recursion does this
 *         automatically.# clozure