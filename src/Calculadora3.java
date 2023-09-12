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
        JPanel painel1 = new JPanel(new BorderLayout());
        tudo.add(painel1);
        painel1.add(new JLabel("Calculadora de custo de viagem"), BorderLayout.NORTH);
        JPanel calculadora = new JPanel(new BorderLayout());
        painel1.add(calculadora,BorderLayout.CENTER);
        JPanel campos = new JPanel(new GridLayout(3, 2));
        calculadora.add(campos, BorderLayout.NORTH);
        campos.add(new JLabel("Insira a distância (em km):"));
        JTextField campoDistancia = new JTextField();
        campos.add(campoDistancia);
        campos.add(new JLabel("Insira o valor do combustível: R$"));
        JTextField campoValorCombustivel = new JTextField();
        campos.add(campoValorCombustivel);
        campos.add(new JLabel("Insira o consumo do seu carro:"));
        JTextField campoConsumoCarro = new JTextField();
        campos.add(campoConsumoCarro);
        JButton calcular = new JButton("Calcular");
        calculadora.add(calcular, BorderLayout.CENTER);
        JTextField display = new JTextField();
        display.setEditable(false);
        calculadora.add(display,BorderLayout.SOUTH);
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
                display.setText("O custo total será de R$"+formatoDecimal.format(custoTotal));
                
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