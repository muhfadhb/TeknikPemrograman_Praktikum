package Kasus3;

/**
 * <h1> Kasus 3 : KelasSatu </h1>
 * bertujuan untuk memahami perbedaan sebuah constructor tetapi sama walaupun berbeda
 * 
 * @author Muhammad Fadhil
 * @version 1.0
 * @since 2022-27-02
 */

public class KelasSatu {
     static {
        System.out.println(11); 
    }
    
    static
    {
        System.out.println(2); 
    }
    
    public KelasSatu(int i) 
    {
        System.out.println(3); 
    }
    public KelasSatu() 
    {
        System.out.println(4); 
    }
}