package primitivos;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        //Circulo mi_circulo=new Circulo("Circulo",50.0);



        MiCanvas canvas=new MiCanvas();
        JFrame ventana=new JFrame();
        ventana.getContentPane().add(canvas);
        ventana.setSize(400,400);
        ventana.setVisible(true);
        //marco.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
