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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JPanel;

/**
 *
 * @author Jeffrey Thomas Piercy <mqduck@mqduck.net>
 */
public class MACImagePanel extends JPanel
{
    private ArrayList<MACImage> images = new ArrayList<>();
    int index;
    
    MACImagePanel() throws IOException
    {
        images.add(new MACImage("Bath_of_Psyche.jpeg",
                                "The Bath of Psyche",
                                "Frederic Leighton",
                                "Aestheticism"));
        images.add(new MACImage("Madame_X.jpeg",
                                "Madame X (Mme Pierre Gautreau)",
                                "John Singer Sargent",
                                "Tonalism"));
        images.add(new MACImage("A_Sunday_Afternoon.jpeg",
                                "A Sunday Afternoon on the Island of La Grande Jatte",
                                "Georges Seurat",
                                "Pointillism"));
        images.add(new MACImage("The_Apparition.jpeg",
                                "The Apparition",
                                "Gustave Moreau",
                                "Symbolism"));
        images.add(new MACImage("Where_Do_We_Come_From.jpeg",
                                "Where do we come fron? What are we? Where are we going?",
                                "Paul Gauguin",
                                "Synthetism"));
        images.add(new MACImage("The_Talisman.jpeg",
                                "The Talisman (Landscape of the Bois d’Amour)",
                                "Paul Sérusier",
                                "Nabis"));
        images.add(new MACImage("Moulin_Rouge.jpeg",
                                "Moulin Rouge—La Goulue",
                                "Henri de Toulouse-Lautrec",
                                "Post-Impressionism"));
        images.add(new MACImage("The_Night_Cafe.jpeg",
                                "The Night Café",
                                "Vincent van Gogh",
                                "Post-Impressionism"));
        images.add(new MACImage("Basket_of_Apples.jpeg",
                                "Still Life with Basket of Apples",
                                "Paul Cézanne",
                                "Post-Impressionism"));
        images.add(new MACImage("Chatting_Women.png",
                                "Chatting Women",
                                "Camille Claudel",
                                "Post-Impressionism"));
        images.add(new MACImage("Tropon.jpeg",
                                "Tropon",
                                "Hendry van de Velde",
                                "Art Nouveau"));
        images.add(new MACImage("Stairwell_of_Tassel_House.jpeg",
                                "Stairwell of Tassel House",
                                "Victor Horta",
                                "Art Nouveau",
                                "Brussels, Belgium"));
        images.add(new MACImage("Adele_Blach-Bauer.jpeg",
                                "Adele Blach-Bauer (Woman in Gold)",
                                "Gustav Klimt",
                                "Vienna Secession"));
        images.add(new MACImage("Dance_of_Life.jpeg",
                                "The Dance of Life",
                                "Edvard Munch",
                                ""));
        images.add(new MACImage("Green_Line.jpeg",
                                "Portrait of Madame Matisse / The Green Line",
                                "Henri Matisse",
                                "Fauvism"));
        images.add(new MACImage("London_Bridge.jpeg",
                                "London Bridge",
                                "André Derain",
                                "Fauvism"));
        images.add(new MACImage("Blue_Nude.jpeg",
                                "Blue Nude: Memory of Biskra",
                                "Henri Matisse",
                                "Modernism"));
        images.add(new MACImage("Harmony_in_Red.jpeg",
                                "Harmony in Red (The Dessert)",
                                "Henri Matisse",
                                "Modernism"));
        images.add(new MACImage("Sleeping_Muse.jpeg",
                                "Sleeping Muse I",
                                "Constantin Brâncuși",
                                "Modernism"));
        images.add(new MACImage("The_Kiss.jpeg",
                                "The Kiss",
                                "Constantin Brâncuși",
                                "Modernism"));
        images.add(new MACImage("Les_Demoiselles.jpeg",
                                "Les Demoiselles d’Avignon",
                                "Pablo Picasso",
                                "Proto-Cubism"));
        images.add(new MACImage("Houses_on_the_Hill.jpeg",
                                "Houses on the Hill, Horta de Ebro",
                                "Pablo Picasso",
                                "Analytic Cubism"));
        images.add(new MACImage("Violin_and_Palette.jpeg",
                                "Violin and Palette",
                                "Georges Braque",
                                "Analytic Cubism"));
        
        index = 0;
    }
    
    public void shuffle()
    {
        Collections.shuffle(images);
    }
    
    public MACImage next()
    {
        index = (index+1) % images.size();
        return images.get(index);
    }
    
    public MACImage previous()
    {
        index = (index-1) % images.size();
        return images.get(index);
    }
}
