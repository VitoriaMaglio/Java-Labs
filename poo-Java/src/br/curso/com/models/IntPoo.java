package br.curso.com.models;

import java.util.Scanner;

public class IntPoo {

    //Fazer um programa que leia os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
    //Atributtes
    private double width;
    private double height;
    public IntPoo(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public IntPoo() {
    }
    public double getWidth() {return width;}
    public void setWidth(double width) {this.width = width;}
    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}
    //methods
    public double area(){
        return width*height;
    }
    public double perimeter(){
        return (width*2) + (height*2);
    }
    public double diagonal(){
        return Math.sqrt(width*width + height*height);
    }
    public static void main(String[] args) {
        //Os dois jeitos funcionaram ;)

        Scanner sc = new Scanner(System.in);
        //IntPoo intPoo = new IntPoo();
        // declarando objeto sem parâmetros para serem iniciados com valores do scanner
        //System.out.println("Enter rectangle width and height:");
        //intPoo.height = sc.nextDouble();
        //intPoo.width = sc.nextDouble();
        //System.out.println(intPoo.area());
        //System.out.println(intPoo.perimeter());
        //System.out.println(intPoo.diagonal());

        //System.out.println("Enter rectangle width and height:");
        //double width = sc.nextDouble();
        //double height = sc.nextDouble();
        //IntPoo intPoo = new IntPoo(width, height);
        // Se você vai ler os valores dos parâmetros com Scanner você deve declarar a instância do objeto depois de ter lido.
        //System.out.println(intPoo.area());
        //System.out.println(intPoo.perimeter());
        //System.out.println(intPoo.diagonal());

    }
}
