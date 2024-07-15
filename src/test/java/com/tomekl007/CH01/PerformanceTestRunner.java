package com.tomekl007.CH01;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PerformanceTestRunner {
  public static void main(String[] args) throws Exception {
    Options opt =
        new OptionsBuilder().include(BenchmarkSingletonVsThreadLocal.class.getSimpleName()).build();

    new Runner(opt).run();
  }

  private static final Logger logger = LoggerFactory.getLogger(PerformanceTestRunner.class);

  @Test
  void useLoggerToPropagateExceptionInfo() {
    try {
      new PerformanceTestRunner().main(null);
    } catch (Exception e) {
      logger.error("Problem when check ", e);
    }
  }
}
