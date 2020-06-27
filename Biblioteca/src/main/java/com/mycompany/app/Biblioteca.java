package com.mycompany.app;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Biblioteca {


    public int validarAdmin(String Usuario,String Pass){
        ArrayList Admin= new ArrayList();
        Admin.add("Admin");
        Admin.add("root");
        if(Usuario.equals(Admin.get(0)) && Pass.equals(Admin.get(1))) {
            JOptionPane.showMessageDialog(null, "Haz iniciado sesión como Administrador");
            try {
                Stage op = FXMLLoader.load(getClass().getResource("/V_Bibliografia.fxml"));
                op.setTitle("Administrador");
                op.show();
                return 1;
            }
            catch (IOException e) {
                JOptionPane.showInputDialog(null, "Window Not Found. Error #405 :/");
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Cuenta Invalida, Ingresa de nuevo");
        return 0;
    }
}
