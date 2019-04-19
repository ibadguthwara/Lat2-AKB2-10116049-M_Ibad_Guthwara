package id.ibadguthwara.tugas.lat2_akb2_10116049_mibadguthwara;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    /*
    NIM : 10116049
    Nama : M. Ibad Guthwara
    Kelas : AKB2 (IF-2)
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button register = findViewById(R.id.btnRegisterRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, AlmostthereActivity.class);
                startActivity(intent);
            }
        });
    }

}
