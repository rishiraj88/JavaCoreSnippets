package java21.advanced;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

public class FriendFunctionCaller {

   public static void main(String[] args) throws Throwable {
       try (final var arena = Arena.ofConfined()) {

           final var linker = Linker.nativeLinker();

           final var symbolLookup = linker.defaultLookup();

           // Create a memory segment for the atoi function here
           // Use the find method on the symbolLookup object to find the atoi function
           final var memorySegment = symbolLookup.find("atoi").orElseThrow();
           final var functionDescriptor =
                   FunctionDescriptor.of(JAVA_LONG, ADDRESS);
           final var methodHandle = linker.downcallHandle(memorySegment, functionDescriptor);
           final var segmentAllocator = arena.allocateFrom("25");
           final var result = (long) methodHandle.invokeExact(segmentAllocator);

           System.out.println("Object value " + result);
           System.out.println("Object type: " + ((Object)result).getClass().getSimpleName());
       }

   }

}    
