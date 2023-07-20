package complete;

//Explain the difference between composition and inheritance. In which case would you use each?

public class p389compositionvsinheritance {
    //Composition and inheritance are both terms that primarily refer to Object Oriented programming, and describes how classes are structured and interact with each other.
    //Composition means that each class is more or less their own. This still allows the classes to interact with each other, but it must be explicitly defined, as there isn't anything shared between them unless requested to do so. If you were to separate these classes from each other, they would still be able to operate the same, no matter where they are placed. Removed from the context of the classes around it, it may be a little more difficult to understand how this class was used, but it minimizes the amount of code that you would need to rewrite.
    //Inheritance means that a subclass has access by default to its superclass' methods and variables. This allows the subclass access to anything used in the parent class, like variables or methods. In this case, you couldn't separate the two since the subclass would likely rely on something from its parent to operate properly. However, because of this, if the parent class is included somewhere else, its subclasses will also be included and if you wanted to share information between several subclasses, you could make a global variable (in the context of that parent class) for the two subclasses. This can help when trying to share many or large pieces of data, however, this can cause its own issues.
    //Both composition and inheritance can be used in combination with each other.
}