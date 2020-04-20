/*
 * @(#)VectorEditor.java	1.3 02/08/21
 *
 * Copyright (c) 1996-2002 Sun Microsystems, Inc.  All rights reserved.
 */

package movie.registry;



import java.util.Vector;

public interface VectorEditor {

    @SuppressWarnings("rawtypes")
	Vector getList(int code);
    @SuppressWarnings("rawtypes")
	void setList(int code, Vector v);
    void commit(int code);
    void selectedIndex(int code, int index);
    boolean addToList(int code, String value);
}


