
---

# 📱 iPhone Simulator em Java

Bem-vindo ao **iPhone Simulator**! Este projeto é uma simulação simplificada de um iPhone utilizando Java, projetada para rodar no console. O sistema oferece funcionalidades básicas de um iPhone, incluindo um reprodutor de música, um telefone e um navegador de internet, tudo de forma modular e interativa, feito por mim 🙋🏻‍♂️ Rian Gabriel.

---

## 🛠 Funcionalidades

### Música
- **Selecionar Música**: Escolha a faixa que deseja ouvir.
- **Reproduzir**: Inicie a reprodução da faixa selecionada.
- **Pausar**: Pause a música em reprodução.

### Telefone
- **Ligar**: Faça uma chamada para um número específico.
- **Atender**: Atenda uma chamada recebida.
- **Correio de Voz**: Acesse o correio de voz.

### Navegador de Internet
- **Exibir Página**: Mostre uma página web específica.
- **Adicionar Nova Aba**: Abra uma nova aba com uma página web.
- **Atualizar Página**: Atualize a página atual.

---

## 🚀 Como Usar

1. **Clone o Repositório**
   ```bash
   git clone https://github.com/seu-usuario/iphone-simulator.git
   cd iphone-simulator
   ```

2. **Compile o Código**
   ```bash
   javac -d bin src/iphone/device/*.java src/iphone/music/*.java src/iphone/call/*.java src/iphone/browser/*.java src/iphone/iPhone.java
   ```

3. **Execute o Programa**
   ```bash
   java -cp bin iphone.iPhone
   ```

4. **Interaja com o Menu**
   O menu principal permitirá que você escolha entre o reprodutor de música, o telefone e o navegador de internet. Navegue pelos submenus para usar as funcionalidades disponíveis.

---

## 🖥 Estrutura do Projeto

- **Pacote `device`**: Contém a classe base `ElectronicDevice` com funcionalidades comuns a todos os dispositivos.
- **Pacote `music`**: Inclui a classe `MusicPlayer` para controle da música.
- **Pacote `call`**: Abriga a classe `Phone` para funcionalidades de chamadas.
- **Pacote `browser`**: Contém a classe `WebBrowser` para navegação na web.
- **Pacote `iphone`**: Integra todas as funcionalidades e fornece a interface do usuário através do console.

---

## 📚 Conceitos de POO Utilizados

- **Encapsulamento**: Cada classe gerencia suas próprias propriedades e métodos.
- **Herança**: `ElectronicDevice` é a classe base para `MusicPlayer`, `Phone` e `WebBrowser`.
- **Polimorfismo**: Métodos comuns como `turnOn()` e `turnOff()` são implementados nas classes derivadas.
- **Abstração**: A classe base `ElectronicDevice` abstrai as operações básicas de dispositivos eletrônicos.

---

## 💡 Desafios e Aprendizados

Durante o desenvolvimento deste projeto, o maior desafio foi garantir a integração coesa de todas as funcionalidades. A aplicação dos princípios de Programação Orientada a Objetos (POO) foi fundamental para a estruturação modular e reutilizável do código. Este projeto forneceu uma excelente oportunidade para praticar a criação de sistemas orientados a objetos e a importância da modularização no desenvolvimento de software.

---

## 🎨 Tema Apple

Inspirado pelo design elegante e intuitivo dos produtos da Apple, este projeto visa refletir a simplicidade e a funcionalidade dos dispositivos iPhone em uma forma acessível e interativa. Esperamos que você aprecie esta simulação tanto quanto nós gostamos de desenvolvê-la!

---
