| I need to... | Use | Why |
|-------------|-----|-----|
| Store elements in order, access by index | `ArrayList` | O(1) random access, dynamic sizing |
| Frequently insert/remove at front | `LinkedList` | O(1) insertion at both ends |
| Process elements in FIFO order | `Queue` (`LinkedList`) | Standard queue behavior |
| Process by priority, not insertion order | `PriorityQueue` | Heap-based, O(log n) insert/extract |
| Store unique elements, don't care about order | `HashSet` | O(1) add/contains, no duplicates |
| Store unique elements, keep insertion order | `LinkedHashSet` | O(1) + insertion order |
| Store unique elements, keep sorted | `TreeSet` | O(log n), Red-Black Tree |
| Map keys to values, fast lookup | `HashMap` | O(1) put/get |
| Map keys to values, keep insertion order | `LinkedHashMap` | O(1) + insertion order |
| Map keys to values, keep keys sorted | `TreeMap` | O(log n), sorted keys |