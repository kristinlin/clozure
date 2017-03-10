# clozure
1. Summary of QuickSort algorithm:
QSort(arr):  
Uses partition to sort by recursive calls.  
With each recursive call, run partition on the 2 sections of the array to the left/right of the previous partition.  
Repeat this until the bounds converge, and the list is sorted.

2. Best case:
The median point is continuously chosen as pivot each time partition is called. This will divide the array in half, logn times, and partition, O(n), would be called for each halved array. Runtime would be O(nlogn).
 
3. Worst case:
The greatest or the least number in the section is continuously chosen as pivot each time partition is called. Partition, O(n), would be called for all n elements of the array. Runtime would be O(n^2).

4. Average or most likely case:
It is unlikely that partition will be continuously called on the extreme values of the array, or the section of the array examined. This grows increasingly true as the array sizes increase, for there are more values to choose from for pivot. Thus, runtime is an amortized O(nlogn).

###How Pivot Selection and Data Arrangement Affect Execution Time: 
QuickSort takes the middle value of the unsorted array as pivot. If the data is arranged with the least value in the middle slot and every increasing value building on at sides (or the alternative: the greatest value in middle slot and decreasing values building on at both sides), the least or greatest value will continuously be chosen. This will force QuickSort to traverse the array of n elements. 
ex) {6, 4, 2, 1, 3, 5, 7} or {2, 4, 6, 7, 5, 3, 1}
However, if QuickSort keeps choosing the median value of the sorted array as pivot, in which case the given array will be already sorted, it will run partition only logn times.
ex) {1, 2, 3, 4, 5, 6, 7, 8}

###Methodology
Three methods were created to ease Quicksort testing:  
1. generate a random array of a given size,  
2. time the time taken to run QuickSort,  
3. take the average of running QuickSort a given number of times.

###Times:  
Average of size 1, with 2 000 times: 18  
Average of size 10, with 2 000 times: 211  
Average of size 100, with 2 000 times: 3483  
Average of size 1 000, with 2 000 times: 38607  
Average of size 5 000, with 2 000 times: 224488  
Average of size 10 000, with 2 000 times: 561229  
Average of size 50 000, with 2 000 times: 6112306  
Average of size 100 000, with 2 000 times: 20202676  
Average of size 500 000, with 2 000 times: 419995091  

###Analysis: 
https://docs.google.com/a/stuy.edu/document/d/1XnWP2ppTH6qnMkC-CA7Zv1eBx0UVC-gFu1npCO8w-JQ/edit?usp=sharing
