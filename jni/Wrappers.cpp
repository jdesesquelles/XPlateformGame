#include <stdlib.h>
#include <jni.h>
#include <android/log.h>
#define LOGI(...) ((void)__android_log_print(ANDROID_LOG_INFO,"App", __VA_ARGS__))
extern "C" {
	JNIEXPORT void JNICALL Java_co_fabrk_app_MainActivity_onCreateNative(JNIEnv* env, jobject obj )
	{
		LOGI( "Hello World!" );
	}
}
