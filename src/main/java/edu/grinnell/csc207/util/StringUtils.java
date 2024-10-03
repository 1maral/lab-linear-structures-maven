package edu.grinnell.csc207.util;

import edu.grinnell.csc207.linear.Stack;
import edu.grinnell.csc207.linear.LinkedStack;

import java.io.PrintWriter;

/**
 * Assorted utilities for working with strings.
 * 
 * @author Samuel A. Rebelsky
 * @author Bonsen and Maral
 */ 
public class StringUtils {
  // +------------------+--------------------------------------------
  // | Provided methods |
  // +------------------+
    
  /**
   * Determine whether the parens match in string.
   */
  public static boolean checkMatching(String str) throws Exception {
    boolean bool = false;
    Stack<Character> parens = new LinkedStack<Character>();
    
    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == '(' || str.charAt(i) == '[') {
        parens.push(str.charAt(i));
      }
      if (str.charAt(i)== ')') {
        if (parens.peek() == '(') {
          parens.pop();
          bool = true;
        } else {
          throw new Exception("Not matching (");
        }
      }
      if (str.charAt(i) == ']') {
        if (parens.peek() == '[') {
          parens.pop();
          bool = true;
        } else {
          throw new Exception("Not matching [");
        }
      }
    } //for

    if (!parens.isEmpty()) {
      throw new Exception("Mismatched");
    }
    else {
      return bool;
    }
  } // checkMatching
} // class StringUtils    

