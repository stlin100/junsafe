package sunny.arraylist.pooled;

import sunny.array.pool.ArrayPool;
import sunny.arraylist.ArrayList;
import sunny.arraylist.ShortArrayList;

/**
 * Created by lzx on 17/9/8.
 */
public class HeapPooledShortArrayList extends HeapPooledShortArray implements ArrayList, ShortArrayList {
    public HeapPooledShortArrayList(ArrayPool<short[]> pool, int capacity) {
        super(pool, capacity);
    }

    @Override
    public void ensureCapacity(int index) {
        if(index>capacity - 1)
        {
            capacity = capacity << 1;
            array = pool.extend(array, capacity);
        }
    }
}
