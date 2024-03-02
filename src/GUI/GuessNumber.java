/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author Feyesel Sultan
 */
public class GuessNumber {
    private static int _RANDOMGEN =0;
    
    //create random number
    public static int _randomNumber(){//start rand fun
        _RANDOMGEN = (int) Math.round(Math.random()*1000); // 1- 1000 generate      
        return _RANDOMGEN;
    }//rand fun end
    
    private static int _checkIfZero(int num){//start zero filter
        int newNum=0;       
        if(num==0){
           newNum = _randomNumber();  
        }else{
            newNum=num;
        }
        return newNum;
    }//end zero fillter
    
}//class end
