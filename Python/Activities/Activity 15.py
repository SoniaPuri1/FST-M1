"""Handling Errors
Write a Python program that throws a NameError.
Handle the error so it doesn't halt execution."""

try:
    print (x)
except NameError:
    print("x has not been defined yet")


