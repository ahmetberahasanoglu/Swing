
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ahmet
 */
public class Graphql extends JButton {

    private String graphQLSchemaUrl;
    private boolean isActive;
    private Icon activeIcon;
    private Icon passiveIcon;

    public Graphql(String text) {
        super(text);
        this.isActive = false;
        this.activeIcon = UIManager.getIcon("OptionPane.informationIcon");

        this.passiveIcon = UIManager.getIcon("OptionPane.questionIcon");

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleState();
                GraphQLMutationekle();                // Burada localhost:4000'deki GraphQL şemasını calıstıracaktım ama sadece bir yazı yazdırttım
            }
        });
    }
/* GraphQL şeması URL'sini getledim.*/
    public String getGraphQLSchemaUrl() {
        return graphQLSchemaUrl;
    }

    public void setGraphQLSchemaUrl(String graphQLSchemaUrl) {
        this.graphQLSchemaUrl = graphQLSchemaUrl;
    }
//buton durumu değiştiğinde çalıssın diye ekledim
    private void toggleState() {
        this.isActive = !this.isActive;
        updateAppearance();
    }
// renk ve iconu güncellemek icin icin kullandım
    private void updateAppearance() {
        if (isActive) {
            setBackground(new Color(1, 32, 123));
            setIcon(activeIcon);
        } else {
            setBackground(new Color(32, 142, 214)); // Pasif renk
            setIcon(passiveIcon);
        }
    }

    private void GraphQLMutationekle() {//GRAPHQL'i Localhost:4000'de oluşturdum ama calıstıramadım 
        System.out.print("GRAPHQL CALISSIN   \n");
    }
}
