# Distribuidora de Alimentos - Aplicación Java

## Descripción
Este proyecto consiste en el desarrollo de una aplicación en Java que permite calcular automáticamente el costo de despacho a domicilio, según reglas de negocio:

- Compras mayores a $50,000 → Despacho gratuito (dentro de 20 km).
- Compras entre $25,000 y $49,999 → Tarifa de $150 por km.
- Compras menores a $25,000 → Tarifa de $300 por km.

Los usuarios pueden registrarse con su cuenta Gmail (simulado).  
El desarrollo se hizo **sin IDE**, usando línea de comandos (`javac` y `java`).

## Archivos incluidos
- `README_Codigo.md`: Código fuente explicado línea por línea.
- `REQUERIMIENTOS.md`: Requerimientos funcionales y no funcionales.
- `HISTORIAS_USUARIO.md`: Historias de usuario.
- `CRONOGRAMA.md`: Cronograma inicial.
- `DatosVehiculo.java`: Código Java compilable.

## Cómo ejecutar
1. Compilar el programa:
   ```bash
   javac DatosVehiculo.java
