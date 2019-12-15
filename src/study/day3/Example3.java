package study.day3;

import org.junit.Test;

public class Example3 {
    @Test
    public void CaiSeQiu(){
        House house = new House();
        house.age = 5;
        house.shape = "四合院";
        house.huiJia();
        Person person = new Person();
        person.age = 25;
        person.name = "小明";
        person.setHouse(house);
        System.out.println(person);
        String n = "小华";
        Person person2 = new Person(n, 18);
        System.out.println(person2);
    }
    class  House{
        int age;
        String shape;

        @Override
        public String toString() {
            return "House{" +
                    "age=" + age +
                    ", shape='" + shape + '\'' +
                    '}';
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        public void huiJia(){
            System.out.println("欢迎来到" + shape);
        }
    }

    class Person{
        private String name;
        private int age;
        private House house;

        Person(){};
        Person(String name, int age){
            this.name  = name;
            this.age = age;
        };
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHouse(House house) {
            this.house = house;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public House getHouse() {
            return house;
        }

        @Override
        public String toString() {
            return "person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", house=" + house +
                    '}';
        }
    }
}
