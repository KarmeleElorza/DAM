package pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author elorza.karmele
 */
public class Controller implements ActionListener {

      private Model model;
      private View view;

      public Controller(Model model, View view) {
            this.model = model;
            this.view = view;
            gehituActionListener(this);
      }

      private void gehituActionListener(ActionListener listener) {
            //GUIaren konponente guztiei gehitu listenerra
            view.jButtonTxertatu.addActionListener(listener);
      }

      @Override
      public void actionPerformed(ActionEvent e) {
            String actionCommand = e.getActionCommand();
            //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
            switch (actionCommand) {
                  case "TXERTATU":
                        System.out.println("TXERTATU botoia sakatu duzu");
                        model.terminoaGehitu(view.jTextFieldEus.getText(), view.jTextFieldEsp.getText());
                        model.terminoakImprimatu();
                  case "IRTEN":
                        System.out.println("IRTEN botoia sakatu duzu");
            }
      }
}