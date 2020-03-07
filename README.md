# io_uring Kotlin bindings

### requirements
* __JDK8__, or one that includes the command line tool`javah`
* Kotlin compiler: `kotlinc-jvm`
* liburing: https://github.com/axboe/liburing (install with `sudo make install`)


### generate C header files
Run the following __from kotlin/ directory:__

* Compile the .kt file to a class, so we can later use `javah` on it:
`kotlinc-jvm .`

* Generate C header files:
`javah -o iouring/native/io_uring_kotlin.h iouring.IOuringNativeBindings`

* Compile JNI files from:
`gcc -fPIC iouring/native/io_uring_kotlin.c -shared -o iouring/native/libio_uring_kotlin.so -I $JAVA_HOME/include/ -I $JAVA_HOME/include/linux/ -Wall -O2 -D_GNU_SOURCE -luring`

* Compile the .kt file to a JAR:
`kotlinc-jvm . -include-runtime -d iouring/IOuringNativeBindings.jar`

* Run: 
`java -jar -Djava.library.path=iouring/native/ iouring/IOuringNativeBindings.jar 1337`

