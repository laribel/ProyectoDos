/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prácticados;

/**
 *
 * @author Laribel
 */
public class Operaciones {
    double num1;
    double num2;
    double result;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
   
     public void Suma (double num1,double num2) {
        this.result = num1+num2;
    }
     
    public void Resta(double num1, double num2) {
        this.result = num1-num2;
    }
     public void Multiplicacion(double num1, double num2) {
        this.result = num1*num2;
    }
    public void Division (double num1, double num2) {
        this.result = num1/num2;
    }
    
   
}
