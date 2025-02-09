import java.util.Random;

public class HM_2 {
    public static void main(String[] args) {
        System.out.println(permission(20, 15)); //можно
        System.out.println(permission(25, 28)); //можно
        System.out.println(permission(28, 27)); //можно
        System.out.println(permission(55, -20)); //нельзя
        System.out.println(permission(23, -25)); //нельзя

        System.out.println(permission(generateRandomAge(), 20)); // Тут проблема выходит постоянно результат "Можно идти гулять" но свою очередь генерация работает отлитчно
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

