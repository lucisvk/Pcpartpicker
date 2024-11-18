public class SampleDataLoader {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        dbManager.createPartTable();

        dbManager.insertPart("Intel i9-12900K", "CPU", 589.99);
        dbManager.insertPart("NVIDIA RTX 3080", "GPU", 699.99);
        dbManager.insertPart("Corsair Vengeance LPX 16GB", "RAM", 74.99);
    }
}
