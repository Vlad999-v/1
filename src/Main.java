
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

    Actor Robert_John_Downey = new Actor.Builder().withname("Robert_John")
                                                  .withsurname("Downey")
                                                  .withrowth(1.75)
                                                  .withbirthdate(LocalDate.of(1965, 4, 4))
                                                  .withbirthplace("USA,Mangetten")
                                                  .build();

    System.out.println(Robert_John_Downey);

    Actor Chris_Hemswort = new Actor.Builder().withname("Chris")
                .withsurname("Hemswort")
                .withrowth(1.85)
                .withbirthdate(LocalDate.of(1983,8, 11))
                .withbirthplace("Australia, Melburn")
                .build();
        System.out.println(Chris_Hemswort);
        System.out.println(Robert_John_Downey.equals(Chris_Hemswort));
        System.out.println(Robert_John_Downey.equals(Robert_John_Downey));

        List <Actor> actorsAvengers = new ArrayList<Actor>();
        actorsAvengers.add(Chris_Hemswort);
        actorsAvengers.add(Robert_John_Downey);
        List<Film.Genre> genresAvengers = new ArrayList<Film.Genre>();
        genresAvengers.add(Film.Genre.FEATUREFILM);
        genresAvengers.add(Film.Genre.FANTASY);

        Film Avengers = new Film.Builder().withname("Avengers")
                .withactors(actorsAvengers)
                .withbudget(220000000)
                .withdirector("Dzosh Uidon")
                .withcountry("USA")
                .withduration(210)
                .withgenres(genresAvengers)
                .withyear(2012)
                .build();
        System.out.println(Avengers);

        System.out.println(Avengers.equals(Avengers));
        System.out.println(Avengers.equals(Chris_Hemswort));

    }

}
