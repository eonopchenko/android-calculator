package unitec.ac.nz.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalculate = (Button) findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int op1 = 0;
                int op2 = 0;

                try {
                    op1 = Integer.parseInt(((EditText) findViewById(R.id.edtAdd1)).getText().toString());
                    op2 = Integer.parseInt(((EditText) findViewById(R.id.edtAdd2)).getText().toString());
                    ((EditText)findViewById(R.id.edtAddRes)).setText("" + (op1 + op2));
                } catch (NumberFormatException ex) {
                    ((EditText)findViewById(R.id.edtAddRes)).setText("");
                }

                try {
                    op1 = Integer.parseInt(((EditText) findViewById(R.id.edtSub1)).getText().toString());
                    op2 = Integer.parseInt(((EditText) findViewById(R.id.edtSub2)).getText().toString());
                    ((EditText)findViewById(R.id.edtSubRes)).setText("" + (op1 - op2));
                } catch (NumberFormatException ex) {
                    ((EditText)findViewById(R.id.edtSubRes)).setText("");
                }

                try {
                    op1 = Integer.parseInt(((EditText) findViewById(R.id.edtMul1)).getText().toString());
                    op2 = Integer.parseInt(((EditText) findViewById(R.id.edtMul2)).getText().toString());
                    ((EditText)findViewById(R.id.edtMulRes)).setText("" + (op1 * op2));
                } catch (NumberFormatException ex) {
                    ((EditText)findViewById(R.id.edtMulRes)).setText("");
                }

                try {
                    op1 = Integer.parseInt(((EditText) findViewById(R.id.edtDiv1)).getText().toString());
                    op2 = Integer.parseInt(((EditText) findViewById(R.id.edtDiv2)).getText().toString());
                    ((EditText)findViewById(R.id.edtDivRes)).setText("" + (op1 / op2));
                } catch (NumberFormatException ex) {
                    ((EditText)findViewById(R.id.edtDivRes)).setText("");
                } catch (ArithmeticException ex) {
                    ((EditText)findViewById(R.id.edtDivRes)).setText("");
                }
            }
        });
    }
}
