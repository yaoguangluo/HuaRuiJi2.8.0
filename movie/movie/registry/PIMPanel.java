/*
 * @(#)PIMPanel.java	1.3 02/08/21
 *
 * Copyright (c) 1996-2002 Sun Microsystems, Inc.  All rights reserved.
 */

package movie.registry;

import java.awt.*;


import com.sun.media.ui.TabControl;

import movie.registry.PerTypePanel;
import jmapps.ui.*;


@SuppressWarnings("serial")
public class PIMPanel extends JMPanel {

    TabControl tabs;
    
    public PIMPanel() {
        super();

        int             i;
        PerTypePanel    panelPerType;

        setLayout( new BorderLayout() );
        tabs = new TabControl ();
        add ( tabs, BorderLayout.CENTER );

        for ( i = 1;  i < PerTypePanel.pluginTypes.length;  i++ ) {
            panelPerType = new PerTypePanel ( i );
            tabs.addPage ( panelPerType, PerTypePanel.pluginTypes[i] );
        }
    }

}
    

