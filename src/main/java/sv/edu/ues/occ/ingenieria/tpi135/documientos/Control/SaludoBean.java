/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.ues.occ.ingenieria.tpi135.documientos.Control;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import java.io.Serializable;

/**
 *
 * @author home
 */

@Stateless
@LocalBean
public class SaludoBean implements Serializable {

   
    public Saludo saludar(String mensaje)  {
        // Lógica para generar un objeto Saludo basado en el mensaje
        return new Saludo("chepe");
    }
}