/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padolina_071017_act8;

/**
 *
 * @author Student Account
 */
public class Task1Demo {
    public static void main(String [] args){
        OuterClass oc = new OuterClass();
        InnerClass ic = new InnerClass();
        System.out.println(oc.data);
        System.out.println(ic.data2);
        ic.method(oc);
    }
}
