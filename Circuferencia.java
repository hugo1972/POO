/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico01;

/**
 *
 * @author hugo
 */
public class Circuferencia {
    private double radio;

    public Circuferencia(double radio) {
        this.radio = radio;
    }

    public Circuferencia() {
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void ingresa(){
        System.out.print("Ingresa valor: ");
    }
    public void crearCircuferencia(double radio){
        this.radio = radio;
    }
    public double area(){
        double retorno = ((3.1416*radio)*2)*2;
        System.out.println("Area: "+retorno);
        return retorno;
    }    
    public double perimetro(){
        double retorno = (2*3.1416*radio);
        System.out.println("Perimetro: "+retorno);
        return retorno;
    }

    @Override
    public String toString() {
        return "Circuferencia{" + "radio=" + radio + '}';
    }
    
}

/*
2. Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
*/