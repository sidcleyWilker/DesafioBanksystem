# DesafioBanksystem

url: http://localhost:8080/DesafioBankSystem/rest/clock/pegarAngulo

url para teste com parametros: http://localhost:8080/DesafioBankSystem/rest/clock/pegarAngulo?hora=2&min=47



Desafio:
Escreva um programa onde, dado um determinado horário (hora/minutos) seja capaz de calcular o ângulo entre os 2 ponteiros do relógio.

Requisitos do desafio:
- O movimento dos ponteiros ocorrem de minuto em minuto;
- O resultado não deverá ser recalculado caso a mesma consulta seja executada duas vezes;
- Deve ser retornado sempre o menor ângulo.


Tecnologias:
 - Java 1.8;
 - Maven;
 - Container, Toncat 9.0;
 - Interface REST;
 - Content-Type de retorno, JSON.

Testado com a ferramenta #SoapUI

![teste](https://user-images.githubusercontent.com/7070744/32473303-a9cf8ffa-c345-11e7-8ad8-5c01939c7e8b.png)


Caso seja passado hora ou minuto invalido o retorno sera null ou nada.
Ex de hora/ min invalidos: hora < 1 ou hora > 12 e min < 0 ou min > 60
