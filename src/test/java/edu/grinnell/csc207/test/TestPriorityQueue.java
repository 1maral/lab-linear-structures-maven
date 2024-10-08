package edu.grinnell.csc207.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

import edu.grinnell.csc207.linear.BuiltinPriorityQueue;
import edu.grinnell.csc207.util.IntComparator;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Maral and Richard */
public class TestPriorityQueue {

  @Test
  public void testSet() throws Exception{
    BuiltinPriorityQueue<Integer> q = new BuiltinPriorityQueue(2, new IntComparator());

    q.put(8);
    q.put(1);
    assertEquals(1, q.peek(), "stupid test");
  } // testSet()

  @Test
  public void testGet() throws Exception {
    BuiltinPriorityQueue<Integer> q = new BuiltinPriorityQueue<>(4, null);

    q.put(2);
    q.put(3);
    q.put(4);
    q.put(5);
    assertEquals(2, q.get(), "Testing Getting for BuiltinPriorityQueue");
  }

} // class TestPriorityQueue