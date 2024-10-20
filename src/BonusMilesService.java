public class BonusMilesService {
    public int calculate(int price) {
        int milesPer20Rubles = 20;
        return price / milesPer20Rubles;
    }
}