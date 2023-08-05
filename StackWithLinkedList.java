		//Abhishek Sunil Uphade

import java.util.*;
public class StackWithLinkedList{
	static class Node{
		int data ;
		Node next;
	

		Node (int data){
			this.data=data;
			next = null;
		}
	}

	//Push Insertion

	static class Stack{
		
		public static Node head = null;
		public static void Push(int data){
			Node NewNode = new Node(data);
		
			if(head==null){
				head = NewNode;
				return;
			}
			NewNode.next = head;
			head = NewNode;
		}


		public static boolean isEmpty(){
			return head == null;
		}

		public static int Pop(){
			if(isEmpty()){
				return -1;
			}

			Node top = head;
			head = head.next;
			return top.data;
		}

		public static int Peek(){
			if(isEmpty()){
				return -1;
			}
	
			Node top = head;
			return top.data;
		}
	}


	public static void main(String ar[]){
		Stack stk = new Stack();
		stk.Push(101);
		stk.Push(102);
		stk.Push(103);
		stk.Push(104);
		
		while(!stk.isEmpty()){
			System.out.println(stk.Peek());
			stk.Pop();
		}
	}
}