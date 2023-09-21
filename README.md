RELATÓRIO - Situação de aprendizagem 3 (LayoutManager)

INTRODUÇÃO

Primeiramente, é de fundamental importância sabermos a diferença de cada tipo de elemento utilizado 
no decorrer do código. De forma respectiva, estruturamos 3 Layouts no código, sendo eles, o FlowLayout que
Respeita o tamanho preferido dos componentes mesmo quando não houver espaço suficiente no container, e também 
indica a mobilidade visual do elemento; GridLayout, Similar ao FlowLayout, porém, cada componento é alocado em uma célula de
igual tamanho. Permite definir um vetor ou matriz de células nas quais os componentes são alocados; Por último, indicamos o BorderLayout
Layout default para a maioria das aplicações gráficas. Quando se adiciona um componente, é necessário especificar em qual das áreas ele deve ser
adicionado. Ex: add(butOK, BorderLayout.WEST)
Divide um container em cinco regiões:
– BorderLayout.CENTER
– BorderLayout.NORTH
– BorderLayout.EAST
– BorderLayout.SOUTH
– BorderLayout. WEST

Como abordado no decorrer das aulas, a linguagem JAVA assegura que programas sejam extremamente
portáveis, a filosofia da interface visa também ser extremamente adaptável.
É possível definir seus próprios Layouts, mas a linguagem oferece um
conjunto de Layouts básicos que simplificam o trabalho.
A vantagem de um LayoutManager é ressaltada pela apresentação dos componentes, dos quais, se
adaptam quanto ao redimensionamento da janela. A desvantagem é o pouco
domínio que o programador tem da posição dos componentes com alguns
LayoutManagers. O projeto se converge com utilização desses Layouts(FlowLayout, BorderLayout, GridLayout, BoxLayout)
aplicados em 3 calculadoras(IMC, Desconto, Custo de Viagem) JAVA diferentes. 

OBJETIVO

Os objetivos que são almejados com a realização desse programa é, em suma, 
compreender os conceitos de layouts e a importância de escolher o layout adequado
para a organização de elementos em uma interface gráfica. Explorando e praticando 
o uso dos diferentes tipos de layouts disponíveis na biblioteca LayoutManager, 
visando sempre desenvolver nossas habilidades em programação. além disso, é evidente também, 
a capacidade de identificação dos critérios críticos e desejáveis na escolha de layouts para 
projetos de interface gráfica.

DESENVOLVIMENTO

Em prol do desenvolvimento da atividade, foi subdividido a pasta do projeto em 5 arquivos, sendo eles, O App.java,
Calculadora1.java, Calculadora2.java, Calculadora3.java, JFrame.java e o JTabbedPane.java, isando uma maior variedade de dados,
utilizamos os 3 tipos de Layouts em cada uma das calculadoras.
Na 1°calculadora, foi aplicado o FlowLayout do JPanel "tudo" afim de centralizar todos os elementos, dentro do painel "tudo" foi criado outro JPanel,
no qual, foi aplicado o BorderLayout. Este novo painel é identificado como "painel1", com isso, posicionamos melhor os elementos contidos.
Visto que utilizamos o posicionamento 'BorderLayout.NORTH' para o JPanel "cabeçalho", que foi usada como um titulo para a calculadora.
Utilizamos o posicionamento 'BorderLayout.CENTER' para o JPanel "calculadora" , que contém todos os campos e o botão responsável para o funcionamento da calculadora.
O JPanel "calculadora" tem um layout do tipo BorderLayout , porém dentro deste painel temos outro JPanel , "campos" , este que possui um layout do tipo GridLayout para que pudessemos posicionar exatamente os campos de aplicabilidade da calculadora; junto deste painel também temos um JButton "calcular" e um JTextField que funciona como um dispaly para a calculadora.
Para a calculadora 2, foi desenvolvido a mesma metodologia da 1° em relação ao cabeçalho, porém nesta calculadora temos 1 JPanel principal chamado "panel";
que por sua vez, possui um Layout do tipo GridLayout para que obtenhamos uma melhor aplicabilidade, este GridLayout foi caracterizado com 4 linhas e 2 colunas.
Continuamente, a 3° calculadora, assim como a segunda, segue a mesma metodologia da primeira como base. Porém, ela possui somente alguns detalhes visuais, por exemplo,
o JPanel "campos" que possui um layout do tipo GridLayout , nessa contém 3 linhas e 2 colunas ; já na primeira este mesmo JPanel com o mesmo tipo de Layout contém 2 linhas e 2 colunas.

CONCLUSÃO

Perante todos estes aspectos, concluimos que, a aplicabilidade destes elementos de LayoutManager convergem diretamente na parte estrutural do software, portanto, fica evidente a praticidade e eficácia de ser utilizado dentre os códigos em JAVA. Além disso, o grupo pode analisar esses compostos e suas respectivas funcionalidades, desenvolvendo e aplicando esses conceitos nas 3 calculadoras. 
