# ⛽ App Consumo Combustível

Um aplicativo Android desenvolvido em **Java + XML** no **Android Studio**, para controle e cálculo de consumo de combustível (litros, valor, distância, média).  
Projeto criado como parte dos estudos de **desenvolvimento mobile nativo** e para praticar lógica de cálculo aplicada a veículos.

---

## 🧠 Sobre o Projeto

O App Consumo Combustível é voltado para quem quer acompanhar o desempenho do veículo e saber quanto ele está gastando de combustível por quilômetro ou por viagem.

**Funcionalidades incluem:**
- Inserção de distância percorrida e volume de combustível consumido  
- Cálculo da média (Km/l ou l/Km)  
- Exibição de resultado na tela  
- Interface simples e intuitiva  

---

## 🛠️ Tecnologias Utilizadas

| Categoria         | Ferramenta                         |
|-------------------|------------------------------------|
| IDE               | Android Studio                    |
| Linguagem         | Java                              |
| Layouts           | XML                               |
| Versão mínima Android | API 21 (Android 5.0)             |
| Estrutura de UI   | ConstraintLayout / LinearLayout   |

---

## 📱 Estrutura do Projeto

```
app/
 ├── java/
 │    └── br/ulbra/appconsumocombustivel/
 │         └── MainActivity.java
 ├── res/
 │    ├── layout/
 │    │     └── activity_main.xml
 │    ├── drawable/
 │    │     └── (ícones ou imagens do app)
 │    └── values/
 │          └── strings.xml
 └── AndroidManifest.xml
```

---

## 📊 Lógica de Cálculo de Consumo

```java
double km = Double.parseDouble(editDistancia.getText().toString());
double litros = Double.parseDouble(editLitros.getText().toString());
double mediaKmPorLitro = km / litros;
textResultado.setText("Média: " + mediaKmPorLitro + " km/l");
```

**Exemplo com custo:**

```java
double custoLitro = Double.parseDouble(editCusto.getText().toString());
double custoPorKm = (litros * custoLitro) / km;
textCusto.setText("Custo por km: R$ " + custoPorKm);
```

---

## 🏗️ Funcionalidades Implementadas

✅ Inserção de distância e combustível consumido  
✅ Cálculo automático da média de consumo  
✅ Exibição do resultado na interface  
✅ Interface simples e funcional  
✅ Código comentado para entendimento  

---

## 💡 Possíveis Melhorias

- Adicionar histórico de viagens com SQLite  
- Criar gráficos de desempenho (MPAndroidChart)  
- Tema claro/escuro  
- Exportar relatório em PDF/CSV  
- Adicionar animações e ícones personalizados  

---

## 👩‍💻 Autor

**Nome:** *Laerte Ferraz da Silva Júnior*  
**Instituição:** *Curso Técnico em Informática – Escola Ulbra São Lucas*  
**Disciplina:** *Desenvolvimento Mobile Android*  
**Professor:** *Jeferson Leon*  

---

## 📚 Licença

Projeto desenvolvido para fins **educacionais**.  
Livre para uso e modificação, desde que mantidos os créditos ao autor.

---

> “A melhor forma de aprender é construindo. Então... bora codar!”
