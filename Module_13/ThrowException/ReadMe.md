## Throws Exception
### Description:
In this activity you will learn about the throws keyword as well as when and how to use it. You will be trying to divide by 0 and see how the program continues after it catches the exception instead of the program stopping.
Please follow the steps below:

### Steps:
1. Make a Calculator Class in a new file
2. Create a static method called calculate(int x, int y) that throws an ArithmeticException and does not return a value. (Hint: Don't use the throw keyword as we don't want it to always throw an exception but only throw it if it finds the ArithmeticException)
3. In the calculate method have it print out x/y.
4. Create a static method called use which takes in ints x and y and does not return a value.
5. Create a try/catch block in use.
6. In the try block call the calculate method
7. The first catch block should catch ArithmeticException and print out "Caught ArithmeticException" and "Don't divide by 0!".
8. The second catch should block general exception making sure that our catch statements are from most specific to general. This catch block should print out "Some other exception".
9. Also create a finally block that will state how it will always run if an exception is caught or not. This block should print out "This will always print out"

### Test:
Use the test provided.

#### Sample output:
```
Caught ArithmeticException
Don't divide by 0!
This will always print out
Made it to the end!
```