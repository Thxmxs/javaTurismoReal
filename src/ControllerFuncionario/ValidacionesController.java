/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerFuncionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author alx4a
 */
public class ValidacionesController {

    public Boolean validarIntPositivo(JTextField txt) {
        Boolean positivo = false;

        try {
            if (Integer.valueOf(txt.getText()) < 0) {
                positivo = true;
            }
        } catch (Exception e) {
            positivo = false;
        }

        return positivo;
    }

    public Boolean validarTextoVacio(JTextField txt) {
        Boolean vacio = false;
        try {
            if (txt.getText().length() == 0) {
                vacio = true;
            }
        } catch (Exception e) {
            vacio = false;
        }
        return vacio;
    }

    public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);

    }

    
  

}
