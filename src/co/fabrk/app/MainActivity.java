package co.fabrk.app;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	static{
		System.loadLibrary( "App" );
	}
	
	@Override protected void onCreate( Bundle icicle )
	{
		super.onCreate( icicle );
		onCreateNative();
	}
	public static native void onCreateNative();
}
