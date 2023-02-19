package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import static java.lang.Math.sqrt;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        double strana_ctverce = 80;
        double delsi_strana = 100;
        double predpona = strana_ctverce;
        double odvesna = sqrt(strana_ctverce * strana_ctverce / 2);
        double nozicka = strana_ctverce / 3;
        double mezera = strana_ctverce + 50;

        /*zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliPrasatko(zofka);
        zofka.turnRight(120);
        mezera(zofka);
        nakresliOsmiuhelnik(zofka);
        zofka.turnRight(180);
        mezera(zofka);
        nakresliKolecko(zofka);
        mezera(zofka);
        nakresliSlunicko(zofka);*/

        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penDown();
        nakresliSlunicko(zofka);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(120);
        zofka.turnRight(90);
        zofka.penDown();
        for (int i = 0; i < 5; i++) {
            nakresliTrojuhelnik(zofka, predpona, odvesna);
            nakresliTelo(zofka, strana_ctverce, delsi_strana);
            ulice(zofka, mezera);
        }
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(2 * delsi_strana);
        zofka.turnRight(90);
        zofka.move(mezera);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliTrojuhelnik(zofka, predpona, odvesna);
        nakresliTelo(zofka, strana_ctverce, delsi_strana);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(250);
        zofka.turnLeft(90);
        zofka.move(delsi_strana);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliPrasatko(zofka);
        zofka.penUp();
        zofka.turnLeft(60);
        zofka.move(370);
        zofka.turnRight(90);
        zofka.move(delsi_strana);
        zofka.penDown();
        nakresliTrojuhelnik(zofka, predpona, odvesna);
        nakresliTelo(zofka, strana_ctverce, delsi_strana);
    }

    private void nakresliPrasatko(Turtle zofka) {
        double strana_ctverce = 80;
        double delsi_strana = 100;
        double predpona = strana_ctverce;
        double odvesna = sqrt(strana_ctverce * strana_ctverce / 2);
        double nozicka = strana_ctverce / 3;

        zofka.turnLeft(90);
        nakresliTrojuhelnik(zofka, predpona, odvesna);
        nakresliTelo(zofka, strana_ctverce, delsi_strana);
        nakresliNozicku(zofka, nozicka);
        presunNaNozicku(zofka, strana_ctverce, delsi_strana);
        nakresliNozicku(zofka, nozicka);
    }

    private void nakresliTrojuhelnik(Turtle zofka, double predpona, double odvesna) {
        zofka.turnRight(45);
        zofka.move(odvesna);
        zofka.turnRight(90);
        zofka.move(odvesna);
        zofka.turnRight(135);
        zofka.move(predpona);
        zofka.turnRight(90);
    }

    private void nakresliTelo(Turtle zofka, double strana_ctverce, double delsi_strana) {
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(90);
            zofka.move(strana_ctverce);
            zofka.turnRight(90);
            zofka.move(delsi_strana);
        }
    }

    private void nakresliNozicku(Turtle zofka, double nozicka) {
        zofka.turnLeft(60);
        zofka.move(nozicka);
        zofka.turnLeft(120);
        zofka.penUp();
        zofka.move(nozicka);
        zofka.turnLeft(120);
        zofka.penDown();
        zofka.move(nozicka);
    }

    private void presunNaNozicku(Turtle zofka, double strana_ctverce, double delsi_strana) {
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(delsi_strana);
        zofka.turnLeft(180);
        zofka.penDown();
    }

    private void mezera(Turtle zofka) {
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
    }

    private void nakresliOsmiuhelnik(Turtle zofka) {
        zofka.turnLeft(180);
        for (int n = 0; n < 8; n++) {
            zofka.move(40);
            zofka.turnRight(45);
        }
    }

    private void nakresliKolecko(Turtle zofka) {
        for (int n = 0; n < 18; n++) {
            zofka.move(20);
            zofka.turnLeft(20);
        }
    }

    private void nakresliSlunicko(Turtle zofka) {
        for (int n = 0; n < 12; n++) {
            zofka.move(15);
            zofka.turnLeft(30);
            zofka.turnRight(110);
            zofka.move(15);
            zofka.turnLeft(180);
            zofka.move(15);
            zofka.turnRight(70);

        }
    }

    private void ulice(Turtle zofka, double mezera) {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(mezera);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }
}
