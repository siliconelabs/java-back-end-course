package com.collection.MyarrayList;

import java.io.IOException;

public class ArrayListSilicon {
    private static final int DEFAULT_CAPACITY = 10;
    private Object [] m_elems;
    private int m_index;



    private static void checkForIllegalArgumentException(int capacity)
    {
        try {
            if (capacity < 0)
                throw new IOException("capacity error");
        }
        catch (Exception ex)
        {ex.getMessage();
        }
    }

    private static void checkForIndexOutOfBounds(int index, int end)
    {
        try
        {
        if (index < 0 || index >= end)
            throw new IOException("index out of bound exception error");
    }
        catch (Exception ex)
          { ex.getMessage();
    }
    }

    private void allocateCapacity(int capacity)
    {
        Object [] temp = new Object[capacity];

        for (int i = 0; i < m_index; ++i)
            temp[i] = m_elems[i];

        m_elems = temp;
    }

    private void checkAndAllocCapacity(int capacity)
    {
        if (m_index < m_elems.length)
            return;

        allocateCapacity(capacity);
    }

    public ArrayListSilicon()
    {
        this(DEFAULT_CAPACITY);
    }

    public ArrayListSilicon(int initialCapacity)
    {
        checkForIllegalArgumentException(initialCapacity);
        m_elems = new Object[initialCapacity];
    }

    public boolean add(Object elem)
    {
        checkAndAllocCapacity(m_elems.length * 2);
        m_elems[m_index++] = elem;
        return true;
    }

    public void add(int index, Object elem)
    {
        checkForIndexOutOfBounds(index, m_index + 1); // add size verildiğinde sona ekler
        checkAndAllocCapacity(m_elems.length * 2);
        //TODO:
    }

    public int capacity() {return m_elems.length;}

    public void clear()
    {
        for (int i = 0; i < m_index; ++i)
            m_elems[i] = null;

        m_index = 0;
    }

    public Object get(int index)
    {
        checkForIndexOutOfBounds(index, m_index);

        return m_elems[index];
    }

    public Object set(int index, Object elem)
    {
        checkForIndexOutOfBounds(index, m_index);
        Object old = m_elems[index];

        m_elems[index] = elem;

        return old;
    }

    public Object remove(int index)
    {
        checkForIndexOutOfBounds(index, m_index);
        Object old = m_elems[index];

        //TODO:
        return old;
    }
    public int size() {return m_index;}

    public void trimToSize()
    {
        if (m_index == m_elems.length)
            return;

        allocateCapacity(m_index == 0 ? DEFAULT_CAPACITY : m_index);
    }
}