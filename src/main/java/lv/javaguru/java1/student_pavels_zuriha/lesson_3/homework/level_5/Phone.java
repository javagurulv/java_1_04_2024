package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_5;

class Phone {

    private String newModel;

    Phone (String newModel) {
        this.newModel = newModel;
    }

    String getModel() {
        return this.newModel;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}
