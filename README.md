# Java-Assignment-008
Excercise 7.5 From the Book

## Part 1 - Write the following code in the provided Java class **InfiniteSeries**

One way to calculate $e^x$ is to use the infinite series expansion: $e^x =1+x+x^2/2!+x^3/3!+x^4/4!+$...

The ith term in the series is $x^i/i!$.

1. Write a method called **myexp** that takes **x** and **n** as parameters and estimates $e^x$ by adding the first **n** terms of this series. You can use the **factorial method** from Section 6.7 or your iterative version from the previous exercise.

2. You can make this method more efficient if you realize that the **numerator** of each term is the **same as its predecessor multiplied by x**, and the **denominator** is the **same as its predecessor multiplied by i**. Use this observation to eliminate the use of **Math.pow** and **factorial**, and check that you get the same result.

3. Write a method called **check** that takes a parameter, **x**, and displays **x, myexp(x)**, and **Math.exp(x)**. The output should look something like:
       1.0     2.708333333333333     2.718281828459045
You can use the escape sequence **\t** to put a tab character between columns of a table or use format specifiers!

4. Vary the number of terms in the series **(the second argument that check sends to myexp)** and see the effect on the accuracy of the result. Adjust this value until the estimated value agrees with the correct answer when **x is 1**.
 
5. Write a loop in main that invokes check with the values 0.1, 1.0, 10.0, and 100.0.
* How does the accuracy of the result vary as x varies?
    * Compare the number of digits of agreement rather than the difference between the actual and estimated values.
        * For 0.1 and 1 it is fine. For 10 and 100 it is completely inaccurate.
6. Add a loop in main that checks myexp with the values -0.1, -1.0, -10.0, and -100.0.
* Comment on the accuracy.
  * like with the first set it works fine for the first two and then goes crazy and becomes completely inaccurate.

## Part 2 - Submit via GitHub Pull Request
* Perform the same Pull request steps you've been doing all semester!
    * Don't forget to **feature branch** as Sprint2023
