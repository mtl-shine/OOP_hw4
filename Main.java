public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        controller.create("Krasnov","Denis", "Fedorovich");
        controller.create("Zhdanov","Igor", "Gennadievich");
        controller.create("Makarov", "Evgeny", "Alexandrovich");
        controller.create("Presnykova", "Ekaterina", "Semenovna");
        controller.create("Fedorova", "Yulia", "Olegovna");
        controller.printTeacherList();
        controller.change(3, "Ivanov", "Yuriy", "Alekseevich");
        System.out.println();
        controller.printTeacherList();
        System.out.println();
        controller.printSortedTeacherList();
    }
}