package Logic1;

public class DateFashion {
    private int you;
    private int date;

    public DateFashion(int you, int date) {
        this.you = you;
        this.date = date;
        answer();
    }

    private int check() {
        if (you < 3 || date < 3) {
            return 0;
        } else if (you < 8 && date < 8) {
            return 1;
        } else {
            return 2;
        }
    }

    private void answer() {
        switch (check()) {
            case 0 -> System.out.println("Nie mamy  miejsca dla Was.");
            case 1 -> System.out.println("Proszę poczekać, może znajdziemy jakieś miejsce.");
            case 2 -> System.out.println("Zapraszamy!");
        }
    }

}
