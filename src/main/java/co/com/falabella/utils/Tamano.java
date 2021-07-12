package co.com.falabella.utils;

public class Tamano {

    private Tamano() {
    }

    public static String devolver(String tamano) {
        int size = Integer.parseInt(tamano);

        if (size <= 32) {
            return "1";
        } else if (size >= 40 && size <= 43) {
            return "2";
        } else if (size >= 49 && size <= 50) {
            return "3";
        } else if (size >= 55 && size <= 60) {
            return "4";
        } else if (size >= 65) {
            return "5";
        } else {
            return "0";
        }

    }

}
