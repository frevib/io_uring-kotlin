#include <stdio.h>
#include <liburing.h>
//#include "../headers/io_uring_kotlin.h"
#include <string.h>
#include <jni.h>

//JNIEXPORT void JNICALL Java_____(JNIEnv *env, jobject obj) {
//  printf("Addcrack World!\n");
//  return;
//}


//JNIEXPORT jint JNICALL Java_iouring_IOuringNativeBindings_ioUringQueueInit (JNIEnv * env, jobject obj)
//{
//    printf("starting ui_uring setup...\n");
//    struct io_uring ring;
//    int result = io_uring_queue_init(32, &ring, 0);
//    if (result < 0)
//    {
//    	printf("queue_init: %d\n", result);
//    	return -1;
//    }
//
//    return result;
//};


jint JNICALL Java_iouring_IOuringNativeBindings_ioUringQueueInitParams (JNIEnv * env, jobject obj, jint number)
{
    struct io_uring ring;
    int result = io_uring_queue_init(32, &ring, 0);
    if (result < 0)
    {
    	printf("queue_init: %d\n", result);
    	return -1;
    }

    return result;
};