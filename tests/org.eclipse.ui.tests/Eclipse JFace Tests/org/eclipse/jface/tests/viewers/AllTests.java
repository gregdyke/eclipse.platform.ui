/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jface.tests.viewers;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests extends TestSuite {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite() {
        return new AllTests();
    }

     public AllTests() {
        addTestSuite(TreeViewerTest.class);
        addTestSuite(TableViewerTest.class);
        addTestSuite(VirtualTableViewerTest.class);
        addTestSuite(VirtualLazyTableViewerTest.class);
        addTestSuite(TableTreeViewerTest.class);
        addTestSuite(TableColorProviderTest.class);
        addTestSuite(TableFontProviderTest.class);
        addTestSuite(ListViewerTest.class);
        addTestSuite(CheckboxTableViewerTest.class);
        addTestSuite(CheckboxTreeViewerTest.class);
        addTestSuite(ComboViewerTest.class);
    }
}