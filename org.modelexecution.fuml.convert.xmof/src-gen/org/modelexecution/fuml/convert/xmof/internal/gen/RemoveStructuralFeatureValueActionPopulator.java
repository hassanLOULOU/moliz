/*
* Copyright (c) 2012 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
*/
package org.modelexecution.fuml.convert.xmof.internal.gen;
    	
import javax.annotation.Generated;
import org.modelexecution.fuml.convert.impl.ConversionResultImpl;
import org.modelexecution.fuml.convert.xmof.internal.IElementPopulator;

@Generated(value="Generated by org.modelexecution.fuml.convert.xmof.gen.ElementPopulatorGenerator.xtend")
public class RemoveStructuralFeatureValueActionPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.emf.ecore.EModelElement element, ConversionResultImpl result) {
			
		if (!(element instanceof org.modelexecution.xmof.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction) ||
			!(fumlElement instanceof fUML.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction)) {
			return;
		}
		
		fUML.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction fumlNamedElement = (fUML.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction) fumlElement;
		org.modelexecution.xmof.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction xmofElement = (org.modelexecution.xmof.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction) element;
		
		fumlNamedElement.isRemoveDuplicates = xmofElement.isRemoveDuplicates();
		fumlNamedElement.removeAt = (fUML.Syntax.Actions.BasicActions.InputPin) result
							.getFUMLElement(xmofElement.getRemoveAt());
		
	}
	
}