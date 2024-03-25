package ntu_63132291.cau2_appbmi;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    public void HamXuLyBMI(){
        //Tham chiếu
        EditText h = findViewById(R.id.editH);
        EditText w = findViewById(R.id.editW);
        EditText kq = findViewById(R.id.editKQ);

        String strh = h.getText().toString();
        String strw = w.getText().toString();

        int height =   Integer.parseInt(strh);
        int weight =   Integer.parseInt(strw);

        int BMI = weight / (height * height);
        String strBMI = String.valueOf(BMI); //Chuyển sang dạng chuỗi
        //Hiện ra màn hình(Lấy dữ liệu hiện ra màn hình)
        kq.setText(strBMI);
    }
}