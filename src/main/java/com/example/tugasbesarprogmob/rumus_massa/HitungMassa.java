package com.example.tugasbesarprogmob.rumus_massa;

import android.content.Context;

public class HitungMassa {
    private Context context;

    public HitungMassa(Context context) {
        this.context = context;
    }

    /**
     * TON
     **/
    // formula conversion ton to kwintal
    public String TonToKwintal(double ton) {
        // kwintal = 10 x ton
        double kwintal = 10 * ton;
        return check_after_decimal_point(kwintal);
    }

    // formula conversion ton to kg
    public String TonToKg(double ton) {
        // kg = 1000 x ton
        double kg = 1000 * ton;
        return check_after_decimal_point(kg);
    }

    // formula conversion ton to hg/ons
    public String TonToHg(double ton) {
        // hg = 10000 x ton
        double hg = 10000 * ton;
        return check_after_decimal_point(hg);
    }

    // formula conversion ton to dag
    public String TonToDag(double ton) {
        // dag = 100000 x ton
        double dag = 100000 * ton;
        return check_after_decimal_point(dag);
    }

    // formula conversion ton to g
    public String TonToG(double ton) {
        // g = 1000000 x ton
        double g = 1000000 * ton;
        return check_after_decimal_point(g);
    }

    // formula conversion ton to dg
    public String TonToDg(double ton) {
        // dg = 10000000 x ton
        double dg = 10000000 * ton;
        return check_after_decimal_point(dg);
    }

    // formula conversion ton to cg
    public String TonToCg(double ton) {
        // cg = 100000000 x ton
        double cg = 100000000 * ton;
        return check_after_decimal_point(cg);
    }

    // formula conversion ton to mg
    public String TonToMg(double ton) {
        // mg = 1000000000 x ton
        double mg = 1000000000 * ton;
        return check_after_decimal_point(mg);
    }

    /**
     * kwintal
     **/
    // formula conversion kwintal to ton
    public String KwintalToTon(double kwintal) {
        // ton = kwintal/10
        double ton = kwintal/10;
        return check_after_decimal_point(ton);
    }

    // formula conversion kwintal to kg
    public String KwintalToKg(double kwintal) {
        // kg = 100 * kwintal
        double kg = 100 * kwintal;
        return check_after_decimal_point(kg);
    }

    // formula conversion kwintal to hg/ons
    public String KwintalToHg(double kwintal) {
        // hg = 1000 * kwintal
        double hg = 1000 * kwintal;
        return check_after_decimal_point(hg);
    }

    // formula conversion kwintal to dag
    public String KwintalToDag(double kwintal) {
        // dag = 10000 * kwintal
        double dag = 10000 * kwintal;
        return check_after_decimal_point(dag);
    }

    // formula conversion kwintal to g
    public String KwintalToG(double kwintal) {
        // g = 100000 * kwintal
        double g = 100000 * kwintal;
        return check_after_decimal_point(g);
    }

    // formula conversion kwintal to dg
    public String KwintalToDg(double kwintal) {
        // dg = 1000000 * kwintal
        double dg = 1000000 * kwintal;
        return check_after_decimal_point(dg);
    }

    // formula conversion kwintal to cg
    public String KwintalToCg(double kwintal) {
        // cg = 1000000 * kwintal
        double cg = 10000000 * kwintal;
        return check_after_decimal_point(cg);
    }

    // formula conversion kwintal to mg
    public String KwintalToMg(double kwintal) {
        // mg = 1000000 * kwintal
        double mg = 100000000 * kwintal;
        return check_after_decimal_point(mg);
    }

    /**
     * KG
     **/
    // formula conversion kg to ton
    public String KgToTon(double kg) {
        // ton = kg/1000
        double ton = kg/1000;
        return check_after_decimal_point(ton);
    }

    // formula conversion kg to kwintal
    public String KgToKwintal(double kg) {
        // kwintal = kg/100
        double kwintal = kg/100;
        return check_after_decimal_point(kwintal);
    }

    // formula conversion kg to hg
    public String KgToHg(double kg) {
        // hg = 10*kg
        double hg = 10*kg;
        return check_after_decimal_point(hg);
    }

    // formula conversion kg to hg
    public String KgToDag(double kg) {
        // dag = 100*kg
        double dag = 100*kg;
        return check_after_decimal_point(dag);
    }

    // formula conversion kg to g
    public String KgToG(double kg) {
        // g = 1000*kg
        double g = 1000*kg;
        return check_after_decimal_point(g);
    }

    // formula conversion kg to dg
    public String KgToDg(double kg) {
        // dg = 10000*kg
        double dg = 10000*kg;
        return check_after_decimal_point(dg);
    }

    // formula conversion kg to cg
    public String KgToCg(double kg) {
        // cg = 100000*kg
        double cg = 100000*kg;
        return check_after_decimal_point(cg);
    }

    // formula conversion kg to mg
    public String KgToMg(double kg) {
        // mg = 1000000*kg
        double mg = 1000000*kg;
        return check_after_decimal_point(mg);
    }

    //HG/ons
    // formula conversion hg to ton
    public String HgToTon(double hg) {
        // ton = hg/10000
        double ton = hg/10000;
        return check_after_decimal_point(ton);
    }

    // formula conversion hg to kwintal
    public String HgToKwintal(double hg) {
        // kwintal = hg/1000
        double kwintal = hg/1000;
        return check_after_decimal_point(kwintal);
    }

    // formula conversion hg to kg
    public String HgToKg(double hg) {
        // kg = hg/10
        double kg = hg/10;
        return check_after_decimal_point(kg);
    }

    // formula conversion hg to dag
    public String HgToDag(double hg) {
        // dag = 10*hg
        double dag = hg*10;
        return check_after_decimal_point(dag);
    }

    // formula conversion hg to g
    public String HgToG(double hg) {
        // g = 100*hg
        double g = hg*100;
        return check_after_decimal_point(g);
    }

    // formula conversion hg to dg
    public String HgToDg(double hg) {
        // dg = 1000*hg
        double dg = hg*1000;
        return check_after_decimal_point(dg);
    }

    // formula conversion hg to cg
    public String HgToCg(double hg) {
        // cg = 10000*hg
        double cg = hg*10000;
        return check_after_decimal_point(cg);
    }

    // formula conversion hg to mg
    public String HgToMg(double hg) {
        // mg = 100000*hg
        double mg = hg*100000;
        return check_after_decimal_point(mg);
    }

    //DAG
    // formula conversion dag to ton
    public String DagToTon(double dag) {
        // ton = dag/100000
        double ton = dag/100000;
        return check_after_decimal_point(ton);
    }

    // formula conversion dag to kwintal
    public String DagToKwintal(double dag) {
        // kwintal = dag/10000
        double kwintal = dag/10000;
        return check_after_decimal_point(kwintal);
    }

    // formula conversion dag to kg
    public String DagToKg(double dag) {
        // kg = dag/100
        double kg = dag/100;
        return check_after_decimal_point(kg);
    }

    // formula conversion dag to hg
    public String DagToHg(double dag) {
        // hg = dag/10
        double hg = dag/10;
        return check_after_decimal_point(hg);
    }

    // formula conversion dag to g
    public String DagToG(double dag) {
        // g = 10*dag
        double g = dag*10;
        return check_after_decimal_point(g);
    }

    // formula conversion dag to dg
    public String DagToDg(double dag) {
        // dg = 100*dag
        double dg = dag*100;
        return check_after_decimal_point(dg);
    }

    // formula conversion dag to cg
    public String DagToCg(double dag) {
        // cg = 1000*dag
        double cg = dag*1000;
        return check_after_decimal_point(cg);
    }

    // formula conversion dag to mg
    public String DagToMg(double dag) {
        // mg = 10000*dag
        double mg = dag*10000;
        return check_after_decimal_point(mg);
    }

    //g
    // formula conversion g to ton
    public String GToTon(double g) {
        // ton = g/1000000
        double ton = g/1000000;
        return check_after_decimal_point(ton);
    }

    // formula conversion g to kwintal
    public String GToKwintal(double g) {
        // kwintal = g/100000
        double kwintal = g/100000;
        return check_after_decimal_point(kwintal);
    }

    // formula conversion g to kg
    public String GToKg(double g) {
        // kg = g/1000
        double kg = g/1000;
        return check_after_decimal_point(kg);
    }

    // formula conversion g to hg
    public String GToHg(double g) {
        // hg = g/100
        double hg = g/100;
        return check_after_decimal_point(hg);
    }

    // formula conversion g to dag
    public String GToDag(double g) {
        // dag = g/10
        double dag = g/10;
        return check_after_decimal_point(dag);
    }

    // formula conversion g to dg
    public String GToDg(double g) {
        // dg = 10*g
        double dg = g*10;
        return check_after_decimal_point(dg);
    }

    // formula conversion g to cg
    public String GToCg(double g) {
        // cg = 100*g
        double cg = g*100;
        return check_after_decimal_point(cg);
    }

    // formula conversion g to mg
    public String GToMg(double g) {
        // mg = 1000*g
        double mg = g*1000;
        return check_after_decimal_point(mg);
    }

    //dg
    // formula conversion dg to ton
    public String DgToTon(double dg) {
        // ton = dg/10000000
        double ton = dg/10000000;
        return check_after_decimal_point(ton);
    }

    // formula conversion dg to kwintal
    public String DgToKwintal(double dg) {
        // kwintal = dg/1000000
        double kwintal = dg/1000000;
        return check_after_decimal_point(kwintal);
    }

    // formula conversion dg to kg
    public String DgToKg(double dg) {
        // kg = dg/10000
        double kg = dg/10000;
        return check_after_decimal_point(kg);
    }

    // formula conversion dg to hg
    public String DgToHg(double dg) {
        // hg = dg/1000
        double hg = dg/1000;
        return check_after_decimal_point(hg);
    }

    // formula conversion dg to dag
    public String DgToDag(double dg) {
        // dag = dg/100
        double dag = dg/100;
        return check_after_decimal_point(dag);
    }

    // formula conversion dg to g
    public String DgToG(double dg) {
        // g = dg/10
        double g = dg/10;
        return check_after_decimal_point(g);
    }

    // formula conversion dg to cg
    public String DgToCg(double dg) {
        // cg = 10*dg
        double cg = dg*10;
        return check_after_decimal_point(cg);
    }

    // formula conversion dg to mg
    public String DgToMg(double dg) {
        // mg = 100*dg
        double mg = dg*100;
        return check_after_decimal_point(mg);
    }

    //cg
    // formula conversion cg to ton
    public String CgToTon(double cg) {
        // ton = cg/100000000
        double ton = cg/100000000;
        return check_after_decimal_point(ton);
    }

    // formula conversion cg to kwintal
    public String CgToKwintal(double cg) {
        // kwintal = cg/10000000
        double kwintal = cg/10000000;
        return check_after_decimal_point(kwintal);
    }

    // formula conversion cg to kg
    public String CgToKg(double cg) {
        // kg = cg/100000
        double kg = cg/100000;
        return check_after_decimal_point(kg);
    }

    // formula conversion cg to hg
    public String CgToHg(double cg) {
        // hg = cg/10000
        double hg = cg/10000;
        return check_after_decimal_point(hg);
    }

    // formula conversion cg to dag
    public String CgToDag(double cg) {
        // dag = cg/1000
        double dag = cg/1000;
        return check_after_decimal_point(dag);
    }

    // formula conversion cg to g
    public String CgToG(double cg) {
        // g = cg/100
        double g = cg/100;
        return check_after_decimal_point(g);
    }

    // formula conversion cg to dg
    public String CgToDg(double cg) {
        // dg = cg/10
        double dg = cg/10;
        return check_after_decimal_point(dg);
    }

    // formula conversion cg to mg
    public String CgToMg(double cg) {
        // mg = 10*cg
        double mg = cg*10;
        return check_after_decimal_point(mg);
    }

    //mg
    // formula conversion mg to ton
    public String MgToTon(double mg) {
        // ton = mg/1000000000
        double ton = mg/1000000000;
        return check_after_decimal_point(ton);
    }

    // formula conversion mg to kwintal
    public String MgToKwintal(double mg) {
        // kwintal = mg/100000000
        double kwintal = mg/100000000;
        return check_after_decimal_point(kwintal);
    }

    // formula conversion mg to kg
    public String MgToKg(double mg) {
        // kg = mg/1000000
        double kg = mg/1000000;
        return check_after_decimal_point(kg);
    }

    // formula conversion mg to hg
    public String MgToHg(double mg) {
        // hg = mg/100000
        double hg = mg/100000;
        return check_after_decimal_point(hg);
    }

    // formula conversion mg to dag
    public String MgToDag(double mg) {
        // dag = mg/10000
        double dag = mg/10000;
        return check_after_decimal_point(dag);
    }

    // formula conversion mg to g
    public String MgToG(double mg) {
        // g = mg/1000
        double g = mg/1000;
        return check_after_decimal_point(g);
    }

    // formula conversion mg to dg
    public String MgToDg(double mg) {
        // dg = mg/100
        double dg = mg/100;
        return check_after_decimal_point(dg);
    }

    // formula conversion mg to mg
    public String MgToCg(double mg) {
        // cg = mg/10
        double cg = mg/10;
        return check_after_decimal_point(cg);
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
        // ton to kwintal
        if (symbol1.equals("TON") && symbol2.equals("KWINTAL")) {
            results = symbol2 + "  =  " + symbol1 + "  x  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10\n" + symbol2 + "  =  " + result;
        }
        // ton to KG
        else if (symbol1.equals("TON") && symbol2.equals("KG")) {
            results = symbol2 + "  =  " + symbol1 + "  x  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000\n" + symbol2 + "  =  " + result;
        }
        // ton to HG
        else if (symbol1.equals("TON") && symbol2.equals("HG")) {
            results = symbol2 + "  =  " + symbol1 + "  x  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10000\n" + symbol2 + "  =  " + result;
        }
        // ton to DAG
        else if (symbol1.equals("TON") && symbol2.equals("DAG")) {
            results = symbol2 + "  =  " + symbol1 + "  x  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100000\n" + symbol2 + "  =  " + result;
        }
        // ton to g
        else if (symbol1.equals("TON") && symbol2.equals("Gram")) {
            results = symbol2 + "  =  " + symbol1 + "  x  1000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000000\n" + symbol2 + "  =  " + result;
        }
        // ton to dg
        else if (symbol1.equals("TON") && symbol2.equals("DG")) {
            results = symbol2 + "  =  " + symbol1 + "  x  10000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10000000\n" + symbol2 + "  =  " + result;
        }
        // ton to Cg
        else if (symbol1.equals("TON") && symbol2.equals("CG")) {
            results = symbol2 + "  =  " + symbol1 + "  x  100000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100000000\n" + symbol2 + "  =  " + result;
        }
        // ton to mg
        else if (symbol1.equals("TON") && symbol2.equals("MG")) {
            results = symbol2 + "  =  " + symbol1 + "  x  1000000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000000000\n" + symbol2 + "  =  " + result;
        }
        // kwintal to ton
        else if (symbol1.equals("KWINTAL") && symbol2.equals("TON")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // kwintal to kg
        else if (symbol1.equals("KWINTAL") && symbol2.equals("KG")) {
            results = symbol2 + "  =  " + symbol1 + "  x  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100\n" + symbol2 + "  =  " + result;
        }
        // kwintal to Hg
        else if (symbol1.equals("KWINTAL") && symbol2.equals("HG")) {
            results = symbol2 + "  =  " + symbol1 + "  x  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000\n" + symbol2 + "  =  " + result;
        }
        // kwintal to DAg
        else if (symbol1.equals("KWINTAL") && symbol2.equals("DAG")) {
            results = symbol2 + "  =  " + symbol1 + "  x  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10000\n" + symbol2 + "  =  " + result;
        }
        // kwintal to g
        else if (symbol1.equals("KWINTAL") && symbol2.equals("Gram")) {
            results = symbol2 + "  =  " + symbol1 + "  x  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100000\n" + symbol2 + "  =  " + result;
        }
        // kwintal to dg
        else if (symbol1.equals("KWINTAL") && symbol2.equals("DG")) {
            results = symbol2 + "  =  " + symbol1 + "  x  1000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000000\n" + symbol2 + "  =  " + result;
        }
        // kwintal to cg
        else if (symbol1.equals("KWINTAL") && symbol2.equals("CG")) {
            results = symbol2 + "  =  " + symbol1 + "  x  10000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10000000\n" + symbol2 + "  =  " + result;
        }
        // kwintal to Mg
        else if (symbol1.equals("KWINTAL") && symbol2.equals("MG")) {
            results = symbol2 + "  =  " + symbol1 + "  x  100000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100000000\n" + symbol2 + "  =  " + result;
        }
        // KG to TON
        else if (symbol1.equals("KG") && symbol2.equals("TON")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // KG to KWIN
        else if (symbol1.equals("KG") && symbol2.equals("KWINTAL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // KG to HG
        else if (symbol1.equals("KG") && symbol2.equals("HG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10\n" + symbol2 + "  =  " + result;
        }
        // KG to DAG
        else if (symbol1.equals("KG") && symbol2.equals("DAG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100\n" + symbol2 + "  =  " + result;
        }
        // KG to G
        else if (symbol1.equals("KG") && symbol2.equals("Gram")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000\n" + symbol2 + "  =  " + result;
        }
        // KG to DG
        else if (symbol1.equals("KG") && symbol2.equals("DG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10000\n" + symbol2 + "  =  " + result;
        }
        // KG to CG
        else if (symbol1.equals("KG") && symbol2.equals("CG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100000\n" + symbol2 + "  =  " + result;
        }
        // KG to CG
        else if (symbol1.equals("KG") && symbol2.equals("MG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000000\n" + symbol2 + "  =  " + result;
        }
        // HG to TON
        else if (symbol1.equals("HG") && symbol2.equals("TON")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  / 10000\n" + symbol2 + "  =  " + result;
        }
        // HG to KWIN
        else if (symbol1.equals("HG") && symbol2.equals("KWINTAL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // HG to KG
        else if (symbol1.equals("HG") && symbol2.equals("KG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // HG to DAG
        else if (symbol1.equals("HG") && symbol2.equals("DAG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // HG to G
        else if (symbol1.equals("HG") && symbol2.equals("Gram")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // HG to DG
        else if (symbol1.equals("HG") && symbol2.equals("DG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  1000\n" + symbol2 + "  =  " + result;
        }
        // HG to CG
        else if (symbol1.equals("HG") && symbol2.equals("CG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10000\n" + symbol2 + "  =  " + result;
        }
        // HG to MG
        else if (symbol1.equals("HG") && symbol2.equals("MG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100000\n" + symbol2 + "  =  " + result;
        }
        // DAG to TON
        else if (symbol1.equals("DAG") && symbol2.equals("TON")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000\n" + symbol2 + "  =  " + result;
        }
        // DAG to KWIN
        else if (symbol1.equals("DAG") && symbol2.equals("KWINTAL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // DAG to KG
        else if (symbol1.equals("DAG") && symbol2.equals("KG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // DAG to HG
        else if (symbol1.equals("DAG") && symbol2.equals("HG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // DAG to GRA
        else if (symbol1.equals("DAG") && symbol2.equals("Gram")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // DAG to DG
        else if (symbol1.equals("DAG") && symbol2.equals("DG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // DAG to CG
        else if (symbol1.equals("DAG") && symbol2.equals("CG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  1000\n" + symbol2 + "  =  " + result;
        }
        // DAG to MG
        else if (symbol1.equals("DAG") && symbol2.equals("MG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10000\n" + symbol2 + "  =  " + result;
        }
        // GR to TON
        else if (symbol1.equals("Gram") && symbol2.equals("TON")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000000\n" + symbol2 + "  =  " + result;
        }
        // GR to KW
        else if (symbol1.equals("Gram") && symbol2.equals("KWINTAL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000\n" + symbol2 + "  =  " + result;
        }
        // GR to KG
        else if (symbol1.equals("Gram") && symbol2.equals("KG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // GR to HG
        else if (symbol1.equals("Gram") && symbol2.equals("HG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // GR to DAG
        else if (symbol1.equals("Gram") && symbol2.equals("DAG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // GR to DG
        else if (symbol1.equals("Gram") && symbol2.equals("DG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // GR to CG
        else if (symbol1.equals("Gram") && symbol2.equals("CG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // GR to MG
        else if (symbol1.equals("Gram") && symbol2.equals("MG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  1000\n" + symbol2 + "  =  " + result;
        }
        // DG to TON
        else if (symbol1.equals("DG") && symbol2.equals("TON")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000000\n" + symbol2 + "  =  " + result;
        }
        // DG to KW
        else if (symbol1.equals("DG") && symbol2.equals("KWINTAL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000000\n" + symbol2 + "  =  " + result;
        }
        // DG to KG
        else if (symbol1.equals("DG") && symbol2.equals("KG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // DG to HG
        else if (symbol1.equals("DG") && symbol2.equals("HG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // DG to DAG
        else if (symbol1.equals("DG") && symbol2.equals("DAG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // DG to G
        else if (symbol1.equals("DG") && symbol2.equals("Gram")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // DG to CG
        else if (symbol1.equals("DG") && symbol2.equals("CG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // DG to MG
        else if (symbol1.equals("DG") && symbol2.equals("MG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // CG to TON
        else if (symbol1.equals("CG") && symbol2.equals("TON")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000000\n" + symbol2 + "  =  " + result;
        }
        // CG to KW
        else if (symbol1.equals("CG") && symbol2.equals("KWINTAL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000000\n" + symbol2 + "  =  " + result;
        }
        // CG to KG
        else if (symbol1.equals("CG") && symbol2.equals("KG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000\n" + symbol2 + "  =  " + result;
        }
        // CG to HG
        else if (symbol1.equals("CG") && symbol2.equals("HG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // CG to DAG
        else if (symbol1.equals("CG") && symbol2.equals("DAG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // CG to G
        else if (symbol1.equals("CG") && symbol2.equals("Gram")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // CG to DG
        else if (symbol1.equals("CG") && symbol2.equals("DG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // CG to MG
        else if (symbol1.equals("CG") && symbol2.equals("MG")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // MG to TON
        else if (symbol1.equals("MG") && symbol2.equals("TON")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000000000\n" + symbol2 + "  =  " + result;
        }
        // MG to KW
        else if (symbol1.equals("MG") && symbol2.equals("KWINTAL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000000\n" + symbol2 + "  =  " + result;
        }
        // MG to KG
        else if (symbol1.equals("MG") && symbol2.equals("KG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000000\n" + symbol2 + "  =  " + result;
        }
        // MG to HG
        else if (symbol1.equals("MG") && symbol2.equals("HG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000\n" + symbol2 + "  =  " + result;
        }
        // MG to DAG
        else if (symbol1.equals("MG") && symbol2.equals("DAG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // MG to G
        else if (symbol1.equals("MG") && symbol2.equals("Gram")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // MG to DG
        else if (symbol1.equals("MG") && symbol2.equals("DG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // MG to CG
        else if (symbol1.equals("MG") && symbol2.equals("CG")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        return results;
    }
}
