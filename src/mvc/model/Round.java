package mvc.model;

public class Round {
    public static double toRound(double toRound){
        double roundOff = Math.round(toRound * 100.0) / 100.0;
        if (roundOff % 1 == 0){
            roundOff=Math.round(roundOff);
        }
        return roundOff;
    }
}
