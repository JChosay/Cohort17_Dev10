public class Exercise02 {

    public static void main(String[] args) {

        String[] tenFavoriteFoods = new String[10]; // space for 10 favorite foods

        tenFavoriteFoods[5] = "squid ink";
        System.out.println(tenFavoriteFoods[5]);
        System.out.println(tenFavoriteFoods[6]);

        // 1. Set your 10 favorite foods. (It's okay to replace squid ink.)
        // 2. Print your top, 6th, and last favorite from tenFavoriteFoods.
        tenFavoriteFoods = new String[] {"pizza", "fried chicken", "burritos", "tacos", "salads",
                "sandwiches", "chili", "ramen", "nachos", "stir fries"};
        for (int i = 0; i < 6; i++)
            System.out.println(tenFavoriteFoods[i]);
        System.out.println(tenFavoriteFoods[9]);
    }
}
