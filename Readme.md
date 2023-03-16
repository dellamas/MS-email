Microservice Email

Microservice Email é uma aplicação que possibilita o envio de emails através de uma API REST.
Tecnologias utilizadas

    Java
    Spring Boot
    Spring Data JPA
    Spring Mail
    Lombok

Configuração do ambiente

    É necessário ter o Java 11 e o Maven instalados.
    Configure as credenciais de envio de email no arquivo application.properties.

Como executar

    Clone o repositório para sua máquina.
    Abra o terminal na pasta do projeto.
    Execute o comando mvn spring-boot:run.
    A aplicação estará disponível na porta 8080.

Como utilizar

    Para enviar um email, faça uma requisição POST para a rota /sending-email com os seguintes campos no corpo da requisição:
        OwnerRef: referência para identificar o dono do email.
        emailFrom: email do remetente.
        emailTo: email do destinatário.
        Subject: assunto do email.
        text: conteúdo do email.

    Exemplo de requisição utilizando cURL:
    
    curl --location --request POST 'http://localhost:8080/sending-email' \
--header 'Content-Type: application/json' \
--data-raw '{
    "OwnerRef": "Meu dono",
    "emailFrom": "meuemail@gmail.com",
    "emailTo": "emaildestinatario@gmail.com",
    "Subject": "Assunto do email",
    "text": "Conteúdo do email"
}'

    
