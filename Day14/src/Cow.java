public class Cow {
    public double weight;

    public Cow() {
    }

    public Cow(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public class Cowleg{
        private double length;
        private String color;

        public Cowleg() {
        }

        public Cowleg(double length, String color) {
            this.length = length;
            this.color = color;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public void info(){
            System.out.println("当前牛腿的颜色是："+color+",高："+length);
            System.out.println("本牛腿所在奶牛重"+weight);
        }
    }
}
