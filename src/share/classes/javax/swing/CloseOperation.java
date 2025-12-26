/*
 * Copyright (c) 1997, 2003, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javax.swing;


/**
 * Enumeration used to control the window-closing operation.
 * The <code>setDefaultCloseOperation</code> and
 * <code>getDefaultCloseOperation</code> methods
 * provided by <code>JFrame</code>,
 * <code>JInternalFrame</code>, and
 * <code>JDialog</code>
 * use these values.
 * For examples of setting the default window-closing operation, see
 * <a
 href="http://java.sun.com/docs/books/tutorial/uiswing/components/frame.html#windowevents">Responding to Window-Closing Events</a>,
 * a section in <em>The Java Tutorial</em>.
 * @see JFrame#setDefaultCloseOperation(CloseOperation)
 * @see JDialog#setDefaultCloseOperation(CloseOperation)
 * @see JInternalFrame#setDefaultCloseOperation(CloseOperation)
 *
 *
 * @author Amy Fowler
 */
public enum CloseOperation
{
    /**
     * The do-nothing default window close operation.
     */
    DO_NOTHING_ON_CLOSE,

    /**
     * The hide-window default window close operation.
     */
    HIDE_ON_CLOSE,

    /**
     * The dispose-window default window close operation.
     * <p>
     * <b>Note</b>: When the last displayable window
     * within the Java virtual machine (VM) is disposed of, the VM may
     * terminate.  See <a href="../../java/awt/doc-files/AWTThreadIssues.html">
     * AWT Threading Issues</a> for more information.
     *
     * @see java.awt.Window#dispose()
     * @see JInternalFrame#dispose()
     */
    DISPOSE_ON_CLOSE,

    /**
     * The exit application default window close operation. Attempting
     * to use this operation on Windows that support it, such as
     * <code>JFrame</code>, may throw a <code>SecurityException</code> based
     * on the <code>SecurityManager</code>.
     * It is recommended you only use this in an application.
     *
     * @since 1.4
     */
    EXIT_ON_CLOSE;
}
