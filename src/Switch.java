public class Switch {
    public static void main(String[] args) {
        int dayofWeak = 2;
        switch (dayofWeak) {
            case 1:
                System.out.println("luni");
                break;
            case 2:
                System.out.println("marti");
            case 3:
                System.out.println("miercuri");
                break;
            case 4:
            case 5:
            default:
                System.out.println(" nu stiu");
        }

    }

}
