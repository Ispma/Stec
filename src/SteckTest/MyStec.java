package SteckTest;

import java.util.NoSuchElementException;

public class MyStec<Item>
{

    private Object[] stack= new Object[1];
    private int size= 0;

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    private void resize( int capacity )
    {
        Object[] temp= new Object[capacity];
        for ( int i= 0; i < size; i++ )
        {
            temp[i]= stack[i];
        }
        stack= temp;
    }

    public void push(String item)
    {
        if (size == stack.length)
        {
            resize( 2 * stack.length );
        }
        stack[size]= item;
        size++;
    }

    public Item peek ()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        return (Item) stack[size-1];
    }

    public Item pop ()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        Item item= (Item) stack[size-1];
        size--;
        if ( size == stack.length / 4 && size > 0 )
        {
            resize( stack.length / 2 );
        }
        return item;
    }

    public String toString()
    {
        String s= "";
        for (int i= 0; i < size; i++ )
        {
            s= s + stack[i] + ", ";
        }
        return s;
    }
}
