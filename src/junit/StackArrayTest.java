package junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Stack;

public class StackArrayTest {

    Stack test;

    @Before
    public void setup(){
        test = new Stack();
    }

    @Test
    public void emptyPop(){
        assertEquals(-1, test.pop());
    }

    @Test
    public void insertionTest(){
        test.push(25);
        test.push(5);
        test.push(2);

        assertEquals(2,test.pop());
        assertEquals(5,test.pop());
        assertEquals(25,test.pop());
    }

}