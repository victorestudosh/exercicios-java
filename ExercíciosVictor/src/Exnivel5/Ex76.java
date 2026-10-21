package Exnivel5;

import java.util.Stack;

public class Ex76 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		
		stack.push("Pilha 1");
		stack.push("Pilha 2");
		stack.push("Pilha 3");
		
		String topo = stack.peek();
		
		System.out.println("Item do Topo: " + topo + "\n");
		
		System.out.println(stack);
	}
}
