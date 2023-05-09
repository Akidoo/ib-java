import java.util.Stack;

public class Stacks {
	
	public static void main (String[] args) {
		
		
		//FILO (First in last out) data structure
		Stack<String> stack = new Stack<String>();
		
		stack.push("Minecraft");
		stack.push("Pokemon");
		stack.push("Undertale");
		
		System.out.println(stack.empty());
		System.out.println(stack);
		
		//String myFavGame = stack.pop(); //Removes Undertale from the stack and stores it
		System.out.println(stack.peek()); //Returns top most item within the stack
		System.out.println(stack);
		
		System.out.println(stack.search("Pokemon")); //locates iten within stack
		
	}
	
}

