public class linearSearch {
    public static int linSearch (String list[], String key) {
        for (int i = 0; i < list.length; i++)
            if (key.equals(list[i]))
                return i;
        return -1;
    }
    public static void main(String[] args) {
        String[] array = {"java", "python", "ruby"};
        String key = "c";
        int index = linSearch(array, key);
        
        System.out.print(index);
    }
}