# Integración y uso responsable de asistentes de IA en desarrollo backend

El equipo de desarrollo de una empresa fintech está buscando mejorar su eficiencia en el desarrollo de microservicios backend. Han decidido incorporar asistentes de IA como Github Copilot y Amazon CodeWhisperer en su flujo de trabajo. Tu tarea es integrar estas herramientas de manera efectiva y responsable en un proyecto real, reconociendo sus limitaciones y aplicando buenas prácticas.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Desarrollo |
| **Nivel** | advanced-l2 |
| **Tipo** | mixed |
| **Tiempo estimado** | 4-5 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Exploración y selección de herramienta

**Objetivo:** Identificar y seleccionar la herramienta de asistente de IA más adecuada para el proyecto.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Investiga las características y limitaciones de Github Copilot y Amazon CodeWhisperer.
- Evalúa cómo cada herramienta puede integrarse en el flujo de trabajo existente del equipo.
- Selecciona la herramienta que mejor se adapte a las necesidades del proyecto.

**Entregable:** Documento que describe la herramienta seleccionada, sus ventajas y limitaciones, y cómo se integrará en el proyecto.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la facilidad de integración, la calidad de las sugerencias y las políticas de privacidad de cada herramienta.
- Piensa en cómo la herramienta puede mejorar la eficiencia sin comprometer la calidad del código.

</details>

### Fase 2: Integración en el flujo de trabajo

**Objetivo:** Integrar la herramienta seleccionada en el flujo de trabajo del equipo.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Configura la herramienta en tu entorno de desarrollo.
- Identifica puntos en el flujo de trabajo donde la herramienta puede ser más beneficiosa.
- Documenta el proceso de integración y las mejores prácticas para su uso.

**Entregable:** Guía de integración que incluye la configuración de la herramienta, puntos de integración y mejores prácticas.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda documentar cada paso del proceso de integración.
- Considera cómo la herramienta puede ser utilizada de manera responsable para mejorar la eficiencia sin comprometer la calidad del código.

</details>

### Fase 3: Evaluación y ajuste

**Objetivo:** Evaluar el impacto de la herramienta en el flujo de trabajo y ajustar su uso según sea necesario.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Usa la herramienta en varios proyectos y tareas.
- Evalúa el impacto en la eficiencia y calidad del código.
- Identifica áreas de mejora y ajusta el uso de la herramienta en consecuencia.

**Entregable:** Informe de evaluación que incluye el impacto de la herramienta, áreas de mejora y ajustes realizados.

<details>
<summary>Pistas de conocimiento</summary>

- Recopila datos sobre el uso de la herramienta y su impacto en la eficiencia y calidad del código.
- Considera cómo puedes ajustar el uso de la herramienta para maximizar sus beneficios.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un asistente de IA en el contexto del desarrollo de software?
- **paraQueSirve**: ¿Para qué sirve integrar un asistente de IA en el flujo de trabajo de desarrollo?
- **comoSeUsa**: ¿Cómo se usa responsablemente un asistente de IA en el desarrollo de software?
- **erroresComunes**: ¿Cuáles son los errores comunes al integrar un asistente de IA en el flujo de trabajo?
- **queDecisionesImplica**: ¿Qué decisiones implica la integración de un asistente de IA en el flujo de trabajo?

## Criterios de Evaluacion

- Seleccionar y documentar la herramienta de asistente de IA más adecuada.
- Integrar la herramienta en el flujo de trabajo y documentar el proceso.
- Evaluar el impacto de la herramienta y ajustar su uso según sea necesario.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
