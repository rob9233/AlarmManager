package robfernandes.xyz.alarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Roberto Fernandes on 05/11/2018.
 */
public class AlertReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "One minute has passed", Toast.LENGTH_LONG).show();

    }
}
