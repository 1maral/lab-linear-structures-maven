package edu.grinnell.csc207.util;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer> {
  public int compare(Integer i, Integer j) {
    // While this method sometimes gets implemented as i-j, that
    // implementation presents overflow risks, so we choose a
    // somewhat more verbose approach.
    if (i < j) { return -1; }
    else if (j < i) { return 1; }
    else return 0;
  } // compare(Integer, Integer)
} // IntegerComparator
