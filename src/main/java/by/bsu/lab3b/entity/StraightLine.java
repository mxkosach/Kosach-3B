package by.bsu.lab3b.entity;

public class StraightLine {
    private int a;
    private int b;
    private int c;

    public StraightLine() {
    }

    public StraightLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "StraightLine{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    public String getPointIntersectionWithX() {
        return String.format("OX:(%.2f, 0)", (double) -this.c / (double) this.a);
    }

    public String getPointIntersectionWithY() {
        return String.format("OY:(0, %.2f)", (double) -this.c / (double) this.b);
    }

    public String getPointIntersectionLines(StraightLine line) {
        String result = null;
        if (line != null) {
            double coeffOne = (double) this.a / (double) line.a;
            double coeffTwo = (double) this.b / (double) line.b;
            double coeffThree = (double) this.c / (double) line.c;

            if (coeffOne == coeffTwo && coeffOne == coeffThree) {
                result = "Прямые равны";
            } else if (coeffOne == coeffTwo && coeffOne != coeffThree) {
                result = "Прямые параллельны";
            } else {
                double y = (double) (line.a * this.c - this.a * line.c) / (double) (this.a * line.b - line.a * this.b);
                double x = (this.b * y + this.c) / (double) -this.a;
                result = String.format("Точка пересечения: (%.2f, %.2f)", x, y);
            }
        }
        return result;
    }

    public boolean isParallel(StraightLine line) {
        double coeffOne = (double) this.a / (double) line.a;
        double coeffTwo = (double) this.b / (double) line.b;
        double coeffThree = (double) this.c / (double) line.c;
        return coeffOne == coeffTwo && coeffOne != coeffThree;
    }

    public boolean isEquals(StraightLine line) {
        double coeffOne = (double) this.a / (double) line.a;
        double coeffTwo = (double) this.b / (double) line.b;
        double coeffThree = (double) this.c / (double) line.c;
        return coeffOne == coeffTwo && coeffOne == coeffThree;
    }
}
