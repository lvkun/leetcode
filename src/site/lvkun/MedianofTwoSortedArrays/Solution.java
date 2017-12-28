package site.lvkun.MedianofTwoSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int iA = 0;
        int iB = 0;

        double last = 0;
        double secondLast = 0;

        while (iA + iB < (A.length + B.length) / 2 + 1) {

            if (iA >= A.length) {
                secondLast = last;
                last = B[iB++];
            } else if (iB >= B.length) {
                secondLast = last;
                last = A[iA++];
            } else if (A[iA] < B[iB]) {
                secondLast = last;
                last = A[iA++];
            } else {
                secondLast = last;
                last = B[iB++];
            }
        }

        if ((A.length + B.length) % 2 == 0) {
            return (last + secondLast) / 2;
        }

        return last;
    }
}
