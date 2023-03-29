/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kvadraticka_rce_solver;

/**
 *
 * @author tobias
 */
public class QuadSolution {
    private final double[] reseni;
    private final double diskriminant;
    
    public QuadSolution(double x, double y, double z){
        diskriminant = y * y - 4 * x * z;
        if (diskriminant < 0) {
            reseni = null;
        } else if (diskriminant == 0) {
            double solution = 100*(-y) / (2 * x);
            reseni = new double[] {solution/100};
        } else {
            double solution1 = Math.round(100 * (-y + Math.sqrt(diskriminant)) / (2 * x));
            double solution2 = Math.round(100 * (-y - Math.sqrt(diskriminant)) / (2 * x));
            
            reseni = new double[] {solution1/100, solution2/100};
        }
    }
    
    public double[] get(){
        return reseni;
    }
    
    public double getDiskriminant(){
        return diskriminant;
    }
}
