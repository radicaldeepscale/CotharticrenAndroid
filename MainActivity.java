public class MainActivity extends AppCompatActivity {
    private EditText editTextRad;
    private EditText editTextRadt;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextRad = findViewById(R.id.editTextRad);
        editTextRadt = findViewById(R.id.editTextRadt);
        textViewResult = findViewById(R.id.textViewResult);

        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double rad = Double.parseDouble(editTextRad.getText().toString());
                double radt = Double.parseDouble(editTextRadt.getText().toString());

                CotharticrenModule1 cotharticrenModule = new CotharticrenModule1(rad, radt);
                double resultA = cotharticrenModule.cotharticrenA();
                double resultB = cotharticrenModule.cotharticrenB();
                double resultC = cotharticrenModule.cotharticrenC();
                double resultD = cotharticrenModule.cotharticrenD();
                double resultE = cotharticrenModule.cotharticrenE();
                double resultF = cotharticrenModule.cotharticrenF();
                double resultG = cotharticrenModule.cotharticrenG();

                String result = "A: " + resultA + "\nB: " + resultB + "\nC: " + resultC + "\nD: " + resultD + "\nE: " + resultE + "\nF: " + resultF + "\nG: " + resultG;
                textViewResult.setText(result);
            }
        });
    }
}
