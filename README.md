# Zen series level 0: ZenCalc

A CLI calcultor made with Java 21, Picocli and Maven.

# Build

Run: ``mvn clean package``

# Usage

### General Syntax
-a <num> -b <num> -op <operation>

#### Options
add: Addition
sub: Subtraction
mul: Multiplacation
div: division

### Example (Multiplication)
java -jar target/ZenCalc-1.jar -a 10 -b 5 -op mul

### Linux 
./run -a 5 -b 5 op add

### Winows
.\run -a 5 -b 5 op sub
