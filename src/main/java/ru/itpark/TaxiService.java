package ru.itpark;

public class TaxiService {


    int orderSum(int distance) {
        int landingSum = 60;
        int priceForOneKilometre = 20;
        int salePercent = 5;
        int maxSale=100;
        int resulSum = (priceForOneKilometre * distance) + landingSum;
        int resultSale=resulSum*salePercent/100;
        if (resultSale>maxSale){
                return maxSale;
            }
        return resultSale;

    }
}




