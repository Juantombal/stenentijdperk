package hsleiden.stenentijdperk.stenentijdperk.Helpers;


public class Tool extends Locatiebord{
    public Tool(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void ontvangGereedschap(Speler speler){
        // ontvangen gereedschap
        Tableau tableau = speler.getTableau();
        int gereedschap = tableau.getAantalTools();
        if (gereedschap < 12) {
            tableau.verhoogTool();
        }
    }
}
