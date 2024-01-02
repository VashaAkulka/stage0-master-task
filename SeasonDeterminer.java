
public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer ");
                break;
            case 4:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Wrong month number");
        }
    }
}
