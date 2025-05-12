# Frequently Used Features Available with Java 21 (vs. Java 17)
- String templates (preview): code available
- Sequenced collections: code available
- Record patterns with instanceof operator: code available
- Pattern matching for switch statements
- Unnamed patterns and unnamed variables (preview)
- Unnamed classes and instance main methods (preview): code available
- Virtual threads: code available
- Generational ZGC (Z garbage collector)

# Quick additions (with possible overlaps) to the above list
- String.indexOf("test",startIdx,endIdx) method
- Character.isEmoji**() methods
- sb.repeat("dfdb",6) methods in StringBuilder and StringBuffer
- Map and collection interfaces: SequencedCollection<E>, SequencedMap<E> and SequencedSet<E>
- Creator methods newHashMap, newHashSet, newLinkedHashMap, newLinkedHashSet with size parameter.
- DataTimeFormatter.ofLocalizedPattern("---") and DataTimeFormatterBuilder().appendLocalized("---") for localization
- ZipInputStream class with methods: read(), readNBytes(len), readNBytes(bytes,offset,len), readAllBytes() and transferTo(outStream)
- HttpClient, ExecutorService and ForkJoinPool are now AutoCloseable, nice for try-with-resesources
- Integer division methods: floorDivExact, divideExact, ceilDiv, ceilDivExact and ceilMod for combinations of int and long
- clamp(inputValue,min,max) for int, long, float and double inputs.
- long unsignedMultiplyHigh(long a, long b) and BigInteger parallelMultiply(BigInteger other)
- Thread.sleep(Duration dur), Thread.join(Duration dur) methods
- more of Thread methods: isVirtual(), ofPlatform(), ofVirtual().
- Executors.newVirtualThreadPerTaskExecutor() method is a pathbreaker in respect of performance.
- Future methods: T resultNow(), Throwable exceptionNow(), Future.State state(). TODO: I will read more on them and present code samples. All I know yet is: enum Future.State {RUNNING, SUCCESS, FAILED, CANCELLED}
- 
