package com.codegym;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack);

        int number1 = stack.pop();
        int number2 = stack.pop();
        int number3 = stack.pop();

        stack.push(number1);
        stack.push(number2);
        stack.push(number3);

        System.out.println("Mảng sau khi đảo ngược: " + stack);

        Stack<String> stackString = new Stack<>();
        stackString.push("A");
        stackString.push("B");
        stackString.push("C");

        System.out.println(stackString);

        String str1 = stackString.pop();
        String str2 = stackString.pop();
        String str3 = stackString.pop();

        stackString.push(str1);
        stackString.push(str2);
        stackString.push(str3);

        System.out.println(stackString);
    }
}
