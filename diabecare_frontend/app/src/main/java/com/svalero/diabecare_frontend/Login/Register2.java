package com.svalero.diabecare_frontend.Login;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.svalero.diabecare_frontend.Dialog.DatePickerFragment;
import com.svalero.diabecare_frontend.R;

import java.util.Calendar;
import java.util.Date;

public class Register2 extends AppCompatActivity {

    private Button siguiente;
    private DatePicker fecha;
    private int fecha22 = 18;

    private String nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist2);
        fecha = findViewById(R.id.datePicker);

        final Bundle bundle = this.getIntent().getExtras();


        fecha.init(2000,1,1, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                fecha22 = (Calendar.getInstance().get(Calendar.YEAR)) - year;
            }
        });


        siguiente = findViewById(R.id.button4);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Register2.this, Register3.class);
                bundle.putInt("edad",fecha22);
                toy.putExtras(bundle);




                Toast toast1 = Toast.makeText(getApplicationContext(),
                        "fecha: " + fecha22, Toast.LENGTH_SHORT);
                toast1.show();
                startActivity(toy);
            }

        });



    }

}