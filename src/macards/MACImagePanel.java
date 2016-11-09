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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            "./assets/Bath_of_Psyche.jpeg",
            "The Bath of Psyche",
            "Frederic Leighton",
            "Aestheticism"));
        images.add(new MACImage(
            "./assets/Madame_X.jpeg",
            "Madame X (Mme Pierre Gautreau)",
            "John Singer Sargent",
            "Tonalism"));
        images.add(new MACImage(
            "./assets/A_Sunday_Afternoon.jpeg",
            "A Sunday Afternoon on the Island of La Grande Jatte",
            "Georges Seurat",
            "Pointillism"));
        images.add(new MACImage(
            "./assets/The_Apparition.jpeg",
            "The Apparition",
            "Gustave Moreau",
            "Symbolism"));
        images.add(new MACImage(
            "./assets/Where_Do_We_Come_From.jpeg",
            "Where do we come fron? What are we? Where are we going?",
            "Paul Gauguin",
            "Synthetism"));
        images.add(new MACImage(
            "./assets/The_Talisman.jpeg",
            "The Talisman (Landscape of the Bois d’Amour)",
            "Paul Sérusier",
            "Nabis"));
        images.add(new MACImage(
            "./assets/Moulin_Rouge.jpeg",
            "Moulin Rouge—La Goulue",
            "Henri de Toulouse-Lautrec",
            "Post-Impressionism"));
        images.add(new MACImage(
            "./assets/The_Night_Cafe.jpeg",
            "The Night Café",
            "Vincent van Gogh",
            "Post-Impressionism"));
        images.add(new MACImage(
            "./assets/Basket_of_Apples.jpeg",
            "Still Life with Basket of Apples",
            "Paul Cézanne",
            "Post-Impressionism"));
        images.add(new MACImage(
            "./assets/Chatting_Women.png",
            "Chatting Women",
            "Camille Claudel",
            "Post-Impressionism"));
        images.add(new MACImage(
            "./assets/Tropon.jpeg",
            "Tropon",
            "Hendry van de Velde",
            "Art Nouveau"));
        images.add(new MACImage(
            "./assets/Stairwell_of_Tassel_House.jpeg",
            "Stairwell of Tassel House",
            "Victor Horta",
            "Art Nouveau",
            "Brussels, Belgium"));
        images.add(new MACImage(
            "./assets/Adele_Blach-Bauer.jpeg",
            "Adele Blach-Bauer (Woman in Gold)",
            "Gustav Klimt",
            "Vienna Secession"));
        images.add(new MACImage(
            "./assets/Dance_of_Life.jpeg",
            "The Dance of Life",
            "Edvard Munch",
            ""));
        images.add(new MACImage(
            "./assets/Green_Line.jpeg",
            "Portrait of Madame Matisse / The Green Line",
            "Henri Matisse",
            "Fauvism"));
        images.add(new MACImage(
            "./assets/London_Bridge.jpeg",
            "London Bridge",
            "André Derain",
            "Fauvism"));
        images.add(new MACImage(
            "./assets/Blue_Nude.jpeg",
            "Blue Nude: Memory of Biskra",
            "Henri Matisse",
            "Modernism"));
        images.add(new MACImage(
            "./assets/Harmony_in_Red.jpeg",
            "Harmony in Red (The Dessert)",
            "Henri Matisse",
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
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
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
