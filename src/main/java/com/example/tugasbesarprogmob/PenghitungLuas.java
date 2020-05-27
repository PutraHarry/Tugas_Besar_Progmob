package com.example.tugasbesarprogmob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSpinner;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugasbesarprogmob.rumus_luas.HitungLuas;
import com.example.tugasbesarprogmob.rumus_luas.SharedPrefsLuas;

import java.util.Objects;

public class PenghitungLuas extends AppCompatActivity {
    private AppCompatEditText edit_luas1;
    private AppCompatEditText edit_luas2;
    private HitungLuas hitungluas;
    private LinearLayout layout_formula;
    private TextView text_formula;
    private Animation rotate_zoom_out;
    private String[] hitungLuas = new String[]{
            "KA",
            "HA",
            "DAA",
            "Are",
            "DA",
            "CA",
            "MA"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_luas);

        hitungluas = new HitungLuas(this);

        layout_formula = findViewById(R.id.layout_formula);
        text_formula = findViewById(R.id.text_formula);

        rotate_zoom_out = AnimationUtils.loadAnimation(PenghitungLuas.this, R.anim.rotate_zoom_out);

        getSupportActionBar().setTitle("Konversi Luas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //edit text temp to conversion 1
        edit_luas1 = findViewById(R.id.edit_1);
        edit_luas1.setHint(SharedPrefsLuas.getLuasSymbol1(PenghitungLuas.this));

        //edit text temp to conversion 2
        edit_luas2 = findViewById(R.id.edit_2);
        edit_luas2.setHint(SharedPrefsLuas.getLuasSymbol2(PenghitungLuas.this));
        edit_luas2.setKeyListener(null);
        edit_luas2.setClickable(false);

        //Spinner & Adapter 1
        ArrayAdapter<String> arrayAdapter1 =
                new ArrayAdapter(PenghitungLuas.this, android.R.layout.simple_spinner_item, hitungLuas);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AppCompatSpinner appCompatSpinner1 = findViewById(R.id.spinner_1);
        appCompatSpinner1.setAdapter(arrayAdapter1);

        //set selection
        appCompatSpinner1.setSelection(SharedPrefsLuas.getLuasIndex1(PenghitungLuas.this));
        appCompatSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String luas_symbol1 = hitungLuas[position];
                SharedPrefsLuas.setLuas1(PenghitungLuas.this, luas_symbol1, position);
                edit_luas1.setHint(hitungLuas[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //spinner & adapter 2
        ArrayAdapter<String> arrayAdapter2 =
                new ArrayAdapter(PenghitungLuas.this, android.R.layout.simple_spinner_item, hitungLuas);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AppCompatSpinner appCompatSpinner2 = findViewById(R.id.spinner_2);
        appCompatSpinner2.setAdapter(arrayAdapter2);
        appCompatSpinner2.setSelection(SharedPrefsLuas.getLuasIndex2(PenghitungLuas.this));
        appCompatSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String luas_symbol2 = hitungLuas[position];
                SharedPrefsLuas.setLuas2(PenghitungLuas.this, luas_symbol2, position);
                edit_luas2.setHint(hitungLuas[position]);
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
                if (Objects.requireNonNull(edit_luas1.getText()).toString().isEmpty()) {

                    Toast.makeText(PenghitungLuas.this,
                            "Masukan nilai luas yang ingin di konversi", Toast.LENGTH_SHORT).show();

                } else {
                    layout_formula.startAnimation(rotate_zoom_out);
                    if (layout_formula.getVisibility() == View.GONE) {
                        layout_formula.setVisibility(View.VISIBLE);
                    }
                    String symbol_luas1 = SharedPrefsLuas.getLuasSymbol1(PenghitungLuas.this);
                    String symbol_luas2 = SharedPrefsLuas.getLuasSymbol2(PenghitungLuas.this);
                    double value_to_conversion = Double.parseDouble(edit_luas1.getText().toString());

                    if (symbol_luas1.equals("KA") && symbol_luas2.equals("HA")) {
                        edit_luas2.setText(hitungluas.KaToHa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("KA", "HA",
                                value_to_conversion, hitungluas.KaToHa(value_to_conversion)));
                    }
                    // KM to DAM
                    else if (symbol_luas1.equals("KA") && symbol_luas2.equals("DAA")) {
                        edit_luas2.setText(hitungluas.KaToDaa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("KA", "DAA",
                                value_to_conversion, hitungluas.KaToDaa(value_to_conversion)));
                    }
                    // KM to M
                    else if (symbol_luas1.equals("KA") && symbol_luas2.equals("Are")) {
                        edit_luas2.setText(hitungluas.KaToA(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("KA", "Are",
                                value_to_conversion, hitungluas.KaToA(value_to_conversion)));
                    }
                    // KM to DM
                    else if (symbol_luas1.equals("KA") && symbol_luas2.equals("DA")) {
                        edit_luas2.setText(hitungluas.KaToDa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("KA", "DA",
                                value_to_conversion, hitungluas.KaToDa(value_to_conversion)));
                    }
                    // KM to CA
                    else if (symbol_luas1.equals("KA") && symbol_luas2.equals("CA")) {
                        edit_luas2.setText(hitungluas.KaToCa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("KA", "CA",
                                value_to_conversion, hitungluas.KaToCa(value_to_conversion)));
                    }
                    // KA to MA
                    else if (symbol_luas1.equals("KA") && symbol_luas2.equals("MA")) {
                        edit_luas2.setText(hitungluas.KaToMa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("KA", "MA",
                                value_to_conversion, hitungluas.KaToMa(value_to_conversion)));
                    }
                    // HM to KM
                    else if (symbol_luas1.equals("HA") && symbol_luas2.equals("KA")) {
                        edit_luas2.setText(hitungluas.HaToKa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("HA", "KA",
                                value_to_conversion, hitungluas.HaToKa(value_to_conversion)));
                    }
                    // HM to DAM
                    else if (symbol_luas1.equals("HA") && symbol_luas2.equals("DAA")) {
                        edit_luas2.setText(hitungluas.HaToDaa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("HA", "DAA",
                                value_to_conversion, hitungluas.HaToDaa(value_to_conversion)));
                    }
                    // HM to G
                    else if (symbol_luas1.equals("HA") && symbol_luas2.equals("Are")) {
                        edit_luas2.setText(hitungluas.HaToA(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("HA", "Are",
                                value_to_conversion, hitungluas.HaToA(value_to_conversion)));
                    }
                    // HM to DA
                    else if (symbol_luas1.equals("HA") && symbol_luas2.equals("DA")) {
                        edit_luas2.setText(hitungluas.HaToDa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("HA", "DA",
                                value_to_conversion, hitungluas.HaToDa(value_to_conversion)));
                    }
                    // HM to CA
                    else if (symbol_luas1.equals("HA") && symbol_luas2.equals("CA")) {
                        edit_luas2.setText(hitungluas.HaToCa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("HA", "CA",
                                value_to_conversion, hitungluas.HaToCa(value_to_conversion)));
                    }
                    // HM to MA
                    else if (symbol_luas1.equals("HA") && symbol_luas2.equals("MA")) {
                        edit_luas2.setText(hitungluas.HaToMa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("HA", "MA",
                                value_to_conversion, hitungluas.HaToMa(value_to_conversion)));
                    }
                    // DAM to KM
                    else if (symbol_luas1.equals("DAA") && symbol_luas2.equals("KA")) {
                        edit_luas2.setText(hitungluas.DaaToKa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("DAA", "KA",
                                value_to_conversion, hitungluas.DaaToKa(value_to_conversion)));
                    }
                    // DAM to HM
                    else if (symbol_luas1.equals("DAA") && symbol_luas2.equals("HA")) {
                        edit_luas2.setText(hitungluas.DaaToHa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("DAA", "HA",
                                value_to_conversion, hitungluas.DaaToHa(value_to_conversion)));
                    }
                    // DAM to G
                    else if (symbol_luas1.equals("DAA") && symbol_luas2.equals("Are")) {
                        edit_luas2.setText(hitungluas.DaaToA(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("DAA", "Are",
                                value_to_conversion, hitungluas.DaaToA(value_to_conversion)));
                    }
                    // DAM to DA
                    else if (symbol_luas1.equals("DAA") && symbol_luas2.equals("DA")) {
                        edit_luas2.setText(hitungluas.DaaToDa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("DAA", "DA",
                                value_to_conversion, hitungluas.DaaToDa(value_to_conversion)));
                    }
                    // DAM to CM
                    else if (symbol_luas1.equals("DAA") && symbol_luas2.equals("CA")) {
                        edit_luas2.setText(hitungluas.DaaToCa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("DAA", "CA",
                                value_to_conversion, hitungluas.DaaToCa(value_to_conversion)));
                    }
                    // DAM to MM
                    else if (symbol_luas1.equals("DAA") && symbol_luas2.equals("MA")) {
                        edit_luas2.setText(hitungluas.DaaToMa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("DAA", "MA",
                                value_to_conversion, hitungluas.DaaToMa(value_to_conversion)));
                    }
                    // G to KM
                    else if (symbol_luas1.equals("Are") && symbol_luas2.equals("KA")) {
                        edit_luas2.setText(hitungluas.AToKa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("Are", "KA",
                                value_to_conversion, hitungluas.AToKa(value_to_conversion)));
                    }
                    // G to HM
                    else if (symbol_luas1.equals("Are") && symbol_luas2.equals("HA")) {
                        edit_luas2.setText(hitungluas.AToHa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("Are", "HA",
                                value_to_conversion, hitungluas.AToHa(value_to_conversion)));
                    }
                    // G to DAM
                    else if (symbol_luas1.equals("Are") && symbol_luas2.equals("DAA")) {
                        edit_luas2.setText(hitungluas.AToDaa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("Are", "DAA",
                                value_to_conversion, hitungluas.AToDaa(value_to_conversion)));
                    }
                    // G to DA
                    else if (symbol_luas1.equals("Are") && symbol_luas2.equals("DA")) {
                        edit_luas2.setText(hitungluas.AToDa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("Are", "DA",
                                value_to_conversion, hitungluas.AToDa(value_to_conversion)));
                    }
                    // G to CA
                    else if (symbol_luas1.equals("Are") && symbol_luas2.equals("CA")) {
                        edit_luas2.setText(hitungluas.AToCa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("Are", "CA",
                                value_to_conversion, hitungluas.AToCa(value_to_conversion)));
                    }
                    // G to MA
                    else if (symbol_luas1.equals("Are") && symbol_luas2.equals("MA")) {
                        edit_luas2.setText(hitungluas.AToMa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("Are", "MA",
                                value_to_conversion, hitungluas.AToMa(value_to_conversion)));
                    }
                    // DA to KM
                    else if (symbol_luas1.equals("DA") && symbol_luas2.equals("KA")) {
                        edit_luas2.setText(hitungluas.DaToKa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("DA", "KA",
                                value_to_conversion, hitungluas.DaToKa(value_to_conversion)));
                    }
                    // DA to HM
                    else if (symbol_luas1.equals("DA") && symbol_luas2.equals("HA")) {
                        edit_luas2.setText(hitungluas.DaToHa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("DA", "HA",
                                value_to_conversion, hitungluas.DaToHa(value_to_conversion)));
                    }
                    // DA to DAM
                    else if (symbol_luas1.equals("DA") && symbol_luas2.equals("DAA")) {
                        edit_luas2.setText(hitungluas.DaToDaa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("DA", "DAA",
                                value_to_conversion, hitungluas.DaToDaa(value_to_conversion)));
                    }
                    // DA to M
                    else if (symbol_luas1.equals("DA") && symbol_luas2.equals("Are")) {
                        edit_luas2.setText(hitungluas.DaToA(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("DA", "Are",
                                value_to_conversion, hitungluas.DaToA(value_to_conversion)));
                    }
                    // DA to CA
                    else if (symbol_luas1.equals("DA") && symbol_luas2.equals("CA")) {
                        edit_luas2.setText(hitungluas.DaToCa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("DA", "CA",
                                value_to_conversion, hitungluas.DaToCa(value_to_conversion)));
                    }
                    // DA to MA
                    else if (symbol_luas1.equals("DA") && symbol_luas2.equals("MA")) {
                        edit_luas2.setText(hitungluas.DaToMa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("DA", "MA",
                                value_to_conversion, hitungluas.DaToMa(value_to_conversion)));
                    }
                    // CA to KM
                    else if (symbol_luas1.equals("CA") && symbol_luas2.equals("KA")) {
                        edit_luas2.setText(hitungluas.CaToKa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("CA", "KA",
                                value_to_conversion, hitungluas.CaToKa(value_to_conversion)));
                    }
                    // CA to HM
                    else if (symbol_luas1.equals("CA") && symbol_luas2.equals("HA")) {
                        edit_luas2.setText(hitungluas.CaToHa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("CA", "HA",
                                value_to_conversion, hitungluas.CaToHa(value_to_conversion)));
                    }
                    // CA to DAM
                    else if (symbol_luas1.equals("CA") && symbol_luas2.equals("DAA")) {
                        edit_luas2.setText(hitungluas.CaToDaa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("CA", "DAA",
                                value_to_conversion, hitungluas.CaToDaa(value_to_conversion)));
                    }
                    // CA to M
                    else if (symbol_luas1.equals("CA") && symbol_luas2.equals("Are")) {
                        edit_luas2.setText(hitungluas.CaToA(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("CA", "Are",
                                value_to_conversion, hitungluas.CaToA(value_to_conversion)));
                    }
                    // CA to DA
                    else if (symbol_luas1.equals("CA") && symbol_luas2.equals("DA")) {
                        edit_luas2.setText(hitungluas.CaToDa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("CA", "DA",
                                value_to_conversion, hitungluas.CaToDa(value_to_conversion)));
                    }
                    // CA to MA
                    else if (symbol_luas1.equals("CA") && symbol_luas2.equals("MA")) {
                        edit_luas2.setText(hitungluas.CaToMa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("CA", "MA",
                                value_to_conversion, hitungluas.CaToMa(value_to_conversion)));
                    }
                    // MA to KM
                    else if (symbol_luas1.equals("MA") && symbol_luas2.equals("KA")) {
                        edit_luas2.setText(hitungluas.MaToKa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("MA", "KA",
                                value_to_conversion, hitungluas.MaToKa(value_to_conversion)));
                    }
                    // MA to HM
                    else if (symbol_luas1.equals("MA") && symbol_luas2.equals("HA")) {
                        edit_luas2.setText(hitungluas.MaToHa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("MA", "HA",
                                value_to_conversion, hitungluas.MaToHa(value_to_conversion)));
                    }
                    // MA to DAM
                    else if (symbol_luas1.equals("MA") && symbol_luas2.equals("DAA")) {
                        edit_luas2.setText(hitungluas.MaToDaa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("MA", "DAA",
                                value_to_conversion, hitungluas.MaToDaa(value_to_conversion)));
                    }
                    // MA to M
                    else if (symbol_luas1.equals("MA") && symbol_luas2.equals("Are")) {
                        edit_luas2.setText(hitungluas.MaToA(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("MA", "Are",
                                value_to_conversion, hitungluas.MaToA(value_to_conversion)));
                    }
                    // MA to DA
                    else if (symbol_luas1.equals("MA") && symbol_luas2.equals("DA")) {
                        edit_luas2.setText(hitungluas.MaToDa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("MA", "DA",
                                value_to_conversion, hitungluas.MaToDa(value_to_conversion)));
                    }
                    // MA to CA
                    else if (symbol_luas1.equals("MA") && symbol_luas2.equals("CA")) {
                        edit_luas2.setText(hitungluas.MaToCa(value_to_conversion));
                        text_formula.setText(hitungluas.getFormula("MA", "CA",
                                value_to_conversion, hitungluas.MaToCa(value_to_conversion)));
                    }
                    //if KM equals KM
                    else if (symbol_luas1.equals("KA") && symbol_luas2.equals("KA")) {
                        edit_luas2.setText(hitungluas.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("KA  =  " + hitungluas.check_after_decimal_point(value_to_conversion));
                    }
                    //if HM equals HM
                    else if (symbol_luas1.equals("HA") && symbol_luas2.equals("HA")) {
                        edit_luas2.setText(hitungluas.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("HA  =  " + hitungluas.check_after_decimal_point(value_to_conversion));
                    }
                    //if DAM equals DAM
                    else if (symbol_luas1.equals("DAA") && symbol_luas2.equals("DAA")) {
                        edit_luas2.setText(hitungluas.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("DAA  =  " + hitungluas.check_after_decimal_point(value_to_conversion));
                    }
                    //if M equals M
                    else if (symbol_luas1.equals("Are") && symbol_luas2.equals("Are")) {
                        edit_luas2.setText(hitungluas.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("Are  =  " + hitungluas.check_after_decimal_point(value_to_conversion));
                    }
                    //if DA equals DA
                    else if (symbol_luas1.equals("DA") && symbol_luas2.equals("DA")) {
                        edit_luas2.setText(hitungluas.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("DA  =  " + hitungluas.check_after_decimal_point(value_to_conversion));
                    }
                    //if CA equals CA
                    else if (symbol_luas1.equals("CA") && symbol_luas2.equals("CA")) {
                        edit_luas2.setText(hitungluas.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("CA  =  " + hitungluas.check_after_decimal_point(value_to_conversion));
                    }
                    //if MA equals MA
                    else if (symbol_luas1.equals("MA") && symbol_luas2.equals("MA")) {
                        edit_luas2.setText(hitungluas.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("MA  =  " + hitungluas.check_after_decimal_point(value_to_conversion));
                    }
                }
            }
        });
    }

}
