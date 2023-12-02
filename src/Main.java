import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int max_red = 12;
        int max_blue = 14;
        int max_green = 13;
        int min_red = 0;
        int min_green = 0;
        int min_blue = 0;
        int i = 1;
        int result = 0;
        int result2 = 0;

        boolean is_okay = true;


        BufferedReader bufReader = new BufferedReader(new StringReader(text));
        String line=null;
        while( (line=bufReader.readLine()) != null ){
            line = line.substring(8);
            min_red=0;
            min_green=0;
            min_blue=0;

            for (int x = 0; x < line.length(); x++) {
                int number = Character.getNumericValue(line.charAt(x));
                try {
                    if (Character.isDigit(line.charAt(x-1))){
                        number+=10*Character.getNumericValue(line.charAt(x-1));
                    }
                } catch (Exception e) {

                }

                if (Character.isDigit(line.charAt(x)) && line.charAt(x+2)=='r') {
                    if(number>max_red){
                        is_okay=false;
                    }
                    if(number>min_red){
                        min_red=number;
                    }

                } else if (Character.isDigit(line.charAt(x)) && line.charAt(x+2)=='g') {
                    if(number>max_green){
                        is_okay=false;
                    }
                    if(number>min_green){
                        min_green=number;
                    }
                } else if (Character.isDigit(line.charAt(x)) && line.charAt(x+2)=='b'){
                    if(number>max_blue){
                        is_okay=false;
                    }
                    if(number>min_blue){
                        min_blue=number;
                    }
                } else if(Character.isDigit(line.charAt(x))){
                    //System.out.println(number);
                }

            }

            if(is_okay){
                result+=i;
                System.out.println(i);
            }

            result2+=(min_red*min_blue*min_green);
            is_okay = true;
            i++;
        }

        System.out.println("Result of first part: " + result);
        System.out.println("Result of second part: " + result2);
    }

    public static String text = "Game 1: 3 blue, 7 green, 10 red; 4 green, 4 red; 1 green, 7 blue, 5 red; 8 blue, 10 red; 7 blue, 19 red, 1 green\n" +
            "Game 2: 6 red, 10 green; 11 green, 4 red; 16 green, 2 blue; 7 green, 5 blue, 4 red; 17 green, 1 red, 1 blue\n" +
            "Game 3: 5 red, 9 blue, 1 green; 5 red; 11 red, 2 green, 8 blue; 2 green, 6 blue\n" +
            "Game 4: 2 red, 5 green; 2 blue, 3 red, 3 green; 3 red, 2 blue; 8 green, 2 red\n" +
            "Game 5: 12 red, 13 blue; 13 blue, 2 green, 9 red; 9 blue, 1 red; 2 green, 12 blue; 1 green, 1 red, 11 blue\n" +
            "Game 6: 4 blue, 11 red; 4 red; 1 green, 7 red; 1 green, 1 blue; 8 blue, 10 red; 1 green, 2 blue, 8 red\n" +
            "Game 7: 7 blue, 15 red, 1 green; 5 green, 17 red, 7 blue; 5 blue, 1 green; 11 blue, 2 green, 17 red; 14 green, 9 red, 2 blue; 6 blue, 19 red\n" +
            "Game 8: 13 green; 5 green; 3 blue, 9 green, 1 red; 4 red, 11 green, 4 blue\n" +
            "Game 9: 4 green, 1 red, 1 blue; 4 green, 7 blue, 7 red; 9 blue, 4 red; 2 blue, 8 red, 5 green; 6 blue, 2 green; 5 red, 5 green, 10 blue\n" +
            "Game 10: 1 green, 5 blue, 3 red; 4 green, 9 red, 3 blue; 11 red, 2 green, 5 blue; 3 green, 1 blue, 2 red; 6 red, 2 blue\n" +
            "Game 11: 2 red, 6 green, 12 blue; 2 red, 9 blue, 1 green; 12 green, 3 blue\n" +
            "Game 12: 1 red, 1 blue, 12 green; 6 green, 2 red, 1 blue; 6 red, 6 green, 1 blue; 3 green, 6 red\n" +
            "Game 13: 5 red, 19 green, 3 blue; 6 red, 7 blue, 11 green; 8 blue, 6 red; 3 blue, 4 green, 4 red; 8 red, 15 green, 5 blue; 5 blue, 2 red, 10 green\n" +
            "Game 14: 5 blue, 9 green; 4 green, 6 blue; 14 green, 1 red, 4 blue; 3 blue, 3 green; 2 green; 5 blue, 7 green, 1 red\n" +
            "Game 15: 5 red, 8 blue; 9 blue, 3 red; 5 red, 1 green, 16 blue; 1 blue, 3 red, 2 green; 5 red, 2 green, 10 blue\n" +
            "Game 16: 6 blue, 9 green, 10 red; 8 blue, 9 red, 14 green; 7 green, 1 blue, 1 red; 8 red, 5 green, 8 blue; 10 red, 5 blue, 14 green; 7 blue, 11 red, 3 green\n" +
            "Game 17: 12 blue, 12 red, 6 green; 14 green, 17 blue, 4 red; 11 blue, 1 red, 13 green\n" +
            "Game 18: 7 blue, 2 green, 4 red; 1 blue, 2 green, 4 red; 2 red, 17 blue\n" +
            "Game 19: 3 red, 9 green; 8 red, 2 blue, 2 green; 3 blue, 15 green, 11 red; 18 green, 3 red, 1 blue\n" +
            "Game 20: 5 green, 5 red, 16 blue; 8 blue, 6 green, 4 red; 10 red, 11 blue; 5 red, 5 blue, 5 green\n" +
            "Game 21: 1 red, 3 blue, 14 green; 6 red, 6 blue, 17 green; 12 green, 17 blue, 3 red; 15 green, 1 red, 19 blue; 3 red, 18 blue, 4 green\n" +
            "Game 22: 15 blue; 11 blue, 2 red, 1 green; 1 green, 7 red; 1 red, 18 blue, 1 green; 16 blue; 3 red, 6 blue\n" +
            "Game 23: 11 blue, 6 green, 4 red; 9 green, 11 red, 8 blue; 5 green, 5 red, 2 blue; 11 green, 4 blue, 11 red; 3 green, 9 blue, 2 red\n" +
            "Game 24: 7 green, 2 red; 8 red, 1 blue, 15 green; 3 red, 6 green, 6 blue\n" +
            "Game 25: 9 blue, 9 green; 3 green, 7 blue, 1 red; 6 green, 1 red, 1 blue; 6 green, 1 red, 1 blue\n" +
            "Game 26: 1 green, 15 blue, 1 red; 1 red, 12 blue, 1 green; 16 blue; 5 red, 11 green, 14 blue; 6 green, 4 red, 14 blue\n" +
            "Game 27: 14 red, 9 green; 11 red, 5 green, 6 blue; 1 red, 6 blue, 9 green\n" +
            "Game 28: 6 green, 1 blue, 9 red; 1 green, 9 red; 7 red; 11 red, 1 blue, 2 green; 8 red, 10 green; 6 green, 1 blue, 5 red\n" +
            "Game 29: 1 red, 19 blue, 3 green; 9 blue, 1 red; 8 green, 17 blue; 11 blue, 4 green\n" +
            "Game 30: 7 blue; 5 blue, 1 red, 1 green; 3 blue, 1 red\n" +
            "Game 31: 9 red, 2 green, 1 blue; 5 red, 1 green, 3 blue; 2 green, 7 red; 2 green, 12 red\n" +
            "Game 32: 1 red, 1 blue, 17 green; 14 blue, 10 green, 6 red; 12 green, 11 blue, 3 red\n" +
            "Game 33: 2 red, 1 green, 3 blue; 7 blue, 4 green; 1 red, 3 green, 5 blue\n" +
            "Game 34: 9 blue, 1 green, 9 red; 12 blue, 2 green, 12 red; 3 blue, 12 red; 2 green, 14 blue, 11 red; 10 red, 12 blue\n" +
            "Game 35: 6 blue, 2 red; 5 blue; 6 green, 9 blue, 3 red; 3 green, 1 red, 2 blue\n" +
            "Game 36: 9 blue, 4 green, 6 red; 2 red, 4 green; 7 red, 3 green; 6 green, 2 blue; 3 red, 4 blue, 3 green; 3 green, 4 red, 16 blue\n" +
            "Game 37: 2 green, 8 red, 4 blue; 3 red, 4 blue, 2 green; 5 blue, 3 green; 9 blue, 15 green; 5 red, 11 green, 7 blue\n" +
            "Game 38: 12 red, 1 blue; 10 red, 3 green, 2 blue; 7 blue, 3 green, 8 red; 14 red, 2 green\n" +
            "Game 39: 16 green, 2 red, 17 blue; 6 red, 4 green, 13 blue; 7 blue, 1 green, 4 red; 2 green, 3 blue; 12 green, 6 red, 17 blue; 5 red, 2 blue, 6 green\n" +
            "Game 40: 3 green, 4 blue, 2 red; 2 green, 3 red; 6 blue, 2 red, 6 green; 5 green; 3 blue, 1 red, 5 green\n" +
            "Game 41: 13 green, 11 red; 3 green, 2 red, 1 blue; 1 blue, 3 green, 9 red; 12 red, 11 green; 9 red, 1 green; 9 green, 4 red\n" +
            "Game 42: 4 green, 2 blue; 6 blue, 10 green; 13 blue, 3 red, 6 green; 11 blue, 17 green; 8 blue, 5 red\n" +
            "Game 43: 10 green, 2 blue, 10 red; 3 red, 3 blue, 5 green; 10 green, 11 red, 4 blue; 5 green; 7 green, 13 red, 2 blue\n" +
            "Game 44: 4 red, 1 blue, 5 green; 1 blue, 8 red, 3 green; 11 red, 1 green, 1 blue; 2 green, 12 red, 1 blue; 1 blue, 12 red; 14 red, 3 green\n" +
            "Game 45: 4 green, 5 red, 7 blue; 10 red, 8 green, 3 blue; 12 blue, 1 green, 13 red; 1 red, 3 blue, 7 green\n" +
            "Game 46: 5 blue, 13 red; 15 red, 3 green, 17 blue; 8 red, 2 green, 1 blue; 1 green, 7 red, 16 blue; 4 blue, 10 red\n" +
            "Game 47: 2 red, 3 green; 2 blue, 9 red, 15 green; 7 green, 4 red; 3 blue, 13 red, 9 green\n" +
            "Game 48: 11 green, 4 red, 9 blue; 1 blue, 7 green; 4 blue, 4 red; 4 red, 4 blue, 2 green; 9 green, 2 blue, 2 red\n" +
            "Game 49: 10 green, 6 blue; 2 blue, 5 green, 1 red; 5 green, 4 blue; 11 green, 3 red, 3 blue\n" +
            "Game 50: 2 red, 15 green, 1 blue; 8 green, 7 blue; 4 blue, 8 green; 7 blue, 17 green; 5 blue, 6 green, 2 red; 16 green, 2 red, 1 blue\n" +
            "Game 51: 3 green, 5 blue, 1 red; 11 red, 9 blue, 8 green; 3 red, 8 green, 7 blue; 1 red, 9 blue, 6 green; 4 green, 1 red, 3 blue; 8 green, 7 red\n" +
            "Game 52: 1 green, 2 blue, 10 red; 8 green, 1 blue, 2 red; 7 red, 8 green\n" +
            "Game 53: 2 red, 6 green; 1 green, 4 blue; 12 green, 19 blue; 11 blue, 1 green; 4 green, 20 blue; 7 blue, 9 green, 1 red\n" +
            "Game 54: 2 blue, 2 green, 2 red; 13 red, 1 green, 6 blue; 9 blue, 1 green, 18 red; 11 red, 16 blue; 15 red, 3 green, 13 blue\n" +
            "Game 55: 5 green, 5 blue, 9 red; 8 red, 11 blue, 7 green; 6 green, 2 red, 10 blue; 6 red, 6 blue, 9 green; 11 green, 14 blue, 4 red\n" +
            "Game 56: 8 blue, 14 green; 3 red, 8 green, 3 blue; 14 green, 1 red, 13 blue; 8 green, 3 red; 8 blue, 11 green, 1 red; 8 blue, 10 green, 2 red\n" +
            "Game 57: 7 blue, 7 red; 11 green, 5 blue, 2 red; 14 green, 8 blue; 5 blue, 2 red, 17 green; 12 green, 3 red; 7 red, 7 blue, 9 green\n" +
            "Game 58: 3 blue, 4 red, 1 green; 2 green, 3 red; 1 red, 2 green, 4 blue; 4 green, 4 red, 2 blue\n" +
            "Game 59: 6 red, 4 blue, 5 green; 6 blue, 6 red; 1 red; 8 blue, 1 red\n" +
            "Game 60: 4 blue, 9 green, 11 red; 12 green, 3 red, 9 blue; 7 green, 1 blue; 14 green, 11 blue, 11 red\n" +
            "Game 61: 12 green; 9 green, 9 red; 12 red, 18 blue, 8 green; 16 red, 10 blue, 3 green; 6 green, 15 red, 3 blue; 13 green\n" +
            "Game 62: 2 green, 3 red, 12 blue; 12 blue, 12 green, 12 red; 1 red, 12 blue, 5 green; 7 red, 9 blue, 13 green; 1 blue, 3 red, 10 green; 2 blue, 8 red, 17 green\n" +
            "Game 63: 10 green, 7 blue, 4 red; 3 blue, 6 green, 2 red; 4 green, 10 red, 6 blue; 16 blue, 5 red, 4 green\n" +
            "Game 64: 11 red, 1 green, 6 blue; 12 red, 3 green; 6 green, 5 blue, 2 red; 4 green, 9 blue, 11 red; 5 blue, 8 green, 8 red; 9 green, 11 blue\n" +
            "Game 65: 4 blue, 12 red; 1 green, 3 blue, 12 red; 1 green, 3 blue, 13 red; 2 red; 12 red\n" +
            "Game 66: 4 red, 3 green, 3 blue; 2 blue, 4 red; 10 red, 6 blue, 3 green\n" +
            "Game 67: 7 red, 2 blue, 5 green; 3 green, 5 red, 18 blue; 16 red, 5 green, 13 blue; 16 red, 5 blue, 2 green\n" +
            "Game 68: 11 blue, 2 red; 1 green, 3 blue, 8 red; 16 red, 1 green, 17 blue; 4 red, 1 green, 11 blue; 3 red\n" +
            "Game 69: 1 green, 9 red, 12 blue; 12 red; 11 blue; 1 green\n" +
            "Game 70: 1 green, 18 blue, 16 red; 3 green, 15 red, 7 blue; 3 blue, 3 green, 10 red; 1 blue, 3 green, 10 red\n" +
            "Game 71: 3 red, 12 blue, 8 green; 18 green, 12 blue, 5 red; 2 blue, 7 red; 11 blue, 9 green; 5 blue, 7 red, 19 green; 2 red, 1 blue, 13 green\n" +
            "Game 72: 8 red, 6 blue, 3 green; 2 green, 13 blue, 15 red; 5 green, 8 blue, 2 red; 5 red, 12 blue, 3 green\n" +
            "Game 73: 3 blue, 13 green; 7 red, 3 green; 10 red, 2 blue, 1 green\n" +
            "Game 74: 3 red; 2 red, 1 blue, 7 green; 10 green, 3 blue, 1 red; 6 green, 1 blue; 11 green, 4 blue\n" +
            "Game 75: 8 blue, 2 green, 4 red; 19 blue, 2 green; 1 red, 18 blue, 3 green; 3 red, 5 green, 18 blue\n" +
            "Game 76: 3 green, 2 red, 2 blue; 3 blue, 6 green, 1 red; 1 green, 3 blue; 1 blue, 1 green\n" +
            "Game 77: 4 green, 7 red, 13 blue; 18 blue; 4 blue, 9 red, 1 green; 2 green, 16 blue, 9 red\n" +
            "Game 78: 2 green, 5 blue, 11 red; 2 blue, 3 red, 1 green; 4 green, 6 blue, 6 red\n" +
            "Game 79: 9 blue, 1 green, 3 red; 1 green, 2 red, 4 blue; 5 red, 4 green, 10 blue; 1 red, 9 blue, 4 green\n" +
            "Game 80: 8 red, 5 green, 7 blue; 15 red, 6 blue, 8 green; 8 blue, 14 red, 7 green; 3 blue, 2 green, 20 red; 10 red, 8 blue, 1 green; 7 green, 11 red, 9 blue\n" +
            "Game 81: 7 red, 1 blue, 5 green; 5 green, 10 blue, 9 red; 8 blue, 2 green, 7 red\n" +
            "Game 82: 1 green, 6 blue, 14 red; 7 blue, 2 green; 7 blue, 17 red, 3 green\n" +
            "Game 83: 2 red, 19 blue, 2 green; 5 red, 5 blue, 2 green; 2 red, 4 blue, 1 green\n" +
            "Game 84: 1 blue, 1 red, 12 green; 11 blue, 6 red, 13 green; 10 red, 8 blue, 8 green; 14 blue, 15 red; 19 blue, 10 green, 17 red; 11 red, 7 green\n" +
            "Game 85: 16 blue, 12 red, 8 green; 13 red, 3 green; 1 red, 16 blue, 10 green\n" +
            "Game 86: 5 green, 8 blue, 3 red; 8 green, 9 red, 13 blue; 4 green, 1 red, 12 blue; 13 red, 15 blue, 5 green\n" +
            "Game 87: 1 green, 16 red; 10 red, 2 green, 2 blue; 16 red, 5 blue; 1 blue, 2 green\n" +
            "Game 88: 3 blue, 1 green; 1 red, 2 green, 13 blue; 5 blue, 2 green, 1 red\n" +
            "Game 89: 9 blue, 2 red, 1 green; 10 blue; 5 blue, 1 green\n" +
            "Game 90: 8 red, 2 blue, 5 green; 2 red, 2 green, 2 blue; 1 blue, 8 green, 10 red; 11 green, 1 blue; 10 green, 4 red, 3 blue\n" +
            "Game 91: 14 blue, 9 red; 5 green, 5 red, 11 blue; 7 green, 4 blue, 12 red; 8 red, 6 green, 10 blue\n" +
            "Game 92: 2 green, 2 blue, 12 red; 2 green, 1 blue, 14 red; 14 red, 2 blue, 6 green; 11 red, 6 green, 2 blue; 11 green, 12 red, 2 blue\n" +
            "Game 93: 4 green, 7 blue, 3 red; 1 green, 12 blue, 1 red; 8 blue, 7 green, 2 red; 3 red, 9 blue, 2 green\n" +
            "Game 94: 13 green, 9 blue; 9 blue, 1 red, 8 green; 12 green, 1 red, 8 blue; 1 red, 9 green; 1 red, 5 blue, 14 green\n" +
            "Game 95: 7 blue, 14 red; 9 blue, 17 red; 2 blue, 1 green, 4 red\n" +
            "Game 96: 11 blue, 2 green, 3 red; 3 blue, 12 red, 3 green; 4 green, 11 red, 1 blue\n" +
            "Game 97: 9 red, 5 green, 2 blue; 12 red, 1 blue, 11 green; 7 green, 4 red, 2 blue; 1 blue, 6 red, 10 green\n" +
            "Game 98: 5 green, 5 red, 11 blue; 1 red, 10 blue, 7 green; 8 red, 1 blue, 7 green; 8 green, 11 red, 2 blue; 4 red, 5 blue, 2 green; 10 green, 5 red, 9 blue\n" +
            "Game 99: 3 green, 7 red, 4 blue; 9 red, 13 blue, 2 green; 3 red, 2 green, 11 blue; 5 red, 6 blue, 3 green; 8 blue, 5 green, 6 red; 6 green, 13 red, 1 blue\n" +
            "Game 100: 9 green, 7 blue; 1 green, 3 red, 4 blue; 15 red, 9 green; 3 blue, 6 red, 13 green; 2 red, 11 blue, 12 green";

}