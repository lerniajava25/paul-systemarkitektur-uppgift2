# reflection

## why is constructor injection often preferred over field or setter injection?
it makes dependencies clear and ensures the object gets what it needs when it is created

## what did weld solve?
my own container had to use reflection to find constructors and create dependencies manually. weld does this automatically

## how does adding scopes (@ApplicationScoped, etc.) change object lifetimes?
reflection lets the program inspect classes at runtime. i used it to find constructors and their dependecies
