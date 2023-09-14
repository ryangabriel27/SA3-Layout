import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Calculadora2 extends JPanel {
    public Calculadora2() {
        super();

        JPanel tudo = new JPanel(new BorderLayout());
        this.add(tudo);
        this.setBackground(new Color(207, 198, 164));
        tudo.setBackground(new Color(227, 218, 184));
        tudo.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 10), 10));

        JPanel cabecalho = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cabecalho.add(new JLabel("Calculadora De Desconto"));
        tudo.add(cabecalho, BorderLayout.NORTH);
        cabecalho.setBackground(new Color(227, 218, 184));
        
        JPanel panel = new JPanel(new GridLayout(4, 2,0,3));
        tudo.add(panel, BorderLayout.CENTER);
        panel.setBackground(new Color(227, 218, 184));

        JLabel precoOriginalLabel = new JLabel("Preço Original:");
        panel.add(precoOriginalLabel);
        precoOriginalLabel.setBackground(new Color(227, 218, 184));

        JTextField campoPreco = new JTextField();
        campoPreco.setSize(200, 100);
        panel.add(campoPreco);

       JLabel descontoLabel = new JLabel("Taxa de Desconto (%):");
        panel.add(descontoLabel);
        descontoLabel.setBackground(new Color(227, 218, 184));

        JTextField campoDesconto = new JTextField();
        panel.add(campoDesconto);

        campoPreco.setSize(200, 100);
        JButton botaoCalcular = new JButton("Calcular Desconto");
        botaoCalcular.setBackground(new Color(150, 142, 107));
        botaoCalcular.setForeground(new Color(255, 255, 255));
        panel.add(botaoCalcular);
        JTextField display = new JTextField();
        display.setEditable(false);
        display.setBackground(new Color(255, 255,255));
        panel.add(display);

        // ao clicar no botão 'botaoCalcular'
        botaoCalcular.addActionListener(e -> {
            try {
                double preco = Double.parseDouble(campoPreco.getText());
                double desconto = Double.parseDouble(campoDesconto.getText());

                if (desconto < 0 || desconto > 100) {
                    display.setText("A taxa de desconto deve estar entre 0 e 100.");
                } else {
                    double discountAmount = (preco * desconto) / 100;
                    double finalPrice = preco - discountAmount;

                    DecimalFormat df = new DecimalFormat("#.##");
                    display.setText("Preço com Desconto: R$ " + df.format(finalPrice));
                }
            } catch (NumberFormatException ex) {
                display.setText("Valores inválidos. Certifique-se de inserir números válidos.");
            }
        });
    }
}
