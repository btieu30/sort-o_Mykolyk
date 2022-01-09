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

  System.out.println( "BubbleSort best case (sorted, 0-49 inclusive) -- \t" + Sorts.bubble( cheese ));
  System.out.println( "BubbleSort worst case (descending, 49-0 inclusive) -- \t" + Sorts.bubble( spinach ));

  System.out.println( "InsertionSort best case (sorted, 0-49 inclusive) -- \t" + Sorts.insertion( cheese ));
  System.out.println( "InsertionSort worst case (descending, 49-0 inclusive) -- " + Sorts.insertion( spinach ));

  System.out.println( "SelectionSort (sorted, 0-49 inclusive) -- \t" + Sorts.selection(cheese));
  System.out.println( "SelectionSort (descending, 49-0 inclusive) -- \t" + Sorts.selection(spinach));
  System.out.println( "SelectionSort (randomly sorted, 0-49) -- \t" + Sorts.selection(bread));
  }
}
