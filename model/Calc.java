package model;


public class Calc {

    public static double caller(String functionality, double e1, double e2) {

        try {
            Class<?> clazz = Class.forName("methods." + functionality);
            Operation calc = (Operation) clazz.getDeclaredConstructor().newInstance();
            double result = calc.mathematic(e1, e2);
            return result;
        } catch (Exception e) {
            throw new RuntimeException();
        }

        // Class<Calc> clazz = Calc.class;

        // try{
        // Method method = clazz.getDeclaredMethod(functionality, Double.class);
        // method.invoke(this, e1, e2);
        // }
        // catch(Exception e){
        // System.out.println("Function doesn't exist");
        // }
    }
}
