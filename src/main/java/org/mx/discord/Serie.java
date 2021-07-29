/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mx.discord;

import java.util.UUID;

/**
 *
 * @author jganrica
 */
public class Serie extends EShow {
    
        public Serie(String nombre, String genero) {
        super(UUID.randomUUID().toString(), nombre, genero);
    }
}
