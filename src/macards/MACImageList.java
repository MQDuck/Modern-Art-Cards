/*
 * Copyright (C) 2016 Jeffrey Thomas Piercy <mqduck@mqduck.net>
 *
 * This file is part of ModernArtCards.
 *
 * ModernArtCards is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ModernArtCards is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ModernArtCards.  If not, see <http://www.gnu.org/licenses/>.
 */
package macards;

import java.util.ArrayList;

/**
 *
 * @author Jeffrey Thomas Piercy <mqduck@mqduck.net>
 */
public class MACImageList extends ArrayList<MACImage>
{
    public void loadImages(final boolean createThread)
    {
        if(createThread)
            ( new Thread() {@Override public void run() { loadImages(); }} ).start();
        else
            loadImages();
    }
    
    private void loadImages() { stream().forEach((image) -> image.getImage()); }

}
