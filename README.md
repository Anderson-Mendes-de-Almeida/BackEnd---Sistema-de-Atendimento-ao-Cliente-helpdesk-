Essa é a primeira parte do sistema HelpDesk, esse é o "Backend".

Esse sistema de chamados terá o Backend - Frontend - Base de Dados.

Acabo de desenvolver o Back End -API RESTFULL em java utilizando framework Spring Boot.
Sistema CRUD.
Utilizamos o Banco de Dados Postgresql juntamente com Postman para ir testando as chamadas das APIS, o sistema pode ser usado por cliente ou atendente, é usado UUID para maior segurança, o sistema será publicado na AWS assim que terminar.

O Sistema conta com 4 Entidades "Tabelas"

 *Users 
*Called 
*Attachments 
*Interaction 

Depencencies: 
*Mapstruct => tive problemas de conflitos com Mapstruct e Lombok, mas resolvido
*Lombok 
*Spring Web =>inclui RestFull - Spring MVC 
*Spring Data 
*Spring Security 
*PostgreSql Driver =>JDBC 
*FlyWay Migration => Version control for your database so you can migrate from any version (incl. an empty database) to the latest version of the schema.

Obs: Spring Banner gerenation => facilitando em saber qual API está subindo.
