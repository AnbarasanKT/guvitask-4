import java.util.Stack;
public class collectionclasses {


    public class IntegerStack {
        private Stack<Integer> stack;

        public IntegerStack() {
            stack = new Stack<>();
        }

        public void push(int value) {
            stack.push(value);
        }

        public Integer pop() {
            if (!stack.isEmpty()) {
                return stack.pop();
            } else {
                return null; // or throw an exception
            }
        }


    }
}
