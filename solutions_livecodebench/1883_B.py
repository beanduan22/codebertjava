# Prompt:
You are given a string $s$ of length $n$, consisting of lowercase Latin letters, and an integer $k$.

You need to check if it is possible to remove exactly $k$ characters from the string $s$ in such a way that the remaining characters can be rearranged to form a palindrome. Note that you can reorder the remaining characters in any way.

A palindrome is a string that reads the same forwards and backwards. For example, the strings "z", "aaa", "aba", "abccba" are palindromes, while the strings "codeforces", "reality", "ab" are not.

Input

Each test consists of multiple test cases. The first line contains a single integer $t$ ($1 \leq t \leq 10^4$) — the number of the test cases. This is followed by their description.

The first line of each test case contains two integers $n$ and $k$ ($0 \leq k < n \leq 10^5$) — the length of the string $s$ and the number of characters to be deleted.

The second line of each test case contains a string $s$ of length $n$, consisting of lowercase Latin letters.

It is guaranteed that the sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.

Output

For each test case, output "YES" if it is possible to remove exactly $k$ characters from the string $s$ in such a way that the remaining characters can be rearranged to form a palindrome, and "NO" otherwise.

You can output the answer in any case (uppercase or lowercase). For example, the strings "yEs", "yes", "Yes", and "YES" will be recognized as positive answers.Sample Input 1:
14

1 0

a

2 0

ab

2 1

ba

3 1

abb

3 2

abc

6 2

bacacd

6 2

fagbza

6 2

zwaafa

7 2

taagaak

14 3

ttrraakkttoorr

5 3

debdb

5 4

ecadc

5 3

debca

5 3

abaac



Sample Output 1:

YES
NO
YES
YES
YES
YES
NO
NO
YES
YES
YES
YES
NO
YES


Note

In the first test case, nothing can be removed, and the string "a" is a palindrome.

In the second test case, nothing can be removed, but the strings "ab" and "ba" are not palindromes.

In the third test case, any character can be removed, and the resulting string will be a palindrome.

In the fourth test case, one occurrence of the character "a" can be removed, resulting in the string "bb", which is a palindrome.

In the sixth test case, one occurrence of the characters "b" and "d" can be removed, resulting in the string "acac", which can be rearranged to the string "acca".

In the ninth test case, one occurrence of the characters "t" and "k" can be removed, resulting in the string "aagaa", which is a palindrome.
# Solution:
You are given a string $s$ of length $n$, consisting of lowercase Latin letters, and an integer $k$.

You need to check if it is possible to remove exactly $k$ characters from the string $s$ in such a way that the remaining characters can be rearranged to form a palindrome. Note that you can reorder the remaining characters in any way.

A palindrome is a string that reads the same forwards and backwards. For example, the strings "z", "aaa", "aba", "abccba" are palindromes, while the strings "codeforces", "reality", "ab" are not.

Input

Each test consists of multiple test cases. The first line contains a single integer $t$ ($1 \leq t \leq 10^4$) — the number of the test cases. This is followed by their description.

The first line of each test case contains two integers $n$ and $k$ ($0 \leq k < n \leq 10^5$) — the length of the string $s$ and the number of characters to be deleted.

The second line of each test case contains a string $s$ of length $n$, consisting of lowercase Latin letters.

It is guaranteed that the sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.

Output

For each test case, output "YES" if it is possible to remove exactly $k$ characters from the string $s$ in such a way that the remaining characters can be rearranged to form a palindrome, and "NO" otherwise.

You can output the answer in any case (uppercase or lowercase). For example, the strings "yEs", "yes", "Yes", and "YES" will be recognized as positive answers.Sample Input 1:
14

1 0

a

2 0

ab

2 1

ba

3 1

abb

3 2

abc

6 2

bacacd

6 2

fagbza

6 2

zwaafa

7 2

taagaak

14 3

ttrraakkttoorr

5 3

debdb

5 4

ecadc

5 3

debca

5 3

abaac



Sample Output 1:

YES
NO
YES
YES
YES
YES
NO
NO
YES
YES
YES
YES
NO
YES


Note

In the first test case, nothing can be removed, and the string "a" is a palindrome.

In the second test case, nothing can be removed, but the strings "ab" and "ba" are not palindromes.

In the third test case, any character can be removed, and the resulting string will be a palindrome.

In the fourth test case, one occurrence of the character "a" can be removed, resulting in the string "bb", which is a palindrome.

In the sixth test case, one occurrence of the characters "b" and "d" can be removed, resulting in the string "acac", which can be rearranged to the string "acca".

In the ninth test case, one occurrence of the characters "t" and "k" can be removed, resulting in the string "aagaa", which is a palindrome.
Solution (Python 3):import sys, math
input = sys.stdin.readline

def solve():
    n, k = map(int, input().split())
    s = input().strip()
    left = 0
    right = n - 1
    while left < right:
        if s[left] == s[right]:
            left += 1
            right -= 1
        else:
            break
    left_ch = set(s[:left])
    right_ch = set(s[right+1:])
    if k >= (n - 2 * left):
        return 'YES