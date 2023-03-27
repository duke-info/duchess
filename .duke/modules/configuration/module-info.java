module configuration {
  provides java.util.spi.ToolProvider with
      configuration.NoopToolProvider;
}
