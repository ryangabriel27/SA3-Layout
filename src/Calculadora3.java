import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

    public class Calculadora3 extends JPanel {
    public Calculadora3() {
        super();
        // Cálculo de gasto de viagem
        // consumo total = distancia percorrida x consumo do carro
        // custo total = consumo total x valor da Combustivel
        JPanel tudo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        tudo.setSize(150, 300);
        this.add(tudo);
        this.setBackground(new Color(207, 141, 201));
        tudo.setBackground(new Color(227, 161, 221));
        
        JPanel painel1 = new JPanel(new BorderLayout(0,2));
        tudo.add(painel1);
        painel1.setBackground(new Color(227, 161, 221));

        JPanel cabecalho = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cabecalho.add(new JLabel("Calculadora de custo de viagem"));
        cabecalho.setBackground(new Color(227, 161, 221));
        painel1.add(cabecalho, BorderLayout.NORTH);

        JPanel calculadora = new JPanel(new BorderLayout(0,3));
        painel1.add(calculadora,BorderLayout.CENTER);

        JPanel campos = new JPanel(new GridLayout(3, 2));
        calculadora.add(campos, BorderLayout.NORTH);

        campos.add(new JLabel("Insira a distância (em km):"));
        campos.setBackground(new Color(227, 161, 221));
        JTextField campoDistancia = new JTextField();
        campos.add(campoDistancia);

        campos.add(new JLabel("Insira o valor do combustível: R$"));
        JTextField campoValorCombustivel = new JTextField();
        campos.add(campoValorCombustivel);

        campos.add(new JLabel("Insira o consumo do seu carro:"));
        JTextField campoConsumoCarro = new JTextField();
        campos.add(campoConsumoCarro);

        JButton calcular = new JButton("Calcular");
        calcular.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 10), 4));
        calcular.setBackground(new Color(150, 92, 146));
        calcular.setForeground(new Color(255,255,255));
        calculadora.add(calcular, BorderLayout.CENTER);

        JTextField display = new JTextField();
        display.setEditable(false);
        display.setBackground(new Color(150, 92, 146));
        display.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 10), 4));
        display.setForeground(new Color(255,255,255));
        calculadora.add(display,BorderLayout.SOUTH);
        
        calculadora.setBackground(new Color(227, 161, 221));
        calcular.addActionListener(e -> {
            double consumoTotal = 0;
            double custoTotal = 0;
            try {
                if (campoDistancia.getText() != "" && campoValorCombustivel.getText() != "") {
                double distancia = Double.parseDouble(campoDistancia.getText());
                double consumoCarro = Double.parseDouble(campoConsumoCarro.getText());
                double valorCombustivel = Double.parseDouble(campoValorCombustivel.getText());

                consumoTotal = distancia / consumoCarro;
                custoTotal = consumoTotal * valorCombustivel;
                DecimalFormat formatoDecimal = new DecimalFormat("#.##");
                display.setText("O custo total será de R$ "+formatoDecimal.format(custoTotal));
                
                }
            } catch (Exception i){
                display.setText("Preencha os campos corretamente.");
            }
            
            
            campoDistancia.setText("");
            campoValorCombustivel.setText("");
            campoConsumoCarro.setText("");
        });
    }
}