// Mykolyk -- Brianna Tieu and Fang Chen
// APCS pd06
// Lab04 -- Never Fear, Big O is Here!

import java.util.ArrayList;

public class Sorts
{

    public static String bubble( ArrayList<Comparable> data )
    {
      int swapCtrB = 0;
      int passCtrB = 0;
      ArrayList<Comparable> input = new ArrayList<Comparable>(data);

      for( int pass = 1; pass < input.size(); pass++ ) {

        //iterate thru first to next-to-last element, comparing to next
        for( int i = 0; i < input.size()-1; i++ ) {

          //if element at i > element at i+1, swap
          if ( input.get(i).compareTo(input.get(i+1) ) > 0 ) {
            input.set( i, input.set(i+1,input.get(i)) );
            swapCtrB++;
          }
      }
      passCtrB = pass;
    }
    return ("Swaps: " + swapCtrB + "\tPasses: " + passCtrB);
  }

  public static String insertion( ArrayList<Comparable> data )
  {
    int swapCtrI = 0;
    int passCtrI = 0;
    ArrayList<Comparable> input = new ArrayList<Comparable>(data);
    for( int partition = 1; partition < input.size(); partition++ ) {
      //partition marks first item in unsorted region

      //traverse sorted region from right to left
      for( int i = partition; i > 0; i-- ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( input.get(i).compareTo( input.get(i-1) ) < 0 ) {
          input.set( i, input.set( i-1, input.get(i) ) );
          swapCtrI++;
        }
        else
          break;
    }
      passCtrI = partition;
    }
    return ("Swaps: " + swapCtrI + "\tPasses: " + passCtrI);
  }//end insertionSortV


  public static String selection( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at rightmost end,

    //maxPos will point to position of SELECTION (greatest value)
    ArrayList<Comparable> input = new ArrayList<Comparable>(data);
    int maxPos;
    int swapCtrS = 0;
    int passCtrS = 0;
    for( int pass = input.size()-1; pass > 0; pass-- ) {
      maxPos = 0;
      passCtrS++;
      for( int i = 1; i <= pass; i++ ) {
        if ( input.get(i).compareTo( input.get(maxPos) ) > 0 ) {
          maxPos = i;
        }
      }
      input.set( maxPos, ( input.set( pass, input.get(maxPos) ) ) );
      swapCtrS++;
    }
    return ("Swaps: " + swapCtrS + "\tPasses: " + passCtrS);
  }//end selectionSort
}
