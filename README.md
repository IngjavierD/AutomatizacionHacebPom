# Automatización de Pruebas con Serenity y Metodología POM

Este repositorio contiene la automatización de pruebas para el proyecto Automatización creacion de Usuario en Haceb. Se utiliza Serenity con la metodología de Page Object Model (POM) para crear una solución eficiente y mantenible para las pruebas automatizadas.

---
## Estructura del Proyecto

- **src/main/java**: Contiene el código fuente principal.
  - **[paquete].pages**: Define las páginas del sitio web con la implementación de Page Objects.
  - **[paquete].core**: Contiene clases con métodos centralizados para acciones comunes y optimización del desarrollo.
  - **[paquete].steps**: Contiene clases de pasos que definen las acciones realizadas en las pruebas.
  - **[paquete].utils**: Utilidades, configuraciones y clases de ayuda.

- **src/main/resources**: Archivos de recursos, como archivos de configuración y datos de prueba.

- **src/test/java**: Contiene los archivos de prueba.
  - **[paquete].features**: Define las características de las pruebas BDD escritas en Gherkin.
  - **[paquete].stepsdefinitions**: Clases que mapean pasos de Gherkin a métodos de prueba.

---

## Configuración del Proyecto

Asegúrate de tener las dependencias y configuraciones adecuadas:

```groovy
dependencies {
    implementation 'net.serenity-bdd:serenity-core:3.6.0'
    implementation 'net.serenity-bdd:serenity-junit:3.6.0'
    // Otras dependencias...
}

plugins {
    id 'java'
    id 'net.serenity-bdd.aggregator' version '2.0.71'
}
```


---

## Informes de Serenity

Después de ejecutar las pruebas, puedes encontrar los informes de Serenity en `target/site/serenity/index.html`.

---

## Datos de Prueba

Los datos de prueba se toman desde un archivo Excel ubicado en `src/main/resources/Data/Data.xlsx`.

---

## Contribuciones

Si deseas contribuir al proyecto, siéntete libre de crear un fork y enviar un pull request. Agradecemos cualquier contribución.
