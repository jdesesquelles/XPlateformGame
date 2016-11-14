package co.fabrk.app;
import android.app.Activity;
import android.os.Bundle;
import android.view.Surface;

public class MainActivity extends Activity {
    public static GLView m_View = null;
    
	static{
		System.loadLibrary( "App" );
	}
	
	@Override protected void onCreate( Bundle icicle )
	{
		super.onCreate( icicle );
		OnCreateNative();
        m_View = new GLView( getApplication() );
        setContentView( m_View );
	}
	public static native void OnCreateNative();
	public static native void SetSurface( Surface surface );
	public static native void SetSurfaceSize( int width, int height );
	public static native void DrawFrame();
}
