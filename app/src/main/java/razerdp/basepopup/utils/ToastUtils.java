package razerdp.basepopup.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Mazoh on 2016/1/15.
 */
public class ToastUtils {

    public static void ToastMessage(Context context, String msg) {
       Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
}
