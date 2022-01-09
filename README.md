# Mykolyk -- Fang Chen and Brianna Tieu
## Bubble Sort
* Best Case:
  * Arrangement of Data: The best case arrangement would be if the array is already sorted. If the array were to already be sorted, we would only need to traverse through the array once without performing any swaps because no element would be greater than the one to its right.
  * Time-Complexity: For BubbleSort's best case, the runtime would be O(n) or linear. This is because as we traverse through an array utilizing BubbleSort, we compare elements at two consecutive indices until we reach the last element at an index of a.size() - 1. Therefore if the array size increases by 1, the amount of passes or comparisons increases by 1, forming a linear relationship.
* Worst Case: 
  * Arrangement of Data: The worst case arrangement would be if the array is in descending order. If the array were to be in descending order, we would have to conduct a.size() - 1 swaps for the first pass, because each element is in the incorrect position. However as numbers begin to be sorted, the swaps decrease by 1 for each pass and there are a total of a.size() - 1 passes. This is the worst case because the amount of swaps conducted for each pass is equal to the amount of unsorted numbers. 
  * Time-Complexity: For BubbleSort's worst case, the runtime would be O(n^2) or quadratic, because we have a.size() - 1 passes and for each pass, we have n swaps, with n being the number of elements that have yet to be sorted. Therefore, this yields a quadratic growth pattern for the runtime as the array grows.
## Selection Sort
* Best Case: 
  * Arrangement of Data: 
  * Time-Complexity: 
* Worst Case:
  * Arrangement of Data:  
  * Time-Complexity:
## Insertion Sort
* Best Case:
  * Arrangement of Data: The best case arrangement would be if the array is already sorted. For InsertionSort, the partition slowly enlarges and sorts the numbers within it, making it so that every array requires a.size() - 1 passes. But if the array is already sorted, we wouldn't conduct any swaps, making this the best case scenario.
  * Time-Complexity: The best case's time-complexity is O(n) or linear. This is because as the array size increases by 1, the number of passes also increases by 1 due to the partition having to traverse over 1 more element, creating a linear relationship. 
* Worst Case:
  * Arrangement of Data: The worst case arrangement would be if the array is in descending order. This is because
  * Time-Complexity:
