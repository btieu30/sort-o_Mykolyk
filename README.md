# Mykolyk -- Fang Chen and Brianna Tieu
* SotW: [Willy Wonka & the Chocolate Factory - Pure Imagination](https://www.youtube.com/watch?v=myqzUur4K98)

## Bubble Sort
* Best Case: Already Sorted / Ascending Order
  * Arrangement of Data: If the array were to already be sorted, we would only need to traverse through the array once without performing any swaps because no element would be greater than the one to its right.
  * Time-Complexity: For BubbleSort's best case, the runtime would be O(n) or linear. This is because as we traverse through an array utilizing BubbleSort, the number of passes is always a.size() - 1. Therefore if the array size increases by 1, the amount of passes or comparisons increases by 1, forming a linear relationship.
* Worst Case: Descending Order
  * Arrangement of Data: If the array were to be in descending order, we would have to conduct a.size() - 1 swaps for the first pass, because each element is in the incorrect position. However as numbers begin to be sorted, the swaps decrease by 1 for each pass and there are a total of a.size() - 1 passes. This is the worst case because the amount of swaps conducted for each pass is equal to the amount of unsorted numbers. 
  * Time-Complexity: For BubbleSort's worst case, the runtime would be O(n^2) or quadratic, because we have a.size() - 1 passes and for each pass, we have n swaps, with n being the number of elements that have yet to be sorted. Therefore, this yields a quadratic growth pattern for the runtime as the array grows.
## Selection Sort
  * Best / Worst Case: There is no worst or best case arrangement of data for SelectionSort. This is because the method works by searching for the largest number in the array and placing it in the correct position. Therefore, ascending and descending arrays would have no impact on the end total number of passes or swaps as elements swap with themselves and you are guaranteed that a element is placed in the correct position after each pass.
  * Time-Complexity: The runtime for SelectionSort is always O(n^2) because in SelectionSort we perform a.size() - 1 passes. Then, for each pass, we must find the largest unsorted number and perform a swap. As a result, we get a quadratic relationship as the array size increases.
## Insertion Sort
* Best Case: Already Sorted / Ascending Order
  * Arrangement of Data: For InsertionSort, the partition slowly enlarges and sorts the numbers within it, making it so that every array requires a.size() - 1 passes. But if the array is already sorted, we wouldn't conduct any swaps, making this the best case scenario.
  * Time-Complexity: The best case's time-complexity is O(n) or linear. This is because as the array size increases by 1, the number of passes also increases by 1 due to the partition having to traverse over 1 more element, creating a linear relationship. 
* Worst Case: Descending Order
  * Arrangement of Data: This is because the element at the index of the partition will always be less than the elements before it in the partition. In order to get it to the front of the array, the amount of swaps required is always equal to the index of the partition, which is the maximum amount of swaps possible per pass. 
  * Time-Complexity: The worst case runtime can be expressed through O(n^2) because we perform a.size() - 1 passes in order to gradually expand the partition by 1 each time. Then, for each pass, we have to traverse through the sorted region to correctly place all the elements, which then creates a quadratic relationship as the array gets larger. 
