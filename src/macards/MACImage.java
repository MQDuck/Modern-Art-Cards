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

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Jeffrey Thomas Piercy <mqduck@mqduck.net>
 */
public class MACImage
{
    private BufferedImage image = null;
    private boolean loading = false;
    final public String file, title, artist, style, place;
    
    MACImage(final String img, final String ttl, final String artst, final String stl, final String plc)
    {
        file = img;
        title = ttl;
        artist = artst;
        style = stl;
        place = plc;
    }
    
    MACImage(final String img, final String ttl, final String artst, final String stl)
    {
        file = img;
        title = ttl;
        artist = artst;
        style = stl;
        place = null;
    }
    
    public final BufferedImage getImage()
    {
        loadImage();
        return image;
    }
    
    public void loadImage() { loadImage(file); }
    
    private void loadImage(final String fl)
    {
        if(image != null)
            return;
        if(loading)
        {
            waitForImageLoad();
            return;
        }
        
        loading = true;
        System.out.println("loading " + fl);
        try { image = ImageIO.read(getClass().getResource(fl)); }
        catch(IOException ex) { Logger.getLogger(MACImage.class.getName()).log(Level.SEVERE, null, ex); }
        loading = false;
    }
    
    private void waitForImageLoad()
    {
        try
        {
            while(image == null)
                Thread.sleep(10);
        }
        catch(InterruptedException ex)
        {
            Logger.getLogger(MACImage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
