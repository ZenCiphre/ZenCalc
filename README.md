# Zen series level 0: ZenCalc

A CLI calcultor made with Java 21, Picocli and Maven.

# Build

### Prerequisites
* **Java 21+** installed.
* **Maven*** installed.

Run: ``bash
mvn clean package``

# Usage

### General Syntax
-a <num> -b <num> -op <operation>

#### Options
``add: Addition
sub: Subtraction
mul: Multiplication
div: division``

### Example
``java -jar target/ZenCalc-1.jar -a 10 -b 5 -op mul``

# Using the helper script

### Linux 
``./run -a 5 -b 5 op add``

### Windows
``.\run -a 5 -b 5 op sub``
