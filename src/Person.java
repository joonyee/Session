public class Person {
    private float height;
    private float weight;

    float getBMI() {
        float BMI = 0;
        BMI = (float) (this.weight / (this.height * this.height * 0.01 * 0.01));
        return BMI;
    }
    void say() {
        System.out.println("응애");
    }
    void setHeight(float new_height){
        height = new_height;
    }
    float getHeight(){
        return height;
    }
    void setWeight(float new_weight){
        weight = new_weight;
    }
    float getWeight(){
        return weight;
    }
}

