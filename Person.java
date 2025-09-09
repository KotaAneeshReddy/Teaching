class Person {
    protected String name;
    public void speak(){
        System.out.println("I am "+name);
    }

    public void speak(String message){
        System.out.println(message);
    }

}
class Employee extends Person{
    private String empId;

    public Employee(String name, String empId){
        this.name = name;
        this.empId = empId;
    }
    public void work(){
        System.out.println(name+" is working...");
    }

    @Override
    public void speak(String song) {
        super.speak("Singing a "+song);
    }
}


