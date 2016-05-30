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
public class WalkCommand extends GameCommand{

    @Override
    public void execute(Player player,String[] input) {
        System.out.println(player.getName() +" is walking");
    }
    
}
