# API de câmbio e cotação
API de moedas disponíveis para consulta e a cotação de tais moedas, dia a dia. 
 
Sistema feito em Spring Boot e tem as seguintes APIs disponibilizadas: 


| Método  |  Uri  |
| ------- | ----- |
|  GET | /moeda  | 
|  GET |  /moeda/{id}  |
|  GET |  /moeda/{simbolo}  |
|  POST | /moeda  | 
|  DELETE | /moeda/{id}  | 
|  GET | /cotacao/{símbolo}   | 
|  POST  |  /cotacao/{símbolo}/{ano}/{mes}/{dia}  | 

O script sql está no arquivo [script.txt](\script.txt)
