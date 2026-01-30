class Student{
    int id;
    String name;
    Student(int i, String name){
        id = i;
        this.name=name;
    }
void display(){
    System.out.println(id+" "+ name);
}
}
class Method10{
  public static void main(String[]args){
    Student s1 = new Student(1,"Sinchana");
    Student s2 = new Student(2,"Parinitha");
    s1.display();
    s2.display();
  }
}