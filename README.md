## Documentação da API
### API Rest de Consulta de E-mails Enviados
Este projeto consiste em um microsserviço de *API Rest* desenvolvida em *Java 17* no ecossistema *Spring* para consultar os e-mails enviados no microsserviço de disparo de e-mail.

Para acessar o serviço de disparo de e-mail:

[![GitHub license](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/HttpsWinicius/microsservicos-sendemail)

O endpoint principal é denominado **/view/email?email_id=**.


## Instalação

Configurações Iniciais

Antes de começar a usar a API, certifique-se de que as seguintes dependências estão instaladas:

```bash
  Java JDK 8 ou superior
  Maven
```

### Clone o repositório:

```bash
git clone https://github.com/HttpsWinicius/microsservicos-sendemail.git
```
### Navegue até o diretório do projeto:
Compile o projeto com o Maven:

```bash
mvn clean install
```

### Execute a aplicação:

Na sua IDE de preferência

```bash
Run EmailApplication
A API estará em execução em http://localhost:8080.
```
#### Disparar um e-mail

```http
  GET /view/email?email_id=
```

| Parâmetro   | Tipo       | Descrição                                                               |
| :---------- | :--------- | :---------------------------------------------------------------------  |
| `email_id`  | `int`      | **Obrigatório**. O id do e-mail retornado no seding-email sending-email |

Certifique-se de substituir os valores nos parâmetros de exemplo pelos seus próprios valores.

#### Retorna o item

    "ownerRef": Pessoa que enviou o e-mail,
    "emailFrom": E-mail remetende,
    "emailTo": E-mail destinatario,
    "subject": Assunto do e-mail,
    "text": Corpo do e-mail,
    "sendDateEmail": Data de envio,
    "statusEnvio": Status do disparo,


## Licença

Este projeto está licenciado sob a *MIT License*.

## Por Winicius Souza

[![GitHub license](https://img.shields.io/badge/linkedin-green.svg)](https://www.linkedin.com/in/winicius-dev/)
