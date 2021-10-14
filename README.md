# Log4j2TransformerTest
A simple project demonstrating an error in the Log4j2PluginsCacheFileTransformer. 

## Normal run:
```shell
gradlew :run

> Task :run
2021-10-14 22:48:34,046 [AWT-EventQueue-0] INFO  transformer.TransformerTest - Hello!

BUILD SUCCESSFUL in 11s
3 actionable tasks: 2 executed, 1 up-to-date
```

## Shadow run:
```shell
gradlew :runShadow

> Task :runShadow
ERROR StatusLogger Unrecognized format specifier [d]
ERROR StatusLogger Unrecognized conversion specifier [d] starting at position 16 in conversion pattern.
ERROR StatusLogger Unrecognized format specifier [thread]
ERROR StatusLogger Unrecognized conversion specifier [thread] starting at position 25 in conversion pattern.
ERROR StatusLogger Unrecognized format specifier [level]
ERROR StatusLogger Unrecognized conversion specifier [level] starting at position 35 in conversion pattern.
ERROR StatusLogger Unrecognized format specifier [logger]
ERROR StatusLogger Unrecognized conversion specifier [logger] starting at position 47 in conversion pattern.
ERROR StatusLogger Unrecognized format specifier [msg]
ERROR StatusLogger Unrecognized conversion specifier [msg] starting at position 54 in conversion pattern.
ERROR StatusLogger Unrecognized format specifier [n]
ERROR StatusLogger Unrecognized conversion specifier [n] starting at position 56 in conversion pattern.
ERROR StatusLogger Unrecognized format specifier [d]
ERROR StatusLogger Unrecognized conversion specifier [d] starting at position 16 in conversion pattern.
ERROR StatusLogger Unrecognized format specifier [thread]
ERROR StatusLogger Unrecognized conversion specifier [thread] starting at position 25 in conversion pattern.
ERROR StatusLogger Unrecognized format specifier [level]
ERROR StatusLogger Unrecognized conversion specifier [level] starting at position 35 in conversion pattern.
ERROR StatusLogger Unrecognized format specifier [logger]
ERROR StatusLogger Unrecognized conversion specifier [logger] starting at position 47 in conversion pattern.
ERROR StatusLogger Unrecognized format specifier [msg]
ERROR StatusLogger Unrecognized conversion specifier [msg] starting at position 54 in conversion pattern.
ERROR StatusLogger Unrecognized format specifier [n]
ERROR StatusLogger Unrecognized conversion specifier [n] starting at position 56 in conversion pattern.

BUILD SUCCESSFUL in 9s
6 actionable tasks: 4 executed, 2 up-to-date
```