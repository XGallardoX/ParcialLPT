%{
#include <stdio.h>

int found_lambda = 0;
%}

%%
lambda {
    found_lambda = 1;
    printf("Encontrado: %s\n", yytext); // Imprime la coincidencia "lambda"
}

.|\n { /* Ignora otros caracteres */ }
%%

int yywrap() {
    return 1;
}

int main(int argc, char *argv[]) {
    if (argc != 2) {
        fprintf(stderr, "Uso: %s archivo.txt\n", argv[0]);
        return 1;
    }

    FILE *archivo = fopen(argv[1], "r");
    if (!archivo) {
        perror("Error al abrir el archivo");
        return 1;
    }

    yyin = archivo;
    yylex();
    fclose(archivo);

    if (found_lambda) {
        printf("ACEPTA\n");
    } else {
        printf("NO ACEPTA\n");
    }

    return 0;
}
