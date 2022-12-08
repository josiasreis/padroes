o singleton � um padrao criacional que possibilita ter apenas uma unica instancia do objeto no seu sistema

para a implementa��o ele precisa ter um construtor privado e um metodo para retornar uma unica instancia


o padrao singleton � utilizado apenas se vc precisar de uma unica instancia compartilhada em todo sua aplica��o

o padrao simples possui um problema no caso de mais threads tentarem criar o objeto ao mesmo tempo essa implementacao resolve o problema sincronizando o codigo
de criacao do objeto, mas ainda teremos um problema caso esse objeto rode em maais JVMS

(ASSSUNTOS MAIS AVANCADOS N�O � NECESS�RIO SABER A PRINCIPIO)

PROS

 - uma unica instancia na aplicacao
 - um unico ponto de acesso e manutencao
 - � iniciado somente quando for pedido pela primeira vez
 
CONTRAS
 - viola o principio o S do SOLID que � o principio da responsabilidade unica.
 - requer um tratamento multhread e n�o garante uma unica instancia em jvms separadas, pois o synchronyzed so garante naquela JVM
 - dificulta testes pois os frameworks de testes nao conseguem mockar objetos staticos.