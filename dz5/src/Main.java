import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 1. Надає значення 4 полям типу int.
        int a = 2;
        int b = 13;
        int c = 4;
        int d = 5;

        // 2. Сумує їх попарно.
        int sum1 = a + b;
        int sum2 = c + d;

        // 3. Виводить результат порівняння сум (true, якщо перша сума більша).
        System.out.println(sum1 > sum2);

        // 4. Збільшує першу суму на 1.
        sum1++;
        System.out.println(sum1);

        // 5. Другу суму зменшує на 2.
        sum2--;
        sum2--;
        System.out.println(sum2);

        // 6. Виводить результат порівняння (true якщо перша сума більша).
        System.out.println(sum1 > sum2);

        // 7. Виводить true якщо хоча б одна сума кратна 2, інакше - false (я ще додав пробіл для вигляду).
        System.out.println("Is at least one sum even?\s" + ((sum1 % 2 == 0) || (sum2 % 2 == 0)));

    }

}



