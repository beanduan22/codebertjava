# Prompt:

def solve(N):
    """Given a positive integer N, return the total sum of its digits in binary.
    
    Example
        For N = 1000, the sum of digits will be 1 the output should be "1".
        For N = 150, the sum of digits will be 6 the output should be "110".
        For N = 147, the sum of digits will be 12 the output should be "1100".
    
    Variables:
        @N integer
             Constraints: 0 ≤ N ≤ 10000.
    Output:
         a string of binary number
    """

# Solution:

def solve(N):
    """Given a positive integer N, return the total sum of its digits in binary.
    
    Example
        For N = 1000, the sum of digits will be 1 the output should be "1".
        For N = 150, the sum of digits will be 6 the output should be "110".
        For N = 147, the sum of digits will be 12 the output should be "1100".
    
    Variables:
        @N integer
             Constraints: 0 ≤ N ≤ 10000.
    Output:
         a string of binary number
    """

def main():
    N = int(input())
    print(solve(N))

if __name__ == '__main__':
    sys.exit(main()) 
def solve(A, B, C):
    """Given three strings, A, B, C, if they are equal return 0,
    if string A is lexicographically greater than string B return 1,
    if string C is lexicographically greater than string B return 2,
    otherwise return -1.

    Constraints
        - 1 ≤ length of A, B, C ≤ 100