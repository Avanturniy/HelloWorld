public class Boolean {
    public static void main(String[] args) {
        boolean isgoodweather = true;
        boolean isnight = true;
        if (isnight){
            System.out.println("Спать");
        }
        if(!isnight && isgoodweather)
        {
            System.out.println("Гулять");
        }
        if(!isgoodweather  && !isnight)
        {
            System.out.println("Читать книгу");

        }
    }
}
