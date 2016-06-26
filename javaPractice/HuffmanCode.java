import java.util.Scanner;
@SuppressWarnings("rawtypes")
class Heap<E extends Comparable> 
{
	private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
	public Heap(){}
	public Heap(E[] objects)
	{
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);
	}
	@SuppressWarnings("unchecked")
	public void add(E newObject)
	{
		list.add(newObject);
		int currentIndex = list.size() - 1;
		while (currentIndex > 0)
		{
			int parentIndex = (currentIndex - 1) / 2;
			if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0)
			{
				E temp = list.get(currentIndex);
				list.set(currentIndex, list.get(parentIndex));
				list.set(parentIndex, temp);
			}
			else
				break;
			currentIndex = parentIndex;
		}
	}
	@SuppressWarnings("unchecked")
	public E remove()
	{
		if (list.size() == 0) return null ;
		E removedObject = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.remove(list.size() - 1);
		int currentIndex = 0;
		while (currentIndex < list.size())
		{
			int leftChildIndex = 2 * currentIndex + 1;
			int rightChildIndex = 2 * currentIndex + 2;
			if (leftChildIndex >= list.size()) break;
			int maxIndex = leftChildIndex;
			if (rightChildIndex < list.size())
				if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) 
					maxIndex = rightChildIndex;
			if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0)
			{
				E temp = list.get(maxIndex);
				list.set(currentIndex, temp);
				list.set(maxIndex, list.get(currentIndex));
				currentIndex = maxIndex;
			}
			else
				break;
		}
		return removedObject;
	}
	public int getSize()
	{
		return list.size();
	}
}
public class HuffmanCode 
{
	private static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		System.out.println("Enter the Text:");
		String text = sc.nextLine();
		int[	] counts = getCharacterFrequency(text);
		System.out.printf("%-15s%-15s%-15s%-15s\n","ASCII Code", "Character", "Frequency", "Code");
		Tree tree = getHuffmanTree(counts);
		String[] codes = getCode(tree.root);
		for (int i = 0; i < codes.length; i++)
			if (counts[i] != 0)
				System.out.printf("%-15d%-15s%-15d%-15s\n",i, (char)i + "", counts[i], codes[i]);
	}
	public static String[] getCode(Tree.Node root) 
	{
		if (root == null ) return null ;
		String[] codes = new String[2 * 128];
		assignCode(root, codes);
		return codes;
	}
	private static void assignCode(Tree.Node root, String[] codes) 
	{
		if (root.left != null )
		{
			root.left.code = root.code + "0";
			assignCode(root.left, codes);
			root.right.code = root.code + "1";
			assignCode(root.right, codes);
		}
		else
			codes[(int)root.element] = root.code;
	}
	public static Tree getHuffmanTree(int[] counts)
	{
		Heap<Tree> heap = new Heap<Tree>(); 
		for (int i = 0; i < counts.length; i++)
			if (counts[i] > 0)
				heap.add(new Tree(counts[i], (char)i));
		while (heap.getSize() > 1)
		{
			Tree t1 = heap.remove();
			Tree t2 = heap.remove();
			heap.add(new Tree(t1, t2));
		}
		return heap.remove();
	}
	public static int[] getCharacterFrequency(String text)
	{
		int[] counts = new int[256];
		for (int i = 0; i < text.length(); i++)
			counts[(int)text.charAt(i)]++;
		return counts;
	}
	public static class Tree implements Comparable<Tree>
	{
		Node root;
		public Tree(Tree t1, Tree t2)
		{
			root = new Node();
			root.left = t1.root;
			root.right = t2.root;
			root.weight = t1.root.weight + t2.root.weight;
		}
		public Tree(int weight, char element)
		{
			root = new Node(weight, element);
		}
		public int compareTo(Tree o)
		{
			if (root.weight < o.root.weight)
				return 1;
			else if (root.weight == o.root.weight)
				return 0;
			else
				return -1;
		}
		public class Node
		{
			char element;
			int weight;
			Node left;
			Node right;
			String code = "";
			public Node() {}
			public Node(int weight, char element)
			{
				this.weight = weight;
				this.element = element;
			}
		}
	}
}
