import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Calculadora2 extends JPanel {
    public Calculadora2() {
        super();

        JPanel tudo = new JPanel(new BorderLayout());
        this.add(tudo);

        JPanel cabecalho = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cabecalho.add(new JLabel("Calculadora De Desconto"));
        tudo.add(cabecalho, BorderLayout.NORTH);
        
        JPanel panel = new JPanel(new GridLayout(4, 2));
        tudo.add(panel, BorderLayout.CENTER);

        JLabel originalPriceLabel = new JLabel("Preço Original:");
        panel.add(originalPriceLabel);

        JTextField originalPriceField = new JTextField();
        originalPriceField.setSize(200, 100);
        panel.add(originalPriceField);

       JLabel discountRateLabel = new JLabel("Taxa de Desconto (%):");
        panel.add(discountRateLabel);

        JTextField discountRateField = new JTextField();
        panel.add(discountRateField);

        originalPriceField.setSize(200, 100);
        JButton calculateButton = new JButton("Calcular Desconto");
        panel.add(calculateButton);
        JLabel resultLabel = new JLabel();
        panel.add(resultLabel);

        // ao clicar no botão 'calculateButton'
        calculateButton.addActionListener(e -> {
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
        });
    }
}
