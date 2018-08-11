package machine;

/**
 * Coins supported by Vending Machine.
 * @author Amit Kabra
 */
public enum Coin {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

    private int denomination;

     Coin(int denomination){

        this.denomination = denomination;
    }

    public int getDenomination(){

        return denomination;
    }
}
