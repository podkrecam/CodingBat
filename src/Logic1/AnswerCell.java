package Logic1;

public class AnswerCell {
    private boolean isMorning;
    private boolean isMom;
    private boolean isAsleep;

    public AnswerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        this.isMorning = isMorning;
        this.isMom = isMom;
        this.isAsleep = isAsleep;
        System.out.println("AnswerCell: " + check());
    }

    private boolean check() {
        if (isAsleep) {
            return false;
        } else if (isMorning && isMom) {
            return true;
        } else if (isMorning) {
            return false;
        } else {
            return true;
        }
    }
}
