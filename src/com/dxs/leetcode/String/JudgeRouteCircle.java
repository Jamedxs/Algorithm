package com.dxs.leetcode.String;

/**
 * Created by dengxusheng on 2017-08-24.
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
 The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L(Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
 Example 1:
 Input: "UD"
 Output: true
 Example 2:
 Input: "LL"
 Output: false
 */
public class JudgeRouteCircle {
    public static boolean judgeCircle(String moves) {
        int x = 0,y = 0;
        for (int i = 0; i < moves.length(); i++) {
            Character ch = moves.charAt(i);
            if(ch == 'L'){
                x++;
            }else if(ch == 'R'){
                x--;
            }else if(ch == 'U'){
                y++;
            }else{
                y--;
            }
        }
        return (x==0)&&(y==0);
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
    }
}
