package com.datastructures;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHashSet {

    @Test
    public void addValue() {
        HashSet<String> set = new HashSet();

        String value ="ali";
        assertEquals(true, set.add(value));
    }

    @Test
    public void addSameValueAgain2() {
        HashSet<String> set = new HashSet();
        String value ="ali";
        set.add(value);
        assertEquals(false, set.add(value));
    }


    @Test
    public void setSize1(){
        HashSet<String> set = new HashSet();
        set.add("ali");
        assertEquals(1, set.size());
    }

    @Test
    public void setSize2(){
        HashSet<String> set = new HashSet();
        set.add("ali");
        set.add("ahmed");
        assertEquals(2, set.size());
    }

    @Test
    public void setClone1() {
        HashSet original = new HashSet();
        original.add(1);
        original.add(2);
        original.add(4);

        HashSet copy = original.clone();
        copy.add(20);

        assertEquals(3, original.size());
    }

    @Test
    public void setClone2() {
        HashSet original = new HashSet();
        original.add(1);
        original.add(2);
        original.add(4);

        HashSet copy = original.clone();
        copy.add(20);

        assertEquals(4, copy.size());
    }

    @Test
    public void setContains1(){
        HashSet set = new HashSet();
        assertEquals(false, set.contains(13));
    }

    @Test
    public void setContains2(){
        HashSet set = new HashSet();
        int num = 13;
        set.add(num);
        assertEquals(true, set.contains(num));
    }

    @Test
    public void setIsEmpty1(){
        HashSet set = new HashSet();
        assertEquals(true, set.isEmpty());
    }

    @Test
    public void setIsEmpty2(){
        HashSet set = new HashSet();
        set.add("u");
        assertEquals(false, set.isEmpty());
    }

    @Test
    public void setRemoveExistsValue(){
        HashSet set = new HashSet();
        int num = 1;
        set.add(num);
        assertEquals(true, set.remove(num));
    }

    @Test
    public void setRemoveNonExistsValue(){
        HashSet set = new HashSet();
        set.add(1);
        assertEquals(false, set.remove(2));
    }

    @Test
    public void setClear(){
        HashSet set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(11);
        set.clear();
        assertEquals(0, set.size());
    }
}
