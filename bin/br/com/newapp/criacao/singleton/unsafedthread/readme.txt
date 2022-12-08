o singleton é um padrao criacional que possibilita ter apenas uma unica instancia do objeto no seu sistema

para a implementação ele precisa ter um construtor privado e um metodo para retornar uma unica instancia


o padrao singleton é utilizado apenas se vc precisar de uma unica instancia compartilhada em todo sua aplicação


(ASSSUNTOS MAIS AVANCADOS NÃO É NECESSÁRIO SABER A PRINCIPIO)

PROS

 - uma unica instancia na aplicacao
 - um unico ponto de acesso e manutencao
 - é iniciado somente quando for pedido pela primeira vez
 
CONTRAS
 - viola o principio o S do SOLID que é o principio da responsabilidade unica.
 - requer um tratamento multhread e não garante uma unica instancia em jvms separadas, pois o synchronyzed so garante naquela JVM
 - dificulta testes pois os frameworks de testes nao conseguem mockar objetos staticos.