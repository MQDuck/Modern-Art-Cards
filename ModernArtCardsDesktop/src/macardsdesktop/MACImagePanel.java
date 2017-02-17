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
package macardsdesktop;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JPanel;
import macards.MACCard;
import macards.MACCardList;

/**
 *
 * @author Jeffrey Thomas Piercy <mqduck@mqduck.net>
 */
@SuppressWarnings("serial")
public class MACImagePanel extends JPanel
{
    //public ArrayList<MACImage> images = new ArrayList<>();
    public MACCardList images = new MACCardList();
    int index;
    MACCard current;
    
    public MACImagePanel()
    {
        /*images.add(new MACImage(
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
            "Modernism"));*/
        images.add(new MACCard(
            "Sleeping_Muse.jpeg",
            "Sleeping Muse I",
            "Brâncuși, Constantin",
            "Modernism"));
        images.add(new MACCard(
            "Les_Demoiselles.jpeg",
            "Les Demoiselles d’Avignon",
            "Picasso, Pablo",
            "Proto-Cubism"));
        images.add(new MACCard(
            "The_Portuguese.jpeg",
            "The Portuguese",
            "Braque, Georges",
            "Analytic Cubism"));
        images.add(new MACCard(
            "Fruit_Dish_and_Glass.jpeg",
            "Fruit Dish and Glass",
            "Braque, Georges",
            "Synthetic Cubism"));
        images.add(new MACCard(
            "Maquette_for_Guitar.jpeg",
            "Maquette for Guitar",
            "Picasso, Pablo",
            "Synthetic Cubism"));
        images.add(new MACCard(
            "The_Table.jpeg",
            "The Table",
            "Gris, Juan",
            "Synthetic Cubism"));
        images.add(new MACCard(
            "Medrano_II.jpeg",
            "Médrano II",
            "Archipenko, Alexander",
            "Synthetic Cubism"));
        images.add(new MACCard(
            "Disks_of_Newton.jpeg",
            "Disks of Newton (Study for Fugue in Two Colors)",
            "Kupka, František",
            "Orphism / Simultaneity"));
        images.add(new MACCard(
            "Street_Dresden.jpeg",
            "Street, Dresden",
            "Kirchner, Ernst Ludwig",
            "Expressionism: The Bridge (Die Brück)"));
        images.add(new MACCard(
            "Female_Dancer.jpeg",
            "Female Dancer",
            "Nolde, Emil",
            "Expressionism: The Bridge (Die Brück)"));
        images.add(new MACCard(
            "Composition_VII.jpeg",
            "Composition VII",
            "Kandinsky, Wassily",
            "Expressionism: The Blue RIder (Der Blaue Reiter)"));
        images.add(new MACCard(
            "Fate_of_the_Animals.jpeg",
            "Fate of the Animals",
            "Marc, Franz",
            "Expressionism: The Bridge (Die Brück)"));
        images.add(new MACCard(
            "AEG_Turbine_Factory.jpeg",
            "AEG Turbine Factory",
            "Behrens, Peter",
            "Early Modern Architecture",
            "Berlin, Germany"));
        images.add(new MACCard(
            "Guaranty_Trust_Building.jpeg",
            "Guaranty Trust Building",
            "Sullivan, Louis",
            "Early Modern Architecture (Chicago Style)",
            "Buffalo, New York"));
        images.add(new MACCard(
            "Robie_House.jpeg",
            "Robie House",
            "Frank Lloyd Wright",
            "Early Modern Architecture (Prairie Style)",
            "Chicago, Illinois"));
        images.add(new MACCard(
            "Pennsylvania_Station.jpeg",
            "Pennsylvania Station",
            "McKim, Mead & White",
            "Early Modern Architecture (Modern Classicism)"));
        images.add(new MACCard(
            "The_Melancholy_and_Mystery.jpeg",
            "The Melancholy and Mystery of a Street",
            "Giorgio De Chirico",
            "Metaphysical"));
        images.add(new MACCard(
            "Dynamic_Hieroglyphic.jpeg",
            "Dynamic Hieroglyphic of the Bal Tabarin",
            "Severini, Gino",
            "Futurism"));
        images.add(new MACCard(
            "Ezra_Pound.png",
            "Ezra Pound",
            "Coburn, Alvin Langdon",
            "Vorticism"));
        images.add(new MACCard(
            "Black_Square.jpeg",
            "Black Square",
            "Malevich, Kazimir",
            "Suprematism"));
        images.add(new MACCard(
            "The_Volunteers_from_War.jpeg",
            "The Volunteers from War",
            "Kollwitz, Käthe",
            "November Group / Expressionism / German Social Realism"));
        images.add(new MACCard(
            "Self-Portrait_in_Tuxedo.jpeg",
            "Self-Portrait in Tuxedo",
            "Beckmann, Max",
            "New Objectivity"));
        images.add(new MACCard(
            "Nude.jpeg",
            "Nude",
            "Modigliani, Amedeo",
            "School of Paris: The Mandits (The Cursed)"));
        images.add(new MACCard(
            "La_rue_du_Mont-Cenis.jpeg",
            "La rue du Mont-Cenis",
            "Utrillo, Maurice",
            "School of Paris: The Mandits (The Cursed)"));
        images.add(new MACCard(
            "Music_Lesson.jpeg",
            "Music Lesson",
            "Matisse, Henri",
            "Post-WWI Modernism"));
        images.add(new MACCard(
            "Olga_Seated.jpeg",
            "Olga Seated in an Armchair",
            "Picasso, Pablo",
            "Post-WWI Modernism"));
        images.add(new MACCard(
            "Guernica.jpeg",
            "Guernica",
            "Picasso, Pablo",
            "Post-WWI Modernism"));
            
        images.loadImages(true);
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
        //if(current.getImage() == null)
        //    return;
        
        final float ratioWidth = (float)getWidth() / current.getImage().getWidth();
        final float ratioHeight = (float)getHeight() / current.getImage().getHeight();
        if(ratioWidth < ratioHeight)
            g.drawImage(current.getImage(), 0, (int)(getHeight() - current.getImage().getHeight() * ratioWidth) / 2,
                        getWidth(), (int)(current.getImage().getHeight() * ratioWidth), this);
        else
            g.drawImage(current.getImage(), (int)(getWidth() - current.getImage().getWidth() * ratioHeight) / 2, 0,
                        (int)(current.getImage().getWidth() * ratioHeight), getHeight(), this);
        /*if(ratioWidth < ratioHeight)
            g.drawImage(current.getImage().getScaledInstance(getWidth(), -1, Image.SCALE_REPLICATE), 0,
                        (int)(getHeight() - current.getImage().getHeight() * ratioWidth) / 2, this);
        else
            g.drawImage(current.getImage().getScaledInstance(-1, getHeight(), Image.SCALE_REPLICATE),
                        (int)(getWidth() - current.getImage().getWidth() * ratioHeight) / 2, 0, this);*/
    }
}
