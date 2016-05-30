/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.game;

import com.leapfrog.game.command.GameCommand;
import com.leapfrog.game.command.GameFactory;
import com.leapfrog.game.entity.Player;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Engine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("Welcome to Text Based Game");
        System.out.println("==========================");
        
        Scanner input = new Scanner(System.in);
        Player player = new Player();
            System.out.println("Enter the name of Player:");
            player.setName(input.next());
            
            while(true){
                System.out.print("Enter command:");
                String inputCommand=input.nextLine();
                
                String[]cmds=inputCommand.split(" ");
                GameCommand gamecmd=GameFactory.get(cmds[0]);
                if(gamecmd!=null){
                    gamecmd.execute(player,cmds);
                }else{
                    System.out.println("Invalid command");
                }
            }
        
         
    }
    
}
