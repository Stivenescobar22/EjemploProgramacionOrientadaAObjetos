package main;
import static empleados.constantes.Mensajes.*;
import empleados.Descuentos;

import javax.swing.*;

import static empleados.constantes.Valores.*;


public class Main {


    public static void main(String[] args){





            Descuentos descuentos = new Descuentos();
            boolean accion = true;

        while(accion == true) {

            String opcion = JOptionPane.showInputDialog(null,
                    TITULO_MENU.getMensaje() + "\n" +
                            OPCION1.getMensaje() + "\n" +
                            OPCION2.getMensaje() + "\n");


            switch (opcion) {

                case "1":

                    String horasTrabajadas = JOptionPane.showInputDialog(null, HORAS_TRABAJADAS.getMensaje());
                    double horas = Double.parseDouble(horasTrabajadas);

                    String valorHora = JOptionPane.showInputDialog(null, VALOR_HORA.getMensaje());
                    double valor = Double.parseDouble(valorHora);

                    descuentos.setHorasTrabajadas(horas);
                    descuentos.setValorHora(valor);

                    JOptionPane.showMessageDialog(null,
                            SALARIO_BASE.getMensaje() + descuentos.calcularSalarioBase() +
                                    DESCUENTO_SALUD.getMensaje() + descuentos.impuesto(IMPUESTO_SALUD) +
                                    DESCUENTO_PENSION.getMensaje() + descuentos.impuesto(IMPUESTO_PENSION) +
                                    SALARIO_FINAL1.getMensaje() + descuentos.salarioFinal(descuentos.impuesto(IMPUESTO_SALUD) + descuentos.impuesto(IMPUESTO_PENSION)) +
                                    SALARIO_FINAL2.getMensaje() + descuentos.salarioFinal(descuentos.impuesto(IMPUESTO_SALUD), descuentos.impuesto(IMPUESTO_PENSION)) +
                                    SALARIO_APAGAR.getMensaje() +
                                    (descuentos.salarioFinal(descuentos.impuesto(IMPUESTO_SALUD), descuentos.impuesto(IMPUESTO_PENSION)) > MILLON ?
                                            descuentos.salarioDefinitivo(descuentos.impuesto(IMPUESTO_SALUD), descuentos.impuesto(IMPUESTO_PENSION), OTRO_DESCUENTO) :
                                            descuentos.salarioDefinitivo(descuentos.impuesto(IMPUESTO_SALUD) + descuentos.impuesto(IMPUESTO_PENSION), AUMENTO)));


                    break;


                case "2":

                    break;


                default:
                    JOptionPane.showMessageDialog(null, OPCION_NO_EXISTE.getMensaje());
                    break;


            }

            int respuesta = JOptionPane.showConfirmDialog(null,
                    "Desea regresar?",
                    "Mensaje de confirmacion",
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION){

                accion = true;
            }else if (respuesta == JOptionPane.NO_OPTION){
                accion = false;
            }

        }

    }
}
