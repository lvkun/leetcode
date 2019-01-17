package site.lvkun.common;

public class BitSet {
    private int bit;

    public void set(int i, boolean value) {
        if (value) {
            bit |= 1 << i;
        } else {
            bit &= ~(1 << i);
        }
    }

    public boolean get(int i) {
        return (bit & 1 << i) != 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if (get(i)) {
                builder.append(i);
            } else {
                builder.append('.');
            }
            builder.append(" ");
        }
        return builder.toString();
    }
}
