package com.sofia.view;

import java.util.Scanner;

public class ValidarPagoConsola implements IValidarPago {

    private final Scanner scan = new Scanner(System.in);

    @Override
    public int validarPago(double total) {
        System.out.println("El total a pagar es: $" + total);
        System.out.println("¿Desea pagar?");
        System.out.println("1. Si");
        System.out.println("0. No");
        return Integer.parseInt(scan.nextLine());
    }
}
