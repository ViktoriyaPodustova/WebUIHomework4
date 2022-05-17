package HomeWork4;

public class TriangleArea {
    public static double HeronsFormula(int a, int b, int c) {
        double S=0.0;
        double p;
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Недопустимые значения сторон треугольника"+ "\n" + "Площадь не может быть отрицательной или равняться нулю ");


        } else if(a>=(c+b) || b>=(a+c) || c>=(b+a)){
            System.out.println("Треугольник с такими сторонами не существует"+ "\n" + "Площадь не может быть отрицательной или равняться нулю ");
        }
        else {
            p = (a + b + c) / 2.0;
            S = Math.sqrt((p * ((p - a) * (p - b) * (p - c))));
        }
        return S;
    }
}

