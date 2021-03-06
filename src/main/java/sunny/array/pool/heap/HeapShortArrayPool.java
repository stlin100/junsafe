package sunny.array.pool.heap;

import sunny.array.pool.a.AbstractArrayLevelPool;
import sunny.array.pool.a.WeakDeamonRunner;

/**
 * Created by lzx on 17/9/7.
 */
public class HeapShortArrayPool extends HeapArrayPool<short[]> {

    public HeapShortArrayPool(int minLevelSize, int maxLevelSize, WeakDeamonRunner deamonRunner)
    {
        super(minLevelSize, maxLevelSize, deamonRunner);
    }

    @Override
    public AbstractArrayLevelPool<short[]> createLevelPool(int levelSize) {
        return new HeapShortArrayLevelPool(levelSize);
    }

    @Override
    public int arrayLength(short[] array) {
        return array.length;
    }


}
