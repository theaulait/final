# String Queue

In this problem, you will implement a "string queue". This data structure
behaves as a queue of individual characters, except that enqueueing and 
dequeing are done with strings (which are effectively sequences of characters)
rather than individual characters.

When enqueing, the provided string is added to the back of the queue, as if its
contituent characters were added sequentially. When dequeueing, the caller
requests a specific number of characters, which are removed from the front of 
the queue and returned as a string. The queue is initially empty.

For example, 

- start with an empty queue

- enqueue the string "BOLDLY TO GO" 

- dequeue 7 characters, which returns "BOLDLY " and leaves "TO GO" in the queue

- enqueue the string " TO THE STORE", which leaves "TO GO TO THE STORE" in the
  queue

- dequeue 6 characters, which returns "TO GO " and leaves the characters "TO THE
  STORE" in the queue

We've provided for you an _interface_ [`StringQueue`](StringQueue.java). Your
task is to create a new class `SimpleStringQueue` in a new Java source file that
implements this interface. Do not modify the interface.

Your implementation can use a single string to track the contents of the buffer.

We've also provided a simple [test class](Test.java). 



