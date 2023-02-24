# Online Delivery

Now that you have fixed a set of errors in a provided file, it is time to try and create your own Java class (right click src in the project view pane and select New > Java Class). In the src directory (which you might have to create), create a new file called `Delivery.java`. Inside the file, create a class declaration and a main method.

Inside your class, your main method is going to call one other method, named `order`. Since we have not covered methods in depth, the description will be provided here:

```java
public static void main(String[] args){
    order(System.in);
}

public static double order(InputStream in){
    Scanner keyboard = new Scanner(in);
    
    //Write all of your code here
}
```

The purpose of the `order` method is relatively straightforward: it computes the amount owed on a restaurant order. When run, your program should:
1. Print a statement greeting the user in a friendly way with the name of one of your favorite restaurants to order from.
2. Display a list of four numbered items that are available for that restaurant and their price. The names of the items should be items from the restaurant. However, the amounts should be:
   1. $1.99
   2. $2.99
   3. $3.99
   4. $4.99
3. Ask the user if they want delivery (y/n). Delivery costs $5.99.
4. Ask the user if they want to tip (y/n). If they say yes, ask them to enter any amount in the range of 0 to 40, which will be used as a percentage to calculate tip.
5. Calculate the total cost and display it to the user, according to the following rules:
   1. Tax is 10%. Base price and delivery fee is taxed, but not tip.
   2. Tip percentage is based on the base price only, not delivery or tax. 
6. The `order` method should return the total cost back to the `main` method.
7. End the program.

If at any time the user does not enter one of the expected values, the `order` method should end and return -1.

As with the previous assignment, a series of tests will be included in the test directory to establish whether your program operates correctly, according to the instructions above. 

> Why does the main method call `order` with the parameter `System.in`? Typically, you create a `Scanner` object by passing in the `System.in`. But our tests do not rely on keyboard input. They call the `order` method directly, and simulate a person typing so that all the different tests can be run. These tests pass something other than `System.in` to do this. But, when you run your `main` method, it passes the normal `System.in` so that you can still test your program as a normal user might.
