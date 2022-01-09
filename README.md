# Mykolyk -- Fang Chen and Brianna Tieu
## Bubble Sort
* Best Case:
  * Arrangement of Data: The best case arrangement would be if the array is already sorted. If the array were to already be sorted, we would only need to traverse through the array once without performing any swaps because no element would be greater than the one to its right.
  * Time-Complexity: For BubbleSort's best case, the runtime would be O(n) or linear. This is because as we traverse through an array utilizing BubbleSort, we compare elements at two consecutive indices until we reach the last element at an index of a.size() - 1. For the best case, we would only need to traverse the array once, so we have a total of a.size() - 1 comparisons, which would experience a linear growth pattern as we expand the size of our array.
* Worst Case: 
  * Arrangement of Data: The worst case arrangement would be if the array is in descending order. As stated above, with the BubbleSort algorithm, we are making a.size() - 1 comparisons for each pass. If the array were to be in descending order, we would have to conduct a.size() - 1 swaps for each pass as well, because each element is in the incorrect position. We would have to repeat this a.size() - 1 times, considering that the greatest element in the array begins at index 0 and is constantly compared to its neighbor to the right, making each pass place the GREATEST unsorted element in the correct position until we swap the least and second least elements in the array.
  * Time-Complexity: For BubbleSort's worst case, the runtime would be O(n^2) or quadratic, because we have a.size() - 1 passes and for each pass, we must conduct a.size() - 1 swaps.
## Selection Sort
* Best Case: 
  * Arrangement of Data:
  * Time-Complexity:
* Worst Case:
  * Arrangement of Data:
  * Time-Complexity:
## Insertion Sort
* Best Case:
  * Arrangement of Data:
  * Time-Complexity:
* Worst Case:
  * Arrangement of Data:
  * Time-Complexity:
