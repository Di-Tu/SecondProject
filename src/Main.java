//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println();
        System.out.println("             Задача №1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Dog   " + dog);
        System.out.println("Cat   " + cat);
        System.out.println("Paper " + paper);
        System.out.println();

        System.out.println("             Задача №2");
        var additive = 4;
        dog = dog + additive;
        cat = cat + additive;
        paper = paper + additive;
        System.out.println("Dog   " + dog);
        System.out.println("Cat   " + cat);
        System.out.println("Paper " + paper);
        System.out.println();

        System.out.println("             Задача №3");
        var decreaseDog = 3.5;
        var decreaseCat = 1.6;
        var decreasePaper = 7639;
        dog = dog - decreaseDog;
        cat = cat - decreaseCat;
        paper = paper - decreasePaper;
        System.out.println("Dog   " + dog);
        System.out.println("Cat   " + cat);
        System.out.println("Paper " + paper);
        System.out.println();

        System.out.println("             Задача №4");
        var friend = 19;
        System.out.println("Друзей        " + friend);
        friend = friend+2;
        System.out.println("Теперь друзей " + friend);
        friend = friend/7;
        System.out.println("А всего       " + friend);
        System.out.println();

        System.out.println("             Задача №5");
        var frog = 3.5;
        System.out.println("        Считаем вес лягушки в граммах");
        System.out.println("Изначально весит  " + frog + " грамм");
        frog = frog * 10;
        System.out.println("Резко потолстела  " + frog + " грамм");
        frog = frog / 3.5;
        System.out.println("Села на диету     " + frog + " грамм");
        frog = frog + 4;
        System.out.println("Откат после диеты " + frog + " грамм");
        System.out.println();

        System.out.println("             Задача №6");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общая масса боксёров  " + totalWeight + " кг");
        var massDifference = boxerTwo - boxerOne;
        System.out.println("Разница масс боксеров   " + massDifference + " кг");
        System.out.println();

        System.out.println("             Задача №7");
        var remainderByDivision = boxerTwo % boxerOne;
        System.out.println("Вот что останется после деления " + remainderByDivision);
        System.out.println();

        System.out.println("             Задача №8");
        var hour = 640;
        var employeeWorkingHours = 8;
        var totalEmployees = hour / employeeWorkingHours;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");
        var moreEmployees = totalEmployees + 94;
        var howManyHoursOfWork = moreEmployees * employeeWorkingHours;
        System.out.println("Если в компании работает " + moreEmployees + " человека, то всего " + howManyHoursOfWork + " часов работы может быть поделено между сотрудниками.");
    }
}