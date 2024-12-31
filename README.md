# Conversor de Monedas

![Conversor de Monedas](https://via.placeholder.com/800x200?text=Conversor+de+Monedas)

## Descripción del Proyecto
El **Conversor de Monedas** es una aplicación en Java diseñada para realizar conversiones entre diversas divisas de manera sencilla y eficiente. La aplicación consume una API de tasas de cambio para obtener los valores más recientes y precisos de conversión.

El sistema permite al usuario elegir entre diferentes opciones de conversión y, tras ingresar la cantidad deseada, muestra el resultado calculado en tiempo real. Esta herramienta es ideal para estudiantes y desarrolladores que desean aprender sobre consumo de APIs, manipulación de datos JSON y programación interactiva en consola.

---

## Funcionalidades
- Conversión entre diferentes divisas:
    - MXN a USD y viceversa.
    - ARS a USD y viceversa.
    - BRL a USD y viceversa.
    - COP a USD y viceversa.
- Interfaz interactiva en consola.
- Actualización en tiempo real de las tasas de cambio mediante consumo de API.
- Validación de entradas del usuario para evitar errores.
- Manejo de errores al consumir la API.

---

## Tecnologías y Librerías Utilizadas
- **Java 21**: Lenguaje principal.
- **Gson 2.11.0**: Para analizar y procesar respuestas JSON.
- **HttpClient**: Para realizar solicitudes HTTP.
- **API de Exchange Rate**: Fuente de las tasas de cambio.

---

## Estructura del Proyecto
1. **Principal.java**:
    - Contiene el flujo principal del programa.
    - Despliega el menú interactivo.
    - Valida las entradas del usuario.
    - Invoca los métodos de la clase `ConvertirMoneda`.

2. **ConvertirMoneda.java**:
    - Gestiona las solicitudes a la API de Exchange Rate.
    - Realiza las conversiones de divisas.
    - Muestra los resultados al usuario.

---

## Ejemplo de Uso
### Menú Interactivo
```
***************************************************
Bienvenido al conversor de monedas lista de divisas

||---------  DE DIVISAS A --> DOLAR  ------------||
1) MXN --> USD    Peso Mexicano   / Dolar Estadounidense
2) ARS --> USD    Peso Argentino  / Dolar Estadounidense
3) BRL --> USD    Real Brasileño  / Dolar Estadounidense
4) COP --> USD    Peso Colombiano / Dolar Estadounidense
||---------  DE DOLAR A --> DIVISAS  ------------||
5) USD --> MXN    Dolar Estadounidense / Peso Mexicano
6) USD --> ARS    Dolar Estadounidense / Peso Argentino
7) USD --> BRL    Dolar Estadounidense / Real Brasileño
8) USD --> COP    Dolar Estadounidense / Peso Colombiano

9) SALIR
***************************************************
Elija una opción válida:
```

### Conversión Ejemplo
Entrada:
```
1
Ingrese la cantidad que desea convertir: 1000
```
Salida:
```
$1000.00 MXN --equivale a--> $50.00 USD
```

---

## Aprendizajes y Habilidades Desarrolladas
1. **Consumo de APIs REST:** Uso de `HttpClient`, `HttpRequest`, `HttpResponse` y `JsonObject`manejo de solicitudes HTTP en Java.
2. **Análisis de JSON:** Descomposición de respuestas JSON mediante Gson.
3. **Programación Modular:** Uso de clases separadas para mantener el código limpio y escalable.
4. **Validación de Entradas:** Implementación de controles para evitar datos inválidos.
5. **Interacción en Consola:** Creación de menús dinámicos y amigables para el usuario.
6. **Gestión de Errores:** Manejo adecuado de excepciones al consumir APIs.

---

## Capturas de Pantalla
### Menú Interactivo
![menu.jpg](https://github.com/nestorsauceda/conversor-monedas/blob/main/src/com/aluraprojects/img/menu.jpg?raw=true)
)

### Resultado de Conversión
![resultado.jpg](https://github.com/nestorsauceda/conversor-monedas/blob/main/src/com/aluraprojects/img/resultado.jpg?raw=true)
)

---

## Instalación y Ejecución
1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/nestorsauceda/conversor-monedas.git
   ```
2. **Abrir en tu IDE favorito:** Importa el proyecto en IntelliJ IDEA, Eclipse o cualquier otro entorno compatible con Java.
3. **Agregar librerías:** Asegúrate de que Gson esté incluido en tu archivo `pom.xml` o como dependencia en tu proyecto.
4. **Ejecutar el proyecto:** Corre la clase `Principal` para iniciar la aplicación.

---

## Autor
Desarrollado por Nestor Sauceda.

**Contacto:**
- GitHub: https://github.com/nestorsauceda
- email: nasp41@gmail.com

---

¡Gracias por revisar este proyecto! 😊

