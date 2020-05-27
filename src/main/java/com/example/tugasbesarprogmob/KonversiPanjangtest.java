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
import com.example.tugasbesarprogmob.rumus_panjang.HitungPanjang;
import com.example.tugasbesarprogmob.rumus_panjang.SharedPrefsPanjang;

import java.util.Objects;

public class KonversiPanjangtest extends AppCompatActivity {

    private AppCompatEditText edit_panjang1;
    private AppCompatEditText edit_panjang2;
    private HitungPanjang hitungpanjang;
    private LinearLayout layout_formula;
    private Animation rotate_zoom_out;
    private TextView text_formula;
    private String[] hitungPanjang = new String[]{
            "KM",
            "HM",
            "DAM",
            "Meter",
            "DM",
            "CM",
            "MM"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_panjangtest);

        hitungpanjang = new HitungPanjang(this);

        layout_formula = findViewById(R.id.layout_formula);
        text_formula = findViewById(R.id.text_formula);
        rotate_zoom_out = AnimationUtils.loadAnimation(KonversiPanjangtest.this, R.anim.rotate_zoom_out);

        getSupportActionBar().setTitle("Konversi Panjang");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //edit text temp to conversion 1
        edit_panjang1 = findViewById(R.id.edit_1);
        edit_panjang1.setHint(SharedPrefsPanjang.getPanjangSymbol1(KonversiPanjangtest.this));

        //edit text temp to conversion 2
        edit_panjang2 = findViewById(R.id.edit_2);
        edit_panjang2.setHint(SharedPrefsPanjang.getPanjangSymbol2(KonversiPanjangtest.this));
        edit_panjang2.setKeyListener(null);
        edit_panjang2.setClickable(false);

        //Spinner & Adapter 1
        ArrayAdapter<String> arrayAdapter1 =
                new ArrayAdapter(KonversiPanjangtest.this, android.R.layout.simple_spinner_item, hitungPanjang);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AppCompatSpinner appCompatSpinner1 = findViewById(R.id.spinner_1);
        appCompatSpinner1.setAdapter(arrayAdapter1);

        //set selection
        appCompatSpinner1.setSelection(SharedPrefsPanjang.getPanjangIndex1(KonversiPanjangtest.this));
        appCompatSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String panjang_symbol1 = hitungPanjang[position];
                SharedPrefsPanjang.setPanjang1(KonversiPanjangtest.this, panjang_symbol1, position);
                edit_panjang1.setHint(hitungPanjang[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //spinner & adapter 2
        ArrayAdapter<String> arrayAdapter2 =
                new ArrayAdapter(KonversiPanjangtest.this, android.R.layout.simple_spinner_item, hitungPanjang);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AppCompatSpinner appCompatSpinner2 = findViewById(R.id.spinner_2);
        appCompatSpinner2.setAdapter(arrayAdapter2);
        appCompatSpinner2.setSelection(SharedPrefsPanjang.getPanjangIndex2(KonversiPanjangtest.this));
        appCompatSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String panjang_symbol2 = hitungPanjang[position];
                SharedPrefsPanjang.setPanjang2(KonversiPanjangtest.this, panjang_symbol2, position);
                edit_panjang2.setHint(hitungPanjang[position]);
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
                if (Objects.requireNonNull(edit_panjang1.getText()).toString().isEmpty()) {

                    Toast.makeText(KonversiPanjangtest.this,
                            "Masukan nilai panjang yang ingin di konversi", Toast.LENGTH_SHORT).show();

                } else {
                    layout_formula.startAnimation(rotate_zoom_out);
                    if (layout_formula.getVisibility() == View.GONE) {
                        layout_formula.setVisibility(View.VISIBLE);
                    }
                    String symbol_panjang1 = SharedPrefsPanjang.getPanjangSymbol1(KonversiPanjangtest.this);
                    String symbol_panjang2 = SharedPrefsPanjang.getPanjangSymbol2(KonversiPanjangtest.this);
                    double value_to_conversion = Double.parseDouble(edit_panjang1.getText().toString());

                    // KM to hm
                    if (symbol_panjang1.equals("KM") && symbol_panjang2.equals("HM")) {
                        edit_panjang2.setText(hitungpanjang.KmToHm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("KM", "HM",
                                value_to_conversion, hitungpanjang.KmToHm(value_to_conversion)));
                    }
                    // KM to DAM
                    else if (symbol_panjang1.equals("KM") && symbol_panjang2.equals("DAM")) {
                        edit_panjang2.setText(hitungpanjang.KmToDam(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("KM", "DAM",
                                value_to_conversion, hitungpanjang.KmToDam(value_to_conversion)));
                    }
                    // km to Meter
                    else if (symbol_panjang1.equals("KM") && symbol_panjang2.equals("Meter")) {
                        edit_panjang2.setText(hitungpanjang.KmToM(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("KM", "Meter",
                                value_to_conversion, hitungpanjang.KmToM(value_to_conversion)));
                    }
                    // KM to DM
                    else if (symbol_panjang1.equals("KM") && symbol_panjang2.equals("DM")) {
                        edit_panjang2.setText(hitungpanjang.KmToDm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("KM", "DM",
                                value_to_conversion, hitungpanjang.KmToDm(value_to_conversion)));
                    }
                    // KM to CM
                    else if (symbol_panjang1.equals("KM") && symbol_panjang2.equals("CM")) {
                        edit_panjang2.setText(hitungpanjang.KmToCm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("KM", "CM",
                                value_to_conversion, hitungpanjang.KmToCm(value_to_conversion)));
                    }
                    // KM to MM
                    else if (symbol_panjang1.equals("KM") && symbol_panjang2.equals("MM")) {
                        edit_panjang2.setText(hitungpanjang.KmToMm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("KM", "MM",
                                value_to_conversion, hitungpanjang.KmToMm(value_to_conversion)));
                    }
                    // HM to Km
                    else if (symbol_panjang1.equals("HM") && symbol_panjang2.equals("KM")) {
                        edit_panjang2.setText(hitungpanjang.HmToKm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("HM", "KM",
                                value_to_conversion, hitungpanjang.HmToKm(value_to_conversion)));
                    }
                    // HM to DAM
                    else if (symbol_panjang1.equals("HM") && symbol_panjang2.equals("DAM")) {
                        edit_panjang2.setText(hitungpanjang.HmToDam(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("HM", "DAM",
                                value_to_conversion, hitungpanjang.HmToDam(value_to_conversion)));
                    }
                    // HM to Meter
                    else if (symbol_panjang1.equals("HM") && symbol_panjang2.equals("Meter")) {
                        edit_panjang2.setText(hitungpanjang.HmToM(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("HM", "Meter",
                                value_to_conversion, hitungpanjang.HmToM(value_to_conversion)));
                    }
                    // HM to DM
                    else if (symbol_panjang1.equals("HM") && symbol_panjang2.equals("DM")) {
                        edit_panjang2.setText(hitungpanjang.HmToDm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("HM", "DM",
                                value_to_conversion, hitungpanjang.HmToDm(value_to_conversion)));
                    }
                    // HM to CM
                    else if (symbol_panjang1.equals("HM") && symbol_panjang2.equals("CM")) {
                        edit_panjang2.setText(hitungpanjang.HmToCm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("HM", "CM",
                                value_to_conversion, hitungpanjang.HmToCm(value_to_conversion)));
                    }
                    // HM to MM
                    else if (symbol_panjang1.equals("HM") && symbol_panjang2.equals("MM")) {
                        edit_panjang2.setText(hitungpanjang.HmToMm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("HM", "MM",
                                value_to_conversion, hitungpanjang.HmToMm(value_to_conversion)));
                    }
                    // DAM to KM
                    else if (symbol_panjang1.equals("DAM") && symbol_panjang2.equals("KM")) {
                        edit_panjang2.setText(hitungpanjang.DamToKm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("DAM", "KM",
                                value_to_conversion, hitungpanjang.DamToKm(value_to_conversion)));
                    }
                    // DAM to HM
                    else if (symbol_panjang1.equals("DAM") && symbol_panjang2.equals("HM")) {
                        edit_panjang2.setText(hitungpanjang.DamToHm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("DAM", "HM",
                                value_to_conversion, hitungpanjang.DamToHm(value_to_conversion)));
                    }
                    // DAM to Meter
                    else if (symbol_panjang1.equals("DAM") && symbol_panjang2.equals("Meter")) {
                        edit_panjang2.setText(hitungpanjang.DamToM(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("DAM", "Meter",
                                value_to_conversion, hitungpanjang.DamToM(value_to_conversion)));
                    }
                    // DAM to DM
                    else if (symbol_panjang1.equals("DAM") && symbol_panjang2.equals("DM")) {
                        edit_panjang2.setText(hitungpanjang.DamToDm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("DAM", "DM",
                                value_to_conversion, hitungpanjang.DamToDm(value_to_conversion)));
                    }
                    // DAm to Cm
                    else if (symbol_panjang1.equals("DAM") && symbol_panjang2.equals("CM")) {
                        edit_panjang2.setText(hitungpanjang.DamToCm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("DAM", "CM",
                                value_to_conversion, hitungpanjang.DamToCm(value_to_conversion)));
                    }
                    // DAM to MM
                    else if (symbol_panjang1.equals("DAM") && symbol_panjang2.equals("MM")) {
                        edit_panjang2.setText(hitungpanjang.DamToMm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("DAM", "MM",
                                value_to_conversion, hitungpanjang.DamToMm(value_to_conversion)));
                    }
                    // Meter to KM
                    else if (symbol_panjang1.equals("Meter") && symbol_panjang2.equals("KM")) {
                        edit_panjang2.setText(hitungpanjang.MToKm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("Meter", "KM",
                                value_to_conversion, hitungpanjang.MToKm(value_to_conversion)));
                    }
                    // Meter to HM
                    else if (symbol_panjang1.equals("Meter") && symbol_panjang2.equals("HM")) {
                        edit_panjang2.setText(hitungpanjang.MToHm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("Meter", "HM",
                                value_to_conversion, hitungpanjang.MToHm(value_to_conversion)));
                    }
                    // Meter to DAM
                    else if (symbol_panjang1.equals("Meter") && symbol_panjang2.equals("DAM")) {
                        edit_panjang2.setText(hitungpanjang.MToDam(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("Meter", "DAM",
                                value_to_conversion, hitungpanjang.MToDam(value_to_conversion)));
                    }
                    // Meter to DM
                    else if (symbol_panjang1.equals("Meter") && symbol_panjang2.equals("DM")) {
                        edit_panjang2.setText(hitungpanjang.MToDm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("Meter", "DM",
                                value_to_conversion, hitungpanjang.MToDm(value_to_conversion)));
                    }
                    // Meter to CM
                    else if (symbol_panjang1.equals("Meter") && symbol_panjang2.equals("CM")) {
                        edit_panjang2.setText(hitungpanjang.MToCm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("Meter", "CM",
                                value_to_conversion, hitungpanjang.MToCm(value_to_conversion)));
                    }
                    // L to MM
                    else if (symbol_panjang1.equals("Meter") && symbol_panjang2.equals("MM")) {
                        edit_panjang2.setText(hitungpanjang.MToMm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("Meter", "MM",
                                value_to_conversion, hitungpanjang.MToMm(value_to_conversion)));
                    }
                    // DM to KM
                    else if (symbol_panjang1.equals("DM") && symbol_panjang2.equals("KM")) {
                        edit_panjang2.setText(hitungpanjang.DmToKm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("DM", "KM",
                                value_to_conversion, hitungpanjang.DmToKm(value_to_conversion)));
                    }
                    // DM to HM
                    else if (symbol_panjang1.equals("DM") && symbol_panjang2.equals("HM")) {
                        edit_panjang2.setText(hitungpanjang.DmToHm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("DM", "HM",
                                value_to_conversion, hitungpanjang.DmToHm(value_to_conversion)));
                    }
                    // DM to DAM
                    else if (symbol_panjang1.equals("DM") && symbol_panjang2.equals("DAM")) {
                        edit_panjang2.setText(hitungpanjang.DmToDam(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("DM", "DAM",
                                value_to_conversion, hitungpanjang.DmToDam(value_to_conversion)));
                    }
                    // DM to Meter
                    else if (symbol_panjang1.equals("DM") && symbol_panjang2.equals("Meter")) {
                        edit_panjang2.setText(hitungpanjang.DmToM(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("DM", "Meter",
                                value_to_conversion, hitungpanjang.DmToM(value_to_conversion)));
                    }
                    // DM to CM
                    else if (symbol_panjang1.equals("DM") && symbol_panjang2.equals("CM")) {
                        edit_panjang2.setText(hitungpanjang.DmToCm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("DM", "CM",
                                value_to_conversion, hitungpanjang.DmToCm(value_to_conversion)));
                    }
                    // DM to MM
                    else if (symbol_panjang1.equals("DM") && symbol_panjang2.equals("MM")) {
                        edit_panjang2.setText(hitungpanjang.DmToMm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("DM", "MM",
                                value_to_conversion, hitungpanjang.DmToMm(value_to_conversion)));
                    }
                    // CM to KM
                    else if (symbol_panjang1.equals("CM") && symbol_panjang2.equals("KM")) {
                        edit_panjang2.setText(hitungpanjang.CmToKm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("CM", "KM",
                                value_to_conversion, hitungpanjang.CmToKm(value_to_conversion)));
                    }
                    // CM to HM
                    else if (symbol_panjang1.equals("CM") && symbol_panjang2.equals("HM")) {
                        edit_panjang2.setText(hitungpanjang.CmToHm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("CM", "HM",
                                value_to_conversion, hitungpanjang.CmToHm(value_to_conversion)));
                    }
                    // CM to DAM
                    else if (symbol_panjang1.equals("CM") && symbol_panjang2.equals("DAM")) {
                        edit_panjang2.setText(hitungpanjang.CmToDam(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("CM", "DAM",
                                value_to_conversion, hitungpanjang.CmToDam(value_to_conversion)));
                    }
                    // CM to Meter
                    else if (symbol_panjang1.equals("CM") && symbol_panjang2.equals("Meter")) {
                        edit_panjang2.setText(hitungpanjang.CmToM(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("CM", "Meter",
                                value_to_conversion, hitungpanjang.CmToM(value_to_conversion)));
                    }
                    // CM to DM
                    else if (symbol_panjang1.equals("CM") && symbol_panjang2.equals("DM")) {
                        edit_panjang2.setText(hitungpanjang.CmToDm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("CM", "DM",
                                value_to_conversion, hitungpanjang.CmToDm(value_to_conversion)));
                    }
                    // CM to MM
                    else if (symbol_panjang1.equals("CM") && symbol_panjang2.equals("MM")) {
                        edit_panjang2.setText(hitungpanjang.CmToMm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("CM", "MM",
                                value_to_conversion, hitungpanjang.CmToMm(value_to_conversion)));
                    }
                    // MM to KM
                    else if (symbol_panjang1.equals("MM") && symbol_panjang2.equals("KM")) {
                        edit_panjang2.setText(hitungpanjang.MmToKm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("MM", "KM",
                                value_to_conversion, hitungpanjang.MmToKm(value_to_conversion)));
                    }
                    // MM to HM
                    else if (symbol_panjang1.equals("MM") && symbol_panjang2.equals("HM")) {
                        edit_panjang2.setText(hitungpanjang.MmToHm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("MM", "HM",
                                value_to_conversion, hitungpanjang.MmToHm(value_to_conversion)));
                    }
                    // MM to DAM
                    else if (symbol_panjang1.equals("MM") && symbol_panjang2.equals("DAM")) {
                        edit_panjang2.setText(hitungpanjang.MmToDam(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("MM", "DAM",
                                value_to_conversion, hitungpanjang.MmToDam(value_to_conversion)));
                    }
                    // MM to Meter
                    else if (symbol_panjang1.equals("MM") && symbol_panjang2.equals("Meter")) {
                        edit_panjang2.setText(hitungpanjang.MmToM(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("MM", "Meter",
                                value_to_conversion, hitungpanjang.MmToM(value_to_conversion)));
                    }
                    // MM to DM
                    else if (symbol_panjang1.equals("MM") && symbol_panjang2.equals("DM")) {
                        edit_panjang2.setText(hitungpanjang.MmToDm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("MM", "DM",
                                value_to_conversion, hitungpanjang.MmToDm(value_to_conversion)));
                    }
                    // MM to CM
                    else if (symbol_panjang1.equals("MM") && symbol_panjang2.equals("CM")) {
                        edit_panjang2.setText(hitungpanjang.MmToCm(value_to_conversion));
                        text_formula.setText(hitungpanjang.getFormula("MM", "CM",
                                value_to_conversion, hitungpanjang.MmToCm(value_to_conversion)));
                    }
                    //if KM equals KM
                    else if (symbol_panjang1.equals("KM") && symbol_panjang2.equals("KM")) {
                        edit_panjang2.setText(hitungpanjang.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("KM  =  " + hitungpanjang.check_after_decimal_point(value_to_conversion));
                    }
                    //if HM equals HM
                    else if (symbol_panjang1.equals("HM") && symbol_panjang2.equals("HM")) {
                        edit_panjang2.setText(hitungpanjang.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("HM  =  " + hitungpanjang.check_after_decimal_point(value_to_conversion));
                    }
                    //if DAM equals DAM
                    else if (symbol_panjang1.equals("DAM") && symbol_panjang2.equals("DAM")) {
                        edit_panjang2.setText(hitungpanjang.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("DAM  =  " + hitungpanjang.check_after_decimal_point(value_to_conversion));
                    }
                    //if Meter equals Meter
                    else if (symbol_panjang1.equals("Meter") && symbol_panjang2.equals("Meter")) {
                        edit_panjang2.setText(hitungpanjang.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("Meter  =  " + hitungpanjang.check_after_decimal_point(value_to_conversion));
                    }
                    //if DM equals DM
                    else if (symbol_panjang1.equals("DM") && symbol_panjang2.equals("DM")) {
                        edit_panjang2.setText(hitungpanjang.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("DM  =  " + hitungpanjang.check_after_decimal_point(value_to_conversion));
                    }
                    //if CM equals CM
                    else if (symbol_panjang1.equals("CM") && symbol_panjang2.equals("CM")) {
                        edit_panjang2.setText(hitungpanjang.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("CM  =  " + hitungpanjang.check_after_decimal_point(value_to_conversion));
                    }
                    //if MM equals MM
                    else if (symbol_panjang1.equals("MM") && symbol_panjang2.equals("MM")) {
                        edit_panjang2.setText(hitungpanjang.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("MM  =  " + hitungpanjang.check_after_decimal_point(value_to_conversion));
                    }
                }
            }
        });
    }


}

