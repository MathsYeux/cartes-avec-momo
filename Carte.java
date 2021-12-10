/**
*@author Ayered Mohammed et Mathieu Dessaulx
*/
public class Carte{

  private int date;
  private boolean face;
  private String event;


  /**
  *getter de Date
  *@return la date de la carte
  */
  public int getDate(){
    return (this.date);
  }

  /**
  *getter de face
  *@return la face de la carte
  */
  public boolean getFace(){
    return(this.face);
  }

  /**
  *getter d'event
  *@return l'event de la carte
  */
  public String getEvent(){
    return(this.event);
  }

  public void setDate(int d){
    this.date = d;
  }

  public void setFace(boolean f){
    this.face = f;
  }

  public void setEvent(String e){
    this.event = e;
  }

  /**
  *constructeur avec un String
  *@param s
  *chaîne à convertir puis prendre en paramètres
  */
  public Carte(String s){
    int i = 0;
  while (s.charAt(i) != ':'){
    i+=1;
  }
  String temp = "";
  for (int j = 0; j<i-1; j++){
    temp += s.charAt(j);
    }
  this.date= int Integer.parseint(temp);
  for (int j = s.length; j>i-1; j--){
    temp += s.charAt(j);
    }
  }
}
