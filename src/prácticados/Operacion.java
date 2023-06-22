/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prácticados;

/**
 *
 * @author Laribel
 */
public class Operacion {
    double num;
    double result;

    public double getNum1() {
        return num;
    }

    public void setNum1(double num1) {
        this.num = num1;
    }

   

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
   
     public void Suma (double num) {
        this.result = num + num;
    }
     
    public void Resta(double num) {
        this.result = num-num;
    }
     public void Multiplicacion(double num) {
        this.result = num*num;
    }
    public void Division (double num) {
        this.result = num/num;
    }
    
   
}
