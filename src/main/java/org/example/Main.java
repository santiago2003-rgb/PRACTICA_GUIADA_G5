package org.example;

import org.example.ayudas.Licor;
import org.example.modelos.Cliente;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Licor licorUno = new Licor();
        Licor licorDos = new Licor("jack daniels", LocalDate.of(2028,10,31), 40.0f, "wiskhy", 500000.0 );

        Cliente clienteUno = new Cliente();
        Cliente clienteDos = new Cliente("Sebastian", "1000662145" , 25, "santiagomejiagar@gmail.com", "Cr 42 # 21b 68");

        //Accediendo a los atributos
        System.out.println(licorUno.getMarca());
        System.out.println(licorDos.getMarca());
    }
}