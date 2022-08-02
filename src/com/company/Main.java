package com.company;
import java.util.Scanner;

public class Main {
 public static void main(String[] args){
  System.out.println("Hello, wellcome to my calculator");
  Scanner in = new Scanner(System.in);
  System.out.println("Write your first number: ");
  double a = in.nextDouble();

  System.out.println("write your second number: ");
  double b = in.nextDouble();

  System.out.println("Choose operation '+,-': ");
  char symb = in.next().charAt(0);

  double c;

  /*if(symb == '+'){
   c = a + b;
   System.out.println(c);
  }else if(symb == '-'){
   c = a - b;
   System.out.println(c);
  }else{
   System.out.println("Choose right opperation or write only numbers");
  }
  in.close();*/
  switch (symb){
   case '+':
    System.out.println("Your answer: " + a+b);
    break;
   case '-':
    System.out.println("Your answer: " + (a-b));
    break;
   default:
    System.out.println("Choose right opperation or write only numbers");
  }
    in.close();









 }


}






