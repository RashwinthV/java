package Day11;

public class st_ex_mo {
   
    char[] a = new char[10];
    int[] b = new int[10];
    int top = 0;
    int fo = 0;

    void push(String dat) {
        if (isFull()) {
            System.out.println("stack full");
        } else {
            for (char ch:dat.toCharArray()) {
                if (isAlpha(ch)) {
                    a[top]=ch;
                    top++;
                } else if (isDigit(ch)) {
                    b[fo]=Character.getNumericValue(ch);
                    fo++;
                }
            }
        }
    }

    private boolean isAlpha(char ch) {
        return (Character.isUpperCase(ch)||Character.isLowerCase(ch));
    }

    private boolean isDigit(char ch) {
        return Character.isDigit(ch);
    }

    void pop() {
        if (!isEmpty()) {
            top--;
            fo--;
        } else {
            System.out.println("stack empty");
        }
    }

    void show() {
    	System.out.println("The String values in the stck are: ");
        for (int i=0; i<top;i++) {
            System.out.print(a[i]+" ");
            
            
        }
        System.out.println();
        System.out.println("The NUmeric values in the Stack are: ");
        for (int i=0; i<fo;i++) {
            System.out.print(b[i]+" ");   
        }
        System.out.println();
    }

    boolean isEmpty() {
    	if(top==0) {
    		return true;
    	}
        return false;
    }

    boolean isFull() {
        return top==a.length;
    }

    int size1() {
        return top;
    }
    int size2() {
        return fo;
    }
}
