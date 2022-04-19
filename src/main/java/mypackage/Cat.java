package mypackage;

public class Cat extends  Animal{
    public Integer age;
    public String color;
    int x=0;

    public void sleep() {
        System.out.println("From Cat I am sleeping in bed");
    }




    public void eat() {
        System.out.println("From Cat I am eating..");


        }

     public void setAge(Integer x) {
        this.age= x;

     }
     public Integer getAge(){
        return this.age;

     }

     public void setColor(String y){
    this.color= y;

    }
    public String getColor(){
        return this.color;

    }
}


