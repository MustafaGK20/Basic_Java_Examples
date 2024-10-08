package org.example;

public class MultiDimensionalArray {
    public static void main(String[] args){
        String[][] component= new String[3][3];

        component[0][0] = "A84";
        component[0][1] = "MultiLevel Inverter";
        component[0][2] = "Grid Interface Board";
        component[1][0] = "Power Supply Board";
        component[1][1] = "LR Card";
        component[1][2] = "Power Supply";
        component[2][0] = "Ribonlar";
        component[2][1] = "Fan";
        component[2][2] = "Cooler";

        for(int i=0; i<=2; i++){
            for(int j=0; j<=2; j++){
                System.out.println(component[i][j]);
            }
        }
    }
}
