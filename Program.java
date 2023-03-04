public class Program {
    private static void ShowProducts(Product[] all){
        for (Product product : all) {
            System.out.println(product);
            System.out.println("*****");
        }
    }
    public static void main(String[] args) {
        Product milk = new Milk("Домик", 60, 6, "Литр", "2 месяца", 2);
        Product lemonade = new Drinks("Baikal", 56, 12, "Литр", 2);
        Product bread = new Bread("Нарезной", 45, 1, "шт", "2 дня", "1 сорт");
        Product eggs = new Eggs("Деревенское", 82, 10, "шт", "2 нед", 10);
        Product masks = new Masks("Рецепт от Бабки", 455, 12, "шт", 12);
        Product paper = new ToiletPaper("Auchan", 275, 12, "шт", 12, 2);
        Product diapers = new Diapers("Pampers", 1112, 56, "шт.", 2, "да", 12, 5, 7, "Нежный");
        Product nipple = new Nipple("Соска", 134, 1, "шт.", 1, "да");
    
        Product[] all = new Product[] {milk, lemonade, bread, eggs, masks, paper, diapers, nipple};

        ShowProducts(all);
    }

}
