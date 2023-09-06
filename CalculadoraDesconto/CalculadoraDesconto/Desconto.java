package CalculadoraDesconto;

    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Desconto {
    private JFrame frame;
    private JPanel panel;
    private JLabel originalPriceLabel;
    private JLabel discountRateLabel;
    private JTextField originalPriceField;
    private JTextField discountRateField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public Desconto() {
        frame = new JFrame("Calculadora de Desconto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        originalPriceLabel = new JLabel("Preço Original:");
        panel.add(originalPriceLabel);

        originalPriceField = new JTextField();
        originalPriceField.setSize(200, 100);
        panel.add(originalPriceField);

        discountRateLabel = new JLabel("Taxa de Desconto (%):");
        panel.add(discountRateLabel);

        discountRateField = new JTextField();
        panel.add(discountRateField);
        originalPriceField.setSize(200, 100);

        calculateButton = new JButton("Calcular Desconto");
        panel.add(calculateButton);

        resultLabel = new JLabel();
        panel.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double originalPrice = Double.parseDouble(originalPriceField.getText());
                    double discountRate = Double.parseDouble(discountRateField.getText());

                    if (discountRate < 0 || discountRate > 100) {
                        resultLabel.setText("A taxa de desconto deve estar entre 0 e 100.");
                    } else {
                        double discountAmount = (originalPrice * discountRate) / 100;
                        double finalPrice = originalPrice - discountAmount;

                        DecimalFormat df = new DecimalFormat("#.##");
                        resultLabel.setText("Preço com Desconto: R$ " + df.format(finalPrice));
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Valores inválidos. Certifique-se de inserir números válidos.");
                }
            }
        });

        frame.add(panel);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    
}


