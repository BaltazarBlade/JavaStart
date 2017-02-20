public class Third {
    public static void main(String[] args) {
        int pervoe = 150;
        int vtoroe = 151;

        if (pervoe == vtoroe){
            pervoe = 0;
            vtoroe = 0;
            System.out.println(pervoe + " " + vtoroe);
        }
        else {
            pervoe = pervoe + vtoroe;
            vtoroe = pervoe + vtoroe;
            System.out.println(pervoe + " " + vtoroe);
        }
    }
}
