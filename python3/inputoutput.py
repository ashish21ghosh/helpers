# Basic Input
# Input: Read a line of input input from STDIN
# Output: string
input_str = input()

# Input: space seperated list of numbers
# Output: an iterable map object of integers
input_list = map(int, input().split())

# Basic Output
# outputs data to STDOUT
# this adds a newline character at the end
print(output_data)


# Input/Output using sys
from sys import stdin, stdout

# Input: a line of input from STDIN 
# Output: string
input_str = stdin.readlines()

# Output to STDOUT
# no newline character is added
stdout.write(output_data)