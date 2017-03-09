# clozure
1. Summary of QuickSort algorithm:
QSort(arr):  
Uses partition to sort by recursive calls.  
With each recursive call, run partition on the 2 sections of the array to the left/right of the previous partition.  
Repeat this until the bounds converge, and the list is sorted.

2. Worst pivot choice / array state and associated runtime:  
The 0th val, then the 1st, then the 2nd, etc. O(n^2)
 
3. Best pivot choice / array state and associated runtime:  
The median point O(nlogn)

4. Approach to handling duplicate values in array:  
No difference.

Mechanism for Testing:  
Three methods were created to ease the readability of the Quicksort testing:  
1. generate a random array of a given size,  
2. time the time taken to run QuickSort,  
3. take the average of running QuickSort a given number of times.

Times:  
Average of size 1, with 2 000 times: 18  
Average of size 10, with 2 000 times: 211  
Average of size 100, with 2 000 times: 3483  
Average of size 1 000, with 2 000 times: 38607  
Average of size 5 000, with 2 000 times: 224488  
Average of size 10 000, with 2 000 times: 561229  
Average of size 50 000, with 2 000 times: 6112306  
Average of size 100 000, with 2 000 times: 20202676  
Average of size 500 000, with 2 000 times: 419995091  
