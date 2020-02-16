# io_uring Kotlin bindings

### needed
* jdk8, or one that includes the command line tool`javah`
* Kotlin compiler; `kotlinc-jvm`
* liburing: https://github.com/axboe/liburing (install with `sudo make install`)


### generate C header files
from kotlin/ directory:

* Compile the .kt file to a class, so we can later use `javah` on it:
`kotlinc-jvm iouring/IOuringSetup.kt`

* Generate C header files:
`javah -o iouring/native/IOuringSetup.h iouring.IOuringSetup`

* Compile JNI files from `kotlin/` dir:
`gcc -fPIC iouring/io_uring_kotlin.c -shared -o iouring/libio_uring_kotlin.so -I $JAVA_HOME/include/ -I $JAVA_HOME/include/linux/ -Wall -O2 -D_GNU_SOURCE -luring`

* Compile the .kt file to a JAR:
`kotlinc-jvm -include-runtime iouring/IOuringSetup.kt -d iouring/IOuringSetup.jar`

* Run: 
`java -jar -Djava.library.path=./iouring iouring/IOuringSetup.jar`

