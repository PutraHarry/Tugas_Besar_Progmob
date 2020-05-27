package com.example.tugasbesarprogmob.rumus_volume;

import android.content.Context;

public class HitungVolume {
    private Context context;

    public HitungVolume(Context context) {
        this.context = context;
    }

    // K1/M3
    // formula conversion kl to gl
    public String KlToHl(double kl) {
        // hl = 10*kl
        double hl = 10*kl;
        return check_after_decimal_point(hl);
    }

    // formula conversion kl to hl
    public String KlToDal(double kl) {
        // dal = 100*kl
        double dal = 100*kl;
        return check_after_decimal_point(dal);
    }

    // formula conversion kl to l
    public String KlToL(double kl) {
        // l = 1000*kl
        double l = 1000*kl;
        return check_after_decimal_point(l);
    }

    // formula conversion kl to dl
    public String KlToDl(double kl) {
        // dl = 10000*kl
        double dl = 10000*kl;
        return check_after_decimal_point(dl);
    }

    // formula conversion kl to cl
    public String KlToCl(double kl) {
        // cl = 100000*kl
        double cl = 100000*kl;
        return check_after_decimal_point(cl);
    }

    // formula conversion kl to ml
    public String KlToMl(double kl) {
        // ml = 1000000*kl
        double ml = 1000000*kl;
        return check_after_decimal_point(ml);
    }

    //hL
    // formula conversion hl to kl
    public String HlToKl(double hl) {
        // kl = hl/10
        double kl = hl/10;
        return check_after_decimal_point(kl);
    }

    // formula conversion hl to dal
    public String HlToDal(double hl) {
        // dal = 10*hl
        double dal = hl*10;
        return check_after_decimal_point(dal);
    }

    // formula conversion hl to g
    public String HlToL(double hl) {
        // g = 100*hl
        double l = hl*100;
        return check_after_decimal_point(l);
    }

    // formula conversion hl to dl
    public String HlToDl(double hl) {
        // dl = 1000*hl
        double dl = hl*1000;
        return check_after_decimal_point(dl);
    }

    // formula conversion hl to cl
    public String HlToCl(double hl) {
        // cl = 10000*hl
        double cl = hl*10000;
        return check_after_decimal_point(cl);
    }

    // formula conversion hl to ml
    public String HlToMl(double hl) {
        // ml = 100000*hl
        double ml = hl*100000;
        return check_after_decimal_point(ml);
    }

    //dal
    // formula conversion dal to kl
    public String DalToKl(double dal) {
        // kl = dal/100
        double kl = dal/100;
        return check_after_decimal_point(kl);
    }

    // formula conversion dal to hl
    public String DalToHl(double dal) {
        // hl = dal/10
        double hl = dal/10;
        return check_after_decimal_point(hl);
    }

    // formula conversion dal to g
    public String DalToL(double dal) {
        // g = 10*dal
        double l = dal*10;
        return check_after_decimal_point(l);
    }

    // formula conversion dal to dl
    public String DalToDl(double dal) {
        // dl = 100*dal
        double dl = dal*100;
        return check_after_decimal_point(dl);
    }

    // formula conversion dal to cl
    public String DalToCl(double dal) {
        // cl = 1000*dal
        double cl = dal*1000;
        return check_after_decimal_point(cl);
    }

    // formula conversion dal to ml
    public String DalToMl(double dal) {
        // ml = 10000*dal
        double ml = dal*10000;
        return check_after_decimal_point(ml);
    }

    //L
    // formula conversion l to kl
    public String LToKl(double l) {
        // kl = l/1000
        double kl = l/1000;
        return check_after_decimal_point(kl);
    }

    // formula conversion l to hl
    public String LToHl(double l) {
        // hl = l/100
        double hl = l/100;
        return check_after_decimal_point(hl);
    }

    // formula conversion L to dal
    public String LToDal(double l) {
        // dal = L/10
        double dal = l/10;
        return check_after_decimal_point(dal);
    }

    // formula conversion g to dl
    public String LToDl(double l) {
        // dl = 10*g
        double dl = l*10;
        return check_after_decimal_point(dl);
    }

    // formula conversion L to cl
    public String LToCl(double l) {
        // cl = 100*L
        double cl = l*100;
        return check_after_decimal_point(cl);
    }

    // formula conversion L to ml
    public String LToMl(double l) {
        // ml = 1000*l
        double ml = l*1000;
        return check_after_decimal_point(ml);
    }

    //dl
    // formula conversion dl to kl
    public String DlToKl(double dl) {
        // kl = dl/10000
        double kl = dl/10000;
        return check_after_decimal_point(kl);
    }

    // formula conversion dl to hl
    public String DlToHl(double dl) {
        // hl = dl/1000
        double hl = dl/1000;
        return check_after_decimal_point(hl);
    }

    // formula conversion dl to dal
    public String DlToDal(double dl) {
        // dal = dl/100
        double dal = dl/100;
        return check_after_decimal_point(dal);
    }

    // formula conversion dl to g
    public String DlToL(double dl) {
        // g = dl/10
        double l = dl/10;
        return check_after_decimal_point(l);
    }

    // formula conversion dl to cl
    public String DlToCl(double dl) {
        // cl = 10*dl
        double cl = dl*10;
        return check_after_decimal_point(cl);
    }

    // formula conversion dl to ml
    public String DlToMl(double dl) {
        // ml = 100*dl
        double ml = dl*100;
        return check_after_decimal_point(ml);
    }

    //cl
    // formula conversion cl to kl
    public String ClToKl(double cl) {
        // kl = cl/100000
        double kl = cl/100000;
        return check_after_decimal_point(kl);
    }

    // formula conversion cl to hl
    public String ClToHl(double cl) {
        // hl = cl/10000
        double hl = cl/10000;
        return check_after_decimal_point(hl);
    }

    // formula conversion cl to dal
    public String ClToDal(double cl) {
        // dal = cl/1000
        double dal = cl/1000;
        return check_after_decimal_point(dal);
    }

    // formula conversion cl to g
    public String ClToL(double cl) {
        // g = cl/100
        double l = cl/100;
        return check_after_decimal_point(l);
    }

    // formula conversion cl to dl
    public String ClToDl(double cl) {
        // dl = cl/10
        double dl = cl/10;
        return check_after_decimal_point(dl);
    }

    // formula conversion cl to ml
    public String ClToMl(double cl) {
        // ml = 10*cl
        double ml = cl*10;
        return check_after_decimal_point(ml);
    }

    //ml
    // formula conversion ml to kl
    public String MlToKl(double ml) {
        // kl = ml/1000000
        double kl = ml/1000000;
        return check_after_decimal_point(kl);
    }

    // formula conversion ml to hl
    public String MlToHl(double ml) {
        // hl = ml/100000
        double hl = ml/100000;
        return check_after_decimal_point(hl);
    }

    // formula conversion ml to dal
    public String MlToDal(double ml) {
        // dal = ml/10000
        double dal = ml/10000;
        return check_after_decimal_point(dal);
    }

    // formula conversion ml to l
    public String MlToL(double ml) {
        // l = ml/1000
        double l = ml/1000;
        return check_after_decimal_point(l);
    }

    // formula conversion ml to dl
    public String MlToDl(double ml) {
        // dl = ml/100
        double dl = ml/100;
        return check_after_decimal_point(dl);
    }

    // formula conversion ml to ml
    public String MlToCl(double ml) {
        // cl = ml/10
        double cl = ml/10;
        return check_after_decimal_point(cl);
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
        if (symbol1.equals("KL") && symbol2.equals("HL")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10\n" + symbol2 + "  =  " + result;
        }
        // kl to dal
        else if (symbol1.equals("KL") && symbol2.equals("DAL")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100\n" + symbol2 + "  =  " + result;
        }
        // kl to G
        else if (symbol1.equals("KL") && symbol2.equals("Liter")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000\n" + symbol2 + "  =  " + result;
        }
        // kl to dl
        else if (symbol1.equals("KL") && symbol2.equals("DL")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10000\n" + symbol2 + "  =  " + result;
        }
        // kl to cl
        else if (symbol1.equals("KL") && symbol2.equals("CL")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100000\n" + symbol2 + "  =  " + result;
        }
        // kl to ML
        else if (symbol1.equals("KL") && symbol2.equals("ML")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000000\n" + symbol2 + "  =  " + result;
        }
        else if (symbol1.equals("HL") && symbol2.equals("KL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // hl to dal
        else if (symbol1.equals("HL") && symbol2.equals("DAL")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // hl to G
        else if (symbol1.equals("HL") && symbol2.equals("Liter")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // hl to dl
        else if (symbol1.equals("HL") && symbol2.equals("DL")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  1000\n" + symbol2 + "  =  " + result;
        }
        // hl to cl
        else if (symbol1.equals("HL") && symbol2.equals("CL")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10000\n" + symbol2 + "  =  " + result;
        }
        // hl to ml
        else if (symbol1.equals("HL") && symbol2.equals("ML")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100000\n" + symbol2 + "  =  " + result;
        }
        // dal to kl
        else if (symbol1.equals("DAL") && symbol2.equals("KL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // dal to hl
        else if (symbol1.equals("DAL") && symbol2.equals("HL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // dal to GRA
        else if (symbol1.equals("DAL") && symbol2.equals("Liter")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // dal to dl
        else if (symbol1.equals("DAL") && symbol2.equals("DL")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // dal to cl
        else if (symbol1.equals("DAL") && symbol2.equals("CL")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  1000\n" + symbol2 + "  =  " + result;
        }
        // dal to ml
        else if (symbol1.equals("DAL") && symbol2.equals("ML")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10000\n" + symbol2 + "  =  " + result;
        }
        // GR to kl
        else if (symbol1.equals("Liter") && symbol2.equals("KL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // GR to hl
        else if (symbol1.equals("Liter") && symbol2.equals("HL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // GR to dal
        else if (symbol1.equals("Liter") && symbol2.equals("DAL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // GR to dl
        else if (symbol1.equals("Liter") && symbol2.equals("DL")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // GR to cl
        else if (symbol1.equals("Liter") && symbol2.equals("CL")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // GR to ml
        else if (symbol1.equals("Liter") && symbol2.equals("ML")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  1000\n" + symbol2 + "  =  " + result;
        }
        // dl to kl
        else if (symbol1.equals("DL") && symbol2.equals("KL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // dl to hl
        else if (symbol1.equals("DL") && symbol2.equals("HL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // dl to dal
        else if (symbol1.equals("DL") && symbol2.equals("DAL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // dl to G
        else if (symbol1.equals("DL") && symbol2.equals("Liter")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // dl to cl
        else if (symbol1.equals("DL") && symbol2.equals("CL")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // dl to ml
        else if (symbol1.equals("DL") && symbol2.equals("ML")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // cl to kl
        else if (symbol1.equals("CL") && symbol2.equals("KL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000\n" + symbol2 + "  =  " + result;
        }
        // cl to hl
        else if (symbol1.equals("CL") && symbol2.equals("HL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // cl to dal
        else if (symbol1.equals("CL") && symbol2.equals("DAL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // cl to G
        else if (symbol1.equals("CL") && symbol2.equals("Liter")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // cl to dl
        else if (symbol1.equals("CL") && symbol2.equals("DL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // cl to ml
        else if (symbol1.equals("CL") && symbol2.equals("ML")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // ml to kl
        else if (symbol1.equals("ML") && symbol2.equals("KL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000000\n" + symbol2 + "  =  " + result;
        }
        // ml to hl
        else if (symbol1.equals("ML") && symbol2.equals("HL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000\n" + symbol2 + "  =  " + result;
        }
        // ml to dal
        else if (symbol1.equals("ML") && symbol2.equals("DAL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // ml to G
        else if (symbol1.equals("ML") && symbol2.equals("Liter")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // ml to dl
        else if (symbol1.equals("ML") && symbol2.equals("DL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // ml to cl
        else if (symbol1.equals("ML") && symbol2.equals("CL")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        return results;
    }
}
