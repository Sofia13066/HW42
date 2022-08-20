package controller;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import model.Calc;

public class CalcAppl{

public static void main(String[] args) {
    if(args.length != 3) {
        System.out.println("Wrong number of arguments");
        return;
    }
    try {
        System.out.println(Calc.caller(args[0], Double.parseDouble(args[1]), Double.parseDouble(args[2])));
        
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

}