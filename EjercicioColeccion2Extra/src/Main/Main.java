package Main;


import CantanteFamoso.CantanteFamoso;
import CantanteFamosoServices.CantanteFamosoServices;
import Menu.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        CantanteFamosoServices.dataBaseArtist.add(new CantanteFamoso("Eminem","The Marshall Mathers LP"));
        CantanteFamosoServices.dataBaseArtist.add(new CantanteFamoso("Rihanna","Good Girl Gone Bad"));
        CantanteFamosoServices.dataBaseArtist.add(new CantanteFamoso("Michael Jackson","Thriller"));
        CantanteFamosoServices.dataBaseArtist.add(new CantanteFamoso("Adele","Rolling in the deep"));
        CantanteFamosoServices.dataBaseArtist.add(new CantanteFamoso("Bruno Mars"," Unorthodox jukebox"));
        menu.menu();
    }
}