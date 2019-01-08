package site.lvkun.longest_palindromic_substring

data class PalindromeRange(val data: String, var start: Int, var end: Int) {
    init {
        extend()
    }

    // extend to find largest palindrome
    private fun extend() {
        while (start > 0 && end < data.length - 1 &&
                data[start - 1] == data[end + 1]) {
            start--
            end++
        }
    }

    override fun toString(): String {
        return data.substring(start, end + 1)
    }

    fun length(): Int = end - start + 1
}

class Solution {
    private fun max(r1: PalindromeRange, r2: PalindromeRange): PalindromeRange {
        if (r1.length() < r2.length()) {
            return r2
        }
        return r1
    }

    fun longestPalindrome(s: String): String {
        var maxRange = PalindromeRange(s, 0, 0)

        for (i in 0 until s.length - 1) {
            val r1 = PalindromeRange(s, i, i)
            maxRange = max(maxRange, r1)

            if (s[i] == s[i + 1]) {
                val r2 = PalindromeRange(s, i, i + 1)

                if (maxRange.length() < r2.length()) {
                    maxRange = r2
                }
            }
        }

        return maxRange.toString()
    }
}