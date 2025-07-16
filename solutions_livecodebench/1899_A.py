# Prompt:
Vanya and Vova are playing a game. Players are given an integer $n$. On their turn, the player can add $1$ to the current integer or subtract $1$. The players take turns; Vanya starts. If after Vanya's move the integer is divisible by $3$, then he wins. If $10$ moves have passed and Vanya has not won, then Vova wins.

Write a program that, based on the integer $n$, determines who will win if both players play optimally.

Input

The first line contains the integer $t$ ($1 \leq t \leq 100$) — the number of test cases.

The single line of each test case contains the integer $n$ ($1 \leq n \leq 1000$).

Output

For each test case, print "First" without quotes if Vanya wins, and "Second" without quotes if Vova wins.Sample Input 1:
6

1

3

5

100

999

1000



Sample Output 1:

First
Second
First
First
Second
First

# Solution:
Vanya and Vova are playing a game. Players are given an integer $n$. On their turn, the player can add $1$ to the current integer or subtract $1$. The players take turns; Vanya starts. If after Vanya's move the integer is divisible by $3$, then he wins. If $10$ moves have passed and Vanya has not won, then Vova wins.

Write a program that, based on the integer $n$, determines who will win if both players play optimally.

Input

The first line contains the integer $t$ ($1 \leq t \leq 100$) — the number of test cases.

The single line of each test case contains the integer $n$ ($1 \leq n \leq 1000$).

Output

For each test case, print "First" without quotes if Vanya wins, and "Second" without quotes if Vova wins.Sample Input 1:
6

1

3

5

100

999

1000



Sample Output 1:

First
Second
First
First
Second
First

Sample Input 2:
6

1

2

3

4

5

6



Sample Output 2:

First
First
Second
First
First
Second



If Vova takes the first turn, then he will win in the first $5$ test cases.

• Vova wins since $1$ is not divisible by $3$.
• Vova wins since $2$ is not divisible by $3$.
• Vanya wins since $3$ is divisible by $3$.
• Vova wins since $4$ is not divisible by