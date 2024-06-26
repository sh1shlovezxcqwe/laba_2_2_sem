import java.io.*;

public class zd8 {
    public static String popadanie(double x, double y){
        if ((x>=-8 & x<=-5 & y<2*x+10 & y> (-1/3f)*x-(26/3f) & y<-5*x-12)
                || (x>=-6 & x<=-5 & y>-5*x-12 & y<-1.4*x-7 & y<2*x+10)
                || (x>=-5 & x<=-3 & y>-1.4*x-7 & y>7*x+28 & y<3.5*x+17.5)
                || (x>=-6 & x<=-5 & y>2*x+10 & y<-6*x-30 & y >= -2 & y <= 6)){
            return "Точка попала в область первой фигуры\n";
        }else if ((x>=-1 & x<=4 & y<0.4*x+4.4 & y>-2*x+2 & y>4*x-10)
                || (x>=-2 & x<=2 & y<10*x+14 & y<-2*x+2 & y>=x-4)
                || (x>=-2 & x<=3 & y<x-4 & y>0.2*x-5.6 & y<-3*x+4)
                || (x>=2 & x<=6 & y>-3*x+4 & y<-0.25*x-1.5 & y>(2/3f)*x-7)
                || (x>=-2 & x<=3 & y<0.2*x-5.6 & y>(-1/3f)*x-(20/3f) & y>x-8)){
            return "Точка попала в область второй фигуры\n";
        }else if ((x >= -8 & x <= -5 & y == (-1 / 3f) * x - (26 / 3f)) || (x >= -8 & x <= -5 & y == 2 * x + 10)
                || (x >= -5 & x <= -3 & y == 7 * x + 28) || (x >= -5 & x <= -3 & y == 3.5 * x + 17.5)
                || (x == -6 & y >= -2 & y <= 6) || (x >= -6 & x <= -5 & y == -6 * x - 30)){
            return "Точка попала на границу первой фигуры";
        }else if ((x>=-1 & x<=4 & y==0.4*x+4.4) || (x>=-1 & x<=4 & y==4*x-10)
                || (x>=-2 & x<=2 & y==10*x+14)
                || (x>=2 & x<=6 & y==-0.25*x-1.5) || (x>=2 & x<=6 & y==(2/3f)*x-7)
                || (x>=-2 & x<=3 & y==(-1/3f)*x-(20/3f)) || (x>=-2 & x<=3 & y==x-8)){
            return "Точка попала на границу второй фигуры";
        }else {
            return "Точка не попала ни в область, ни на границу";
        }
    }
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\Asus\\text8.txt");
        FileWriter fwr = new FileWriter(file1, true);
        fwr.write("Постановка задачи\n\nПервая фигура\n\nПервый треугольник\nx принадлежит [-8;-5]\ny<=2x+10\ny>=(-1/3)x-(26/3)\ny<=-5x-12\n\n"
                +"Второй треугольник\nx принадлежит [-6;-5]\ny>=-5x-12\ny<=-1.4x-7\ny>=2x+10\n\n"
                +"Третий треугольник\nx принадлежит [-5;-3]\ny>=-1.4x-7\ny>=7x+28\ny<=3.5x+15.5\n\n"
                +"Четвертый треугольник\nx принадлежит [-6;-5]\ny>=2x+10\ny<=-6x-30\n\nВторая фигура\n\n"
                +"Первый треугольник\nx принадлежит [-1;-4]\ny<=0.4x+4.4\ny>=-2x+2\ny>=4x-10\n\n"
                +"Второй треугольник\nx принадлежит [-2;2]\ny<=10x+14\ny<=-2x+2\ny>=x-4\n\n"
                +"Третий треугольник\nx принадлежит [-2;3]\ny<=x-4\ny>=0.2x-5.6\ny<=-3x+4\n\n"
                +"Четвертый треугольник\nx принадлежит [2;6]\ny>=-3x+4\ny<=-0.25x-1.5\ny>=(2/3)x-7\n\n"
                +"Пятый треугольник\nx принадлежит [-2;3]\ny<=0.2x-5.6\ny>=(-1/3)x-(20/3)\ny>=x-8\n\n"
                +"Точки для проверки\n\n№1 (0;-2); №2 (-6;-6); №3 (-2;-2); №4 (4;6); №5 (-6;-2)\n\nВЫВОД ДАННЫХ\n\n");
        fwr.write("Для точки №1\n");
        fwr.write(popadanie(0, -2)+"\n");
        fwr.write("Для точки №2\n");
        fwr.write(popadanie(-6, -6)+"\n");
        fwr.write("Для точки №3\n");
        fwr.write(popadanie(-2, -2) + "\n\n");
        fwr.write("Для точки №4\n");
        fwr.write(popadanie(4, 6) + "\n\n");
        fwr.write("Для точки №5\n");
        fwr.write(popadanie(-6, -2));
        fwr.flush();
        fwr.close();
    }
}
