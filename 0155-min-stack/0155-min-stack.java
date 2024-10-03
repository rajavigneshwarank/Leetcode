import java.util.Stack;

class MinStack {
    Stack<Long> stack;
    long min;

    // Initialize the stack and min variable
    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    // Push an element onto the stack
    public void push(long val) {
        if(stack.isEmpty()){
            min = val;          // First element, set min
            stack.push(val);     // Push the value onto the stack
        } else {
            if(val <= min){      // New minimum found
                stack.push(2 * val - min);  // Store modified value
                min = val;       // Update min
            } else {    
                stack.push(val);  // Push value as normal
            }
        }
    }
    
    // Pop the top element off the stack
    public void pop() {
        if(stack.isEmpty()) return;

        long top = stack.pop();
        if(top <= min){            // The top value was a modified value
            min = 2 * min - top;   // Restore previous min
        }  
    }
    
    // Retrieve the top element of the stack
    public long top() {
        if(stack.isEmpty()) return -1;
        if(stack.peek() <= min) return min;  // If modified value, return min
        return stack.peek();                 // Otherwise, return normal value
    }
    
    // Retrieve the minimum element in the stack
    public long getMin() {
        return min;
    }
}