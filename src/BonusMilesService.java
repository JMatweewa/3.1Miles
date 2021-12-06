public class BonusMilesService {
    public int calculate(int ticketPrice, int milePrice) {
        int bonusMiles = ticketPrice / milePrice;
        return bonusMiles;
    }
}
