public class TaxiService {
    int landingSum = 60;
    int priceForOneKilometre = 20;
    int salePercent = 5;

    int orderSum(int distance) {
        int resulSum = (priceForOneKilometre * distance) + landingSum;
        if (resulSum > 1000) {
            int sale = (resulSum / 100) * salePercent;
            if (sale > 100) {
                System.out.println("Ваша скидка максимальна - 100 р");
            } else {
                System.out.println("Ваша скидка - " + sale);
            }
        } else {
            System.out.println("У вас нет скидки");
        }
        return 0;
    }
}




