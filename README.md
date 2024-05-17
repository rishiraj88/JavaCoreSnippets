# JavaCoreSnippets
programs and code snippets to showcase the might of Java platform (as of Java API), algorithms implemented using Java language and the types and method to refer and use in other projects.

## Java 11 API
New features available in Java SE 11. These are the features added to JLS in the versions later to Java SE 8. Most frequently used features are:
- Method `T[] Collection.toArray(IntFunction<T[]> generator )` to use instead of first generating a stream and then invoking `A[] Stream.toArray(IntFunction<A[]> generator);`
- Methods `String Files.readString(Path.of(filePath))` and `Path Files.writeString(Path.of(strFilePath),"string content", StandardOpenOption)`.
- Class `java.net.http.HttpClient` capable of making GET, PUT, POST requests easily.
- Running a Java class directly with `java` command as in `$ java MainClass.java` without generating a `.class` file a priori.
- Usage of `var` keyword for variable declaration in lambda expressions: ` (@Nonnull var a,@Nullable var b) -> System.out.println(a + b)`
- Method `Optional.isEmpty()` to check if the contained value is null. Its definition straight from Java API is:
`public boolean isEmpty() {
        return value == null;
}`
- A number of new methods foster our most-loved class `java.lang.String`. These are: `isBlank()`, `strip()`, `stripLeading()`, `stripTrailing()`, `repeat(intCount)`

