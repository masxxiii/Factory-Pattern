# Factory-Pattern
Factory design pattern in Java.

The Factory design pattern is one of the most commonly used design patterns in Java. It provides one of the best ways to create an object. In Factory design pattern, we create an object required without exposing the creation logic.

The program demonstrates how to work with objects of two types: character string and binary string. I have created corresponding classes 'SymbString' and 'BinString'. Each object has an identifier 'data'. The class BinString extends SymbString. The operations for creating and deleting objects are encapsulated in the Factory class. The main class provides the implementation along with a menu that provides operations for creation, deletion, checking the data, and the operation of reduction.
For SymString the method 'operator' checks for occurence of substring t2 in t1. If the substring is present the method reduces it and the the identifier 'data' is updated. For BinString the method 'operator' subtracts binary string t2 from t1.
