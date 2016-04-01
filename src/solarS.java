import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class solarS {
    public static void main(String[] args) {
        myFrame f = new myFrame();
        f.setVisible(true);
    }
}

class planet{
    int x1;
    int y1;
    int x2;
    int y2;

    String nume;
    double diameter;
    double mass;
    double synodicPeriod;
    double orbitRadius;
    double dayLong;
    double density;
    int satelite;

    planet(String Name, int x1, int y1, int x2, int y2, double d, double m, double sp, double o, double dl, double dn, int s){

        this.nume = Name;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.diameter = d;
        this.mass = m;
        this.synodicPeriod = sp;
        this.orbitRadius = o;
        this.dayLong = dl;
        this.density = dn;
        this.satelite = s;

    }
    int getX1(){
        return this.x1;
    }

    int getY1(){
        return this.y1;
    }

    int getX2(){
        return this.x2;
    }

    int getY2(){
        return this.y2;
    }



}
class myFrame extends JFrame{
    JLabel lb1;
    JLabel lb2;
    TextArea ta1;
    JButton b1;

    planet Sun = new planet("Soare", 60, 305, 220, 465, 1390000, 1.98e30, 0, 0, 0, 1.408, 0 );
    planet Mercury = new planet("Mercur", 230, 365, 260, 395, 2478.0, 3.33e24, 115.88, 57.91e6, 58.6, 5.427, 0);
    planet Venus = new planet("Venus", 280, 345, 350, 415, 12102.0, 4.86e24, 583.92, 108.21e6, 224.698, 5.24, 0);
    planet Earth = new planet("Pamant", 370, 345, 450,425, 12736.0, 5.97e24, 1, 114.6e6, 1.66, 3.93,1);
    planet Mars = new planet("Marte", 470, 345, 540,415, 6782.0,  0.64e24, 779.94, 227.92e6, 1.66, 3.93 ,2);
    planet Jupiter = new planet("Jupiter", 570, 305, 720, 455, 142948.0, 1898.2e24, 398.88, 778.8e6, 0.41, 1.326, 67);
    planet Saturn = new planet("Saturn", 750, 325, 875, 445, 120324.0, 568.64e24, 378.09, 1433.53e6, 0.41, 0.687, 62);
    planet Uranus = new planet("Uranus", 900, 335, 1000, 425, 51118.0, 86.813e24, 369.66, 2872.46e6, 0.70, 1.27, 27);
    planet Neptune = new planet("Neptun", 1000, 345, 1100, 425, 49528.0, 101.413e24, 367.49, 4495.06e6, 0.66, 1.638, 14);
    planet Pluto = new planet("Pluto", 1130, 365, 1170, 395, 2374.0, 0.013e24, 366.73, 5903.38e6, 6.4, 1.86, 0);


    public myFrame(){
        setTitle("Program Educativ 'Sistemul Solar' ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 1200, 800);
        setResizable(false);


        setContentPane(new BgPanel());
        Container cont = getContentPane();
        ta1 = new TextArea();
        lb1 = new JLabel();
        lb1.setFont(new Font("Arial", Font.BOLD, 24));
        lb2 = new JLabel();
        lb2.setFont(new Font("Arial", Font.BOLD, 24));
        lb1.setForeground(Color.RED);

        cont.setLayout(new FlowLayout());
        cont.add(lb1);
        cont.add(lb2);
        cont.add(ta1);


        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickX = e.getX();
                int clickY = e.getY();


                if (clickX > Sun.getX1() && clickX < Sun.getX2() && clickY > Sun.getY1() && clickY < Sun.getY2()) {
                    lb1.setText(" Soarele ");
                    ta1.setText(" Denumire: "+Sun.nume+"\n"+
                                " Diametru: "+Double.toString(Sun.diameter)+" km \n"+
                                " Masa: "+ Double.toString(Sun.mass)+" kg \n"+
                                " Perioada sinodica: "+ Double.toString(Sun.synodicPeriod)+" zile \n"+
                                " Raza orbitei: "+ Double.toString(Sun.orbitRadius)+" km \n"+
                                " Lungimea zilei: "+ Double.toString(Sun.dayLong) +" zile \n"+
                                " Densitatea: "+ Double.toString(Sun.density)+" g/cm^3 \n"+
                                " Numarul de satelite: " + Integer.toString(Sun.satelite));

                }

                if (clickX > Mercury.getX1() && clickX < Mercury.getX2() && clickY > Mercury.getY1() && clickY < Mercury.getY2()) {
                    lb1.setText("Mercur");
                    ta1.setText(" Denumire: "+Mercury.nume+" \n"+
                            " Diametru: "+Double.toString(Mercury.diameter)+" km \n"+
                            " Masa: "+ Double.toString(Mercury.mass)+" kg \n"+
                            " Perioada sinodica: "+ Double.toString(Mercury.synodicPeriod)+" zile \n"+
                            " Raza orbitei: "+ Double.toString(Mercury.orbitRadius)+" km \n"+
                            " Lungimea zilei: "+ Double.toString(Mercury.dayLong) +" zile \n"+
                            " Densitatea: "+ Double.toString(Mercury.density)+" g/cm^3 \n"+
                            " Numarul de satelite: " + Integer.toString(Mercury.satelite));

                }

                if (clickX > Venus.getX1() && clickX < Venus.getX2() && clickY > Venus.getY1() && clickY < Venus.getY2()) {
                    lb1.setText("Venus");
                    ta1.setText(" Denumire: "+Venus.nume+" \n"+
                            " Diametru: "+Double.toString(Venus.diameter)+" km \n"+
                            " Masa: "+ Double.toString(Venus.mass)+" kg \n"+
                            " Perioada sinodica: "+ Double.toString(Venus.synodicPeriod)+" zile \n"+
                            " Raza orbitei: "+ Double.toString(Venus.orbitRadius)+" km \n"+
                            " Lungimea zilei: "+ Double.toString(Venus.dayLong) +" zile \n"+
                            " Densitatea: "+ Double.toString(Venus.density)+" g/cm^3 \n"+
                            " Numarul de satelite: " + Integer.toString(Sun.satelite));
                }

                if (clickX > Earth.getX1() && clickX < Earth.getX2() && clickY > Earth.getY1() && clickY < Earth.getY2()) {
                    lb1.setText("Pamant");
                    ta1.setText(" Denumire: "+Earth.nume+" \n"+
                            " Diametru: "+Double.toString(Earth.diameter)+" km \n"+
                            " Masa: "+ Double.toString(Earth.mass)+" kg \n"+
                            " Perioada sinodica: "+ Double.toString(Earth.synodicPeriod)+" zile \n"+
                            " Raza orbitei: "+ Double.toString(Earth.orbitRadius)+" km \n"+
                            " Lungimea zilei: "+ Double.toString(Earth.dayLong) +" zile \n"+
                            " Densitatea: "+ Double.toString(Earth.density)+" g/cm^3 \n"+
                            " Numarul de satelite: " + Integer.toString(Earth.satelite));
                }

                if (clickX > Mars.getX1() && clickX < Mars.getX2() && clickY > Mars.getY1() && clickY < Mars.getY2()) {
                    lb1.setText("Marte");
                    ta1.setText(" Denumire: "+Mars.nume+" \n"+
                            " Diametru: "+Double.toString(Mars.diameter)+" km \n"+
                            " Masa: "+ Double.toString(Mars.mass)+" kg \n"+
                            " Perioada sinodica: "+ Double.toString(Mars.synodicPeriod)+" zile \n"+
                            " Raza orbitei: "+ Double.toString(Mars.orbitRadius)+" km \n"+
                            " Lungimea zilei: "+ Double.toString(Mars.dayLong) +" zile \n"+
                            " Densitatea: "+ Double.toString(Mars.density)+" g/cm^3\n"+
                            " Numarul de satelite: " + Integer.toString(Mars.satelite));
                }

                if (clickX > Jupiter.getX1() && clickX < Jupiter.getX2() && clickY > Jupiter.getY1() && clickY < Jupiter.getY2()) {
                    lb1.setText("Jupiter");
                    ta1.setText(" Denumire: "+Jupiter.nume+" \n"+
                            " Diametru: "+Double.toString(Jupiter.diameter)+" km \n"+
                            " Masa: "+ Double.toString(Jupiter.mass)+" kg \n"+
                            " Perioada sinodica: "+ Double.toString(Jupiter.synodicPeriod)+" zile \n"+
                            " Raza orbitei: "+ Double.toString(Jupiter.orbitRadius)+" km \n"+
                            " Lungimea zilei: "+ Double.toString(Jupiter.dayLong) +" zile \n"+
                            " Densitatea: "+ Double.toString(Jupiter.density)+" g/cm^3\n"+
                            " Numarul de satelite: " + Integer.toString(Jupiter.satelite));
                }

                if (clickX > Saturn.getX1() && clickX < Saturn.getX2() && clickY > Saturn.getY1() && clickY <Saturn.getY2()) {
                    lb1.setText("Saturn");
                    ta1.setText(" Denumire: "+Saturn.nume+" \n"+
                            " Diametru: "+Double.toString(Saturn.diameter)+" km \n"+
                            " Masa: "+ Double.toString(Saturn.mass)+" kg \n"+
                            " Perioada sinodica: "+ Double.toString(Saturn.synodicPeriod)+" zile \n"+
                            " Raza orbitei: "+ Double.toString(Saturn.orbitRadius)+" km \n"+
                            " Lungimea zilei: "+ Double.toString(Saturn.dayLong) +" zile \n"+
                            " Densitatea: "+ Double.toString(Saturn.density)+" g/cm^3\n"+
                            " Numarul de satelite: " + Integer.toString(Saturn.satelite));
                }

                if (clickX > Uranus.getX1() && clickX < Uranus.getX2() && clickY > Uranus.getY1() && clickY < Uranus.getY2()) {
                    lb1.setText("Uranus");
                    ta1.setText(" Denumire: "+Uranus.nume+" \n"+
                            " Diametru: "+Double.toString(Uranus.diameter)+" km \n"+
                            " Masa: "+ Double.toString(Uranus.mass)+" kg \n"+
                            " Perioada sinodica: "+ Double.toString(Uranus.synodicPeriod)+" zile \n"+
                            " Raza orbitei: "+ Double.toString(Uranus.orbitRadius)+" km \n"+
                            " Lungimea zilei: "+ Double.toString(Uranus.dayLong) +" zile \n"+
                            " Densitatea: "+ Double.toString(Uranus.density)+" g/cm^3\n"+
                            " Numarul de satelite: " + Integer.toString(Uranus.satelite));
                }

                if (clickX > Neptune.getX1() && clickX < Neptune.getX2() && clickY > Neptune.getY1() && clickY < Neptune.getY2()) {
                    lb1.setText("Neptune");
                    ta1.setText(" Denumire: "+Neptune.nume+" \n"+
                            " Diametru: "+Double.toString(Neptune.diameter)+" km \n"+
                            " Masa: "+ Double.toString(Neptune.mass)+" kg \n"+
                            " Perioada sinodica: "+ Double.toString(Neptune.synodicPeriod)+" zile \n"+
                            " Raza orbitei: "+ Double.toString(Neptune.orbitRadius)+" km \n"+
                            " Lungimea zilei: "+ Double.toString(Neptune.dayLong) +" zile \n"+
                            " Densitatea: "+ Double.toString(Neptune.density)+" g/cm^3 \n"+
                            " Numarul de satelite: " + Integer.toString(Neptune.satelite));
                }

                if (clickX > Pluto.getX1() && clickX < Pluto.getX2() && clickY > Pluto.getY1() && clickY < Pluto.getY2()) {
                    lb1.setText("Pluto");
                    ta1.setText(" Denumire: "+Pluto.nume+" \n"+
                            " Diametru: "+Double.toString(Pluto.diameter)+"  km \n"+
                            " Masa: "+ Double.toString(Pluto.mass)+" kg \n"+
                            " Perioada sinodica: "+ Double.toString(Pluto.synodicPeriod)+" zile \n"+
                            " Raza orbitei: "+ Double.toString(Pluto.orbitRadius)+" km \n"+
                            " Lungimea zilei: "+ Double.toString(Pluto.dayLong) +" zile \n"+
                            " Densitatea: "+ Double.toString(Pluto.density)+" g/cm^3 \n"+
                            " Numarul de satelite: " + Integer.toString(Pluto.satelite));
                }


            }
        });


    }
}

class BgPanel extends JPanel{
    public void paintComponent(Graphics g){
        Image im = null;
        try {
            im = ImageIO.read(new File("D:\\j\\java\\sistemsolar.jpg"));
        } catch (IOException e) {}
        g.drawImage(im, 0, 0, null);
    }
}

