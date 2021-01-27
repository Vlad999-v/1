import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Testlab1 {

    @Test(dataProvider = "compare-actor")
    public void actorTest(Actor one, Actor two) {
        assertEquals(one,two);
    }


@DataProvider(name="compare-actor")
public Object[][] ActorProvider() {

    Actor one = new Actor.Builder().withname("Robert_John")
            .withsurname("Downey")
            .withrowth(1.75)
            .withbirthdate(LocalDate.of(1965, 4, 4))
            .withbirthplace("USA,Mangetten")
            .build();

    Actor two = new Actor.Builder().withname("Chris")
            .withsurname("Hemswort")
            .withrowth(1.85)
            .withbirthdate(LocalDate.of(1983,8, 11))
            .withbirthplace("Australia, Melburn")
            .build();

    Actor three = new Actor.Builder().withname("Chris")
            .withsurname("Hemswort")
            .withrowth(1.80)
            .withbirthdate(LocalDate.of(1983,8, 11))
            .withbirthplace("Chernivtsi")
            .build();

    Actor four = new Actor.Builder().withname("Robert_John")
            .withsurname("Downey")
            .withrowth(1.7)
            .withbirthdate(LocalDate.of(1965, 4, 4))
            .withbirthplace("Afrika")
            .build();


    return new Object[][] { { one, one }, { two, three },{ one,four } };
}

    @Test(dataProvider = "not-compare-actor")
    public void actorNotTest(Actor one, Actor two) {
        assertNotEquals(one,two);
    }


    @DataProvider(name="not-compare-actor")
    public Object[][] ActorNotProvider() {

        Actor one = new Actor.Builder().withname("Robert_John")
                .withsurname("Downey")
                .withrowth(1.75)
                .withbirthdate(LocalDate.of(1965, 4, 4))
                .withbirthplace("USA,Mangetten")
                .build();

        Actor two = new Actor.Builder().withname("Chris")
                .withsurname("Hemswort")
                .withrowth(1.85)
                .withbirthdate(LocalDate.of(1983,8, 11))
                .withbirthplace("Australia, Melburn")
                .build();

        Actor three = new Actor.Builder().withname("Chris")
                .withsurname("Hemswort")
                .withrowth(1.80)
                .withbirthdate(LocalDate.of(1983,8, 11))
                .withbirthplace("Chernivtsi")
                .build();

        Actor four = new Actor.Builder().withname("Robert_John")
                .withsurname("Downey")
                .withrowth(1.7)
                .withbirthdate(LocalDate.of(1965, 4, 4))
                .withbirthplace("Afrika")
                .build();

        Actor five = new Actor.Builder().withname("Robert_Joh")
                .withsurname("Downey")
                .withrowth(1.7)
                .withbirthdate(LocalDate.of(1965, 4, 4))
                .withbirthplace("Afrika")
                .build();


        return new Object[][] { { one, two }, { four, three },{ five,four } };
    }


    /////////////////////////////////////////
    @Test(dataProvider = "compare-film")
    public void filmTest(Film one, Film two) {
        assertEquals(one,two);
    }


    @DataProvider(name="compare-film")
    public Object[][] FilmProvider() {

        Actor one = new Actor.Builder().withname("Robert_John")
                .withsurname("Downey")
                .withrowth(1.75)
                .withbirthdate(LocalDate.of(1965, 4, 4))
                .withbirthplace("USA,Mangetten")
                .build();

        Actor two = new Actor.Builder().withname("Chris")
                .withsurname("Hemswort")
                .withrowth(1.85)
                .withbirthdate(LocalDate.of(1983,8, 11))
                .withbirthplace("Australia, Melburn")
                .build();

        Actor three = new Actor.Builder().withname("Chris")
                .withsurname("Hemswort")
                .withrowth(1.80)
                .withbirthdate(LocalDate.of(1983,8, 11))
                .withbirthplace("Chernivtsi")
                .build();

        Actor four = new Actor.Builder().withname("Robert_John")
                .withsurname("Downey")
                .withrowth(1.7)
                .withbirthdate(LocalDate.of(1965, 4, 4))
                .withbirthplace("Afrika")
                .build();

        Actor five = new Actor.Builder().withname("Robert_Joh")
                .withsurname("Downey")
                .withrowth(1.7)
                .withbirthdate(LocalDate.of(1965, 4, 4))
                .withbirthplace("Afrika")
                .build();

        List<Actor> actorsAvengers = new ArrayList<Actor>();
        actorsAvengers.add(one);
        actorsAvengers.add(two);
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

        Film Avengers2 = new Film.Builder().withname("Avengers")
                .withactors(actorsAvengers)
                .withbudget(12000)
                .withdirector("Dzosh Uidon")
                .withcountry("USA")
                .withduration(110)
                .withgenres(genresAvengers)
                .withyear(2010)
                .build();



        return new Object[][] { { Avengers, Avengers }, { Avengers2, Avengers } };
    }




    @Test(dataProvider = "not-compare-film")
    public void filmNotTest(Film one, Film two) {
        assertNotEquals(one,two);
    }


    @DataProvider(name="not-compare-film")
    public Object[][] FilmNotProvider() {

        Actor one = new Actor.Builder().withname("Robert_John")
                .withsurname("Downey")
                .withrowth(1.75)
                .withbirthdate(LocalDate.of(1965, 4, 4))
                .withbirthplace("USA,Mangetten")
                .build();

        Actor two = new Actor.Builder().withname("Chris")
                .withsurname("Hemswort")
                .withrowth(1.85)
                .withbirthdate(LocalDate.of(1983,8, 11))
                .withbirthplace("Australia, Melburn")
                .build();

        Actor three = new Actor.Builder().withname("Chris")
                .withsurname("Hemswort")
                .withrowth(1.80)
                .withbirthdate(LocalDate.of(1983,8, 11))
                .withbirthplace("Chernivtsi")
                .build();

        Actor four = new Actor.Builder().withname("Robert_John")
                .withsurname("Downey")
                .withrowth(1.7)
                .withbirthdate(LocalDate.of(1965, 4, 4))
                .withbirthplace("Afrika")
                .build();

        Actor five = new Actor.Builder().withname("Robert_Joh")
                .withsurname("Downey")
                .withrowth(1.7)
                .withbirthdate(LocalDate.of(1965, 4, 4))
                .withbirthplace("Afrika")
                .build();

        List<Actor> actorsAvengers = new ArrayList<Actor>();
        actorsAvengers.add(one);
        actorsAvengers.add(two);
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

        Film Avengers2 = new Film.Builder().withname("Avenger")
                .withactors(actorsAvengers)
                .withbudget(12000)
                .withdirector("Dzosh Uidon")
                .withcountry("USA")
                .withduration(110)
                .withgenres(genresAvengers)
                .withyear(2010)
                .build();

        Film Avengers3 = new Film.Builder().withname("Avengers")
                .withactors(actorsAvengers)
                .withbudget(12000)
                .withdirector("Dzosh")
                .withcountry("USA")
                .withduration(110)
                .withgenres(genresAvengers)
                .withyear(2010)
                .build();



        return new Object[][] { { Avengers, Avengers3 }, { Avengers2, Avengers } };
    }




}
