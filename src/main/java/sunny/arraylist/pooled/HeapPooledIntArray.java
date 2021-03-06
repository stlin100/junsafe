package sunny.arraylist.pooled;

import sunny.array.pool.ArrayPool;
import sunny.arraylist.IntArray;

/**
 * Created by lzx on 17/9/8.
 */
public class HeapPooledIntArray extends PooledArray<int[]> implements IntArray{

    private int size;

    public HeapPooledIntArray(ArrayPool<int[]> pool, int capacity) {
        super(pool, capacity);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void set(int index, int value) {
        if(size<index+1)
        {
            size = index + 1;
        }
        array[index] = value;
    }

    @Override
    public int get(int index) {
        return array[index];
    }
}
