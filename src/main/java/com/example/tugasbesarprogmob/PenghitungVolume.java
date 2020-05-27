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

import com.example.tugasbesarprogmob.rumus_volume.HitungVolume;
import com.example.tugasbesarprogmob.rumus_volume.SharedPrefsVolume;

import java.util.Objects;

public class PenghitungVolume extends AppCompatActivity {
    private AppCompatEditText edit_volume1;
    private AppCompatEditText edit_volume2;
    private HitungVolume hitungvolume;
    private LinearLayout layout_formula;
    private TextView text_formula;
    private Animation rotate_zoom_out;
    private String[] hitungVolume = new String[]{
            "KL",
            "HL",
            "DAL",
            "Liter",
            "DL",
            "CL",
            "ML"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penghitung_volume);

        hitungvolume = new HitungVolume(this);

        layout_formula = findViewById(R.id.layout_formula);
        text_formula = findViewById(R.id.text_formula);

        rotate_zoom_out = AnimationUtils.loadAnimation(PenghitungVolume.this, R.anim.rotate_zoom_out);

        getSupportActionBar().setTitle("Konversi Volume");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //edit text temp to conversion 1
        edit_volume1 = findViewById(R.id.edit_1);
        edit_volume1.setHint(SharedPrefsVolume.getVolumeSymbol1(PenghitungVolume.this));

        //edit text temp to conversion 2
        edit_volume2 = findViewById(R.id.edit_2);
        edit_volume2.setHint(SharedPrefsVolume.getVolumeSymbol2(PenghitungVolume.this));
        edit_volume2.setKeyListener(null);
        edit_volume2.setClickable(false);

        //Spinner & Adapter 1
        ArrayAdapter<String> arrayAdapter1 =
                new ArrayAdapter(PenghitungVolume.this, android.R.layout.simple_spinner_item, hitungVolume);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AppCompatSpinner appCompatSpinner1 = findViewById(R.id.spinner_1);
        appCompatSpinner1.setAdapter(arrayAdapter1);

        //set selection
        appCompatSpinner1.setSelection(SharedPrefsVolume.getVolumeIndex1(PenghitungVolume.this));
        appCompatSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String volume_symbol1 = hitungVolume[position];
                SharedPrefsVolume.setVolume1(PenghitungVolume.this, volume_symbol1, position);
                edit_volume1.setHint(hitungVolume[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //spinner & adapter 2
        ArrayAdapter<String> arrayAdapter2 =
                new ArrayAdapter(PenghitungVolume.this, android.R.layout.simple_spinner_item, hitungVolume);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AppCompatSpinner appCompatSpinner2 = findViewById(R.id.spinner_2);
        appCompatSpinner2.setAdapter(arrayAdapter2);
        appCompatSpinner2.setSelection(SharedPrefsVolume.getVolumeIndex2(PenghitungVolume.this));
        appCompatSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String volume_symbol2 = hitungVolume[position];
                SharedPrefsVolume.setVolume2(PenghitungVolume.this, volume_symbol2, position);
                edit_volume2.setHint(hitungVolume[position]);
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
                if (Objects.requireNonNull(edit_volume1.getText()).toString().isEmpty()) {

                    Toast.makeText(PenghitungVolume.this,
                            "Masukan nilai volume yang ingin di konversi", Toast.LENGTH_SHORT).show();

                } else {
                    layout_formula.startAnimation(rotate_zoom_out);
                    if (layout_formula.getVisibility() == View.GONE) {
                        layout_formula.setVisibility(View.VISIBLE);
                    }
                    String symbol_volume1 = SharedPrefsVolume.getVolumeSymbol1(PenghitungVolume.this);
                    String symbol_volume2 = SharedPrefsVolume.getVolumeSymbol2(PenghitungVolume.this);
                    double value_to_conversion = Double.parseDouble(edit_volume1.getText().toString());

                    // KL to HL
                    if (symbol_volume1.equals("KL") && symbol_volume2.equals("HL")) {
                        edit_volume2.setText(hitungvolume.KlToHl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("KL", "HL",
                                value_to_conversion, hitungvolume.KlToHl(value_to_conversion)));
                    }
                    // KL to DAL
                    else if (symbol_volume1.equals("KL") && symbol_volume2.equals("DAL")) {
                        edit_volume2.setText(hitungvolume.KlToDal(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("KL", "DAL",
                                value_to_conversion, hitungvolume.KlToDal(value_to_conversion)));
                    }
                    // KL to Liter
                    else if (symbol_volume1.equals("KL") && symbol_volume2.equals("Liter")) {
                        edit_volume2.setText(hitungvolume.KlToL(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("KL", "Liter",
                                value_to_conversion, hitungvolume.KlToL(value_to_conversion)));
                    }
                    // KL to DL
                    else if (symbol_volume1.equals("KL") && symbol_volume2.equals("DL")) {
                        edit_volume2.setText(hitungvolume.KlToDl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("KL", "DL",
                                value_to_conversion, hitungvolume.KlToDl(value_to_conversion)));
                    }
                    // KL to CL
                    else if (symbol_volume1.equals("KL") && symbol_volume2.equals("CL")) {
                        edit_volume2.setText(hitungvolume.KlToCl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("KL", "CL",
                                value_to_conversion, hitungvolume.KlToCl(value_to_conversion)));
                    }
                    // KL to ML
                    else if (symbol_volume1.equals("KL") && symbol_volume2.equals("ML")) {
                        edit_volume2.setText(hitungvolume.KlToMl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("KL", "ML",
                                value_to_conversion, hitungvolume.KlToMl(value_to_conversion)));
                    }
                    // HL to KL
                    else if (symbol_volume1.equals("HL") && symbol_volume2.equals("KL")) {
                        edit_volume2.setText(hitungvolume.HlToKl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("HL", "KL",
                                value_to_conversion, hitungvolume.HlToKl(value_to_conversion)));
                    }
                    // HL to DAL
                    else if (symbol_volume1.equals("HL") && symbol_volume2.equals("DAL")) {
                        edit_volume2.setText(hitungvolume.HlToDal(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("HL", "DAL",
                                value_to_conversion, hitungvolume.HlToDal(value_to_conversion)));
                    }
                    // HL to Liter
                    else if (symbol_volume1.equals("HL") && symbol_volume2.equals("Liter")) {
                        edit_volume2.setText(hitungvolume.HlToL(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("HL", "Liter",
                                value_to_conversion, hitungvolume.HlToL(value_to_conversion)));
                    }
                    // HL to DL
                    else if (symbol_volume1.equals("HL") && symbol_volume2.equals("DL")) {
                        edit_volume2.setText(hitungvolume.HlToDl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("HL", "DL",
                                value_to_conversion, hitungvolume.HlToDl(value_to_conversion)));
                    }
                    // HL to CL
                    else if (symbol_volume1.equals("HL") && symbol_volume2.equals("CL")) {
                        edit_volume2.setText(hitungvolume.HlToCl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("HL", "CL",
                                value_to_conversion, hitungvolume.HlToCl(value_to_conversion)));
                    }
                    // HL to ML
                    else if (symbol_volume1.equals("HL") && symbol_volume2.equals("ML")) {
                        edit_volume2.setText(hitungvolume.HlToMl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("HL", "ML",
                                value_to_conversion, hitungvolume.HlToMl(value_to_conversion)));
                    }
                    // DAL to KL
                    else if (symbol_volume1.equals("DAL") && symbol_volume2.equals("KL")) {
                        edit_volume2.setText(hitungvolume.DalToKl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("DAL", "KL",
                                value_to_conversion, hitungvolume.DalToKl(value_to_conversion)));
                    }
                    // DAL to HL
                    else if (symbol_volume1.equals("DAL") && symbol_volume2.equals("HL")) {
                        edit_volume2.setText(hitungvolume.DalToHl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("DAL", "HL",
                                value_to_conversion, hitungvolume.DalToHl(value_to_conversion)));
                    }
                    // DAL to Liter
                    else if (symbol_volume1.equals("DAL") && symbol_volume2.equals("Liter")) {
                        edit_volume2.setText(hitungvolume.DalToL(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("DAL", "Liter",
                                value_to_conversion, hitungvolume.DalToL(value_to_conversion)));
                    }
                    // DAL to DL
                    else if (symbol_volume1.equals("DAL") && symbol_volume2.equals("DL")) {
                        edit_volume2.setText(hitungvolume.DalToDl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("DAL", "DL",
                                value_to_conversion, hitungvolume.DalToDl(value_to_conversion)));
                    }
                    // DAL to CL
                    else if (symbol_volume1.equals("DAL") && symbol_volume2.equals("CL")) {
                        edit_volume2.setText(hitungvolume.DalToCl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("DAL", "CL",
                                value_to_conversion, hitungvolume.DalToCl(value_to_conversion)));
                    }
                    // DAL to ML
                    else if (symbol_volume1.equals("DAL") && symbol_volume2.equals("ML")) {
                        edit_volume2.setText(hitungvolume.DalToMl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("DAL", "ML",
                                value_to_conversion, hitungvolume.DalToMl(value_to_conversion)));
                    }
                    // Liter to KL
                    else if (symbol_volume1.equals("Liter") && symbol_volume2.equals("KL")) {
                        edit_volume2.setText(hitungvolume.LToKl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("Liter", "KL",
                                value_to_conversion, hitungvolume.LToKl(value_to_conversion)));
                    }
                    // Liter to HL
                    else if (symbol_volume1.equals("Liter") && symbol_volume2.equals("HL")) {
                        edit_volume2.setText(hitungvolume.LToHl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("Liter", "HL",
                                value_to_conversion, hitungvolume.LToHl(value_to_conversion)));
                    }
                    // Liter to DAL
                    else if (symbol_volume1.equals("Liter") && symbol_volume2.equals("DAL")) {
                        edit_volume2.setText(hitungvolume.LToDal(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("Liter", "DAL",
                                value_to_conversion, hitungvolume.LToDal(value_to_conversion)));
                    }
                    // Liter to DL
                    else if (symbol_volume1.equals("Liter") && symbol_volume2.equals("DL")) {
                        edit_volume2.setText(hitungvolume.LToDl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("Liter", "DL",
                                value_to_conversion, hitungvolume.LToDl(value_to_conversion)));
                    }
                    // Liter to CL
                    else if (symbol_volume1.equals("Liter") && symbol_volume2.equals("CL")) {
                        edit_volume2.setText(hitungvolume.LToCl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("Liter", "CL",
                                value_to_conversion, hitungvolume.LToCl(value_to_conversion)));
                    }
                    // L to ML
                    else if (symbol_volume1.equals("Liter") && symbol_volume2.equals("ML")) {
                        edit_volume2.setText(hitungvolume.LToMl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("Liter", "ML",
                                value_to_conversion, hitungvolume.LToMl(value_to_conversion)));
                    }
                    // DL to KL
                    else if (symbol_volume1.equals("DL") && symbol_volume2.equals("KL")) {
                        edit_volume2.setText(hitungvolume.DlToKl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("DL", "KL",
                                value_to_conversion, hitungvolume.DlToKl(value_to_conversion)));
                    }
                    // DL to HL
                    else if (symbol_volume1.equals("DL") && symbol_volume2.equals("HL")) {
                        edit_volume2.setText(hitungvolume.DlToHl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("DL", "HL",
                                value_to_conversion, hitungvolume.DlToHl(value_to_conversion)));
                    }
                    // DL to DAL
                    else if (symbol_volume1.equals("DL") && symbol_volume2.equals("DAL")) {
                        edit_volume2.setText(hitungvolume.DlToDal(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("DL", "DAL",
                                value_to_conversion, hitungvolume.DlToDal(value_to_conversion)));
                    }
                    // DL to L
                    else if (symbol_volume1.equals("DL") && symbol_volume2.equals("Liter")) {
                        edit_volume2.setText(hitungvolume.DlToL(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("DL", "Liter",
                                value_to_conversion, hitungvolume.DlToL(value_to_conversion)));
                    }
                    // DL to CL
                    else if (symbol_volume1.equals("DL") && symbol_volume2.equals("CL")) {
                        edit_volume2.setText(hitungvolume.DlToCl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("DL", "CL",
                                value_to_conversion, hitungvolume.DlToCl(value_to_conversion)));
                    }
                    // DL to ML
                    else if (symbol_volume1.equals("DL") && symbol_volume2.equals("ML")) {
                        edit_volume2.setText(hitungvolume.DlToMl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("DL", "ML",
                                value_to_conversion, hitungvolume.DlToMl(value_to_conversion)));
                    }
                    // CL to KL
                    else if (symbol_volume1.equals("CL") && symbol_volume2.equals("KL")) {
                        edit_volume2.setText(hitungvolume.ClToKl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("CL", "KL",
                                value_to_conversion, hitungvolume.ClToKl(value_to_conversion)));
                    }
                    // CL to HL
                    else if (symbol_volume1.equals("CL") && symbol_volume2.equals("HL")) {
                        edit_volume2.setText(hitungvolume.ClToHl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("CL", "HL",
                                value_to_conversion, hitungvolume.ClToHl(value_to_conversion)));
                    }
                    // CL to DAL
                    else if (symbol_volume1.equals("CL") && symbol_volume2.equals("DAL")) {
                        edit_volume2.setText(hitungvolume.ClToDal(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("CL", "DAL",
                                value_to_conversion, hitungvolume.ClToDal(value_to_conversion)));
                    }
                    // CL to Liter
                    else if (symbol_volume1.equals("CL") && symbol_volume2.equals("Liter")) {
                        edit_volume2.setText(hitungvolume.ClToL(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("CL", "Liter",
                                value_to_conversion, hitungvolume.ClToL(value_to_conversion)));
                    }
                    // CL to DL
                    else if (symbol_volume1.equals("CL") && symbol_volume2.equals("DL")) {
                        edit_volume2.setText(hitungvolume.ClToDl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("CL", "DL",
                                value_to_conversion, hitungvolume.ClToDl(value_to_conversion)));
                    }
                    // CL to ML
                    else if (symbol_volume1.equals("CL") && symbol_volume2.equals("ML")) {
                        edit_volume2.setText(hitungvolume.ClToMl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("CL", "ML",
                                value_to_conversion, hitungvolume.ClToMl(value_to_conversion)));
                    }
                    // ML to KL
                    else if (symbol_volume1.equals("ML") && symbol_volume2.equals("KL")) {
                        edit_volume2.setText(hitungvolume.MlToKl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("ML", "KL",
                                value_to_conversion, hitungvolume.MlToKl(value_to_conversion)));
                    }
                    // ML to HL
                    else if (symbol_volume1.equals("ML") && symbol_volume2.equals("HL")) {
                        edit_volume2.setText(hitungvolume.MlToHl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("ML", "HL",
                                value_to_conversion, hitungvolume.MlToHl(value_to_conversion)));
                    }
                    // ML to DAL
                    else if (symbol_volume1.equals("ML") && symbol_volume2.equals("DAL")) {
                        edit_volume2.setText(hitungvolume.MlToDal(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("ML", "DAL",
                                value_to_conversion, hitungvolume.MlToDal(value_to_conversion)));
                    }
                    // ML to Liter
                    else if (symbol_volume1.equals("ML") && symbol_volume2.equals("Liter")) {
                        edit_volume2.setText(hitungvolume.MlToL(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("ML", "Liter",
                                value_to_conversion, hitungvolume.MlToL(value_to_conversion)));
                    }
                    // ML to DL
                    else if (symbol_volume1.equals("ML") && symbol_volume2.equals("DL")) {
                        edit_volume2.setText(hitungvolume.MlToDl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("ML", "DL",
                                value_to_conversion, hitungvolume.MlToDl(value_to_conversion)));
                    }
                    // ML to CL
                    else if (symbol_volume1.equals("ML") && symbol_volume2.equals("CL")) {
                        edit_volume2.setText(hitungvolume.MlToCl(value_to_conversion));
                        text_formula.setText(hitungvolume.getFormula("ML", "CL",
                                value_to_conversion, hitungvolume.MlToCl(value_to_conversion)));
                    }
                    //if TON equals TON
                    else if (symbol_volume1.equals("TON") && symbol_volume2.equals("TON")) {
                        edit_volume2.setText(hitungvolume.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("TON  =  " + hitungvolume.check_after_decimal_point(value_to_conversion));
                    }
                    //if kw equals KW
                    else if (symbol_volume1.equals("KWINTAL") && symbol_volume2.equals("KWINTAL")) {
                        edit_volume2.setText(hitungvolume.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("KWINTAL  =  " + hitungvolume.check_after_decimal_point(value_to_conversion));
                    }
                    //if KL equals KL
                    else if (symbol_volume1.equals("KL") && symbol_volume2.equals("KL")) {
                        edit_volume2.setText(hitungvolume.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("KL  =  " + hitungvolume.check_after_decimal_point(value_to_conversion));
                    }
                    //if HL equals HL
                    else if (symbol_volume1.equals("HL") && symbol_volume2.equals("HL")) {
                        edit_volume2.setText(hitungvolume.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("HL  =  " + hitungvolume.check_after_decimal_point(value_to_conversion));
                    }
                    //if DAL equals DAL
                    else if (symbol_volume1.equals("DAL") && symbol_volume2.equals("DAL")) {
                        edit_volume2.setText(hitungvolume.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("DAL  =  " + hitungvolume.check_after_decimal_point(value_to_conversion));
                    }
                    //if Liter equals Liter
                    else if (symbol_volume1.equals("Liter") && symbol_volume2.equals("Liter")) {
                        edit_volume2.setText(hitungvolume.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("Liter  =  " + hitungvolume.check_after_decimal_point(value_to_conversion));
                    }
                    //if DL equals DL
                    else if (symbol_volume1.equals("DL") && symbol_volume2.equals("DL")) {
                        edit_volume2.setText(hitungvolume.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("DL  =  " + hitungvolume.check_after_decimal_point(value_to_conversion));
                    }
                    //if CL equals CL
                    else if (symbol_volume1.equals("CL") && symbol_volume2.equals("CL")) {
                        edit_volume2.setText(hitungvolume.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("CL  =  " + hitungvolume.check_after_decimal_point(value_to_conversion));
                    }
                    //if ML equals ML
                    else if (symbol_volume1.equals("ML") && symbol_volume2.equals("ML")) {
                        edit_volume2.setText(hitungvolume.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("ML  =  " + hitungvolume.check_after_decimal_point(value_to_conversion));
                    }
                }
            }
        });
    }
}