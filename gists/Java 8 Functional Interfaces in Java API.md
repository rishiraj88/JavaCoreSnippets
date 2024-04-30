# java8 Functional Interfaces in JDK [WIP]

## Base package is:
java.util.function

## Main interfaces are (InterfaceName HASH functionalMethodName):
- Supplier#get()
- Consumer#accept()
- Predicate#test()
- Function#apply()

## More interfaces: with specific parameter datatypes and return datatypes
- BooleanSupplier#getAsBoolean: for boolean primitive
- IntSupplier#getAsInt: for int primitive
- LongSupplier#getAsLong: for long primitive
- DoubleSupplier##getAsDouble: for double primitive
- IntConsumer#: for int primitive
- LongConsumer#: for long primitive
- DoubleConsumer#: for double primitive
- Supplier<Integer>: for wrapper type
- IntPredicate#: for int primitive
- LongPredicate#: for long primitive
- DoublePredicate#: for double primitive
- Predicate<Integer>: for wrapper type
- IntFunction#apply(int): to return an object
- LongFunction#apply(long): to return an object
- DoubleFunction#apply(double): to return an object
- DoubleToIntFunction#apply(double)
- DoubleToLongFunction#apply(double)
- IntToDoubleFunction#apply(int)
- IntToLongFunction#apply(int)
- LongToDoubleFunction#apply(long)
- LongToIntFunction#apply(long)
- ToDoubleFunction#applyAsDouble(T)
- ToIntFunction#apply(T)
- ToLongFunction#applyAsLong(T)
The names of the functional methods in JDK are slightly different, not always the same as shown above. The applicable method names are easy to infer and look up, such as applyAsLong(T) in the last interface above.

## More Interfaces: with two or more parameters or return references
- BiConsumer<T,U>#accept(T t, U u): for two object references
- ObjIntConsumer#: for an object and an int primitive
- ObjLongConsumer#: for an object and a long primitive
- ObjDoubleConsumer#: for an object and a double primitive
- BiPredicate<T, U>: for two object references
- BiFunction<T, U, V>: for two input references
- ToDoubleBiFunction#apply(T, U)
- ToIntBiFunction#apply(T, U)
- ToLongBiFunction#apply(T, U)
The names of the functional methods in JDK are slightly different, not always the same as shown above. The applicable method names are easy to infer and look up.
