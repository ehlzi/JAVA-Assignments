# Instructions

**Method overriding** is a form of polymorphism where a subclass can override, or have its own implementation, of a parent class's method. In this activity, we will practice with method overriding.

## Steps
1. Create a file named **Cake.java** and give it the following class definition:
  ```Java
  public class Cake {
  
  }
  ```
2. Let's add a method to our Cake class. Create a **bake()** method that prints out the following statement: `Bakes at a temperature of 350 degrees Fahrenheit for about 30 minutes!` This method does not return any values, nor does it take in any inputs. Your method should be similar to the method below:
  ```Java
  public void bake() {
    System.out.println("Bakes at a temperature of 350 degrees Fahrenheit for about 30 minutes!");
  }
  ```
4. Great! Now create a file named **Cupcake.java** and give it the following class definition:
  ```Java
  public class Cupcake extends Cake {
  
  }
  ```
Notice we used the **extends** keyword. This ensures that the Cupcake class is now a subclass of Cake. Because it is a subclass of Cake, it inherits, or receives copies of, any accessible variables or methods that are defined within the Cake class. This means that the **bake()** method defined in Cake will be inherited by Cupcake.
<br><br>
4. To test this out, in the **Main.java** file's **main()** method, create a Cupcake object and have it use its **bake()** method and run the program. You should see the following output:
  ```
  Bakes at a temperature of 350 degrees Fahrenheit for about 30 minutes!
  ```
5. The Cupcake object can be baked, which is great, however cakes and cupcakes bake at different times. This is a good opportunity to use **method overriding**. We still want our cupcakes to have a bake method, but we want cupcakes to have their own implementation of baking.
   <br><br>
   In Cupcake.java, add a **bake()** method with the same method signature as the parent class's **bake()** method. Have the method print the following statement out to the console:
  ```
  Bakes at a temperature of 350 degrees Fahrenheit for about 20 minutes!
  ```
6. Now when your cupcake objects call their **bake()** method, the bake time is 20 minutes, not 30 minutes. Re-run your program and check to see if the output changes accordingly. Run the I/O test and check that it passes.


  