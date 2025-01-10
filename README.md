# Conversor de Monedas

Es una aplicación desarrollada en Java, para convertir valores entre diferentes monedas, utilizando la API de ExchangeRate.

---

## Convesiones Disponibles

- La conversión se puede realizar entre las siguientes monedas:
 * Dólar ==> Peso Chileno
 * Peso Chile ==> Dólar
 * Dólar ==> Peso Argentino
 * Peso Argentino ==> Dólar
 * Dólar ==> Real Brasileño
 * Real Brasileño ==> Dólar
  

## Tecnologías Utilizadas

- **Java 17**
- **Gson**: Para parsear JSON.
- **Java HTTP Client, Java HTTP Request y Java HTTP Response**: Para crear un cliente, crear la petición y capturar la respuesta de solicitudes a la API.
- **API de ExchangeRate**: API sugerida en Challenge de Alura para obtener las equivalencias de tasas de cambio en tiempo real.


## Requisitos Previos

1. **Java instalado**: Asegúrate de tener Java 11 o superior instalado en tu máquina.
2. **Dependencia Gson**:
   - Descarga Gson desde [Maven Central](https://mvnrepository.com/artifact/com.google.code.gson/gson).
   - Gson debe agregarse la referencia al módulo .JAR en el proyecto e importarse en la clase que se utiliza.

---

## Cómo Usarlo

1. Ejecuta el programa.
2. Seleccionar desde el menú la opción de conversión deseada dentro de las disponibles
3. Ingresar el monto a convertir tomando en consideración que debe ser un valor correspondiente a la moneda de origen,(Los valores son pon decimales)
4. El programa mostrará la conversión en la consola.


-----------------------------------------------------------------------------------------------


## Desarrolador
Creado por Cristian Eduardo Oyarzo, Chile.








