package site.lvkun.leetcode.lru_cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private int capacity;

    private static final Entry DUMMY_HEAD_ENTRY = new Entry(-1, -1);
    private static final Entry DUMMY_TAIL_ENTRY = new Entry(-1, -1);
    private Entry mHead = DUMMY_HEAD_ENTRY;
    private Entry mTail = DUMMY_TAIL_ENTRY;

    private Map<Integer, Entry> entryMap = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        mHead.next = mTail;
        mTail.prev = mHead;
    }

    public int get(int key) {
        if (!entryMap.containsKey(key)) {
            return -1;
        }

        Entry entry = entryMap.get(key);

        entry.prev.next = entry.next;
        entry.next.prev = entry.prev;

        mHead.next.prev = entry;
        entry.next = mHead.next;
        entry.prev = mHead;
        mHead.next = entry;

        return entry.val;
    }

    public void put(int key, int value) {
        if (entryMap.containsKey(key)) {
            Entry entry = entryMap.get(key);
            entry.val = value;
            return;
        }

        Entry newEntry = new Entry(key, value);
        entryMap.put(key, newEntry);
        newEntry.next = mHead.next;
        newEntry.next.prev = newEntry;
        newEntry.prev = mHead;
        mHead.next = newEntry;

        if (entryMap.size() > capacity) {
            Entry removeEntry = mTail.prev;
            removeEntry.prev.next = mTail;
            mTail.prev = removeEntry.prev;

            removeEntry.next = null;
            removeEntry.prev = null;

            entryMap.remove(removeEntry.key);
        }
    }

    private static class Entry {
        Entry prev;
        Entry next;

        private int key;
        private int val;

        public Entry(int k, int v) {
            key = k;
            val = v;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            Entry n = this;
            while (n != null) {
                sb.append(n.val).append(" ");
                n = n.next;
            }

            return sb.toString();
        }
    }
}
