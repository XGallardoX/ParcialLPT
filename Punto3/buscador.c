#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LINE 1024

int contarCoincidencias(FILE *archivo, const char *clave) {
    char linea[MAX_LINE];
    int count = 0;
    size_t len = strlen(clave);

    while (fgets(linea, MAX_LINE, archivo) != NULL) {
        char *pos = linea;
        while ((pos = strstr(pos, clave)) != NULL) {
            count++;
            pos += len;
        }
    }

    return count;
}

int main(int argc, char *argv[]) {
    if (argc != 3) {
        fprintf(stderr, "Uso: %s archivo clave\n", argv[0]);
        return 1;
    }

    const char *nombreArchivo = argv[1];
    const char *clave = argv[2];

    FILE *archivo = fopen(nombreArchivo, "r");
    if (archivo == NULL) {
        perror("Error al abrir el archivo");
        return 1;
    }

    int coincidencias = contarCoincidencias(archivo, clave);
    fclose(archivo);

    printf("%s se repite %d veces en el texto.\n", clave, coincidencias);
    return 0;
}
