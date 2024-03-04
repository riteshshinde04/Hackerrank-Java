//Write your code here
// Sort the array using BigDecimal
Arrays.sort(s, 0, n, new Comparator<String>() {
    @Override
    public int compare(String s1, String s2) {
        BigDecimal bd1 = new BigDecimal(s1);
        BigDecimal bd2 = new BigDecimal(s2);
        return bd2.compareTo(bd1); // Sort in descending order
    }
});
