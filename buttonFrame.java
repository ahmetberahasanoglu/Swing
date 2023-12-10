

/**
 *
 * @author ahmet
 */
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class buttonFrame extends javax.swing.JFrame {

 
    public buttonFrame() {
        initComponents();
        
       
        // ICI BOS MAVI RENKLİ VE 123E 46 Boyutlu 16 buton tanımladım ve hepsinin graphql URL'ini localhost:4000 yaptım cünkü VScodedan yazdıgım kodda oyleydi 
        Graphql btn1 = new Graphql("");
        btn1.setGraphQLSchemaUrl("http://localhost:4000/graphql1");
        btn1.setPreferredSize(new Dimension(123, 46));
        btn1.setBackground(new Color(32, 142, 214));

        Graphql btn2 = new Graphql("");
        btn2.setGraphQLSchemaUrl("http://localhost:4000/graphql2");
        btn2.setPreferredSize(new Dimension(123, 46));
        btn2.setBackground(new Color(32, 142, 214));

        Graphql btn3 = new Graphql("");
        btn3.setGraphQLSchemaUrl("http://localhost:4000/graphql3");
        btn3.setPreferredSize(new Dimension(123, 46));
        btn3.setBackground(new Color(32, 142, 214));

        Graphql btn4 = new Graphql("");
        btn4.setGraphQLSchemaUrl("http://localhost:4000/graphql4");
        btn4.setPreferredSize(new Dimension(123, 46));
        btn4.setBackground(new Color(32, 142, 214));
        
        Graphql btn5 = new Graphql("");
        btn5.setGraphQLSchemaUrl("http://localhost:4000/graphql1");
        btn5.setPreferredSize(new Dimension(123, 46));
        btn5.setBackground(new Color(32, 142, 214));

        Graphql btn6 = new Graphql("");
        btn6.setGraphQLSchemaUrl("http://localhost:4000/graphql2");
        btn6.setPreferredSize(new Dimension(123, 46));
        btn6.setBackground(new Color(32, 142, 214));

        Graphql btn7 = new Graphql("");
        btn7.setGraphQLSchemaUrl("http://localhost:4000/graphql3");
        btn7.setPreferredSize(new Dimension(123, 46));
        btn7.setBackground(new Color(32, 142, 214));

        Graphql btn8 = new Graphql("");
        btn8.setGraphQLSchemaUrl("http://localhost:4000/graphql4");
        btn8.setPreferredSize(new Dimension(123, 46));
        btn8.setBackground(new Color(32, 142, 214));
        
        Graphql btn9 = new Graphql("");
        btn9.setGraphQLSchemaUrl("http://localhost:4000/graphql1");
        btn9.setPreferredSize(new Dimension(123, 46));
        btn9.setBackground(new Color(32, 142, 214));

        Graphql btn10 = new Graphql("");
        btn10.setGraphQLSchemaUrl("http://localhost:4000/graphql2");
        btn10.setPreferredSize(new Dimension(123, 46));
        btn10.setBackground(new Color(32, 142, 214));

        Graphql btn11 = new Graphql("");
        btn11.setGraphQLSchemaUrl("http://localhost:4000/graphql3");
        btn11.setPreferredSize(new Dimension(123, 46));
        btn11.setBackground(new Color(32, 142, 214));

        Graphql btn12 = new Graphql("");
        btn12.setGraphQLSchemaUrl("http://localhost:4000/graphql4");
        btn12.setPreferredSize(new Dimension(123, 46));
        btn12.setBackground(new Color(32, 142, 214));
        
        Graphql btn13 = new Graphql("");
        btn13.setGraphQLSchemaUrl("http://localhost:4000/graphql1");
        btn13.setPreferredSize(new Dimension(123, 46));
        btn13.setBackground(new Color(32, 142, 214));

        Graphql btn14 = new Graphql("");
        btn14.setGraphQLSchemaUrl("http://localhost:4000/graphql2");
        btn14.setPreferredSize(new Dimension(123, 46));
        btn14.setBackground(new Color(32, 142, 214));

        Graphql btn15 = new Graphql("");
        btn15.setGraphQLSchemaUrl("http://localhost:4000/graphql3");
        btn15.setPreferredSize(new Dimension(123, 46));
        btn15.setBackground(new Color(32, 142, 214));

        Graphql btn16 = new Graphql("");
        btn16.setGraphQLSchemaUrl("http://localhost:4000/graphql4");
        btn16.setPreferredSize(new Dimension(123, 46));
        btn16.setBackground(new Color(32, 142, 214));

      //panele butonları ekledim
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(btn1);
        getContentPane().add(btn2);
        getContentPane().add(btn3);
        getContentPane().add(btn4);
        getContentPane().add(btn5);
        getContentPane().add(btn6);
        getContentPane().add(btn7);
        getContentPane().add(btn8);
        getContentPane().add(btn9);
        getContentPane().add(btn10);
        getContentPane().add(btn11);
        getContentPane().add(btn12);
        getContentPane().add(btn13);
        getContentPane().add(btn14);
        getContentPane().add(btn15);
        getContentPane().add(btn16);
        
       
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

   
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );

        pack();
    }

    
   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(buttonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buttonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buttonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buttonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buttonFrame().setVisible(true);
            }
        });
    }
   
}
