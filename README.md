## libraw4j <small>(1.0.0-SNAPSHOT)</small>
Java interface to the [libraw](https://www.libraw.org) library.

Used for reading data from raw images.

### `src/main/java/dev/jacobandersen/libraw4j/...`
The actual API to use, which presents a clean interface to the libraw library.

### `src/main/java/org/libraw/...`
The native API generated by [jextract](https://inside.java/2020/10/06/jextract/). It consists of Java source files
that are generated mirrors of the C header files.