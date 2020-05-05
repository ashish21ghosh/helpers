# Basic Input
# Input: a line of input from STDIN 
# Output: string
input_str = input()

# Input: space seperated list of numbers
# Output: an iterable map object of integers
input_list = map(int, input().split())

# Basic Output
# print function outputs data to STDOUT
print(output_data)


# Input/Output using sys
from sys import stdin, stdout

# Input: a line of input from STDIN 
# Output: string
input_str = stdin.readlines()

# Output to STDOUT
stdout.write(output_data)