# CarFactory
## Template Method and Iterator Design Pattern
### Statement of Work:
Our project is to manufacture cars with lean thinking philosophy. Lean thinking philosophy,
briefly, in the production of a product or a product group, over-produce and store products, etc. avoiding costs and producing products with the most appropriate cost.
The first of the methods applied to produce the products at the most affordable cost is to produce the products in the desired quantity, instead of mass-producing them.
Thus, we get rid of the storage cost. The second method is to realize the common features of the products produced in a single production line
instead of using a separate production line for each product group while producing a product group, and to realize the different features on different production lines.

### Design Patterns:
Template Method Design Pattern and Iterator Design Pattern were used in our project.
In car manufacturing, there are some common behaviors for the manufacture of cars. </br>
Also, some behaviors need to be done in a certain order. For example, we cannot assemble the engine and chassis of the vehicle without producing the skeleton.
In another example, we cannot apply the Euro NCAP test to a vehicle produced without assembling all parts of the vehicle.
We used the template method design pattern to perform these operations in a healthy way.
To use this design pattern, we defined an abstract class called CarsProduction. 
We defined the get functions of the areas of the vehicle produced in this class that we want to use as an abstract method and set their accessibility as protected.
In this way, we not only ensured that the fields we should use are returned to us, but also prevented the use of these fields outside the Cars package. </br>
Also, in this abstract class, we have set the accessibility of the behaviors required for production to private and call these behaviors in the order
they should occur in a final method called createTheCar. Since the createTheCar method is final, 
the order of the production process is prevented from being interfered with by someone else. </br>

![UML](https://github.com/KeremTAN/CarFactory/blob/master/img/createrTheCar.png) </br>

We have separated our vehicles according to body types for production.
While our vehicles are being produced, each case type stores its own vehicles in a static dataset.
Our factory currently produces 4 different types of cases. These are the Sedan, Hatchback, Concept, and Special body types, respectively.
Since it is not possible to predict how many sedan and hatchback body types will be produced, the vehicles produced in these body types are kept in a List.
However, since the production numbers of the vehicles to be produced in Concept and Special case types are certain,
these case types are kept in a normal (raw) series. The toString method was rewritten to print certain features of the produced vehicles to the screen,
and a method called printCars was written to print all the vehicles to the screen.
Here, the iterator design pattern is used. In this way, we did not have to rewrite the printCars method for each class where data is stored differently.
While applying the Iterator design pattern, we wrote a method that returns Iterator. In this method, the ".iterator" property is used for datasets stored as List.
Again, for the data stored as a raw array in this method, a class that implements the Iterator interface is written and an instance of that class is created.

![UML](https://github.com/KeremTAN/CarFactory/blob/master/img/theCarsList.png) </br>

![UML](https://github.com/KeremTAN/CarFactory/blob/master/img/theCarsArray.png) </br>

![UML](https://github.com/KeremTAN/CarFactory/blob/master/img/printCars.png) </br>

### UML:
#### Template Method Design Pattern

![UML](https://github.com/KeremTAN/CarFactory/blob/master/img/template.png) </br>

#### A Simple Image About Iterator Design Pattern
Normally the SedanCar class, SpecialCar class, and other vehicle classes are implemented from the CarProduction abstract class.
However, a simple image was used to understand the logic of the process.

![UML](https://github.com/KeremTAN/CarFactory/blob/master/img/iterator.png) </br>

#### UML DIAGRAM OF ALL SYSTEM
![UML](https://github.com/KeremTAN/CarFactory/blob/master/img/umlDiagram.png) </br>
