package lv.javaguru.java1.student_svetlana_bodnarska.lesson_3.homework.level_5_middle.Task_2;

class Phone {

    private String model;

    public Phone (String model) {
        this.model = model;
    }

    public String getModel() {
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

