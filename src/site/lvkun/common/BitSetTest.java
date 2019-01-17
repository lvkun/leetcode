package site.lvkun.common;

import org.junit.Assert;
import org.junit.Test;

public class BitSetTest {
    @Test
    public void testBitSet() {
        BitSet bitSet = new BitSet();
        bitSet.set(0, true);
        bitSet.set(3, true);
        bitSet.set(8, true);

        Assert.assertTrue(bitSet.get(0));
        Assert.assertTrue(bitSet.get(3));
        Assert.assertTrue(bitSet.get(8));

        Assert.assertFalse(bitSet.get(1));
        Assert.assertFalse(bitSet.get(2));
        Assert.assertFalse(bitSet.get(4));
        Assert.assertFalse(bitSet.get(5));
        Assert.assertFalse(bitSet.get(6));
        Assert.assertFalse(bitSet.get(7));
        Assert.assertFalse(bitSet.get(9));
    }
}
