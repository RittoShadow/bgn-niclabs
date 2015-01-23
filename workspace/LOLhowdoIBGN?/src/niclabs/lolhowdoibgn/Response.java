package niclabs.lolhowdoibgn;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class Response extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_response);
		TextView output = (TextView)findViewById(R.id.Output);
		Bundle bundle = this.getIntent().getExtras();
		output.setText(bundle.getString("message"));
		BGNTable usdbh = new BGNTable(this, "Keys", null, 1);
		SQLiteDatabase db = usdbh.getWritableDatabase();
		
		if (db!=null){
			
		}
	}
}
