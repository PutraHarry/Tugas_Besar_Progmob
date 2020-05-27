package com.example.tugasbesarprogmob.rumus_panjang;

import android.content.Context;

public class HitungPanjang {
    private Context context;

    public HitungPanjang(Context context) {
        this.context = context;
    }

    // Km
    // formula conversion km to hl
    public String KmToHm(double km) {
        // hm = 10*km
        double hm = 10*km;
        return check_after_decimal_point(hm);
    }

    // formula conversion km to dam
    public String KmToDam(double km) {
        // dal = 100*km
        double dam = 100*km;
        return check_after_decimal_point(dam);
    }

    // formula conversion km to m
    public String KmToM(double km) {
        // m = 1000*km
        double m = 1000*km;
        return check_after_decimal_point(m);
    }

    // formula conversion km to dm
    public String KmToDm(double km) {
        // dm = 10000*km
        double dm = 10000*km;
        return check_after_decimal_point(dm);
    }

    // formula conversion km to cm
    public String KmToCm(double km) {
        // cm = 100000*km
        double cm = 100000*km;
        return check_after_decimal_point(cm);
    }

    // formula conversion km to mm
    public String KmToMm(double km) {
        // mm = 1000000*km
        double mm = 1000000*km;
        return check_after_decimal_point(mm);
    }

    //hm
    // formula conversion hm to km
    public String HmToKm(double hm) {
        // km = hm/10
        double km = hm/10;
        return check_after_decimal_point(km);
    }

    // formula conversion hm to dam
    public String HmToDam(double hm) {
        // dam = 10*hm
        double dam = hm*10;
        return check_after_decimal_point(dam);
    }

    // formula conversion hm to g
    public String HmToM(double hm) {
        // m = 100*hm
        double m = hm*100;
        return check_after_decimal_point(m);
    }

    // formula conversion hm to dm
    public String HmToDm(double hm) {
        // dm = 1000*hm
        double dm = hm*1000;
        return check_after_decimal_point(dm);
    }

    // formula conversion hm to cm
    public String HmToCm(double hm) {
        // cm = 10000*hm
        double cm = hm*10000;
        return check_after_decimal_point(cm);
    }

    // formula conversion hm to mm
    public String HmToMm(double hm) {
        // mm = 100000*hm
        double mm = hm*100000;
        return check_after_decimal_point(mm);
    }

    //dam
    // formula conversion dam to km
    public String DamToKm(double dam) {
        // km = dam/100
        double km = dam/100;
        return check_after_decimal_point(km);
    }

    // formula conversion dam to hm
    public String DamToHm(double dam) {
        // hm = dam/10
        double hm = dam/10;
        return check_after_decimal_point(hm);
    }

    // formula conversion dam to m
    public String DamToM(double dam) {
        // m = 10*dam
        double m = dam*10;
        return check_after_decimal_point(m);
    }

    // formula conversion dam to dm
    public String DamToDm(double dam) {
        // dm = 100*dam
        double dm = dam*100;
        return check_after_decimal_point(dm);
    }

    // formula conversion dam to cm
    public String DamToCm(double dam) {
        // cm = 1000*dam
        double cm = dam*1000;
        return check_after_decimal_point(cm);
    }

    // formula conversion dam to mm
    public String DamToMm(double dam) {
        // mm = 10000*dam
        double mm = dam*10000;
        return check_after_decimal_point(mm);
    }

    //m
    // formula conversion m to km
    public String MToKm(double m) {
        // km = m/1000
        double km = m/1000;
        return check_after_decimal_point(km);
    }

    // formula conversion m to hm
    public String MToHm(double m) {
        // hm = m/100
        double hm = m/100;
        return check_after_decimal_point(hm);
    }

    // formula conversion m to dam
    public String MToDam(double m) {
        // dam = m/10
        double dam = m/10;
        return check_after_decimal_point(dam);
    }

    // formula conversion m to dm
    public String MToDm(double m) {
        // dm = 10*m
        double dm = m*10;
        return check_after_decimal_point(dm);
    }

    // formula conversion m to cm
    public String MToCm(double m) {
        // cm = 100*m
        double cm = m*100;
        return check_after_decimal_point(cm);
    }

    // formula conversion m to mm
    public String MToMm(double m) {
        // mm = 1000*m
        double mm = m*1000;
        return check_after_decimal_point(mm);
    }

    //dm
    // formula conversion dm to km
    public String DmToKm(double dm) {
        // km = dm/10000
        double km = dm/10000;
        return check_after_decimal_point(km);
    }

    // formula conversion dm to hm
    public String DmToHm(double dm) {
        // hm = dm/1000
        double hm = dm/1000;
        return check_after_decimal_point(hm);
    }

    // formula conversion dm to dam
    public String DmToDam(double dm) {
        // dam = dm/100
        double dam = dm/100;
        return check_after_decimal_point(dam);
    }

    // formula conversion dm to m
    public String DmToM(double dm) {
        // m = dm/10
        double m = dm/10;
        return check_after_decimal_point(m);
    }

    // formula conversion dm to cm
    public String DmToCm(double dm) {
        // cm = 10*dm
        double cm = dm*10;
        return check_after_decimal_point(cm);
    }

    // formula conversion dm to mm
    public String DmToMm(double dm) {
        // mm = 100*dm
        double mm = dm*100;
        return check_after_decimal_point(mm);
    }

    //cl
    // formula conversion cm to km
    public String CmToKm(double cm) {
        // km = cm/100000
        double km = cm/100000;
        return check_after_decimal_point(km);
    }

    // formula conversion cm to hm
    public String CmToHm(double cm) {
        // hm = cm/10000
        double hm = cm/10000;
        return check_after_decimal_point(hm);
    }

    // formula conversion cm to dam
    public String CmToDam(double cm) {
        // dam = cm/1000
        double dam = cm/1000;
        return check_after_decimal_point(dam);
    }

    // formula conversion cm to m
    public String CmToM(double cm) {
        // m = cm/100
        double m = cm/100;
        return check_after_decimal_point(m);
    }

    // formula conversion cm to dm
    public String CmToDm(double cm) {
        // dm = cm/10
        double dm = cm/10;
        return check_after_decimal_point(dm);
    }

    // formula conversion cm to mm
    public String CmToMm(double cm) {
        // mm = 10*cm
        double mm = cm*10;
        return check_after_decimal_point(mm);
    }

    //mm
    // formula conversion mm to km
    public String MmToKm(double mm) {
        // km = mm/1000000
        double km = mm/1000000;
        return check_after_decimal_point(km);
    }

    // formula conversion mm to hm
    public String MmToHm(double mm) {
        // hm = mm/100000
        double hm = mm/100000;
        return check_after_decimal_point(hm);
    }

    // formula conversion mm to dam
    public String MmToDam(double mm) {
        // dam = mm/10000
        double dam = mm/10000;
        return check_after_decimal_point(dam);
    }

    // formula conversion mm to m
    public String MmToM(double mm) {
        // m = mm/1000
        double m = mm/1000;
        return check_after_decimal_point(m);
    }

    // formula conversion mm to dm
    public String MmToDm(double mm) {
        // dm = mm/100
        double dm = mm/100;
        return check_after_decimal_point(dm);
    }

    // formula conversion mm to mm
    public String MmToCm(double mm) {
        // cm = mm/10
        double cm = mm/10;
        return check_after_decimal_point(cm);
    }



    //check after decimal point
    public String check_after_decimal_point(double decimal) {
        String result = null;
        String[] after_point = String.valueOf(decimal).split("[:.]");
        if (after_point[after_point.length - 1].equals("0")) {
            result = after_point[0];
        } else {
            result = String.valueOf(decimal).replace(".", ",");
        }
        return result;
    }

    /**
     * GET FORMULA
     **/
    public String getFormula(String symbol1, String symbol2, double value_to_conversion, String result) {
        String results = null;
        // kl to hl
        if (symbol1.equals("KM") && symbol2.equals("HM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10\n" + symbol2 + "  =  " + result;
        }
        // kl to dal
        else if (symbol1.equals("KM") && symbol2.equals("DAM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100\n" + symbol2 + "  =  " + result;
        }
        // kl to G
        else if (symbol1.equals("KM") && symbol2.equals("Meter")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000\n" + symbol2 + "  =  " + result;
        }
        // kl to dl
        else if (symbol1.equals("KM") && symbol2.equals("DM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10000\n" + symbol2 + "  =  " + result;
        }
        // kl to cl
        else if (symbol1.equals("KM") && symbol2.equals("CM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100000\n" + symbol2 + "  =  " + result;
        }
        // kl to ML
        else if (symbol1.equals("KM") && symbol2.equals("MM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000000\n" + symbol2 + "  =  " + result;
        }
        else if (symbol1.equals("HM") && symbol2.equals("KM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // hl to dal
        else if (symbol1.equals("HM") && symbol2.equals("DAM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // hl to G
        else if (symbol1.equals("HM") && symbol2.equals("Meter")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // hl to dl
        else if (symbol1.equals("HM") && symbol2.equals("DM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  1000\n" + symbol2 + "  =  " + result;
        }
        // hl to cl
        else if (symbol1.equals("HM") && symbol2.equals("CM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10000\n" + symbol2 + "  =  " + result;
        }
        // hl to ml
        else if (symbol1.equals("HM") && symbol2.equals("MM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100000\n" + symbol2 + "  =  " + result;
        }
        // dal to kl
        else if (symbol1.equals("DAM") && symbol2.equals("KM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // dal to hl
        else if (symbol1.equals("DAM") && symbol2.equals("HM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // dal to GRA
        else if (symbol1.equals("DAM") && symbol2.equals("Meter")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // dal to dl
        else if (symbol1.equals("DAM") && symbol2.equals("DM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // dal to cl
        else if (symbol1.equals("DAM") && symbol2.equals("CM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  1000\n" + symbol2 + "  =  " + result;
        }
        // dal to ml
        else if (symbol1.equals("DAM") && symbol2.equals("MM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10000\n" + symbol2 + "  =  " + result;
        }
        // GR to kl
        else if (symbol1.equals("Meter") && symbol2.equals("KM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // GR to hl
        else if (symbol1.equals("Meter") && symbol2.equals("HM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // GR to dal
        else if (symbol1.equals("Meter") && symbol2.equals("DAM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // GR to dl
        else if (symbol1.equals("Meter") && symbol2.equals("DM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // GR to cl
        else if (symbol1.equals("Meter") && symbol2.equals("CM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // GR to ml
        else if (symbol1.equals("Meter") && symbol2.equals("MM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  1000\n" + symbol2 + "  =  " + result;
        }
        // dl to kl
        else if (symbol1.equals("DM") && symbol2.equals("KM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // dl to hl
        else if (symbol1.equals("DM") && symbol2.equals("HM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // dl to dal
        else if (symbol1.equals("DM") && symbol2.equals("DAM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // dl to G
        else if (symbol1.equals("DM") && symbol2.equals("Meter")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // dl to cl
        else if (symbol1.equals("DM") && symbol2.equals("CM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // dl to ml
        else if (symbol1.equals("DM") && symbol2.equals("MM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // cl to kl
        else if (symbol1.equals("CM") && symbol2.equals("KM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000\n" + symbol2 + "  =  " + result;
        }
        // cl to hl
        else if (symbol1.equals("CM") && symbol2.equals("HM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // cl to dal
        else if (symbol1.equals("CM") && symbol2.equals("DAM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // cl to G
        else if (symbol1.equals("CM") && symbol2.equals("Meter")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // cl to dl
        else if (symbol1.equals("CM") && symbol2.equals("DM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // cl to ml
        else if (symbol1.equals("CM") && symbol2.equals("MM")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // ml to kl
        else if (symbol1.equals("MM") && symbol2.equals("KM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000000\n" + symbol2 + "  =  " + result;
        }
        // ml to hl
        else if (symbol1.equals("MM") && symbol2.equals("HM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000\n" + symbol2 + "  =  " + result;
        }
        // ml to dal
        else if (symbol1.equals("MM") && symbol2.equals("DAM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // ml to G
        else if (symbol1.equals("MM") && symbol2.equals("Meter")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // ml to dl
        else if (symbol1.equals("MM") && symbol2.equals("DM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // ml to cl
        else if (symbol1.equals("MM") && symbol2.equals("CM")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        return results;
    }
}
