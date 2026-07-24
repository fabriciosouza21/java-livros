
# 📚 Java Language Changes – Guia Rápido (Leitura ~≈ 8 min)

Este guia resume as **principais features estáveis** introduzidas a partir do Java 9 até o Java 21.
Para **features em _preview/incubator_**, apenas as mais impactantes são citadas.

---

## Sumário
- [📚 Java Language Changes – Guia Rápido (Leitura ~≈ 8 min)](#-java-language-changes--guia-rápido-leitura-8min)
	- [Sumário](#sumário)
		- [☕ Java 9 (2017)](#-java92017)
		- [☕ Java 10 (2018)](#-java102018)
		- [☕ Java 11 (2018) — LTS](#-java112018--lts)
			- [🎯 Principais Features](#-principais-features)
			- [🔨 Limpeza da Plataforma](#-limpeza-da-plataforma)
				- [Exemplos Rápidos](#exemplos-rápidos)
		- [☕ Java 12 (2019)](#-java122019)
		- [☕ Java 13 (2019)](#-java132019)
		- [☕ Java 14 (2020)](#-java142020)
		- [☕ Java 15 (2020)](#-java152020)
		- [☕ Java 16 (2021)](#-java162021)
		- [☕ Java 17 (2021) — LTS](#-java172021--lts)
			- [🎯 Principais Features](#-principais-features-1)
			- [🔥 Limpeza \& Segurança](#-limpeza--segurança)
				- [Exemplos Rápidos](#exemplos-rápidos-1)
		- [☕ Java 18 (2022)](#-java182022)
		- [☕ Java 19 (2022)](#-java192022)
		- [☕ Java 20 (2023)](#-java202023)
		- [☕ Java 21 (2023) — LTS](#-java212023--lts)
			- [🎯 Principais Features](#-principais-features-2)
			- [⚠️ Deprecações](#️-deprecações)
				- [Exemplos Rápidos](#exemplos-rápidos-2)
		- [🔗 Referências](#-referências)

---

### ☕ Java 9 (2017)

| Categoria | Feature | JEP/JSR |
|-----------|---------|---------|
| **Modularidade** | Java Platform Module System (JPMS) – substitui *classpath* por *module path* | JSR 376 |
| Ferramenta | **JShell** – REPL oficial da linguagem | JEP 222 |
| Coleções | `List.of`, `Set.of`, `Map.of` (coleções imutáveis fáceis) | JEP 269 |
| Stream API | `takeWhile`, `dropWhile`, `iterate`, `ofNullable` | JEP 269 |
| Linguagem | Métodos `private` em interfaces | JEP 213 |
| Runtime | Nova API de Processos (`ProcessHandle`) | JEP 102 |

---

### ☕ Java 10 (2018)

| Categoria | Feature | JEP |
|-----------|---------|-----|
| **Linguagem** | Inferência de tipo local com `var` | **286** |
| Performance | Application Class‑Data Sharing | 310 |
| Segurança | Root Certificates integrados | 319 |
| GC | Parallel Full GC para G1 | 307 |
| Runtime | Thread‑Local Handshakes | 312 |

---

### ☕ Java 11 (2018) — LTS

> **Versão de suporte prolongado (LTS)**. Consolidou o ciclo semestral iniciando a contagem 11‑17‑21.

#### 🎯 Principais Features

| Categoria | Feature | JEP |
|-----------|---------|-----|
| **Networking** | API `HttpClient` (HTTP/2 + WebSocket) | **321** |
| Linguagem | `var` em parâmetros lambda | 323 |
| Strings | `isBlank`, `lines`, `repeat`, `strip` | – |
| Arquivos | `Files.readString` / `writeString` | 330 |
| GC | **ZGC** (experimental, baixa latência) | 333 |

#### 🔨 Limpeza da Plataforma

- **Removidos**: Java FX, CORBA, JAX‑WS e módulo `java.se.ee`.
- Módulos antigos passam a ser distribuídos separadamente.


##### Exemplos Rápidos

```java
// HttpClient sincronamente
HttpClient client = HttpClient.newHttpClient();
HttpRequest req = HttpRequest.newBuilder()
		.uri(URI.create("https://example.com"))
		.GET()
		.build();
HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
System.out.println(resp.statusCode());

// String API
" João ".strip();          // "João"
"Um\nDois".lines().count();  // 2
"OK ".repeat(3);              // "OK OK OK "
```
---

### ☕ Java 12 (2019)

| Categoria | Feature | JEP |
|-----------|---------|-----|
| **Linguagem** | *Switch Expressions* (preview) | **325** |
| GC | Shenandoah (experimental) | 189 |
| Internacionalização | Compact Number Formatting | 344 |
| GC | G1 liberação de heap para o SO | 346 |

---

### ☕ Java 13 (2019)

| Categoria | Feature | JEP |
|-----------|---------|-----|
| **Linguagem** | *Text Blocks* (strings multilinha, preview) | **355** |
| Runtime | Dynamic CDS Archives | 350 |
| GC | ZGC: devolver memória ao SO | 351 |
| Networking | Reimplementação do Socket API em NIO | 353 |

---

### ☕ Java 14 (2020)

| Categoria | Feature | JEP |
|-----------|---------|-----|
| **Linguagem** | **Records** (preview) | 359 |
| Linguagem | Pattern Matching para `instanceof` (preview) | 305 |
| Linguagem | *Switch Expressions* (standard) | 361 |
| Tooling | `jpackage` (incubadora) | 343 |
| GC | ZGC e G1 melhorias | 364 |

---

### ☕ Java 15 (2020)

| Categoria | Feature | JEP |
|-----------|---------|-----|
| **Linguagem** | Sealed Classes (preview) | **360** |
| Linguagem | *Text Blocks* (agora standard) | 378 |
| Runtime | Hidden Classes | 371 |
| GC | ZGC e Shenandoah production‑ready | 377 / 379 |
| Deprecação | Remoção do motor Nashorn JS | 372 |

---

### ☕ Java 16 (2021)

| Categoria | Feature | JEP |
|-----------|---------|-----|
| **Linguagem** | **Records** e Pattern Matching p/ `instanceof` finalizados | 395 / 394 |
| Linguagem | Sealed Classes (preview 2) | 397 |
| Tooling | `jpackage` finalizado | 392 |
| Runtime | Encapsulamento forte de APIs internas | 396 |
| Sistemas | Unix‑Domain Socket Channels | 380 |

---

### ☕ Java 17 (2021) — LTS

#### 🎯 Principais Features

| Categoria | Feature | JEP |
|-----------|---------|-----|
| **Linguagem** | **Sealed Classes** (standard) | **409** |
| Linguagem | Pattern Matching para `switch` (preview) | 406 |
| Confiabilidade | Filtros de desserialização contextuais | 415 |
| Biblioteca | Novo conjunto de geradores pseudo‑aleatórios | 356 |
| Plataforma | Foreign Function & Memory API (incub.) | 412 |
| Sistema | Pipeline de renderização Metal (macOS) | 382 |

#### 🔥 Limpeza & Segurança

- Removidos: **RMI Activation**, APIs de *Applet*.
- `Security Manager` marcado para remoção futura.
- Encapsulamento interno ativado por padrão (use `--add-opens`).


##### Exemplos Rápidos

```java
// Sealed classes
public sealed interface Shape permits Circle, Square {}

public final class Circle implements Shape { /* ... */ }
public final class Square implements Shape { /* ... */ }

// Pattern Matching para switch
static String describe(Object obj) {
	return switch (obj) {
		case String s -> "String %s".formatted(s);
		case Integer i -> "Inteiro %d".formatted(i);
		default -> "Outro";
	};
}
```
---

### ☕ Java 18 (2022)

| Categoria | Feature | JEP |
|-----------|---------|-----|
| **Plataforma** | UTF‑8 como charset padrão | **400** |
| Ferramenta | `jwebserver` – Simple Web Server | 408 |
| Networking | SPI de resolução DNS | 418 |
| Linguagem | Pattern Matching para `switch` – preview 2 | 420 |

---

### ☕ Java 19 (2022)

| Categoria | Feature | JEP |
|-----------|---------|-----|
| **Concorrência** | **Virtual Threads** (preview) | **425** |
| Concorrência | Structured Concurrency (incub.) | 428 |
| Linguagem | Record Patterns (preview) | 405 |
| Plataforma | Foreign Function & Memory API (preview) | 424 |
| Deprecação | `finalize()` obsoleto | 421 |

---

### ☕ Java 20 (2023)

> Release “de transição”: todas as novidades permanecem em preview/incubator.

| Categoria | Feature | JEP |
|-----------|---------|-----|
| Concorrência | Virtual Threads (preview 2) | 436 |
| Concorrência | Structured Concurrency (incub. 2) | 437 |
| Dados de Contexto | Scoped Values (incub.) | 429 |
| Linguagem | Record Patterns (preview 2) | 432 |

---

### ☕ Java 21 (2023) — LTS

#### 🎯 Principais Features

| Categoria | Feature | JEP |
|-----------|---------|-----|
| **Concorrência** | **Virtual Threads** (final) | **444** |
| Linguagem | **Record Patterns** (final) | 440 |
| Linguagem | **Pattern Matching for switch** (final) | 441 |
| Concorrência | Scoped Values (preview) | 446 |
| Coleções | **Sequenced Collections** (`SequencedSet`, etc.) | 431 |
| Linguagem | String Templates (preview) | 430 |
| Linguagem | Unnamed Patterns & Variables (`_`) (preview) | 443 |
| GC | ZGC Generational (preview) | 453 |
| Plataforma | Foreign Function & Memory API (preview) | 442 |

#### ⚠️ Deprecações

- Continuação da remoção de `finalize()`.
- RMI Activation já foi removido.

---


##### Exemplos Rápidos

```java
// Virtual thread criados via factory
try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
	executor.submit(() -> Files.readString(Path.of("data.txt")));
}

// String Template (preview)
String nome = "Maria";
String msg = STR."Olá, \{nome}! Bem‑vinda 🥳";

// SequencedCollection
SequencedSet<String> nomes = java.util.SequencedCollection.of();
nomes.addFirst("primeiro");
nomes.addLast("último");
```
---

### 🔗 Referências

- Índice de JEPs: https://openjdk.org/jeps/0
- Release Notes oficiais (OpenJDK) para cada versão.
- Oracle “Java Language Changes” documentation.

---
