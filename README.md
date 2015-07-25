![Screenshot](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/logo.png)

# Design Patterns

Design Patterns are solutions to common software design problems that occur over and over in software development.

## Index
+ [Structural](#structural)
+ [Behavioral](#behavioral)
+ [Creational](#creational)
+ [Support](#support)
+ [Contribute](#contribute)
+ [License](#license)


## Structural<a name="structural"></a>

### Adapter
An adapter helps to join two incompatible interfaces to work together. So, if you have an interface with implementing classes. If you were asked later to add additional sub class(es), but they have incompatible Interface, then, adapter pattern could be useful. There are two structures:
#### Object
The Adapter has a reference to the incompatible object.

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/adapter.object.png)

#### Interface
The Adapter has a reference to the incompatible interface.

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/adapter.interface.png)

### Decorator
The decorator pattern extends the functionality of an object dynamically.

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/decorator.png)

### Bridge
Decouples an abstraction from its implementation so that the two can vary independently. As an example, If you have a class called Rectangle. This class could have two different implementations, Red Rectangle and Blue one. Instead of Inheriting from Rectangle class, one for blue rectangle and another for red, We could instead pull out these implementations and use Composition over Inheritance.

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/bridge.png)

### Composite
It's used to create a tree structure of group of objects. So, an Object can be collection of other objects, where objects share a common interface that defines the common operations.

An object can have a collection of objects called _Composite_ Or _Node_, while objects that can't have other objects(at the lowest level) called _Leaf_. _Composite_ object can have leafs or other composites.

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/composite.png)

## Behavioral<a name="behavioral"></a>
### Strategy
Strategy is used when you want to extend the behavior of an Object, where this behavior could vary during the run time. If multiple objects need to use the same behavior(algorithm), we get the benefit of code reuse too.

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/startegy.png)
### Dependency injection
Dependency is used when you want to separate the dependencies of an Object, and pass them to dependent object during run time. The dependent object does not need to know how to construct the dependencies nor which actual dependencies it is using.

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/dependency.png)

### Iterator
This pattern is used to get a way to access the elements of a collection object in sequential manner without exposing its underlying representation. In this snippet, I am using Java's built-in Iterable & Iterator classes.

#### Separate Class
![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/iterator.separate.png)

#### Single Class 
![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/iterator.single.png)

### Observer
Observer pattern is used such that if an object is changed, its dependents objects get notified of that change, Thus, there is 1:M Relationship. As an example, having a Publisher that publish news to the Subscribers, Whenever any new updates or data added, the Subscribers get notified. In this snippet, I am using Java's Observer and Observable classes.

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/observer.png)

### State
A class behavior may change based on set of states either made by user, or internally by the system. In this pattern, We encapsulate each state. The user doesn't need to know about each state, the user only performs some actions which in turn may change the state of the object.

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/state.png)

## Creational<a name="creational"></a>

### Factory 
This pattern defines a way for creating object(s) during run time.

#### Factory Method
Factory Method is a method used to create object(s) of a certain type(interface) during run time.

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/factory.method.png)

#### Abstract Factory
Factory Method is an object used to create a set of related objects during run time.

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/factory.abstract.png)

### Singleton
 The Singleton Pattern is a pattern that ensures that there is only ever one single instance of a class, And it provides a global way to get to that instance.

#### Classic
This is the basic implementation

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/singleton.classic.png)

#### Eager Instantiation
If you are concerned about synchronization, eager intantiation could be useful as long as you know you'll always need to instantiate the object, and the object doesn't take a lot of time to load.

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/singleton.eager.png)

#### Synchronized 
Another solution for synchronization using ```synchronized``` method. But, you will pay for it's pitfall; Synchronized code takes a lot longer to run.

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/singleton.synchronized.png)

### Prototype
The Portotype Pattern used when you want to hide the complexity of creating new instance same as in Factory Pattern, and Creating an object is an expensive operation. Thus, copy an existing object is much efficient. It uses Java's Cloneable Interface for cloning objects.
 
#### Abstract Class
Using abstract class

![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/prototype.abstract.png)

#### Interface
Using Interface
 
![Class Diagram](https://raw.githubusercontent.com/OmarElGabry/JavaDesignPatterns/master/diagrams/prototype.interface.png)

## Support
I've written these snippets in my free time during my studies. If you find it useful, please support the project by spreading the word.

## Contribute <a name="contribute"></a>

Contribute by creating new issues, sending pull requests on Github or you can send an email at: omar.elgabry.93@gmail.com

## License
Built under [MIT](http://www.opensource.org/licenses/mit-license.php) license.
