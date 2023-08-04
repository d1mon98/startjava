public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public boolean move() {
        System.out.println("Вы прошли 5 шагов");
        return true;
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useWeapon() {
        System.out.println("Fire");
    }

    public String toString() {
        return "Jaeger{" +
                "modelName='" + modelName + '\'' +
                ", mark='" + mark + '\'' +
                ", origin='" + origin + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public Jaeger() {
    }


}
