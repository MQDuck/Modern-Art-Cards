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

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;

/**
 *
 * @author Jeffrey Thomas Piercy <mqduck@mqduck.net>
 */
public class MACMainWindow extends javax.swing.JFrame
{
    private static final String TEXT_BUTTON_SHOW = "Show";

    /**
     * Creates new form MACMainWindow
     */
    public MACMainWindow()
    {
        initComponents();
        imagePanel.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("RIGHT"), "right pressed");
        imagePanel.getActionMap().put("right pressed", new AbstractAction()
            {@Override public void actionPerformed(ActionEvent evt) { nextCard(); }});
        
        imagePanel.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("LEFT"), "left pressed");
        imagePanel.getActionMap().put("left pressed", new AbstractAction()
            {@Override public void actionPerformed(ActionEvent evt) { lastCard(); }});
        
        imagePanel.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("S"), "S pressed");
        imagePanel.getActionMap().put("S pressed", new AbstractAction()
            {@Override public void actionPerformed(ActionEvent evt) { shuffleCards(); } });
        
        imagePanel.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("1"), "1 pressed");
        imagePanel.getActionMap().put("1 pressed", new AbstractAction()
            {@Override public void actionPerformed(ActionEvent evt) { toggleToggleButton(jToggleButtonShowTitle); }});
        
        imagePanel.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("2"), "2 pressed");
        imagePanel.getActionMap().put("2 pressed", new AbstractAction()
            {@Override public void actionPerformed(ActionEvent evt) { toggleToggleButton(jToggleButtonShowArtist); }});
        
        imagePanel.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("3"), "3 pressed");
        imagePanel.getActionMap().put("3 pressed", new AbstractAction()
            {@Override public void actionPerformed(ActionEvent evt) { toggleToggleButton(jToggleButtonShowStyle); }});
        
        imagePanel.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("4"), "4 pressed");
        imagePanel.getActionMap().put("4 pressed", new AbstractAction()
            {@Override public void actionPerformed(ActionEvent evt) { toggleToggleButton(jToggleButtonShowLocation); }});
        
        jPanelLocation.setVisible(imagePanel.getPlace() != null);
        
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        final Rectangle maxWindow = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        setSize(maxWindow.width, maxWindow.height);
        jSplitPaneMain.setDividerLocation(  getWidth()
                                          - jSplitPaneMain.getInsets().right
                                          - jSplitPaneMain.getDividerSize()
                                          - 481);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jSplitPaneMain = new javax.swing.JSplitPane();
        imagePanel = new macards.MACImagePanel();
        jPanelUI = new javax.swing.JPanel();
        jPanelNavigation = new javax.swing.JPanel();
        jButtonLast = new javax.swing.JButton();
        jButtonShuffle = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jPanelTitle = new javax.swing.JPanel();
        jToggleButtonShowTitle = new javax.swing.JToggleButton();
        jScrollPaneTitle = new javax.swing.JScrollPane();
        jTextPaneTitle = new javax.swing.JTextPane();
        jPanelArtist = new javax.swing.JPanel();
        jToggleButtonShowArtist = new javax.swing.JToggleButton();
        jScrollPaneArtist = new javax.swing.JScrollPane();
        jTextPaneArtist = new javax.swing.JTextPane();
        jPanelStyle = new javax.swing.JPanel();
        jToggleButtonShowStyle = new javax.swing.JToggleButton();
        jScrollPaneStyle = new javax.swing.JScrollPane();
        jTextPaneStyle = new javax.swing.JTextPane();
        jPanelLocation = new javax.swing.JPanel();
        jToggleButtonShowLocation = new javax.swing.JToggleButton();
        jScrollPaneLocation = new javax.swing.JScrollPane();
        jTextPaneLocation = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPaneMain.setDividerLocation(500);
        jSplitPaneMain.setResizeWeight(1.0);
        jSplitPaneMain.setContinuousLayout(true);
        jSplitPaneMain.setFocusable(false);

        imagePanel.setBackground(new java.awt.Color(0, 0, 0));
        imagePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPaneMain.setLeftComponent(imagePanel);

        jPanelUI.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelNavigation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelNavigation.setLayout(new java.awt.GridLayout(1, 0));

        jButtonLast.setFont(new java.awt.Font("DejaVu Sans", 0, 30)); // NOI18N
        jButtonLast.setText("←");
        jButtonLast.setFocusable(false);
        jButtonLast.setPreferredSize(new java.awt.Dimension(32, 29));
        jButtonLast.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonLastActionPerformed(evt);
            }
        });
        jPanelNavigation.add(jButtonLast);

        jButtonShuffle.setText("Shuffle");
        jButtonShuffle.setFocusable(false);
        jButtonShuffle.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonShuffleActionPerformed(evt);
            }
        });
        jPanelNavigation.add(jButtonShuffle);

        jButtonNext.setFont(new java.awt.Font("DejaVu Sans", 0, 30)); // NOI18N
        jButtonNext.setText("→");
        jButtonNext.setFocusable(false);
        jButtonNext.setPreferredSize(new java.awt.Dimension(32, 29));
        jButtonNext.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonNextActionPerformed(evt);
            }
        });
        jPanelNavigation.add(jButtonNext);

        jPanelTitle.setBorder(javax.swing.BorderFactory.createTitledBorder("Title"));
        jPanelTitle.setFocusable(false);

        jToggleButtonShowTitle.setText(TEXT_BUTTON_SHOW);
        jToggleButtonShowTitle.setFocusable(false);
        jToggleButtonShowTitle.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jToggleButtonShowTitleStateChanged(evt);
            }
        });

        jTextPaneTitle.setEditable(false);
        jTextPaneTitle.setFocusable(false);
        jScrollPaneTitle.setViewportView(jTextPaneTitle);

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addComponent(jToggleButtonShowTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTitle))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButtonShowTitle)
            .addComponent(jScrollPaneTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelArtist.setBorder(javax.swing.BorderFactory.createTitledBorder("Artist"));
        jPanelArtist.setFocusable(false);

        jToggleButtonShowArtist.setText(TEXT_BUTTON_SHOW);
        jToggleButtonShowArtist.setFocusable(false);
        jToggleButtonShowArtist.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jToggleButtonShowArtistStateChanged(evt);
            }
        });

        jScrollPaneArtist.setFocusable(false);

        jTextPaneArtist.setEditable(false);
        jScrollPaneArtist.setViewportView(jTextPaneArtist);

        javax.swing.GroupLayout jPanelArtistLayout = new javax.swing.GroupLayout(jPanelArtist);
        jPanelArtist.setLayout(jPanelArtistLayout);
        jPanelArtistLayout.setHorizontalGroup(
            jPanelArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtistLayout.createSequentialGroup()
                .addComponent(jToggleButtonShowArtist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneArtist))
        );
        jPanelArtistLayout.setVerticalGroup(
            jPanelArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButtonShowArtist)
            .addComponent(jScrollPaneArtist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelStyle.setBorder(javax.swing.BorderFactory.createTitledBorder("Period Style"));
        jPanelStyle.setFocusable(false);

        jToggleButtonShowStyle.setText(TEXT_BUTTON_SHOW);
        jToggleButtonShowStyle.setFocusable(false);
        jToggleButtonShowStyle.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jToggleButtonShowStyleStateChanged(evt);
            }
        });

        jTextPaneStyle.setEditable(false);
        jTextPaneStyle.setFocusable(false);
        jScrollPaneStyle.setViewportView(jTextPaneStyle);

        javax.swing.GroupLayout jPanelStyleLayout = new javax.swing.GroupLayout(jPanelStyle);
        jPanelStyle.setLayout(jPanelStyleLayout);
        jPanelStyleLayout.setHorizontalGroup(
            jPanelStyleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStyleLayout.createSequentialGroup()
                .addComponent(jToggleButtonShowStyle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneStyle))
        );
        jPanelStyleLayout.setVerticalGroup(
            jPanelStyleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButtonShowStyle)
            .addComponent(jScrollPaneStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelLocation.setBorder(javax.swing.BorderFactory.createTitledBorder("Location"));
        jPanelLocation.setFocusable(false);

        jToggleButtonShowLocation.setText(TEXT_BUTTON_SHOW);
        jToggleButtonShowLocation.setFocusable(false);
        jToggleButtonShowLocation.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jToggleButtonShowLocationStateChanged(evt);
            }
        });

        jTextPaneLocation.setEditable(false);
        jTextPaneLocation.setFocusable(false);
        jScrollPaneLocation.setViewportView(jTextPaneLocation);

        javax.swing.GroupLayout jPanelLocationLayout = new javax.swing.GroupLayout(jPanelLocation);
        jPanelLocation.setLayout(jPanelLocationLayout);
        jPanelLocationLayout.setHorizontalGroup(
            jPanelLocationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLocationLayout.createSequentialGroup()
                .addComponent(jToggleButtonShowLocation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneLocation))
        );
        jPanelLocationLayout.setVerticalGroup(
            jPanelLocationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButtonShowLocation)
            .addComponent(jScrollPaneLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanelUILayout = new javax.swing.GroupLayout(jPanelUI);
        jPanelUI.setLayout(jPanelUILayout);
        jPanelUILayout.setHorizontalGroup(
            jPanelUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelArtist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelStyle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelUILayout.setVerticalGroup(
            jPanelUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUILayout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelArtist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jPanelNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPaneMain.setRightComponent(jPanelUI);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneMain)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonShowTitleStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jToggleButtonShowTitleStateChanged
    {//GEN-HEADEREND:event_jToggleButtonShowTitleStateChanged
        showAttribute(jToggleButtonShowTitle, jTextPaneTitle, imagePanel.getTitle());
    }//GEN-LAST:event_jToggleButtonShowTitleStateChanged

    private void jToggleButtonShowArtistStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jToggleButtonShowArtistStateChanged
    {//GEN-HEADEREND:event_jToggleButtonShowArtistStateChanged
        showAttribute(jToggleButtonShowArtist, jTextPaneArtist, imagePanel.getArtist());
    }//GEN-LAST:event_jToggleButtonShowArtistStateChanged

    private void jToggleButtonShowStyleStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jToggleButtonShowStyleStateChanged
    {//GEN-HEADEREND:event_jToggleButtonShowStyleStateChanged
        showAttribute(jToggleButtonShowStyle, jTextPaneStyle, imagePanel.getStyle());
    }//GEN-LAST:event_jToggleButtonShowStyleStateChanged

    private void jToggleButtonShowLocationStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jToggleButtonShowLocationStateChanged
    {//GEN-HEADEREND:event_jToggleButtonShowLocationStateChanged
        showAttribute(jToggleButtonShowLocation, jTextPaneLocation, imagePanel.getPlace());
    }//GEN-LAST:event_jToggleButtonShowLocationStateChanged

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonNextActionPerformed
    {//GEN-HEADEREND:event_jButtonNextActionPerformed
        nextCard();
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonLastActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonLastActionPerformed
    {//GEN-HEADEREND:event_jButtonLastActionPerformed
        lastCard();
    }//GEN-LAST:event_jButtonLastActionPerformed

    private void jButtonShuffleActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonShuffleActionPerformed
    {//GEN-HEADEREND:event_jButtonShuffleActionPerformed
        shuffleCards();
    }//GEN-LAST:event_jButtonShuffleActionPerformed

    private void showAttribute(final JToggleButton button, final JTextPane pane, final String attribute)
    {
        if(button.isSelected())
            pane.setText(attribute);
        else
            pane.setText("");
    }
    
    private void hideAllAttributes()
    {
        jToggleButtonShowTitle.setSelected(false);
        jToggleButtonShowArtist.setSelected(false);
        jToggleButtonShowStyle.setSelected(false);
        jToggleButtonShowLocation.setSelected(false);
    }
    
    private void toggleToggleButton(final javax.swing.JToggleButton button)
    { button.setSelected(!button.isSelected()); }
    
    private void loadCard()
    {
        jPanelLocation.setVisible(imagePanel.getPlace() != null);
        hideAllAttributes();
    }
    
    private void nextCard()
    {
        imagePanel.next();
        loadCard();
    }
    
    private void lastCard()
    {
        imagePanel.last();
        loadCard();
    }
    
    private void shuffleCards()
    {
        imagePanel.shuffle();
        loadCard();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MACMainWindow().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private macards.MACImagePanel imagePanel;
    private javax.swing.JButton jButtonLast;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonShuffle;
    private javax.swing.JPanel jPanelArtist;
    private javax.swing.JPanel jPanelLocation;
    private javax.swing.JPanel jPanelNavigation;
    private javax.swing.JPanel jPanelStyle;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JPanel jPanelUI;
    private javax.swing.JScrollPane jScrollPaneArtist;
    private javax.swing.JScrollPane jScrollPaneLocation;
    private javax.swing.JScrollPane jScrollPaneStyle;
    private javax.swing.JScrollPane jScrollPaneTitle;
    private javax.swing.JSplitPane jSplitPaneMain;
    private javax.swing.JTextPane jTextPaneArtist;
    private javax.swing.JTextPane jTextPaneLocation;
    private javax.swing.JTextPane jTextPaneStyle;
    private javax.swing.JTextPane jTextPaneTitle;
    private javax.swing.JToggleButton jToggleButtonShowArtist;
    private javax.swing.JToggleButton jToggleButtonShowLocation;
    private javax.swing.JToggleButton jToggleButtonShowStyle;
    private javax.swing.JToggleButton jToggleButtonShowTitle;
    // End of variables declaration//GEN-END:variables
}
