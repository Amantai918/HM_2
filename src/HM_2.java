import java.util.Random;

public class HM_2 {
    public static void main(String[] args) {
        System.out.println(permission(25, 15));
        //если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов можно гулять
        System.out.println(permission(12, 25));
        //если же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов можно гулять
        System.out.println(permission(65, 15));
        // если человеку больше 45 лет, то результат “Можно идти гулять” формируется только тогда когда на улице температура в диапазоне от -10 до 25 градусов
        System.out.println(permission(46, 26));
        //нельзя
        System.out.println(permission(23, -25));
        //нельзя

        System.out.println(permission(generateRandomAge(), 20));
        // Всегда выдаёт "можно идти гулять" нашел решение в добавлении рандомной темпереатуры во втором примере
    }

    public static String permission(int humanAge, int outsideTemperature) {
        {
            if ((humanAge >= 20 && humanAge <= 45 && outsideTemperature >= -20 && outsideTemperature <= 30)
                    || (humanAge <= 20 && outsideTemperature > 0 && outsideTemperature <= 28)
                    || (humanAge >= 40 && outsideTemperature >= -10 && outsideTemperature <= 25)) {
                return "можно идти гулять (возраст: " + humanAge + " температура : " + outsideTemperature + ")";
            } else {
                return "оставайтесь дома (возраст: " + humanAge + " температура : " + outsideTemperature + ")";
            }
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }
}

