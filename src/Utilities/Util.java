package Utilities;

public class Util {


    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int finGCD3(int a, int b, int c) {
        return findGCD(findGCD(a, b), c);
    }

    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static String solveLinearEquations(int a, int b, int c, int d, int e, int f) {
        int determinant = a * e - b * d;
        int determinantX = c * e - b * f;
        int determinantY = a * f - c * d;
        if (determinant == 0) {
            if (determinantX == 0 && determinantY == 0) {
                return "Vô số nghiệm";
            } else {
                return "Vô nghiệm";
            }
        } else {
            double x = (double) determinantX / determinant;
            double y = (double) determinantY / determinant;
            return "x = " + x + ", y = " + y;
        }
    }

    public static double coneSurfaceArea(double radius, double slantHeight) {
        return Math.PI * radius * (radius + slantHeight);
    }

    public static double calculateCumulativeGPA(double[] grades, int[] credits) {
        if (grades.length != credits.length) {
            throw new IllegalArgumentException("Độ dài mảng điểm không khớp với mảng tín chỉ");
        }
        double totalGradePoints = 0;
        int totalCredits = 0;
        for (int i = 0; i < grades.length; i++) {
            totalGradePoints += grades[i] * credits[i];
            totalCredits += credits[i];
        }
        return totalGradePoints / totalCredits;
    }

    public static double calculateIncome(int workingDays, String position) {
        double baseSalary = 1490000;
        double salary = baseSalary * workingDays / 22;
        if (workingDays >= 25) {
            salary *= 1.2;
        }
        if (workingDays >= 30) {
            salary *= 2;
        }
        switch (position) {
            case "Nhân viên":
                return salary;
            case "Trưởng phòng":
                return salary + salary * 0.3;
            case "Giám đốc":
                return salary + salary * 0.5;
            default:
                throw new IllegalArgumentException("Chức vụ không hợp lệ");
        }
    }

    public static void main(String[] args) {

    }
}


