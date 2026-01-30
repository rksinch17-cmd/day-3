 class person {
    private String name;
    private int age;

    
    public String GetName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    
    public int GetAge() {
        return age;
    }

    public void SetAge(int age) {
        this.age = age;
    }
} 

class Method12 {
    public static void main(String[] args) {
        person p1 = new person();
        p1.SetName("Sinchana");
        p1.SetAge(21);

        System.out.println(p1.GetName());
        System.out.println(p1.GetAge()); 
    }
}