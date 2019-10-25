package com.maksim;

import com.maksim.service.calculate.Calculator;
import com.maksim.service.calculate.MyCalculator;
import com.maksim.service.converter.PostfixRecord;
import com.maksim.validating.MyValidator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Experimental {
    public static void main(String[] args) throws Exception {
//        String mathExpression1 = "-7.3+4*((-43.7-2)/3)+6";
        String mathExpression1 = "-7.3+4*(-43.7-2)/3+6";
        String mathExpression2 = "-7.3++4***((43..7--2)()/3)+6";
        String mathExpression3 = "-7.3+4*((43.7-2)/3)+6";
        String mathExpression4 = ".7.3+4*((43.7-2)/3)+6";
        String mathExpression5 = "+7.3+4*((43.7-2)/3)+6";
        String mathExpression6 = "*7.3+4*((43.7-2)/3)+6";
        String mathExpression7 = ")*7.3+4*((43.7-2)/3)+6";
        String mathExpression8 = "-7.3+4*)(43.7-2)/3)+6";
        String mathExpression9 = "-7.3+4*((43.7-2)/3)+6";
        String mathExpression10 = "-7.3+4*((43.7-2)/3)+6+";
        String mathExpression11 = "-7.3+4*((43.7-2)/3)+6.";
        String mathExpression12 = "-7.3+4*((43.7-2)/3)+6+(";
        String mathExpression13 = "-7.3+4*((43.7-2)/3)+6(";
        String mathExpression14 = "7.3+4*((43.7-2)/3)+6";
        String mathExpression15 = "3+3^3";
        String mathExpression16 = "-5-2";
        String mathExpression17 = "10-2";

//        MyValidator myValidator = new MyValidator();
//        System.out.println(myValidator.isLastSymbolCorrect(mathExpression1));
//        System.out.println(myValidator.isLastSymbolCorrect(mathExpression2));
//        System.out.println(myValidator.isLastSymbolCorrect(mathExpression3));
//        System.out.println(myValidator.isLastSymbolCorrect(mathExpression4));
//        System.out.println(myValidator.isLastSymbolCorrect(mathExpression5));
//        System.out.println(myValidator.isLastSymbolCorrect(mathExpression6));
//        System.out.println(myValidator.isLastSymbolCorrect(mathExpression7));
//        System.out.println(myValidator.isLastSymbolCorrect(mathExpression8));
//        System.out.println(myValidator.isLastSymbolCorrect(mathExpression9));
//        System.out.println(myValidator.isLastSymbolCorrect(mathExpression10));
//        System.out.println(myValidator.isLastSymbolCorrect(mathExpression11));
//        System.out.println(myValidator.isLastSymbolCorrect(mathExpression12));
//        System.out.println(myValidator.isLastSymbolCorrect(mathExpression13));

//        Calculator calc = new MyCalculator();
//        System.out.println(calc.calculate(mathExpression1));
//        System.out.println(calc.calculate(mathExpression2));
//        System.out.println(calc.calculate(mathExpression3));
//        System.out.println(calc.calculate(mathExpression4));
//        System.out.println(calc.calculate(mathExpression5));
//        System.out.println(calc.calculate(mathExpression6));
//        System.out.println(calc.calculate(mathExpression7));
//        System.out.println(calc.calculate(mathExpression8));

//        LinkedList<String> stack = new LinkedList<>();
//        System.out.println(stack.size());

//        List<String> listTokens = PostfixRecord.strToPostfix(mathExpression1);
//        for (String token : listTokens){
//            System.out.print(token);
//        }
//
//        System.out.println();
//        List<String> listTokens2 = PostfixRecord.strToPostfix(mathExpression2);
//        for (String token : listTokens2){
//            System.out.print(token);
//        }

        String formula = mathExpression1;
        System.out.println(formula);

        List<String> listTokens1 = PostfixRecord.strToPostfix(formula);
        for (String token : listTokens1){
            System.out.print(token);
        }
        System.out.println();
        Calculator calc = new MyCalculator();
        System.out.println(calc.calculate(formula));


//        v.isMathExpressionValid(mathExpression);
//        System.out.println(v.isDuplicateOperationsFound(mathExpression3));
//        System.out.println(v.isFirstSymbolCorrect(mathExpression3));

    }
}
