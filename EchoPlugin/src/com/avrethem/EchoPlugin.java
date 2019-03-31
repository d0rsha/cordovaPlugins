import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class EchoPlugin extends CordovaPlugin {
    private static final String TAG = "EchoPluginTag";


    // ngOnInit() { ... } 
    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        Log.d(TAG, "Starting Echo Plugin");
    }

    // Probably not necessecary with above 
/*     @Override
    protected void pluginInitialize() {
        final Context context = this.cordova.getActivity().getApplicationContext();
        final Bundle extras = this.cordova.getActivity().getIntent().getExtras();
        this.cordova.getThreadPool().execute(new Runnable() {
            public void run() {
                Log.d(TAG, "Starting Echo Plugin");
                
            }
        }
    } */

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            Log.d(TAG, "coolMethod() does not do anything lulz");
        } else if (action.equals("echo")) {
            String message = args.getString(0);
            Log.d(TAG, message);
        } else if (action.equals("getDate")) {
            final PluginResult res = new PluginResult(PluginResult.Status.OK, (new Date()).toString());
            callbackContext.sendPluginResult(result);
        }  
    }

}