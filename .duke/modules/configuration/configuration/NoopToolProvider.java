package configuration;

import java.io.PrintWriter;
import java.util.spi.ToolProvider;

public record NoopToolProvider(String name) implements ToolProvider {
  public NoopToolProvider() {
    this("noop");
  }

  @Override
  public int run(PrintWriter out, PrintWriter err, String... args) {
    return 0;
  }
}
