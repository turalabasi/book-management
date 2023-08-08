package util;

public class MenuUtil {

    public static int EntryMenu() {
        System.out.println("[1].Display books \n" +
                "[2].Search book \n" +
                "[3].Add Books\n" +
                "[4].Update Book\n" +
                "[5].Remove Book\n" +
                "[0]. Exit program\n");

        return InputUtil.inputRequiredInt(" choose option: ");



    }
}
