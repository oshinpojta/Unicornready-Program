# Unicornready-Program
Problem Statement - 
Consider a fruit store where an apple is RS 35.00 each or 4 for RS 100.00

Write a program to scan and get results as the correct total price for an entire shopping cart based on the per-unit prices or the volume prices as applicable.

Here are the products listed by code and the prices to use (there is no sales tax):

Product Code | Price
A | RS 35.00 each or 4 for RS 100.00
B | RS 65.00
C | RS 50.00 or RS 250 for a six-pack
D | RS 85.00

You can implement any method by using any programming language, but your code will be evaluated for aspects like - simplicity, efficiency, memory usage, coding standards.

terminal.setPricing(...)
terminal.scan("A")
terminal.scan("C") 
... etc. 
result = terminal.total

Here are the minimal product inputs you should use for your test cases. 

These test cases must be shown to work in your program:

Scan these products in this order: ABCADABAA;
Verify the total price is RS 400.00. 

Scan these products in this order: CCCACCCC; 
Verify the total price is RS 335.00. 

Scan these products in this order: ABCD;
Verify the total price is RS 235.00.
