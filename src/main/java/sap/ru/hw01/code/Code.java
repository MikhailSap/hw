package sap.ru.hw01.code;

public class Code {
    interface Moveable {
        void move();
    }

    interface Stopable {
        void stop();
    }

    abstract class Car implements Moveable { // add implements Moveable
        private Engine engine; //change to private
        private String color;
        private String name;


        protected void start() {
            System.out.println("Car starting");
        }

        abstract void open();

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class LightWeightCar extends Car { // remove implements Moveable

        @Override
        void open() {
            System.out.println("Car is open");
        }

        @Override
        public void move() {
            System.out.println("Car is moving");
        }

    }

    class Lorry extends Car implements Stopable{ // add implements, remove Moveable

        @Override
        void open() {
            System.out.println("Car is open"); // add this implementation
        }

        public void move(){
            System.out.println("Car is moving");
        }

        public void stop(){
            System.out.println("Car is stop");
        }
    }

}
