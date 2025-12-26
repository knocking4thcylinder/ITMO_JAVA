package lab34;

import lab34.entities.*;
import lab34.enums.*;
import lab34.records.InjuryDetails;
import lab34.records.Location;

import java.util.ArrayList;

public class StoryScenario {

    private Location streetLocation;
    private Location policeStationLocation;
    private Street street;
    private Citizen supchik;
    private Citizen krendelek;
    private Policeman sapozhkin;
    private PoliceStation policeStation;
    private Conflict conflict;
    private Crowd crowd;

    public static void main(String[] args) {
        StoryScenario scenario = new StoryScenario();
        scenario.play();
    }

    public void play() {
        setupInitialScene();
        startConflict();
        policeIntervention();
        arrestAndDetention();
        conscienceAndRelease();
    }

    private void setupInitialScene() {
        // Создание локаций
        streetLocation = new Location("Улица", 1);
        policeStationLocation = new Location("Отделение милиции", 2);

        // Создание улицы
        street = new Street("Главная");
        street.setLocation(streetLocation);

        // Создание коротышек
        supchik = new Citizen("Супчик", streetLocation, ClothingStyle.MODERN, true);
        krendelek = new Citizen("Кренделек", streetLocation, ClothingStyle.MODERN, false);

        // Создание одежды
        Pants supchikPants = new Pants("желто-зеленые", ClothingStyle.MODERN, true);
        Jacket supchikJacket = new Jacket("желто-зеленый", ClothingStyle.MODERN, true);
        supchik.wearClothing(supchikPants);
        supchik.wearClothing(supchikJacket);

        Pants krendelekPants = new Pants("желто-зеленые", ClothingStyle.MODERN, true);
        Jacket krendelekJacket = new Jacket("желто-зеленый", ClothingStyle.MODERN, true);
        krendelek.wearClothing(krendelekPants);
        krendelek.wearClothing(krendelekJacket);

        // Начало истории
        System.out.println("Однажды произошел такой случай.");
        street.addPedestrian(supchik);
        street.addPedestrian(krendelek);
        System.out.println("По улице навстречу друг другу шли двое коротышек -- " + supchik.getName() + " и " + krendelek.getName());
    }

    private void startConflict() {
        // Конфликт
        supchik.stepOn(krendelek);
        conflict = new Conflict(supchik, krendelek);
        supchik.insult(krendelek);
        krendelek.insult(supchik);
    }

    private void policeIntervention() {
        // Толпа и милиционер
        crowd = new Crowd(streetLocation);
        crowd.formInstantly();
        street.stopTraffic();
        sapozhkin = new Policeman("Сапожкин", streetLocation, ClothingStyle.CLASSIC, "123");
        Spectator spectator1 = new Spectator("Зритель1", streetLocation, ClothingStyle.CASUAL);
        crowd.addSpectator(spectator1);
        spectator1.watchConflict(conflict);
        spectator1.refuseToDisperse();

        sapozhkin.askToDisperse(crowd);
    }

    private void arrestAndDetention() {
        // Эскалация конфликта
        supchik.hit(krendelek, "затылок");
        supchik.giveBruise(krendelek, "глаз");
        krendelek.addInjury(new InjuryDetails(InjuryType.HIT_ON_BACK_OF_HEAD, 1, "удар по затылку"));
        krendelek.addInjury(new InjuryDetails(InjuryType.BRUISE_UNDER_EYE, 3, "синяк под глазом"));

        // Арест
        sapozhkin.grab(supchik);
        sapozhkin.drag(supchik, policeStationLocation);

        supchik.tryToEscape();
        supchik.bite(sapozhkin);
        sapozhkin.addInjury(new InjuryDetails(InjuryType.BITE_ON_HAND, 3, "укус руки"));

        // В отделении милиции
        policeStation = new PoliceStation("Отделение милиции");
        policeStation.setLocation(policeStationLocation);
        policeStation.addOfficer(sapozhkin);

        AncientLawBook lawBook = new AncientLawBook("Старинные законы");
        policeStation.getCabinet().addItem(lawBook);
        lawBook.retrieveFromCabinet(policeStation.getCabinet());

        ArrayList<InjuryDetails> allInjuries = new ArrayList<>();
        allInjuries.addAll(krendelek.getInjuries());
        allInjuries.addAll(sapozhkin.getInjuries());

        int totalArrestDays = lawBook.calculateArrestDays(allInjuries);

        policeStation.processArrest(sapozhkin.arrest(supchik, totalArrestDays));
    }

    private void conscienceAndRelease() {
        // Ужин и сон
        Cafeteria cafeteria = policeStation.getCafeteria();
        cafeteria.addMeal(new Meal("ужин", true));
        Meal dinner = cafeteria.serveMeal("ужин");
        if (dinner != null) {
            dinner.serve(supchik);
        }
        sapozhkin.goHome();
        sapozhkin.sleep();

        // Совесть
        Conscience conscience = sapozhkin.getConscience();
        conscience.activate();
        conscience.addAccusation("Ты не имеешь права спать, когда другой сидит взаперти.");
        conscience.torment(sapozhkin);

        // Освобождение
        sapozhkin.move(policeStationLocation);
        sapozhkin.release(supchik);

        // Снова совесть
        sapozhkin.goHome();
        conscience.addAccusation("Ты поступил не по закону, отпустив ветрогона.");
        conscience.argue("Ему полагалось сидеть взаперти семь суток.");
        conscience.torment(sapozhkin);
    }
}
