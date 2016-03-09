package LRU;
import java.util.HashMap;

public class LRUCache {
	private class Node {
		Node prev;
		Node next;
		int key;
		int value;

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
			this.prev = null;
			this.next = null;
		}
	}

	private int capacity;
	private HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	private Node head = new Node(-1, -1);
	private Node tail = new Node(-1, -1);

	public LRUCache(int capacity) {
		this.capacity = capacity;
		tail.prev = head;
		head.next = tail;
	}

	public int get(int key) {
		if (!map.containsKey(key)) {
			return -1;
		}

		// remove current from list 
		Node current = map.get(key);
		current.prev.next = current.next;
		current.next.prev = current.prev;

		// move current to tails - - update its frequecy 
		addToTail(current);
		return current.value;
	}

	public void set(int key, int value) {
		if (get(key) != -1) {
			map.get(key).value = value;
			return;
		}

		if (map.size() == capacity) {
			// remove head.next node
			map.remove(head.next.key);
			head.next = head.next.next;
			head.next.prev = head;
		}

		Node insert = new Node(key, value);
		map.put(key, insert);
		addToTail(insert);
	}

	private void addToTail(Node current) {
		current.prev = tail.prev;
		tail.prev = current;
		current.prev.next = current;
		current.next = tail;
	}
}
