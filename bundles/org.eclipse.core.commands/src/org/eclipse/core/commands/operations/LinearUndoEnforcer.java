/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.core.commands.operations;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * <p>
 * An operation approver that enforces a strict linear undo. It does not allow
 * the undo or redo of any operation that is not the latest available operation
 * in all of its contexts.
 * </p>
 * <p>
 * Note: This class/interface is part of a new API under development. It has
 * been added to builds so that clients can start using the new features.
 * However, it may change significantly before reaching stability. It is being
 * made available at this early stage to solicit feedback with the understanding
 * that any code that uses this API may be broken as the API evolves.
 * </p>
 * 
 * @since 3.1
 * @experimental
 */
public class LinearUndoEnforcer extends LinearUndoViolationDetector {

	/*
	 * Return whether a linear redo violation is allowable.  A linear redo violation
	 * is defined as a request to redo a particular operation even if it is not the most
	 * recently added operation to the redo history.
	 */
	protected IStatus allowLinearRedoViolation(IUndoableOperation operation,
			IUndoContext context, IOperationHistory history, IAdaptable uiInfo) {
		return Status.CANCEL_STATUS;
	}

	/*
	 * Return whether a linear undo violation is allowable.  A linear undo violation
	 * is defined as a request to undo a particular operation even if it is not the most
	 * recently added operation to the undo history.
	 */
	protected IStatus allowLinearUndoViolation(IUndoableOperation operation,
			IUndoContext context, IOperationHistory history, IAdaptable uiInfo) {
		return Status.CANCEL_STATUS;
	}

}
