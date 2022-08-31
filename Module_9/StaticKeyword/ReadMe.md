## Static Keyword
### Description:
This activity will help you understand how and when to use the static keyword. In this activity there can be multiple apartments using the same watertank. You will have to finish the watertank class so that whenever an apartment uses water they use up some of the water in the watertank. This amount should decrease for everyone even if only one apartment uses water.
Please follow the steps below:

### Steps:
1. Create a static variable that takes a value for the waterlevel.
2. Create a method called useWater() that uses some water and reduces the waterlevel amount by 10 units. Make it print out the following string: "Water gushes". If there is no water then print out the following string instead: "No water. Please refill" and do not reduce the waterlevel.
3. Create a method calld refill() to refill the waterlevel to its maximum amount. Make it print out the following strings: "Watertank is being refilled" and then on the next line: "Watertank is full".
4. Create a method to print out the waterlevel called printWaterLevel(). Use the following string: "Water level: " and then the waterlevel variable.

### Test:
Use the test provided. This test uses the sample code from the main method in Main.java.

#### Sample output:
```
Water gushes
Water level: 90
Water gushes
Water level: 80
Watertank is being refilled
Watertank is full
Water level: 100
Water gushes
Water level: 90
```