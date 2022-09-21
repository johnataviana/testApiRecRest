# testApiRecRest 
Nivelamento de conhecimento de API

https://reqres.in/ - Documentação

URI = https://reqres.in/api/

1 - Realizar ao menos um script de cobertura de testes em Rest-Assured da API 
2 - Escrever a tecnica utilizada para cobertura do cenário de testes utilizado

Caso de Teste
 
Ferramenta: Eclipse
Tipo: Modelo BDD
API: reqres.in/api
Tecnica de Teste: Teste Caixa Preta
Linguagem: Java

HISTORIA DE USUARIO - reqres.in/api

COMO QA
QUERO realizar uma consulta
PARA verificação de usuario por ID

Cenário 1 - <Validar consulta de usuario por ID> - <Válido>: 
Dado que esteja acessando a ReqRes API 
E realize uma consulta de usuario por ID_2
E preencher os campos necessário para consulta
Quando processar a API
Então receberei o código de retorno "200"
E terei uma consulta realizada com sucesso

Evidencia Response body

{
  "data": {
    "id": 2,
    "email": "janet.weaver@reqres.in",
    "first_name": "Janet",
    "last_name": "Weaver",
    "avatar": "https://reqres.in/img/faces/2-image.jpg"
  },
  "support": {
    "url": "https://reqres.in/#support-heading",
    "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
  }
}


Cenário 2 - <Validar consulta de usuario por ID inexistente> - <Invalido>: 
Dado que esteja acessando a ReqRes API 
E realize uma consulta de usuario por ID_50
E preencher os campos necessário para consulta
Quando processar a API
Então receberei o response status de 404
E terei uma consulta com erro

Evidencia Response body

404
Undocumented
Error: response status is 404

Response body
Download
{}
