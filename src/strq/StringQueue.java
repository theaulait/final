package strq;

/**
 * Essentially a queue of characters, with enqueued and dequeued character sequences passed as
 * strings.
 */
public interface StringQueue {

    /**
     * @return
     *   The total length (number of characters) in the queue.
     */
    int length();

    /**
     * Adds characters to the queue.
     *
     * @param string
     *   The string containing characters to enqueue.
     */
    void enqueue(String string);

    /**
     * Removes and returns characters from the queue.
     *
     * @param length
     *   The length (number of characters) to remove and return.
     * @raise RuntimeException
     *   The queue doesn't contain enough characters to satisfy the request.
     */
    String dequeue(int length);

}
