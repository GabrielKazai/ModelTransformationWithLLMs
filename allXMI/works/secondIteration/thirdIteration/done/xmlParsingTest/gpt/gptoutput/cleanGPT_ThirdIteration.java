package test;abstract class Livre {    private String editeur;}package test;class Theme {    private Produit[] produits;    public String libelle;    public final int identifiant = 0;}package test;class Client {    public void achete(Produit p, boolean r) {    }}package test;interface IAchat {    boolean achat(Produit p);}package test;class File {    private Produit[] produitsAchetes;    private Client client;    protected Folder[] dossiersCibles;    private static final float ClassifierId = -45.254f;}package test;class Produit {    private Theme[] themes;    protected String nom;    private static final String classifier = "";}package test;interface IAction {}package test.Util;

class Facture {
    public Facture valorise(IAchat toto) {
        return null;
    }

    public static void getId(int id) {
    }
}
package test.Util;

class Folder {
}