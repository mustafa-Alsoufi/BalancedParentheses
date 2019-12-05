import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {

		String exp = "{a}({})";

		if (checkIfBalanced(exp))
			System.out.println("Balanced");
		else
			System.err.println("Not Balanced");
	}

	private static boolean checkIfBalanced(String exp) {
		Stack<Character> stack = new Stack<Character>();
		for (int i=0;i<exp.length();i++)
		{
			if (exp.charAt(i) == '{' || exp.charAt(i) == '[' || exp.charAt(i) == '(')
			{
				stack.push(exp.charAt(i));
			}
			else if ((exp.charAt(i) == '}' || exp.charAt(i) == ']' || exp.charAt(i) == ')') && (stack.isEmpty())) 
			{System.out.println("asd");
				return false;
			}
			else if (matchType(stack.lastElement(), exp.charAt(i)))
			{
				stack.pop();
				// If stack is empty, it means we popped all the items and it's Balanced
				if(i == exp.length()-1)
					{
						if(stack.isEmpty())
						{
							return true;
						}
					}
			}
		}		
		return false;
	}
	
	private static boolean matchType(char char1, char char2)
	{
		if (char1 == '(' && char2 == ')')
			return true;
		else if (char1 == '{' && char2 == '}')
			return true;
		else if (char1 == '[' && char2 == ']')
			return true;
		else
		return false;
	}
	
	
}
