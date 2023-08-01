package junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.LinkedList;

public class LinkedListTest {


    LinkedList test;
    LinkedList test1;

    @Before
    public void setup(){
        test1 = new LinkedList();
        test1.add(25);
        test1.add(3);
    }

    @Test(expected = RuntimeException.class)
    public void testNullException(){
        test.add(2);
    }

    @Test
    public void testAddition() throws Exception {
        assertEquals(25,test1.topFront());
        assertEquals(3,test1.topBack());

    }

    @Test
    public void pushFrontTest() throws Exception {
        ((Object) test1).pushFront(69);
        assertEquals(69,((Object) test1).topFront());
    }

    @Test
    public void pushBackTest() throws Exception {
        test1.push(25);
        assertEquals(25,((Object) test1).topBack());
        ((Object) test1).popFront();
        assertEquals(3,((Object) test1).topFront());


    }

    @Test
    public void sizeTest(){
        test = new LinkedList();
        assertEquals(2,test1.size());
        assertEquals(0,test.size());
    }


}