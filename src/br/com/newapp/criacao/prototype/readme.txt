padrao de criacao que permite clonar objetos complexos sem acoplamento a suas classes especificas

* objetos prototipos tem que ter uma interface comum que permita copias, mesmo que suas classes concretas sejam desconhecidas
objetos prototipos podem produzir copias completas mesmo que atributos sejam privados, pois objetos da mesma classe podem acessar objetos privados um do outro.

prototipos sao objetos diferentes mas com campos identicos

quando implementar ? 
 quando tenho um objeto com muitos campos padrao, entao ao inves de instancia um novo objeto complexo faco um clone desse objeto.

como implementar na teoria ?

 1 - criar uma interface comum com um metodo clone
 2 - criar classes concretas clonaveis 