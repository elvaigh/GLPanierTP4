import java.util.*;
/**
 *
 * @author roudet
 */
public class Panier {
    private ArrayList<Fruit> fruits  = new ArrayList<Fruit>();  //attribut pour stocker les fruits
    private int contenanceMax=10;        //nb maximum d'oranges que peut contenir le panier
	
    //groupe 1
    public Panier(int contenanceMax){  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)
        
       this.contenanceMax = contenanceMax;
    }

    @Override
    public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        return "";
    }
    
    //groupe 2
    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
       return null;
    }

    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut
      
    }

    public int getTaillePanier(){  //accesseur retournant la taille allouee pour l'attibut fruits
        return 0;
    }
    
    public int getContenanceMax(){  //accesseur du second attribut
	return contenanceMax;
    }

    //groupe 3
    public Fruit getFruit(int i){  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
	return null;
    }
    
    public void setFruit(int i, Fruit f){  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)

    }
    
    public boolean estVide(){  //predicat indiquant que le panier est vide
	return false;
    }
    
    public boolean estPlein(){  //predicat indiquant que le panier est plein
	return false;
    }

    //groupe 4
    public void ajout(Fruit o) throws PanierPleinException{  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein
        if (fruits.size() < contenanceMax) {
        fruits.add(o);
       }
       else
        throw new PanierPleinException();
    }

    //groupe 5
    public void retrait() throws PanierVideException{ //retire le dernier fruit du panier si celui-ci n'est pas vide
        if(fruits != null){
            fruits.remove(fruits.size()-1);
        } else{
            System.out.println("le panier est vide");
        } 
    }

    //groupe 6
    public double getPrix(){  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
	return 0;
    }
    
    //groupe 7
    public void boycotteOrigine(String origine){  //supprime du panier tous les fruits provenant du pays origine
	
    }  
        
    //groupe 8    
    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        return false;
    }
    
    //tests
    public static void main (String[] args) throws Exception {
        try
            {
                //Ecrire ici vos tests
                    System.out.println("premier test Panier");

        /////// DEBUT TEST GROUPE 4 /////// 
        System.out.println("TEST GROUPE 4 : AJOUT FRUIT");
        Panier panierTestG4 = new Panier(1);
        Kiwi kiwi1 = new Kiwi();
        Kiwi kiwi2 = new Kiwi();
        try {
            System.out.println("Panier de base : " + panierTestG4.toString());
            panierTestG4.ajout(kiwi1);
            System.out.println("Panier avec ajout kiwi : " + panierTestG4.toString());
            //panierTestG4.ajout(kiwi2);
            //System.out.println("Panier rempli avec deuxième ajout kiwi : " + panierTestG4.toString());
        }
        catch (PanierPleinException e) {
            e.printStackTrace();
        }
        //////// FIN TEST GROUPE 4 /////// 
                Panier p = new Panier(10);
                Fruit c = new Ananas(40,"south-africa");
                Fruit c1 = new Ananas(30,"colombia");
                p.ajout(c);
                p.ajout(c1);
                
                for(Fruit f : p.fruits)
                {
                    System.out.println(f + " \n");
                } 

                p.retrait();

                System.out.println("test fonction retrait() ---------  groupe 5 --------\n");

                for(Fruit f : p.fruits)
                {
                    System.out.println(f + " \n");
                } 
                
            }   
            catch (Exception e)
            {
                e.printStackTrace ();
            }
}
}


