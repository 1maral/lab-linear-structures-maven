package edu.grinnell.csc207.util;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
  public int compare(String str1, String str2) {
    // Efficiency hack: If two strings occupy the same memory
    // they are equal.
    if (str1 == str2) { return 0; }
    // Safety check: If either string is null, compareTo may fail,
    // so we make sure neither is null.  We treat null as "smaller"
    // than any other string.
    if (str1 == null) { return -1; }
    if (str2 == null) { return 1; }
    // Finally, we can use the built-in `compareTo` method.
    return str1.compareTo(str2);
  } // compare(String, STring)
} // StringComparator
