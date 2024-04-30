# Java Concurrency API

Types in the Java Concurrency Utilities (APIs) are organized into small frameworks:
- Executor framework
- Synchronizers
- Concurrent collections
- Locks
- Atomic variables
- Fork/Join

## Concurrent Collections
- BlockingQueue
- BlockingDeque
- ConcurrentMap

### BlockingQueue (put(NonNull e),take()) {ArrayBlockingQueue (bounded), LinkedBlockingQueue (unbounded), DelayQueue (unbounded), SynchronousQueue (unbounded), PriorityBlockingQueue, LinkedTransferQueue}
throws exception:
add(e)
remove()
element()

special value:
offer(e)
poll()
peek()

blocking methods:
put(e)
take()

times out:
offer(e,longtime,unit)
poll(longtime,unit)

### BlockingDeque (put(NonNull e),take()) {LinkedBlockingDeque (opetionally bounded)}
method names: the names of methods of BlockingQueue+{First/Last}

put() = putLast()
take() = takeFirst()
element() = getFirst()
peek() = peekFirst()

### ConcurrentMap (NonNull keys, NonNull values, Failsafe iterator)
Segment = HashEntry[]
Map = Segment[]

public V putIfAbsent(K key, V value)
boolean remove(Object key, Object value)
public V replace(K key, V value)
public V replace(K key, V oldValue, V newValue)

### ConcurrentNavigableMap (headMap(key), subMap(k1,k2), tailMap(key), navigableKeySet(), descendingMap(), descendingKeySet())

### ConcurrentskipListMap (entries sorted by natural order of key type) (O(log n) getters)

### CopyOnWriteArrayList (failsafe iterator, iterator does not support remove())

## Synchronizers

### Semaphores (mutex(binary semaphore), counting semaphore)
acquire()
tryAcquire()
acquireUninterruptibly()

### CountDownLatch
Multiplayer scenario: Waiting for the last player to come in, to start gameplay.
- await()
- countDown()

### CyclicBarrier
- CyclicBarrier(int nThreads)
- CyclicBarrier(int nThreads, Runnable barrierAction)
- await()
- reset()

### Exchanger
a bidirectional form of SynchronousQueue
- exchange(Object o)
this.object = this.exchanger.exchange(this.object); // in a participating thread

### Phaser
- phase number
- dynamic number of unarrived parties

- register()
- onAdvance()
- arriveAndAwaitAdvance()
- arriveAndDeregister()
- isTerminated()

## Failsafe Iterators
