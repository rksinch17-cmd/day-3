class Method7 {
    
    public static double add(double a, double b) {
        double result = a + b; 
        System.out.println(result); 
        return result; 
    }

    public static int add(int a, int b) {
        int result = a + b; 
        System.out.println(result); 
        return result;
    }

    public static void main(String[] args) {
        add(40.3, 20.7);
        add(40, 20);
    }
}