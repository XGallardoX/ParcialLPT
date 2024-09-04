grammar Trigonometricas;

// Reglas
prog: expr+ EOF;

expr: FUNCION '(' NUMERO ')' ;

// Tokens
FUNCION: 'Sin' | 'Cos' | 'Tan';
NUMERO: [0-9]+ ('.' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;
