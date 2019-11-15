package airporttransport;

public class Choose {

    public void getTranport(Strategy move, int budget, int time) {
        move.transport(time, budget);
    }

}