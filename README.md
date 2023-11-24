# Proyecto de Refactorización Bancaria en Java

Este proyecto, desarrollado por **Juan Pardo** para la materia *"Programación Avanzada"* de la profesora **Marta Melillo**, aborda la refactorización de una aplicación bancaria existente en Java. Se realizan dos prácticas principales:

- [Práctica 1: Aplicación de la palabra clave abstract](#práctica-1-aplicación-de-la-palabra-clave-abstract)
  - [Pasos Realizados](#pasos-realizados)
  - [Ejecución del Proyecto](#ejecución-del-proyecto)
- [Práctica 2: Aplicación del patrón de diseño Singleton](#práctica-2-aplicación-del-patrón-de-diseño-singleton)
  - [Pasos Realizados](#pasos-realizados-1)
  - [Ejecución del Proyecto](#ejecución-del-proyecto-1)
- [Instrucciones para Ejecutar el Proyecto](#instrucciones-para-ejecutar-el-proyecto)

## Práctica 1: Aplicación de la palabra clave abstract

![](https://raw.githubusercontent.com/JuaniPardo/AbstractBanking/main/src/bank/AbstractBanking.jpeg)

En esta práctica, se refactoriza el código para mejorar la flexibilidad y extensibilidad mediante el uso de la palabra clave `abstract`. Se implementan clases abstractas que permiten la creación de diferentes tipos de cuentas bancarias.

### Pasos Realizados:
1. Revisión de la clase `TimeDepositAccount`.
2. Creación de la clase `Account` como clase abstracta.
3. Agregación de métodos abstractos a la clase `Account`.
4. Refactorización de la clase `TimeDepositAccount` como subclase de `Account`.
5. Creación de la clase `CheckingAccount` como subclase de `Account`.
6. Actualización de clases cliente y generación de informes.

### Ejecución del Proyecto:
- Verificar la correcta generación de informes con clientes y cuentas, asegurándose de que la fecha sea correcta.

## Práctica 2: Aplicación del patrón de diseño Singleton

En esta práctica, se implementa el patrón de diseño Singleton para garantizar que solo exista una instancia de la clase `Bank`.

### Pasos Realizados:
1. Modificación de la clase `Bank` para implementar Singleton.
2. Actualización de la clase `SingletonBankingMain` para utilizar Singleton.
3. Verificación de Singleton mediante la creación de dos referencias a `Bank`.
4. Prueba de inicialización independiente.

### Ejecución del Proyecto:
- Confirmar que el informe se genera correctamente con las cuentas de los clientes y que la inicialización independiente funciona según lo esperado.

## Instrucciones para Ejecutar el Proyecto:

1. Clonar el repositorio desde GitHub. `git clone https://github.com/JuaniPardo/AbstractBanking.git `
2. Importar el proyecto en su entorno de desarrollo Java.
3. Ejecutar la clase `AbstractBankingMain` en el branch `Sin-Singleton` para la Práctica 1 y `SingletonBankingMain` en la rama `Main` para la Práctica 2.

¡Gracias por explorar este proyecto de refactorización bancaria en Java!
