package list;

public interface IGestion <T>{
    public void ajouterEmployer(T t);
    public boolean rechercherEmployer(String nom);
    public boolean rechercherEmployer(T t);
    public void supprimerEmploye(T t);
    public void displayEmploye();
    public void trierEmployeParId(); //Comparable
    public void trierEmployeParNomDepartementEtGrade(); //Comparator
}
