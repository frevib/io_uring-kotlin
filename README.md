# io_uring Kotlin bindings

### needed
* jdk8, or one that includes the command line tool`javah`
* Kotlin compiler; `kotlinc-jvm`


### generate C header files
* first compile the .kt file from the root kotlin dir (`kotlin/`):
`kotlinc-jvm -include-runtime iouring/IOuringSetup.kt -d iouring/IOuringSetup.jar`

* compile JNI files from `kotlin/` dir:
`gcc -fPIC iouring/io_uring_kotlin.c -shared -o iouring/libio_uring_kotlin.so -I $JAVA_HOME/include/ -I $JAVA_HOME/include/linux/ -Wall -O2 -D_GNU_SOURCE -luring`

* run with: `java -jar -Djava.library.path=./iouring iouring/IOuringSetup.jar
`

