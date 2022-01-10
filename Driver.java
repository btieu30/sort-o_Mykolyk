// Mykolyk -- Brianna Tieu and Fang Chen
// APCS pd06
// Lab04 -- Never Fear, Big O is Here!

import java.util.ArrayList;

public class Driver {

public static ArrayList populate( int size )
{
  ArrayList<Integer> bri = new ArrayList<Integer>();
  while( size > 0 ) {
    bri.add( 0 + (int)( (size+1) * Math.random() ) );
    size--;
  }
  return bri;
}

  public static ArrayList bestPopulate(int size) {
    ArrayList<Integer> Mykolyk = new ArrayList<Integer>();
    for (int start = 0; start < size; start++) {
      Mykolyk.add(start);
    }
    return Mykolyk;
  }

  public static ArrayList worstPopulate(int size) {
    ArrayList<Integer> fmc = new ArrayList<Integer>();
    while (size > 0) {
      fmc.add(size - 1);
      size--;
    }
    return fmc;
  }

  public static void main(String[] args) {
  ArrayList bread = populate(50);
  ArrayList cheese = bestPopulate(50);
  ArrayList spinach = worstPopulate(50);
//  System.out.println( "Randomly ordered list (0-49, inclusive) -- " + bread);
//  System.out.println( "Ordered ascending list (0-49, inclusive) -- " + cheese );
//  System.out.println( "Unordered descending list (49-0, inclusive) -- " + spinach );

// No elements
  System.out.println("===========================*0 integers*===========================");
  ArrayList noSet = populate(0);

  System.out.println("BubbleSort (empty dataset) -- " + Sorts.bubble(noSet));
  System.out.println("\nInsertionSort (empty dataset) -- " + Sorts.bubble(noSet));
  System.out.println("\nSelectionSort (empty dataset) -- " + Sorts.selection(noSet));

// 50 elements
  System.out.println("===========================*50 integers*===========================");
  System.out.println( "BubbleSort best case (sorted, 0-49 inclusive) -- \t" + Sorts.bubble( cheese ));
  System.out.println( "\nBubbleSort worst case (descending, 49-0 inclusive) -- \t" + Sorts.bubble( spinach ));
  System.out.println( "\nInsertionSort best case (sorted, 0-49 inclusive) -- \t" + Sorts.insertion( cheese ));
  System.out.println( "\nInsertionSort worst case (descending, 49-0 inclusive) -- " + Sorts.insertion( spinach ));

  System.out.println( "\nSelectionSort (sorted, 0-49 inclusive) -- \t" + Sorts.selection(cheese));
  System.out.println( "\nSelectionSort (descending, 49-0 inclusive) -- \t" + Sorts.selection(spinach));
  System.out.println( "\nSelectionSort (randomly generated ints, 0-49) -- \t" + Sorts.selection(bread));

// 100 elements
  System.out.println("==========================*100 integers*===========================");
  ArrayList chicken = populate(100);
  ArrayList steak = bestPopulate(100);
  ArrayList goat = worstPopulate(100);

  System.out.println( "BubbleSort best case (sorted, 0-99 inclusive) -- \t" + Sorts.bubble( steak ));
  System.out.println( "\nBubbleSort worst case (descending, 99-0 inclusive) -- \t" + Sorts.bubble( goat ));

  System.out.println( "\nInsertionSort best case (sorted, 0-99 inclusive) -- \t" + Sorts.insertion( steak ));
  System.out.println( "\nInsertionSort worst case (descending, 99-0 inclusive) -- " + Sorts.insertion( goat ));

  System.out.println( "\nSelectionSort (sorted, 0-99 inclusive) -- \t" + Sorts.selection( steak ));
  System.out.println( "\nSelectionSort (descending, 99-0 inclusive) -- \t" + Sorts.selection( goat ));
  System.out.println( "\nSelectionSort (randomly generated ints, 0-99) -- \t" + Sorts.selection( chicken ));

// 1000 elements
  System.out.println("===========================*1000 integers*===========================");
  ArrayList self = populate(1000);
  ArrayList love = bestPopulate(1000);
  ArrayList success = worstPopulate(1000);

  System.out.println( "BubbleSort best case (sorted, 0-999 inclusive) -- \t" + Sorts.bubble( love ));
  System.out.println( "\nBubbleSort worst case (descending, 999-0 inclusive) -- \t" + Sorts.bubble( success ));

  System.out.println( "\nInsertionSort best case (sorted, 0-999 inclusive) -- \t" + Sorts.insertion( love ));
  System.out.println( "\nInsertionSort worst case (descending, 999-0 inclusive) -- " + Sorts.insertion( success ));

  System.out.println( "\nSelectionSort (sorted, 0-999 inclusive) -- \t" + Sorts.selection( love ));
  System.out.println( "\nSelectionSort (descending, 999-0 inclusive) -- \t" + Sorts.selection( success ));
  System.out.println( "\nSelectionSort (randomly generated ints, 0-999) -- \t" + Sorts.selection( self ));


// 5000 elements
  System.out.println("===========================*5000 integers*===========================");

  ArrayList cell = populate(5000);
  ArrayList phone = bestPopulate(5000);
  ArrayList Motorola = worstPopulate(5000);

  System.out.println( "BubbleSort best case (sorted, 0-4999 inclusive) -- \t" + Sorts.bubble( phone ));
  System.out.println( "\nBubbleSort worst case (descending, 4999-0 inclusive) -- \t" + Sorts.bubble( Motorola ));
  System.out.println( "\nInsertionSort best case (sorted, 0-4999 inclusive) -- \t" + Sorts.insertion( phone ));
  System.out.println( "\nInsertionSort worst case (descending, 4999-0 inclusive) -- " + Sorts.insertion( Motorola ));

  System.out.println( "\nSelectionSort (sorted, 0-4999 inclusive) -- \t" + Sorts.selection( phone ));
  System.out.println( "\nSelectionSort (descending, 4999-0 inclusive) -- \t" + Sorts.selection( Motorola ));
  System.out.println( "\nSelectionSort (randomly generated ints, 0-4999) -- \t" + Sorts.selection( cell));
  }
}
