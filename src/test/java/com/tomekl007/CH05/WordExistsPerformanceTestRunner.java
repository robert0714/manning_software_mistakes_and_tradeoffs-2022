package com.tomekl007.CH05;

import com.tomekl007.CH03.ExceptionsPerformanceTestRunner;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WordExistsPerformanceTestRunner {
  public static void main(String[] args) throws Exception {
    Options opt =
        new OptionsBuilder().include(WordExistsPerformanceBenchmark.class.getSimpleName()).build();

    new Runner(opt).run();
  }

  private static final Logger logger =
      LoggerFactory.getLogger(ExceptionsPerformanceTestRunner.class);

  @Test
  void useLoggerToPropagateExceptionInfo() {
    try {
      new WordExistsPerformanceTestRunner().main(null);
    } catch (Exception e) {
      logger.error("Problem when check ", e);
    }
  }
}
