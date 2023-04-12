# MagicNumbers
Program to find numbers with a certain property.

# What is a magic number?
A magic number is a number k such that for any number n such that 0 < n < k, ALL k/n have the same period (repeating part of the decimal) in the same order, starting with a different number.

An example of this is the number 7 in base-10.<br>
1/7 = 0.(142857)<br>
2/7 = 0.(285714)<br>
3/7 = 0.(428571)<br>
4/7 = 0.(571428)<br>
5/7 = 0.(714285)<br>
6/7 = 0.(857142)<br><br>

Notice that for all these fractions, they have:<br>
1. No leading numbers before the period
2. Similar period with a similar order, but a different starting point

However, it is also important to note that 7 might not be a magic number in different bases. For example, in hexadecimal,
1/7 = 0.(249)
2/7 = 0.(492)
3/7 = 0.(6DB)
4/7 = 0.(924)
5/7 = 0.(B6D)
6/7 = 0.(DB6)

# How to use the program
It is relatively basic. The MagicNumbers class has a number of useful functions. It must first be initialized using a base (which must be larger than 1).
To find magic numbers with that base, the most simple methods to use are findMagicNumbersBetween(long x, long y) or to findSmallestMagicNumber() (not static since it depends on the base).
In its current iteration, the program will output each time it tests a number and it will say if it is a magic number or not as it iterates up.
