/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.game.command;

import com.leapfrog.game.entity.Player;

/**
 *
 * @author User
 */
public class MoveCommand extends GameCommand{

    @Override
    public void execute(Player player,String[] input) {
        if(input.length==1){
            System.out.println("where do you want to move?");
        }else if(input.length>1){
            switch(input[1].toLowerCase()){
                case "left":
                    System.out.println("You are moving left.");
                    break;
                case "right":
                    System.out.println("You are moving right.");
                    break;    
                default:
                        System.out.println("I'm confused where to move");
            }
        }
        System.out.println(player.getName() +" is moving");
    }
    
}
