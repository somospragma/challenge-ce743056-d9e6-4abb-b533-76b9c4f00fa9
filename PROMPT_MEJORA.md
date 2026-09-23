# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología Java, Advanced

### Brecha de conocimiento
Ha trabajado con un asistente de IA (Github Copilot / Amazon CodeWhisperer / etc). Debe comprender cómo integrar estas herramientas en su flujo de desarrollo, reconocer sus limitaciones, y aplicarlas de manera responsable y efectiva en proyectos reales.

### Misión / candidato
Candidata con experiencia avanzada en desarrollo backend con Java, trabajando en equipos colaborativos.

### Reto
- Tema: Desarrollo
- Seniority: advanced-l2
- Tipo: mixed
- Título: Integración y uso responsable de asistentes de IA en desarrollo backend
- Tiempo estimado: 4-5 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Exploración y selección de herramienta — objetivo: Identificar y seleccionar la herramienta de asistente de IA más adecuada para el proyecto. — entregable (NO resolver): Documento que describe la herramienta seleccionada, sus ventajas y limitaciones, y cómo se integrará en el proyecto.
- Fase 2: Integración en el flujo de trabajo — objetivo: Integrar la herramienta seleccionada en el flujo de trabajo del equipo. — entregable (NO resolver): Guía de integración que incluye la configuración de la herramienta, puntos de integración y mejores prácticas.
- Fase 3: Evaluación y ajuste — objetivo: Evaluar el impacto de la herramienta en el flujo de trabajo y ajustar su uso según sea necesario. — entregable (NO resolver): Informe de evaluación que incluye el impacto de la herramienta, áreas de mejora y ajustes realizados.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación o descripciones sin código, genera los archivos
correspondientes sin aplicar análisis de compilación
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: pom.xml ===
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.fintech</groupId>
  <artifactId>ia-integration</artifactId>
  <version>1.0.0</version>
  <name>IA Integration</name>
  <description>Project for integrating AI assistants in backend development</description>
  <properties>
    <java.version>21</java.version>
    <spring-boot.version>3.4.0</spring-boot.version>
  </properties>
  <dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-webflux</artifactId>
      <version>${spring-boot.version}</version>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
      <version>${spring-boot.version}</version>
    </dependency>
    <dependency>
      <groupId>com.github.copilot</groupId>
      <artifactId>copilot-java</artifactId>
      <version>1.0.0</version>
      <scope>dev</scope>
    </dependency>
    <dependency>
      <groupId>com.amazon.codewhisperer</groupId>
      <artifactId>codewhisperer-java</artifactId>
      <version>1.0.0</version>
      <scope>dev</scope>
    </dependency>
  </dependencies>
  <build>
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <version>${spring-boot.version}</version>
      </plugin>
    </plugins>
  </build>
</project>

// === ARCHIVO: src/main/java/com/fintech/application/IntegrationService.java ===
package com.fintech.application;

import com.fintech.domain.Integration;
import com.fintech.infrastructure.IAAssistantClient;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {
  private final IAAssistantClient iaAssistantClient;

  public IntegrationService(IAAssistantClient iaAssistantClient) {
    this.iaAssistantClient = iaAssistantClient;
  }

  public Integration integrateTool(String toolName) {
    return iaAssistantClient.integrate(toolName);
  }
}

// === ARCHIVO: src/main/java/com/fintech/domain/Integration.java ===
package com.fintech.domain;

import java.time.LocalDate;

public record Integration(String toolName, LocalDate integrationDate, String status) {}

// === ARCHIVO: src/main/java/com/fintech/infrastructure/IAAssistantClient.java ===
package com.fintech.infrastructure;

import com.fintech.domain.Integration;
import org.springframework.stereotype.Component;

@Component
public class IAAssistantClient {
  public Integration integrate(String toolName) {
    // Simulate integration process
    return new Integration(toolName, LocalDate.now(), "Integrated");
  }
}

// === ARCHIVO: src/main/resources/application.yml ===
spring:
  application:
    name: ia-integration

// === ARCHIVO: docs/tool_selection.md ===
# Herramienta de Asistente de IA Seleccionada

## Descripción
Hemos seleccionado Github Copilot como la herramienta de asistente de IA para nuestro proyecto.

## Ventajas
- Sugerencias de código precisas y relevantes.
- Integración sencilla con IDEs populares.

## Limitaciones
- Dependencia de la calidad del código existente para generar sugerencias.
- Potenciales problemas de privacidad con el uso de datos de entrenamiento.

## Integración en el Proyecto
La herramienta se integrará en nuestro flujo de trabajo de desarrollo para mejorar la eficiencia y calidad del código.

// === ARCHIVO: docs/integration_guide.md ===
# Guía de Integración

## Configuración
1. Instala la extensión de Github Copilot en tu IDE.
2. Configura las preferencias de la herramienta según tus necesidades.

## Puntos de Integración
- Durante la escritura de código para obtener sugerencias.
- En la revisión de código para identificar mejoras potenciales.

## Mejores Prácticas
- Usa las sugerencias como base y revisa el código generado.
- Documenta cada paso del proceso de integración.

// === ARCHIVO: docs/evaluation_report.md ===
# Informe de Evaluación

## Impacto
La herramienta ha mejorado significativamente la eficiencia en la escritura de código.

## Áreas de Mejora
- Mejorar la calidad de las sugerencias en contextos específicos.
- Ajustar la configuración para obtener sugerencias más relevantes.

## Ajustes Realizados
- Configuración de preferencias personalizadas para obtener sugerencias más precisas.
- Documentación de cada paso del proceso de integración para futuras referencias.

```
