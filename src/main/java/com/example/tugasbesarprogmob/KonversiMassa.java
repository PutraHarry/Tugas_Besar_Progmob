package com.example.tugasbesarprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSpinner;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.example.tugasbesarprogmob.rumus_massa.HitungMassa;
import com.example.tugasbesarprogmob.rumus_massa.SharedPrefsMassa;

import java.util.Objects;
import android.os.Bundle;

public class KonversiMassa extends AppCompatActivity {
    private AppCompatEditText edit_massa1;
    private AppCompatEditText edit_massa2;
    private HitungMassa hitungmassa;
    private LinearLayout layout_formula;
    private TextView text_formula;
    private Animation rotate_zoom_out;
    private String[] hitungMassa = new String[]{
            "TON",
            "KWINTAL",
            "KG",
            "HG",
            "DAG",
            "Gram",
            "DG",
            "CG",
            "MG"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_massa);

        hitungmassa = new HitungMassa(this);

        layout_formula = findViewById(R.id.layout_formula);
        text_formula = findViewById(R.id.text_formula);

        rotate_zoom_out = AnimationUtils.loadAnimation(KonversiMassa.this, R.anim.rotate_zoom_out);

        getSupportActionBar().setTitle("Konversi Massa");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //edit text temp to conversion 1
        edit_massa1 = findViewById(R.id.edit_1);
        edit_massa1.setHint(SharedPrefsMassa.getMassaSymbol1(KonversiMassa.this));

        //edit text temp to conversion 2
        edit_massa2 = findViewById(R.id.edit_2);
        edit_massa2.setHint(SharedPrefsMassa.getMassaSymbol2(KonversiMassa.this));
        edit_massa2.setKeyListener(null);
        edit_massa2.setClickable(false);

        //Spinner & Adapter 1
        ArrayAdapter<String> arrayAdapter1 =
                new ArrayAdapter(KonversiMassa.this, android.R.layout.simple_spinner_item, hitungMassa);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AppCompatSpinner appCompatSpinner1 = findViewById(R.id.spinner_1);
        appCompatSpinner1.setAdapter(arrayAdapter1);

        //set selection
        appCompatSpinner1.setSelection(SharedPrefsMassa.getMassaIndex1(KonversiMassa.this));
        appCompatSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String massa_symbol1 = hitungMassa[position];
                SharedPrefsMassa.setMassa1(KonversiMassa.this, massa_symbol1, position);
                edit_massa1.setHint(hitungMassa[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //spinner & adapter 2
        ArrayAdapter<String> arrayAdapter2 =
                new ArrayAdapter(KonversiMassa.this, android.R.layout.simple_spinner_item, hitungMassa);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AppCompatSpinner appCompatSpinner2 = findViewById(R.id.spinner_2);
        appCompatSpinner2.setAdapter(arrayAdapter2);
        appCompatSpinner2.setSelection(SharedPrefsMassa.getMassaIndex2(KonversiMassa.this));
        appCompatSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String massa_symbol2 = hitungMassa[position];
                SharedPrefsMassa.setMassa2(KonversiMassa.this, massa_symbol2, position);
                edit_massa2.setHint(hitungMassa[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Button Count
        AppCompatButton btn_count = findViewById(R.id.hitung);
        btn_count.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (Objects.requireNonNull(edit_massa1.getText()).toString().isEmpty()) {

                    Toast.makeText(KonversiMassa.this,
                            "Masukan nilai massa yang ingin di konversi", Toast.LENGTH_SHORT).show();

                } else {
                    layout_formula.startAnimation(rotate_zoom_out);
                    if (layout_formula.getVisibility() == View.GONE) {
                        layout_formula.setVisibility(View.VISIBLE);
                    }
                    String symbol_massa1 = SharedPrefsMassa.getMassaSymbol1(KonversiMassa.this);
                    String symbol_massa2 = SharedPrefsMassa.getMassaSymbol2(KonversiMassa.this);
                    double value_to_conversion = Double.parseDouble(edit_massa1.getText().toString());

                    // ton to kw
                    if (symbol_massa1.equals("TON") && symbol_massa2.equals("KWINTAL")) {
                        edit_massa2.setText(hitungmassa.TonToKwintal(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("TON", "KWINTAL",
                                value_to_conversion, hitungmassa.TonToKwintal(value_to_conversion)));
                    }
                    // ton to kg
                    else if (symbol_massa1.equals("TON") && symbol_massa2.equals("KG")) {
                        edit_massa2.setText(hitungmassa.TonToKg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("TON", "KG",
                                value_to_conversion, hitungmassa.TonToKg(value_to_conversion)));
                    }
                    // ton to kg
                    else if (symbol_massa1.equals("TON") && symbol_massa2.equals("HG")) {
                        edit_massa2.setText(hitungmassa.TonToHg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("TON", "HG",
                                value_to_conversion, hitungmassa.TonToHg(value_to_conversion)));
                    }
                    // ton to dag
                    else if (symbol_massa1.equals("TON") && symbol_massa2.equals("DAG")) {
                        edit_massa2.setText(hitungmassa.TonToDag(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("TON", "DAG",
                                value_to_conversion, hitungmassa.TonToDag(value_to_conversion)));
                    }
                    // ton to G
                    else if (symbol_massa1.equals("TON") && symbol_massa2.equals("Gram")) {
                        edit_massa2.setText(hitungmassa.TonToG(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("TON", "Gram",
                                value_to_conversion, hitungmassa.TonToG(value_to_conversion)));
                    }
                    // ton to DG
                    else if (symbol_massa1.equals("TON") && symbol_massa2.equals("DG")) {
                        edit_massa2.setText(hitungmassa.TonToDg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("TON", "DG",
                                value_to_conversion, hitungmassa.TonToDg(value_to_conversion)));
                    }
                    // ton to CG
                    else if (symbol_massa1.equals("TON") && symbol_massa2.equals("CG")) {
                        edit_massa2.setText(hitungmassa.TonToCg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("TON", "CG",
                                value_to_conversion, hitungmassa.TonToCg(value_to_conversion)));
                    }
                    // ton to MG
                    else if (symbol_massa1.equals("TON") && symbol_massa2.equals("MG")) {
                        edit_massa2.setText(hitungmassa.TonToMg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("TON", "MG",
                                value_to_conversion, hitungmassa.TonToMg(value_to_conversion)));
                    }
                    // kwin to ton
                    else if (symbol_massa1.equals("KWINTAL") && symbol_massa2.equals("TON")) {
                        edit_massa2.setText(hitungmassa.KwintalToTon(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KWINTAL", "TON",
                                value_to_conversion, hitungmassa.KwintalToTon(value_to_conversion)));
                    }
                    // kwin to KG
                    else if (symbol_massa1.equals("KWINTAL") && symbol_massa2.equals("KG")) {
                        edit_massa2.setText(hitungmassa.KwintalToKg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KWINTAL", "KG",
                                value_to_conversion, hitungmassa.KwintalToKg(value_to_conversion)));
                    }
                    // kwin to KG
                    else if (symbol_massa1.equals("KWINTAL") && symbol_massa2.equals("HG")) {
                        edit_massa2.setText(hitungmassa.KwintalToHg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KWINTAL", "HG",
                                value_to_conversion, hitungmassa.KwintalToHg(value_to_conversion)));
                    }
                    // kwin to DAG
                    else if (symbol_massa1.equals("KWINTAL") && symbol_massa2.equals("DAG")) {
                        edit_massa2.setText(hitungmassa.KwintalToDag(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KWINTAL", "DAG",
                                value_to_conversion, hitungmassa.KwintalToDag(value_to_conversion)));
                    }
                    // kwin to G
                    else if (symbol_massa1.equals("KWINTAL") && symbol_massa2.equals("Gram")) {
                        edit_massa2.setText(hitungmassa.KwintalToG(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KWINTAL", "Gram",
                                value_to_conversion, hitungmassa.KwintalToG(value_to_conversion)));
                    }
                    // kwin to DG
                    else if (symbol_massa1.equals("KWINTAL") && symbol_massa2.equals("DG")) {
                        edit_massa2.setText(hitungmassa.KwintalToDg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KWINTAL", "DG",
                                value_to_conversion, hitungmassa.KwintalToDg(value_to_conversion)));
                    }
                    // kwin to CG
                    else if (symbol_massa1.equals("KWINTAL") && symbol_massa2.equals("CG")) {
                        edit_massa2.setText(hitungmassa.KwintalToCg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KWINTAL", "CG",
                                value_to_conversion, hitungmassa.KwintalToCg(value_to_conversion)));
                    }
                    // kwin to MG
                    else if (symbol_massa1.equals("KWINTAL") && symbol_massa2.equals("MG")) {
                        edit_massa2.setText(hitungmassa.KwintalToMg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KWINTAL", "MG",
                                value_to_conversion, hitungmassa.KwintalToMg(value_to_conversion)));
                    }
                    // KG to TON
                    else if (symbol_massa1.equals("KG") && symbol_massa2.equals("TON")) {
                        edit_massa2.setText(hitungmassa.KgToTon(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KG", "TON",
                                value_to_conversion, hitungmassa.KgToTon(value_to_conversion)));
                    }
                    // KG to KW
                    else if (symbol_massa1.equals("KG") && symbol_massa2.equals("KWINTAL")) {
                        edit_massa2.setText(hitungmassa.KgToKwintal(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KG", "KWINTAL",
                                value_to_conversion, hitungmassa.KgToKwintal(value_to_conversion)));
                    }
                    // KG to HG
                    else if (symbol_massa1.equals("KG") && symbol_massa2.equals("HG")) {
                        edit_massa2.setText(hitungmassa.KgToHg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KG", "HG",
                                value_to_conversion, hitungmassa.KgToHg(value_to_conversion)));
                    }
                    // KG to DAG
                    else if (symbol_massa1.equals("KG") && symbol_massa2.equals("DAG")) {
                        edit_massa2.setText(hitungmassa.KgToDag(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KG", "DAG",
                                value_to_conversion, hitungmassa.KgToDag(value_to_conversion)));
                    }
                    // KG to G
                    else if (symbol_massa1.equals("KG") && symbol_massa2.equals("Gram")) {
                        edit_massa2.setText(hitungmassa.KgToG(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KG", "Gram",
                                value_to_conversion, hitungmassa.KgToG(value_to_conversion)));
                    }
                    // KG to DG
                    else if (symbol_massa1.equals("KG") && symbol_massa2.equals("DG")) {
                        edit_massa2.setText(hitungmassa.KgToDg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KG", "DG",
                                value_to_conversion, hitungmassa.KgToDg(value_to_conversion)));
                    }
                    // KG to CG
                    else if (symbol_massa1.equals("KG") && symbol_massa2.equals("CG")) {
                        edit_massa2.setText(hitungmassa.KgToCg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KG", "CG",
                                value_to_conversion, hitungmassa.KgToCg(value_to_conversion)));
                    }
                    // KG to MG
                    else if (symbol_massa1.equals("KG") && symbol_massa2.equals("MG")) {
                        edit_massa2.setText(hitungmassa.KgToMg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("KG", "MG",
                                value_to_conversion, hitungmassa.KgToMg(value_to_conversion)));
                    }
                    // HG to TON
                    else if (symbol_massa1.equals("HG") && symbol_massa2.equals("TON")) {
                        edit_massa2.setText(hitungmassa.HgToTon(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("HG", "TON",
                                value_to_conversion, hitungmassa.HgToTon(value_to_conversion)));
                    }
                    // HG to KW
                    else if (symbol_massa1.equals("HG") && symbol_massa2.equals("KWINTAL")) {
                        edit_massa2.setText(hitungmassa.HgToKwintal(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("HG", "KWINTAL",
                                value_to_conversion, hitungmassa.HgToKwintal(value_to_conversion)));
                    }
                    // HG to KG
                    else if (symbol_massa1.equals("HG") && symbol_massa2.equals("KG")) {
                        edit_massa2.setText(hitungmassa.HgToKg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("HG", "KG",
                                value_to_conversion, hitungmassa.HgToKg(value_to_conversion)));
                    }
                    // HG to DAG
                    else if (symbol_massa1.equals("HG") && symbol_massa2.equals("DAG")) {
                        edit_massa2.setText(hitungmassa.HgToDag(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("HG", "DAG",
                                value_to_conversion, hitungmassa.HgToDag(value_to_conversion)));
                    }
                    // HG to G
                    else if (symbol_massa1.equals("HG") && symbol_massa2.equals("Gram")) {
                        edit_massa2.setText(hitungmassa.HgToG(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("HG", "Gram",
                                value_to_conversion, hitungmassa.HgToG(value_to_conversion)));
                    }
                    // HG to DG
                    else if (symbol_massa1.equals("HG") && symbol_massa2.equals("DG")) {
                        edit_massa2.setText(hitungmassa.HgToDg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("HG", "DG",
                                value_to_conversion, hitungmassa.HgToDg(value_to_conversion)));
                    }
                    // HG to CG
                    else if (symbol_massa1.equals("HG") && symbol_massa2.equals("CG")) {
                        edit_massa2.setText(hitungmassa.HgToCg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("HG", "CG",
                                value_to_conversion, hitungmassa.HgToCg(value_to_conversion)));
                    }
                    // HG to MG
                    else if (symbol_massa1.equals("HG") && symbol_massa2.equals("MG")) {
                        edit_massa2.setText(hitungmassa.HgToMg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("HG", "MG",
                                value_to_conversion, hitungmassa.HgToMg(value_to_conversion)));
                    }
                    // DAG to TON
                    else if (symbol_massa1.equals("DAG") && symbol_massa2.equals("TON")) {
                        edit_massa2.setText(hitungmassa.DagToTon(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DAG", "TON",
                                value_to_conversion, hitungmassa.DagToTon(value_to_conversion)));
                    }
                    // DAG to KW
                    else if (symbol_massa1.equals("DAG") && symbol_massa2.equals("KWINTAL")) {
                        edit_massa2.setText(hitungmassa.DagToKwintal(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DAG", "KWINTAL",
                                value_to_conversion, hitungmassa.DagToKwintal(value_to_conversion)));
                    }
                    // DAG to KG
                    else if (symbol_massa1.equals("DAG") && symbol_massa2.equals("KG")) {
                        edit_massa2.setText(hitungmassa.DagToKg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DAG", "KG",
                                value_to_conversion, hitungmassa.DagToKg(value_to_conversion)));
                    }
                    // DAG to HG
                    else if (symbol_massa1.equals("DAG") && symbol_massa2.equals("HG")) {
                        edit_massa2.setText(hitungmassa.DagToHg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DAG", "HG",
                                value_to_conversion, hitungmassa.DagToHg(value_to_conversion)));
                    }
                    // DAG to G
                    else if (symbol_massa1.equals("DAG") && symbol_massa2.equals("Gram")) {
                        edit_massa2.setText(hitungmassa.DagToG(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DAG", "Gram",
                                value_to_conversion, hitungmassa.DagToG(value_to_conversion)));
                    }
                    // DAG to DG
                    else if (symbol_massa1.equals("DAG") && symbol_massa2.equals("DG")) {
                        edit_massa2.setText(hitungmassa.DagToDg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DAG", "DG",
                                value_to_conversion, hitungmassa.DagToDg(value_to_conversion)));
                    }
                    // DAG to DG
                    else if (symbol_massa1.equals("DAG") && symbol_massa2.equals("CG")) {
                        edit_massa2.setText(hitungmassa.DagToCg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DAG", "CG",
                                value_to_conversion, hitungmassa.DagToCg(value_to_conversion)));
                    }
                    // DAG to DG
                    else if (symbol_massa1.equals("DAG") && symbol_massa2.equals("MG")) {
                        edit_massa2.setText(hitungmassa.DagToMg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DAG", "MG",
                                value_to_conversion, hitungmassa.DagToMg(value_to_conversion)));
                    }
                    // G to TON
                    else if (symbol_massa1.equals("Gram") && symbol_massa2.equals("TON")) {
                        edit_massa2.setText(hitungmassa.GToTon(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("Gram", "TON",
                                value_to_conversion, hitungmassa.GToTon(value_to_conversion)));
                    }
                    // G to KW
                    else if (symbol_massa1.equals("Gram") && symbol_massa2.equals("KWINTAL")) {
                        edit_massa2.setText(hitungmassa.GToKwintal(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("Gram", "KWINTAL",
                                value_to_conversion, hitungmassa.GToKwintal(value_to_conversion)));
                    }
                    // G to KG
                    else if (symbol_massa1.equals("Gram") && symbol_massa2.equals("KG")) {
                        edit_massa2.setText(hitungmassa.GToKg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("Gram", "KG",
                                value_to_conversion, hitungmassa.GToKg(value_to_conversion)));
                    }
                    // G to HG
                    else if (symbol_massa1.equals("Gram") && symbol_massa2.equals("HG")) {
                        edit_massa2.setText(hitungmassa.GToHg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("Gram", "HG",
                                value_to_conversion, hitungmassa.GToHg(value_to_conversion)));
                    }
                    // G to DAG
                    else if (symbol_massa1.equals("Gram") && symbol_massa2.equals("DAG")) {
                        edit_massa2.setText(hitungmassa.GToDag(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("Gram", "DAG",
                                value_to_conversion, hitungmassa.GToDag(value_to_conversion)));
                    }
                    // G to DG
                    else if (symbol_massa1.equals("Gram") && symbol_massa2.equals("DG")) {
                        edit_massa2.setText(hitungmassa.GToDg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("Gram", "DG",
                                value_to_conversion, hitungmassa.GToDg(value_to_conversion)));
                    }
                    // G to CG
                    else if (symbol_massa1.equals("Gram") && symbol_massa2.equals("CG")) {
                        edit_massa2.setText(hitungmassa.GToCg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("Gram", "CG",
                                value_to_conversion, hitungmassa.GToCg(value_to_conversion)));
                    }
                    // G to MG
                    else if (symbol_massa1.equals("Gram") && symbol_massa2.equals("MG")) {
                        edit_massa2.setText(hitungmassa.GToMg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("Gram", "MG",
                                value_to_conversion, hitungmassa.GToMg(value_to_conversion)));
                    }
                    // DG to TON
                    else if (symbol_massa1.equals("DG") && symbol_massa2.equals("TON")) {
                        edit_massa2.setText(hitungmassa.DgToTon(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DG", "TON",
                                value_to_conversion, hitungmassa.DgToTon(value_to_conversion)));
                    }
                    // DG to KW
                    else if (symbol_massa1.equals("DG") && symbol_massa2.equals("KWINTAL")) {
                        edit_massa2.setText(hitungmassa.DgToKwintal(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DG", "KWINTAL",
                                value_to_conversion, hitungmassa.DgToKwintal(value_to_conversion)));
                    }
                    // DG to KG
                    else if (symbol_massa1.equals("DG") && symbol_massa2.equals("KG")) {
                        edit_massa2.setText(hitungmassa.DgToKg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DG", "KG",
                                value_to_conversion, hitungmassa.DgToKg(value_to_conversion)));
                    }
                    // DG to HG
                    else if (symbol_massa1.equals("DG") && symbol_massa2.equals("HG")) {
                        edit_massa2.setText(hitungmassa.DgToHg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DG", "HG",
                                value_to_conversion, hitungmassa.DgToHg(value_to_conversion)));
                    }
                    // DG to DAG
                    else if (symbol_massa1.equals("DG") && symbol_massa2.equals("DAG")) {
                        edit_massa2.setText(hitungmassa.DgToDag(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DG", "DAG",
                                value_to_conversion, hitungmassa.DgToDag(value_to_conversion)));
                    }
                    // DG to G
                    else if (symbol_massa1.equals("DG") && symbol_massa2.equals("Gram")) {
                        edit_massa2.setText(hitungmassa.DgToG(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DG", "Gram",
                                value_to_conversion, hitungmassa.DgToG(value_to_conversion)));
                    }
                    // DG to CG
                    else if (symbol_massa1.equals("DG") && symbol_massa2.equals("CG")) {
                        edit_massa2.setText(hitungmassa.DgToCg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DG", "CG",
                                value_to_conversion, hitungmassa.DgToCg(value_to_conversion)));
                    }
                    // DG to MG
                    else if (symbol_massa1.equals("DG") && symbol_massa2.equals("MG")) {
                        edit_massa2.setText(hitungmassa.DgToMg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("DG", "MG",
                                value_to_conversion, hitungmassa.DgToMg(value_to_conversion)));
                    }
                    // CG to TON
                    else if (symbol_massa1.equals("CG") && symbol_massa2.equals("TON")) {
                        edit_massa2.setText(hitungmassa.CgToTon(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("CG", "TON",
                                value_to_conversion, hitungmassa.CgToTon(value_to_conversion)));
                    }
                    // CG to KW
                    else if (symbol_massa1.equals("CG") && symbol_massa2.equals("KWINTAL")) {
                        edit_massa2.setText(hitungmassa.CgToKwintal(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("CG", "KWINTAL",
                                value_to_conversion, hitungmassa.CgToKwintal(value_to_conversion)));
                    }
                    // CG to KG
                    else if (symbol_massa1.equals("CG") && symbol_massa2.equals("KG")) {
                        edit_massa2.setText(hitungmassa.CgToKg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("CG", "KG",
                                value_to_conversion, hitungmassa.CgToKg(value_to_conversion)));
                    }
                    // CG to HG
                    else if (symbol_massa1.equals("CG") && symbol_massa2.equals("HG")) {
                        edit_massa2.setText(hitungmassa.CgToHg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("CG", "HG",
                                value_to_conversion, hitungmassa.CgToHg(value_to_conversion)));
                    }
                    // CG to DAG
                    else if (symbol_massa1.equals("CG") && symbol_massa2.equals("DAG")) {
                        edit_massa2.setText(hitungmassa.CgToDag(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("CG", "DAG",
                                value_to_conversion, hitungmassa.CgToDag(value_to_conversion)));
                    }
                    // CG to G
                    else if (symbol_massa1.equals("CG") && symbol_massa2.equals("Gram")) {
                        edit_massa2.setText(hitungmassa.CgToG(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("CG", "Gram",
                                value_to_conversion, hitungmassa.CgToG(value_to_conversion)));
                    }
                    // CG to DG
                    else if (symbol_massa1.equals("CG") && symbol_massa2.equals("DG")) {
                        edit_massa2.setText(hitungmassa.CgToDg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("CG", "DG",
                                value_to_conversion, hitungmassa.CgToDg(value_to_conversion)));
                    }
                    // CG to MG
                    else if (symbol_massa1.equals("CG") && symbol_massa2.equals("MG")) {
                        edit_massa2.setText(hitungmassa.CgToMg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("CG", "MG",
                                value_to_conversion, hitungmassa.CgToMg(value_to_conversion)));
                    }
                    // MG to TON
                    else if (symbol_massa1.equals("MG") && symbol_massa2.equals("TON")) {
                        edit_massa2.setText(hitungmassa.MgToTon(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("MG", "TON",
                                value_to_conversion, hitungmassa.MgToTon(value_to_conversion)));
                    }
                    // MG to KW
                    else if (symbol_massa1.equals("MG") && symbol_massa2.equals("KWINTAL")) {
                        edit_massa2.setText(hitungmassa.MgToKwintal(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("MG", "KWINTAL",
                                value_to_conversion, hitungmassa.MgToKwintal(value_to_conversion)));
                    }
                    // MG to KG
                    else if (symbol_massa1.equals("MG") && symbol_massa2.equals("KG")) {
                        edit_massa2.setText(hitungmassa.MgToKg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("MG", "KG",
                                value_to_conversion, hitungmassa.MgToKg(value_to_conversion)));
                    }
                    // MG to HG
                    else if (symbol_massa1.equals("MG") && symbol_massa2.equals("HG")) {
                        edit_massa2.setText(hitungmassa.MgToHg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("MG", "HG",
                                value_to_conversion, hitungmassa.MgToHg(value_to_conversion)));
                    }
                    // MG to DAG
                    else if (symbol_massa1.equals("MG") && symbol_massa2.equals("DAG")) {
                        edit_massa2.setText(hitungmassa.MgToDag(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("MG", "DAG",
                                value_to_conversion, hitungmassa.MgToDag(value_to_conversion)));
                    }
                    // MG to G
                    else if (symbol_massa1.equals("MG") && symbol_massa2.equals("Gram")) {
                        edit_massa2.setText(hitungmassa.MgToG(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("MG", "Gram",
                                value_to_conversion, hitungmassa.MgToG(value_to_conversion)));
                    }
                    // MG to DG
                    else if (symbol_massa1.equals("MG") && symbol_massa2.equals("DG")) {
                        edit_massa2.setText(hitungmassa.MgToDg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("MG", "DG",
                                value_to_conversion, hitungmassa.MgToDg(value_to_conversion)));
                    }
                    // MG to CG
                    else if (symbol_massa1.equals("MG") && symbol_massa2.equals("CG")) {
                        edit_massa2.setText(hitungmassa.MgToCg(value_to_conversion));
                        text_formula.setText(hitungmassa.getFormula("MG", "CG",
                                value_to_conversion, hitungmassa.MgToCg(value_to_conversion)));
                    }
                    //if TON equals TON
                    else if (symbol_massa1.equals("TON") && symbol_massa2.equals("TON")) {
                        edit_massa2.setText(hitungmassa.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("TON  =  " + hitungmassa.check_after_decimal_point(value_to_conversion));
                    }
                    //if kw equals KW
                    else if (symbol_massa1.equals("KWINTAL") && symbol_massa2.equals("KWINTAL")) {
                        edit_massa2.setText(hitungmassa.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("KWINTAL  =  " + hitungmassa.check_after_decimal_point(value_to_conversion));
                    }
                    //if KG equals KG
                    else if (symbol_massa1.equals("KG") && symbol_massa2.equals("KG")) {
                        edit_massa2.setText(hitungmassa.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("KG  =  " + hitungmassa.check_after_decimal_point(value_to_conversion));
                    }
                    //if HG equals HG
                    else if (symbol_massa1.equals("HG") && symbol_massa2.equals("HG")) {
                        edit_massa2.setText(hitungmassa.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("HG  =  " + hitungmassa.check_after_decimal_point(value_to_conversion));
                    }
                    //if DAG equals DAG
                    else if (symbol_massa1.equals("DAG") && symbol_massa2.equals("DAG")) {
                        edit_massa2.setText(hitungmassa.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("DAG  =  " + hitungmassa.check_after_decimal_point(value_to_conversion));
                    }
                    //if G equals G
                    else if (symbol_massa1.equals("Gram") && symbol_massa2.equals("Gram")) {
                        edit_massa2.setText(hitungmassa.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("Gram  =  " + hitungmassa.check_after_decimal_point(value_to_conversion));
                    }
                    //if DG equals DG
                    else if (symbol_massa1.equals("DG") && symbol_massa2.equals("DG")) {
                        edit_massa2.setText(hitungmassa.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("DG  =  " + hitungmassa.check_after_decimal_point(value_to_conversion));
                    }
                    //if CG equals CG
                    else if (symbol_massa1.equals("CG") && symbol_massa2.equals("CG")) {
                        edit_massa2.setText(hitungmassa.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("CG  =  " + hitungmassa.check_after_decimal_point(value_to_conversion));
                    }
                    //if MG equals MG
                    else if (symbol_massa1.equals("MG") && symbol_massa2.equals("MG")) {
                        edit_massa2.setText(hitungmassa.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("MG  =  " + hitungmassa.check_after_decimal_point(value_to_conversion));
                    }
                }
            }
        });
    }

}

