import java.util.*;

public class Main {
    public static void printTravelPrices(int[][] travelPrices, int numberOfCities){
        for(int i = 0; i<numberOfCities; i++){
            for(int j=0; j<numberOfCities; j++){
                System.out.print(travelPrices[i][j]);
                if(travelPrices[i][j]/10 == 0)
                    System.out.print("  ");
                else
                    System.out.print(' ');
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int numberOfCities = 10;
        int[][] travelPrices = new int[numberOfCities][numberOfCities];
        for(int i = 0; i<numberOfCities; i++){
            for(int j=0; j<=i; j++){
                if(i==j)
                    travelPrices[i][j] = 0;
            }
        }
        travelPrices[0][1]=travelPrices[1][0]=541;
        travelPrices[0][2]=travelPrices[2][0]=492;
        travelPrices[0][3]=travelPrices[3][0]=547;
        travelPrices[0][4]=travelPrices[4][0]=308;
        travelPrices[0][5]=travelPrices[5][0]=411;
        travelPrices[0][6]=travelPrices[6][0]=363;
        travelPrices[0][7]=travelPrices[7][0]=222;
        travelPrices[0][8]=travelPrices[8][0]=410;
        travelPrices[0][9]=travelPrices[9][0]=106;
        travelPrices[1][2]=travelPrices[2][1]=779;
        travelPrices[1][3]=travelPrices[3][1]=885;
        travelPrices[1][4]=travelPrices[4][1]=908;
        travelPrices[1][5]=travelPrices[5][1]=161;
        travelPrices[1][6]=travelPrices[6][1]=327;
        travelPrices[1][7]=travelPrices[7][1]=706;
        travelPrices[1][8]=travelPrices[8][1]=855;
        travelPrices[1][9]=travelPrices[9][1]=481;
        travelPrices[2][3]=travelPrices[3][2]=147;
        travelPrices[2][4]=travelPrices[4][2]=477;
        travelPrices[2][5]=travelPrices[5][2]=727;
        travelPrices[2][6]=travelPrices[6][2]=472;
        travelPrices[2][7]=travelPrices[7][2]=547;
        travelPrices[2][8]=travelPrices[8][2]=87;
        travelPrices[2][9]=travelPrices[9][2]=545;
        travelPrices[3][4]=travelPrices[4][3]=612;
        travelPrices[3][5]=travelPrices[5][3]=832;
        travelPrices[3][6]=travelPrices[6][3]=487;
        travelPrices[3][7]=travelPrices[7][3]=682;
        travelPrices[3][8]=travelPrices[8][3]=223;
        travelPrices[3][9]=travelPrices[9][3]=654;
        travelPrices[4][5]=travelPrices[5][4]=747;
        travelPrices[4][6]=travelPrices[6][4]=670;
        travelPrices[4][7]=travelPrices[7][4]=200;
        travelPrices[4][8]=travelPrices[8][4]=395;
        travelPrices[4][9]=travelPrices[9][4]=400;
        travelPrices[5][6]=travelPrices[6][5]=294;
        travelPrices[5][7]=travelPrices[7][5]=546;
        travelPrices[5][8]=travelPrices[8][5]=798;
        travelPrices[5][9]=travelPrices[9][5]=322;
        travelPrices[6][7]=travelPrices[7][6]=544;
        travelPrices[6][8]=travelPrices[8][6]=546;
        travelPrices[6][9]=travelPrices[9][6]=337;
        travelPrices[7][8]=travelPrices[8][7]=465;
        travelPrices[7][9]=travelPrices[9][7]=208;
        travelPrices[8][9]=travelPrices[9][8]=515;




        printTravelPrices(travelPrices,numberOfCities);
        System.out.println("0-Гамбург");
        System.out.println("1-Висбаден");
        System.out.println("2-Дрезден");
        System.out.println("3-Любек");
        System.out.println("4-Падерборн");
        System.out.println("5-Гельзенкирхен");
        System.out.println("6-Оффенбах");
        System.out.println("7-Хамм");
        System.out.println("8-Ройтлинген");
        System.out.println("9-Пфорцгейм");
        ÜberSalesmensch geneticAlgorithm = new ÜberSalesmensch(numberOfCities, SelectionType.ROULETTE, travelPrices, 0, 0);
        SalesmanGenome result = geneticAlgorithm.optimize();
        System.out.println(result);
        ÜberSalesmensch geneticAlgorithm2 = new ÜberSalesmensch(numberOfCities, SelectionType.TOURNAMENT, travelPrices, 0, 0);
        result = geneticAlgorithm2.optimize();
        System.out.println(result);
    }
}

