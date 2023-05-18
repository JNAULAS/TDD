package ec.edu.ups.tdd.calculator;

public class Calculator {
    // Declaramos variable para almacenar respuesta
    private int ans;

    public int addition(int a, int b) {
        //return 0;// 1 Caso para que falle la prueba
        return a + b;// 2 prueba ok
    }
    public int subtraction(int a, int b){
        return a - b;
    }
    public int division(int a, int b){
        return a / b;
    }
    public int multiplication(int a, int b){
        // Agregar metod para dormir
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a * b;
    }
    // Creamos los metodos getters and setters
    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

}
