package sunny.arraylist.pooled;

import sunny.arraylist.ArrayFactory;
import sunny.arraylist.CharArray;
import sunny.arraylist.StrArrayList;

/**
 * Created by lzx on 17/9/8.
 */
public class PooledStrArrayList extends PooledStrArray implements StrArrayList{

    public PooledStrArrayList(ArrayFactory arrayFactory, int capacity) {
        super(arrayFactory, capacity, arrayFactory.createIntArrayList(capacity));
    }

    /**
        lengthArrayList will auto extend
     */
    @Override
    public void ensureCapacity(int index) {
        if(index>capacity - 1)
        {
            capacity = capacity << 1;

            CharArray[] newCharArrays = new CharArray[capacity];
            System.arraycopy(charArrays, 0, newCharArrays, 0, charArrays.length);
            charArrays = newCharArrays;
        }
    }
}
