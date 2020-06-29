package co.tovigamboa.contador;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	private TextView tvDisplay;
	private int contador = 0;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tvDisplay = findViewById(R.id.tvDisplayId);
		tvDisplay.setText(String.valueOf(contador));
	}

	public void onClick(View view) {
		switch (view.getId()){
			case R.id.btSumarId:
				sumar();
				break;
			case R.id.btLimpiarId:
				limpiar();
				break;

		}
	}

	private void limpiar() {
		contador = 0;
		tvDisplay.setText(String.valueOf(contador));
	}

	private void sumar() {
		if(contador >= 0){
			contador++;
			tvDisplay.setText(String.valueOf(contador));
		}else{
			Toast.makeText(getApplicationContext(),"Error.",Toast.LENGTH_SHORT).show();
		}
	}
}
