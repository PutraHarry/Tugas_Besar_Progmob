package com.example.tugasbesarprogmob.rumus_luas;

import android.content.Context;

public class HitungLuas {
    private Context context;

    public HitungLuas(Context context) {
        this.context = context;
    }

    // KA
    // formula conversion KA to ha
    public String KaToHa(double ka) {
        // ha = 10*ka
        double ha = 10*ka;
        return check_after_decimal_point(ha);
    }

    // formula conversion ka to daa
    public String KaToDaa(double ka) {
        // dal = 100*ka
        double daa = 100*ka;
        return check_after_decimal_point(daa);
    }

    // formula conversion ka to a
    public String KaToA(double ka) {
        // a = 1000*ka
        double a = 1000*ka;
        return check_after_decimal_point(a);
    }

    // formula conversion ka to da
    public String KaToDa(double ka) {
        // da = 10000*ka
        double da = 10000*ka;
        return check_after_decimal_point(da);
    }

    // formula conversion ka to ca
    public String KaToCa(double ka) {
        // ca = 100000*ka
        double ca = 100000*ka;
        return check_after_decimal_point(ca);
    }

    // formula conversion ka to ma
    public String KaToMa(double ka) {
        // ma = 1000000*ka
        double ma = 1000000*ka;
        return check_after_decimal_point(ma);
    }

    //ha
    // formula conversion ha to ka
    public String HaToKa(double ha) {
        // ka = ha/10
        double ka = ha/10;
        return check_after_decimal_point(ka);
    }

    // formula conversion ha to daa
    public String HaToDaa(double ha) {
        // daa = 10*ha
        double daa = ha*10;
        return check_after_decimal_point(daa);
    }

    // formula conversion ha to a
    public String HaToA(double ha) {
        // a = 100*ha
        double a = ha*100;
        return check_after_decimal_point(a);
    }

    // formula conversion ha to da
    public String HaToDa(double ha) {
        // da = 1000*ha
        double da = ha*1000;
        return check_after_decimal_point(da);
    }

    // formula conversion ha to ca
    public String HaToCa(double ha) {
        // ca = 10000*ha
        double ca = ha*10000;
        return check_after_decimal_point(ca);
    }

    // formula conversion ha to ma
    public String HaToMa(double ha) {
        // ma = 100000*ha
        double ma = ha*100000;
        return check_after_decimal_point(ma);
    }

    //daa
    // formula conversion daa to ka
    public String DaaToKa(double daa) {
        // ka = daa/100
        double ka = daa/100;
        return check_after_decimal_point(ka);
    }

    // formula conversion daa to ha
    public String DaaToHa(double daa) {
        // ha = daa/10
        double ha = daa/10;
        return check_after_decimal_point(ha);
    }

    // formula conversion daa to a
    public String DaaToA(double daa) {
        // a = 10*daa
        double a = daa*10;
        return check_after_decimal_point(a);
    }

    // formula conversion daa to da
    public String DaaToDa(double daa) {
        // da = 100*daa
        double da = daa*100;
        return check_after_decimal_point(da);
    }

    // formula conversion daa to ca
    public String DaaToCa(double daa) {
        // ca = 1000*daa
        double ca = daa*1000;
        return check_after_decimal_point(ca);
    }

    // formula conversion daa to ma
    public String DaaToMa(double daa) {
        // ma = 10000*daa
        double ma = daa*10000;
        return check_after_decimal_point(ma);
    }

    //m
    // formula conversion a to ka
    public String AToKa(double a) {
        // ka = a/1000
        double ka = a/1000;
        return check_after_decimal_point(ka);
    }

    // formula conversion a to ha
    public String AToHa(double a) {
        // ha = a/100
        double ha = a/100;
        return check_after_decimal_point(ha);
    }

    // formula conversion a to daa
    public String AToDaa(double a) {
        // daa = a/10
        double daa = a/10;
        return check_after_decimal_point(daa);
    }

    // formula conversion a to da
    public String AToDa(double a) {
        // da = 10*a
        double da = a*10;
        return check_after_decimal_point(da);
    }

    // formula conversion a to ca
    public String AToCa(double a) {
        // ca = 100*a
        double ca = a*100;
        return check_after_decimal_point(ca);
    }

    // formula conversion a to ma
    public String AToMa(double a) {
        // ma = 1000*a
        double ma = a*1000;
        return check_after_decimal_point(ma);
    }

    //da
    // formula conversion da to ka
    public String DaToKa(double da) {
        // ka = da/10000
        double ka = da/10000;
        return check_after_decimal_point(ka);
    }

    // formula conversion da to ha
    public String DaToHa(double da) {
        // ha = da/1000
        double ha = da/1000;
        return check_after_decimal_point(ha);
    }

    // formula conversion da to daa
    public String DaToDaa(double da) {
        // daa = da/100
        double daa = da/100;
        return check_after_decimal_point(daa);
    }

    // foraula conversion da to a
    public String DaToA(double da) {
        // a = da/10
        double a = da/10;
        return check_after_decimal_point(a);
    }

    // formula conversion da to ca
    public String DaToCa(double da) {
        // ca = 10*da
        double ca = da*10;
        return check_after_decimal_point(ca);
    }

    // formula conversion da to ma
    public String DaToMa(double da) {
        // ma = 100*da
        double ma = da*100;
        return check_after_decimal_point(ma);
    }

    //cl
    // formula conversion ca to ka
    public String CaToKa(double ca) {
        // ka = ca/100000
        double ka = ca/100000;
        return check_after_decimal_point(ka);
    }

    // formula conversion ca to ha
    public String CaToHa(double ca) {
        // ha = ca/10000
        double ha = ca/10000;
        return check_after_decimal_point(ha);
    }

    // formula conversion ca to daa
    public String CaToDaa(double ca) {
        // daa = ca/1000
        double daa = ca/1000;
        return check_after_decimal_point(daa);
    }

    // formula conversion ca to a
    public String CaToA(double ca) {
        // a = ca/100
        double a = ca/100;
        return check_after_decimal_point(a);
    }

    // formula conversion ca to da
    public String CaToDa(double ca) {
        // da = ca/10
        double da = ca/10;
        return check_after_decimal_point(da);
    }

    // formula conversion ca to ma
    public String CaToMa(double ca) {
        // ma = 10*ca
        double ma = ca*10;
        return check_after_decimal_point(ma);
    }

    //ma
    // formula conversion ma to ka
    public String MaToKa(double ma) {
        // ka = ma/1000000
        double ka = ma/1000000;
        return check_after_decimal_point(ka);
    }

    // formula conversion ma to ha
    public String MaToHa(double ma) {
        // ha = ma/100000
        double ha = ma/100000;
        return check_after_decimal_point(ha);
    }

    // formula conversion ma to daa
    public String MaToDaa(double ma) {
        // daa = ma/10000
        double daa = ma/10000;
        return check_after_decimal_point(daa);
    }

    // formula conversion ma to a
    public String MaToA(double ma) {
        // a = ma/1000
        double a = ma/1000;
        return check_after_decimal_point(a);
    }

    // formula conversion ma to da
    public String MaToDa(double ma) {
        // da = ma/100
        double da = ma/100;
        return check_after_decimal_point(da);
    }

    // formula conversion ma to ca
    public String MaToCa(double ma) {
        // ca = ma/10
        double ca = ma/10;
        return check_after_decimal_point(ca);
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
        if (symbol1.equals("KA") && symbol2.equals("HA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10\n" + symbol2 + "  =  " + result;
        }
        // kl to dal
        else if (symbol1.equals("KA") && symbol2.equals("DAA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100\n" + symbol2 + "  =  " + result;
        }
        // kl to G
        else if (symbol1.equals("KA") && symbol2.equals("Are")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000\n" + symbol2 + "  =  " + result;
        }
        // kl to dl
        else if (symbol1.equals("KA") && symbol2.equals("DA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10000\n" + symbol2 + "  =  " + result;
        }
        // kl to cl
        else if (symbol1.equals("KA") && symbol2.equals("CA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100000\n" + symbol2 + "  =  " + result;
        }
        // kl to ML
        else if (symbol1.equals("KA") && symbol2.equals("MA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000000\n" + symbol2 + "  =  " + result;
        }
        else if (symbol1.equals("HA") && symbol2.equals("KA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // hl to dal
        else if (symbol1.equals("HA") && symbol2.equals("DAA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // hl to G
        else if (symbol1.equals("HA") && symbol2.equals("Are")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // hl to dl
        else if (symbol1.equals("HA") && symbol2.equals("DA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  1000\n" + symbol2 + "  =  " + result;
        }
        // hl to cl
        else if (symbol1.equals("HA") && symbol2.equals("CA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10000\n" + symbol2 + "  =  " + result;
        }
        // hl to ml
        else if (symbol1.equals("HA") && symbol2.equals("MA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100000\n" + symbol2 + "  =  " + result;
        }
        // dal to kl
        else if (symbol1.equals("DAA") && symbol2.equals("KA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // dal to hl
        else if (symbol1.equals("DAA") && symbol2.equals("HA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // dal to GRA
        else if (symbol1.equals("DAA") && symbol2.equals("Are")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // dal to dl
        else if (symbol1.equals("DAA") && symbol2.equals("DA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // dal to cl
        else if (symbol1.equals("DAA") && symbol2.equals("CA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  1000\n" + symbol2 + "  =  " + result;
        }
        // dal to ml
        else if (symbol1.equals("DAA") && symbol2.equals("MA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10000\n" + symbol2 + "  =  " + result;
        }
        // GR to kl
        else if (symbol1.equals("Are") && symbol2.equals("KA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // GR to hl
        else if (symbol1.equals("Are") && symbol2.equals("HA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // GR to dal
        else if (symbol1.equals("Are") && symbol2.equals("DAA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // GR to dl
        else if (symbol1.equals("Are") && symbol2.equals("DA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // GR to cl
        else if (symbol1.equals("Are") && symbol2.equals("CA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // GR to ml
        else if (symbol1.equals("Are") && symbol2.equals("MA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  1000\n" + symbol2 + "  =  " + result;
        }
        // dl to kl
        else if (symbol1.equals("DA") && symbol2.equals("KA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // dl to hl
        else if (symbol1.equals("DA") && symbol2.equals("HA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // dl to dal
        else if (symbol1.equals("DA") && symbol2.equals("DAA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // dl to G
        else if (symbol1.equals("DA") && symbol2.equals("Are")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // dl to cl
        else if (symbol1.equals("DA") && symbol2.equals("CA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // dl to ml
        else if (symbol1.equals("DA") && symbol2.equals("MA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  100\n" + symbol2 + "  =  " + result;
        }
        // cl to kl
        else if (symbol1.equals("CA") && symbol2.equals("KA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000\n" + symbol2 + "  =  " + result;
        }
        // cl to hl
        else if (symbol1.equals("CA") && symbol2.equals("HA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // cl to dal
        else if (symbol1.equals("CA") && symbol2.equals("DAA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // cl to G
        else if (symbol1.equals("CA") && symbol2.equals("Are")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // cl to dl
        else if (symbol1.equals("CA") && symbol2.equals("DA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // cl to ml
        else if (symbol1.equals("CA") && symbol2.equals("MA")) {
            results = symbol2 + "  =  " + symbol1 + "  *  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  *  10\n" + symbol2 + "  =  " + result;
        }
        // ml to kl
        else if (symbol1.equals("MA") && symbol2.equals("KA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000000\n" + symbol2 + "  =  " + result;
        }
        // ml to hl
        else if (symbol1.equals("MA") && symbol2.equals("HA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000\n" + symbol2 + "  =  " + result;
        }
        // ml to dal
        else if (symbol1.equals("MA") && symbol2.equals("DAA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // ml to G
        else if (symbol1.equals("MA") && symbol2.equals("Are")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // ml to dl
        else if (symbol1.equals("MA") && symbol2.equals("DA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // ml to cl
        else if (symbol1.equals("MA") && symbol2.equals("CA")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        return results;
    }
}
