package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_5_middle;

class Phone {

    private String model;

    public Phone(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}