package me.load.leetcode;


import java.util.Stack;

/**
 * Demo class
 *
 * @author yinsanwen
 * @date 2019-04-05
 */
public class ScoreOfParentheses {

    /**
     * 只能处理首尾是一对()的情况。
     * @param S
     * @return
     */
    public int scoreOfParentheses0(String S) {

        if (S.length() == 0) {
            return 0;
        }

        int score = 0;

        Stack<Character> charStack = new Stack<>();
        char cursor;


        for (int i = 0; i < S.length(); i++) {
            cursor = S.charAt(i);
            if ('(' == cursor) {
                charStack.push(cursor);
            } else {
                charStack.pop();
                break;
            }
        }

        int m = charStack.size();
        int n = m + 2;

        // 计算2的m次方
        int prefix = 1;
        for (int k = 0; k < m; k++) {
            prefix = prefix * 2;
        }

        return (1 + socerOflast(S, n, m)) * prefix;
    }

    private int socerOflast(String S, int n, int m) {
        // 无须再继续
        if (n >= S.length() - m) {
            return 0;
        }

        return scoreOfParentheses0(S.substring(n, S.length() - m));

    }

    public static void main(String[] args) {
        ScoreOfParentheses test = new ScoreOfParentheses();

        String input = "((())())";
        System.out.println(test.scoreOfParentheses(input));


    }


    public int scoreOfParentheses(String S) {

        int score = 0;
        int start  = 0;


        int cursor = 0;
        char tmp;
        Stack<Character> characterStack = new Stack<>();
        characterStack.push(S.charAt(cursor++));

        while (cursor < S.length()){

            tmp = S.charAt(cursor);
            if ('(' == tmp){
                characterStack.push(tmp);
            }else {
                characterStack.pop();
                if (characterStack.empty()){
                    score = score + scoreOfParentheses0(S.substring(start,cursor+1));
                    start = cursor+1;
                }
            }

            cursor++;
        }

        return score;
    }




}
