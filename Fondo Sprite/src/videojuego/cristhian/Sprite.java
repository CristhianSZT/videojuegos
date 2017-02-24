/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuego.cristhian;

import java.awt.image.BufferedImage;

/**
 *
 * @author cristhianszt
 */
public class Sprite {
    
    public BufferedImage sprite;
    
    public Sprite(BufferedImage bufferedImage){
        this.sprite = bufferedImage;
    }
    
    public BufferedImage iniciarSprite(int x, int y, int ancho, int alto){
        BufferedImage bufferedImage = sprite.getSubimage(x, y, ancho, alto);
        return bufferedImage;
    }
    
}
