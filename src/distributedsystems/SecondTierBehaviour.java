/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedsystems;

/**
 *
 * @author Angelo
 */
public interface SecondTierBehaviour {
    
    public void switchBehaviour();
    public void assumeNewBehaviour(SecondTierBehaviour beh);
    public void killPrevBehaviour();
    public void assume();
    
}
