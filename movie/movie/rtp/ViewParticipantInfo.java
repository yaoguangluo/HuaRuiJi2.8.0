/*
 * @(#)ViewParticipantInfo.java	1.3 02/08/21
 *
 * Copyright (c) 1996-2002 Sun Microsystems, Inc.  All rights reserved.
 */

package movie.rtp;



import java.awt.*;


import javax.media.rtp.*;
import javax.media.rtp.rtcp.*;





import jmapps.rtp.ViewSourceDescription;
import jmapps.ui.*;


@SuppressWarnings("serial")
public class ViewParticipantInfo extends JMPanel {

    @SuppressWarnings({ "deprecation", "unused" })
	private SessionManager          mngrSession;
    private Participant             participant;
    private ViewSourceDescription   panelSrcDescr = null;

    @SuppressWarnings("deprecation")
	public ViewParticipantInfo ( SessionManager mngrSession, Participant participant ) {
	    super ();

        this.mngrSession = mngrSession;
        this.participant = participant;
        try {
            init();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init () throws Exception {
        this.setLayout ( new BorderLayout() );

        panelSrcDescr = new ViewSourceDescription ( participant.getSourceDescription() );
        this.add ( panelSrcDescr, BorderLayout.NORTH );
    }

    public void updateFields ( Report report ) {
        if ( report.getParticipant() != this.participant )
            return;

        panelSrcDescr.updateFields ( report.getSourceDescription() );
    }

}


