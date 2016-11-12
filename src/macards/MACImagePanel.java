/*
 * Copyright (C) 2016 Jeffrey Thomas Piercy <mqduck@mqduck.net>
 *
 * This file is part of Modern Art Cards.
 *
 * Modern Art Cards is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Modern Art Cards is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modern Art Cards.  If not, see <http://www.gnu.org/licenses/>.
 */
package macards;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JPanel;

/**
 *
 * @author Jeffrey Thomas Piercy <mqduck@mqduck.net>
 */
@SuppressWarnings("serial")
public class MACImagePanel extends JPanel
{
    public ArrayList<MACImage> images = new ArrayList<>();
    int index;
    MACImage current;
    
    public MACImagePanel()
    {
        images.add(new MACImage(
            "Bath_of_Psyche.jpeg",
            "The Bath of Psyche",
            "Leighton, Frederic",
            "Aestheticism"));
        images.add(new MACImage(
            "Madame_X.jpeg",
            "Madame X (Mme Pierre Gautreau)",
            "Sargent, John Singer",
            "Tonalism"));
        images.add(new MACImage(
            "A_Sunday_Afternoon.jpeg",
            "A Sunday Afternoon on the Island of La Grande Jatte",
            "Seurat, Georges",
            "Pointillism"));
        images.add(new MACImage(
            "The_Apparition.jpeg",
            "The Apparition",
            "Moreau, Gustave",
            "Symbolism"));
        images.add(new MACImage(
            "Where_Do_We_Come_From.jpeg",
            "Where do we come fron? What are we? Where are we going?",
            "Gauguin, Paul",
            "Synthetism"));
        images.add(new MACImage(
            "The_Talisman.jpeg",
            "The Talisman (Landscape of the Bois d’Amour)",
            "Sérusier, Paul",
            "Nabis"));
        images.add(new MACImage(
            "Moulin_Rouge.jpeg",
            "Moulin Rouge—La Goulue",
            "Toulouse-Lautrec, Henri",
            "Post-Impressionism"));
        images.add(new MACImage(
            "The_Night_Cafe.jpeg",
            "The Night Café",
            "Van Gogh, Vincent",
            "Post-Impressionism"));
        images.add(new MACImage(
            "Basket_of_Apples.jpeg",
            "Still Life with Basket of Apples",
            "Cézanne, Paul",
            "Post-Impressionism"));
        images.add(new MACImage(
            "Chatting_Women.png",
            "Chatting Women",
            "Claudel, Camille",
            "Post-Impressionism"));
        images.add(new MACImage(
            "Tropon.jpeg",
            "Tropon",
            "Van de Velde, Hendry",
            "Art Nouveau"));
        images.add(new MACImage(
            "Stairwell_of_Tassel_House.jpeg",
            "Stairwell of Tassel House",
            "Horta, Victor",
            "Art Nouveau",
            "Brussels, Belgium"));
        images.add(new MACImage(
            "Adele_Blach-Bauer.jpeg",
            "Adele Blach-Bauer (Woman in Gold)",
            "Klimt, Gustav",
            "Vienna Secession"));
        images.add(new MACImage(
            "Dance_of_Life.jpeg",
            "The Dance of Life",
            "Munch, Edvard",
            "Late Symbolism"));
        images.add(new MACImage(
            "Green_Line.jpeg",
            "Portrait of Madame Matisse / The Green Line",
            "Matisse, Henri",
            "Fauvism"));
        images.add(new MACImage(
            "London_Bridge.jpeg",
            "London Bridge",
            "Derain, André",
            "Fauvism"));
        images.add(new MACImage(
            "Blue_Nude.jpeg",
            "Blue Nude: Memory of Biskra",
            "Matisse, Henri",
            "Modernism"));
        images.add(new MACImage(
            "Harmony_in_Red.jpeg",
            "Harmony in Red (The Dessert)",
            "Matisse, Henri",
            "Modernism"));
            
            index = 0;
            current = images.get(index);
    }
    
    public void shuffle()
    {
        Collections.shuffle(images);
        current = images.get(index);
        repaint();
    }
    
    public void next()
    {
        index = (index+1) % images.size();
        current = images.get(index);
        repaint();
    }
    
    public void last()
    {
        if(index == 0)
            index = images.size() - 1;
        else
            index = (index-1) % images.size();
        current = images.get(index);
        repaint();
    }
    
    public String getTitle() { return current.title; }
    public String getArtist() { return current.artist; }
    public String getStyle() { return current.style; }
    public String getPlace() { return current.place; }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //if(current.image == null)
        //    return;
        
        final float ratioWidth = (float)getWidth() / current.image.getWidth();
        final float ratioHeight = (float)getHeight() / current.image.getHeight();
        if(ratioWidth < ratioHeight)
            g.drawImage(current.image, 0, (int)(getHeight() - current.image.getHeight() * ratioWidth) / 2,
                        getWidth(), (int)(current.image.getHeight() * ratioWidth), this);
        else
            g.drawImage(current.image, (int)(getWidth() - current.image.getWidth() * ratioHeight) / 2, 0,
                        (int)(current.image.getWidth() * ratioHeight), getHeight(), this);
    }
}
