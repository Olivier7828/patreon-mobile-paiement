/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bf.ibam;

/**
 *
 * @author User
 */
public class IllustrationPolymorphisme {
    public static void main(String [] args)
    {
      Animal[] tab={new Tigre(),new Lion(),new Ours()};
              for (int i=0;i<tab.length;i++)
              {
                tab[i].dormir();
              }
    }
}
