package dev.zenith;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(name = "ZenCalc", mixinStandardHelpOptions = true, version = "1.0", description = "A lvl 0 calculator for the Zen series.")

public class ZenCalc implements Callable<Integer> {

  @Option(names = { "-a", "--alpha" }, description = "First number", required = true)
  private double a;

  @Option(names = { "-b", "--beta" }, description = "Second number", required = true)
  private double b;

  @Option(names = { "-op", "--operation" }, description = "add, sub, mul, div", required = true)
  private String op;

  @Override
  public Integer call() throws Exception {

    double result = 0;

    try {
      result = calculate(a, b, op);
      System.out.printf("ZenCalc Result: %.2f%n", result);
      return 0;

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
      return 1;
    }
  }

  public double calculate(double a, double b, String op) {
    return switch (op.toLowerCase()) {
      case "add" -> a + b;
      case "sub" -> a - b;
      case "mul" -> a * b;
      case "div" -> {
        if (b == 0)
          throw new ArithmeticException("Cannot divide by Zero.");
        yield a / b;
      }
      default -> throw new IllegalArgumentException("Unknown operation " + op);
    };

  }

  public static void main(String[] args) {
    int exitCode = new CommandLine(new ZenCalc()).execute(args);
    System.exit(exitCode);
  }
}
