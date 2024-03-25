package ntu_63132291.cau2_appbmi;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
    public void HamXuLyBMI(View view){
        //Tham chiếu
        EditText h = findViewById(R.id.editH);
        EditText w = findViewById(R.id.editW);
        EditText kq = findViewById(R.id.editKQ);
        //Lấy dữ liệu về
        String strh = h.getText().toString();
        String strw = w.getText().toString();
        //Chuyển sang dạng số
        double height =   Double.parseDouble(strh);
        double weight =   Double.parseDouble(strw);
        //Tính toán
        double BMI = weight / (height * height);
        //Chuyển sang dạng chuỗi
        String strBMI = String.format("%.2f", BMI);
        //Hiện ra màn hình(Lấy dữ liệu hiện ra màn hình)
        kq.setText(strBMI);
        TextView tt;
        tt = findViewById(R.id.textViewtt);
        if (BMI <= 18.5) {
          tt.setText("Underweight");
        } else if (BMI <= 24.9) {
            tt.setText("Normal");
        } else if (BMI <= 29.9) {
            tt.setText("Overweight");
        } else {
            tt.setText("Obese");
        }
    }
}