#include <stdio.h>
#include <liburing.h>
#include <string.h>
#include <jni.h>
//#include "../headers/io_uring_kotlin.h"


static jint JNICALL Java_iouring_IOuringNativeBindings_ioUringQueueInit (JNIEnv * env, jobject obj, jint ring_size)
{
    struct io_uring ring;
    int result = io_uring_queue_init(ring_size, &ring, 0);
    if (result < 0)
    {
    	fprintf(stderr, "Failed to execute io_uring_queue_init(), returned: %d\n", result);
    	return -1;
    }

    return result;
};


static jint JNICALL Java_iouring_IOuringNativeBindings_ioUringQueueInitParams (JNIEnv * env, jobject obj, jint ring_size)
{
    struct io_uring ring;
    struct io_uring_params params;
    memset(&params, 0, sizeof(params));

    int result = io_uring_queue_init_params(ring_size, &ring, &params);
    if (result < 0)
    {
    	fprintf(stderr, "Failed to execute io_uring_queue_init_params(), returned: %d\n", result);
    	return -1;
    }

    return result;
}

static jint JNICALL Java_iouring_IOuringNativeBindings_ioUringQueueInitParams_1IORING_1FEAT_1FAST_1POLL (JNIEnv * env, jobject obj, jint ring_size)
{
    struct io_uring ring;
    struct io_uring_params params;
    memset(&params, 0, sizeof(params));

    int result = io_uring_queue_init_params(ring_size, &ring, &params);
    if (result < 0)
    {
    	fprintf(stderr, "Failed to execute io_uring_queue_init_params(), returned: %d\n", result);
    	return -1;
    }
    if (!(params.features & IORING_FEAT_FAST_POLL))
    {
        fprintf(stderr, "IORING_FEAT_FAST_POLL not available in the kernel, quiting...\n");
        return 0;
    }

    return result;
};