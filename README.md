# Learning Exercises from Scala For The Impatient

# Chapter 12: Higher-Order Functions

1. Write a function values(fun: (Int) => Int, low: Int, high: Int) that yields a collection of function inputs and outputs in a given range. For example, values(x => x * x, -5, 5) should produce a collection of pairs (-5, 25), (-4, 16), (-3, 9) ...., (5, 25).

2. How do you get the largest element of an array with reduceLeft?

3. Implement the factorial function using to and reduceLeft, without a loop or recursion.

4. The previous implementation needed a special case when n < 1. Show how you can avoid this using foldLeft.

5. Write a function called largest(fun: (Int) => Int, inputs: Seq[Int]) that yields the largest value of a function within a given sequence of inputs. For example, largest(x => 10 * x - x * 10, 1 to 10) should return 25. Don't use a loop recursion.
