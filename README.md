# Gerenciador de Academia - StarVIP 🏋️‍♂️

Um sistema desenvolvido em Java para simular a gestão diária de uma academia de ginástica. O projeto aplica os conceitos fundamentais de Programação Orientada a Objetos (POO) para modelar as interações entre os funcionários, a infraestrutura e as atividades oferecidas aos alunos.

## 🚀 Funcionalidades e Modelagem

O sistema é composto pelas seguintes entidades principais, localizadas no pacote `br.com.starvip.academia`:
- **Instrutor:** Modelagem dos profissionais da academia, registrando dados como nome, idade e especialidade (ex: Fisioterapia). Inclui métodos para acompanhar alunos e registrar o ponto (entrada/saída).
- **Equipamentos:** Controle do maquinário disponível, armazenando o nome, modelo e ano de fabricação. Possui funcionalidades para registrar a utilização pelos alunos e acionar manutenções.
- **Aulas:** Gerenciamento da grade de atividades (ex: Jumping), horários e professores responsáveis, com métodos para iniciar e lecionar as sessões.

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **Paradigma POO**: Abstração, instanciamento de objetos e passagem de parâmetros (incluindo booleanos para controle de estado, como catraca de ponto e uso de máquinas).

## 📁 Estrutura de Pacotes

O código adota uma arquitetura organizada em pacotes para separar a execução da regra de negócios:
- `br.com.starvip.main`: Contém a classe principal (`Main.java`), responsável por instanciar os objetos e simular a execução do sistema.
- `br.com.starvip.academia`: Contém as classes de domínio da aplicação (`Aulas.java`, `Equipamentos.java`, `Instrutor.java`).

## ▶️ Como executar

Siga os passos abaixo no seu terminal para compilar e rodar o projeto:

**1. Clone este repositório:**
```bash
git clone [https://github.com/YasminEspigolani/ACADEMIA.git](https://github.com/YasminEspigolani/ACADEMIA.git)

```

**2. Navegue até a pasta de código-fonte (`src`):**

```bash
cd ACADEMIA/src

```

**3. Compile as classes do sistema e a classe principal:**

```bash
javac br/com/starvip/academia/*.java br/com/starvip/main/Main.java

```

**4. Execute a aplicação:**

```bash
java br.com.starvip.main.Main

```
